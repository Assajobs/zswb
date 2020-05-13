package com.example.zswb.controller;

import com.example.zswb.bean.CardUser;
import com.example.zswb.dao.UsersMapper;
import com.example.zswb.utils.ocr.BaiDuOCR;
import com.example.zswb.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController("/ident")
@Api(description = "实名认证")
public class IdentificationController {
    @Autowired
    UsersMapper usersMapper;

    @PostMapping("/ocr")
    @ApiOperation("上传身份证")
    public R picOCR(@RequestParam("pic") MultipartFile picOcr , CardUser cardUser, HttpSession session) throws Exception {
        byte[] data = null;
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String base64 = base64Encoder.encode(picOcr.getBytes());
        base64 = base64.replaceAll("\r\n", "");
        base64 = base64.replaceAll("\\+", "%2B");
        String httpUrl = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard?access_token=" + BaiDuOCR.getAuth();
        //正面照
        String httpFront = "detect_direction=true&id_card_side=front&image=" + base64;
        //背面照
        String httpBack = "detect_direction=true&id_card_side=back&image=" + base64;
        String jsonResult = BaiDuOCR.request(httpUrl, httpFront);
        HashMap<String, String> map = BaiDuOCR.getHashMapByJson(jsonResult);

      if (cardUser.getCardName()!=null && cardUser.getCardNumber()!=null){
          //通过seesion拿到当前登陆的用户
          String s = (String)session.getAttribute("uid");
          if (cardUser.getCardName().equals(map.get("姓名")) && cardUser.getCardNumber().equals(map.get("公民身份号码"))) {
                  return R.ok().data("msg", "验证通过");
              } else {
                  return R.error().data("msg", "姓名或身份证号填写有误");
              }
          }else {
          return R.error().data("msg","信息输入不能为空");
          }

    }

}
