package com.example.servicemedia.service.impl;

import com.example.servicemedia.entity.Media;
import com.example.servicemedia.entity.MediaExample;
import com.example.servicemedia.mapper.MediaMapper;
import com.example.servicemedia.service.IMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaServiceImpl implements IMediaService {

    @Autowired
    MediaMapper mediaMapper;

    @Override
    public List<Media> get() {
        return mediaMapper.selectByExample(new MediaExample());
    }
}
