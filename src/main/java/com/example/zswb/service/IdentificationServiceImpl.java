package com.example.zswb.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.zswb.dao.IdentificationMapper;
import com.example.zswb.bean.Identification;
import com.example.zswb.service.impl.IdentificationService;
@Service
public class IdentificationServiceImpl implements IdentificationService{

    @Resource
    private IdentificationMapper identificationMapper;

    @Override
    public int deleteByPrimaryKey(Integer identityId) {
        return identificationMapper.deleteByPrimaryKey(identityId);
    }

    @Override
    public int insert(Identification record) {
        return identificationMapper.insert(record);
    }

    @Override
    public int insertSelective(Identification record) {
        return identificationMapper.insertSelective(record);
    }

    @Override
    public Identification selectByPrimaryKey(Integer identityId) {
        return identificationMapper.selectByPrimaryKey(identityId);
    }

    @Override
    public int updateByPrimaryKeySelective(Identification record) {
        return identificationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Identification record) {
        return identificationMapper.updateByPrimaryKey(record);
    }

}
