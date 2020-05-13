package com.example.zswb.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {

    void upload(MultipartFile file);
}
