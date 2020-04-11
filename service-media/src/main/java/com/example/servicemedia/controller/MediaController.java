package com.example.servicemedia.controller;

import com.example.servicemedia.model.entity.Media;
import com.example.servicemedia.model.entity.MediaExample;
import com.example.servicemedia.mapper.MediaMapper;
import com.example.servicemedia.service.intf.IMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class MediaController {

    @Autowired
    IMediaService mediaService;

    @Autowired
    MediaMapper mediaMapper;

    @RequestMapping(value = "/add")
    public boolean add(@RequestBody Media media){
        return mediaMapper.insert(media) > 0;
    }

    @CacheEvict(value = "media", key = "#media.id")
    @RequestMapping(value = "/update")
    public boolean update(@RequestBody Media media){
        MediaExample me = new MediaExample();
        me.createCriteria().andIdEqualTo(media.getId());
        return mediaMapper.updateByExample(media,me) > 0;
    }

    @Cacheable(value = "media",key = "#mediaId",unless="#mediaId == null")
    @RequestMapping(value = "/get")
    public List<Media> get(@RequestParam(value = "mediaId",required = false)Integer mediaId){
        MediaExample me = new MediaExample();
        if(Objects.nonNull(mediaId))
            me.createCriteria().andIdEqualTo(mediaId);
        return mediaMapper.selectByExample(me);
    }

    @CacheEvict(value = "media", key = "#mediaId",condition = "#mediaId != null")
    @RequestMapping(value = "/delete")
    public boolean delete(@RequestParam(value = "mediaId", required = false)Integer mediaId, @RequestParam(value = "mediaIdList", required = false)List<Integer> mediaIdList){
        MediaExample me = new MediaExample();
        if(Objects.nonNull(mediaId)){
            me.createCriteria().andIdEqualTo(mediaId);
        }
        if (Objects.nonNull(mediaIdList)){
            mediaIdList.stream().forEach(i -> {
                me.createCriteria().andIdEqualTo(i);
            });
        }
        if(Objects.isNull(mediaId) && Objects.isNull(mediaIdList)){
            return true;
        }
        return mediaMapper.deleteByExample(me) > 0;
    }
}
