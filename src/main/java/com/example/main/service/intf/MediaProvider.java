package com.example.main.service.intf;

import com.example.main.model.entity.Media;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "service-media")
@RequestMapping("/media")
public interface MediaProvider {

    @RequestMapping(value = "/add")
    List<Media> add(@RequestParam("media") Media media);

    @RequestMapping(value = "/update")
    List<Media> update(@RequestParam("media") Media media);

    @RequestMapping(value = "/get")
    List<Media> get(@RequestParam(value = "mediaId", required = false) Integer mediaId);

    @RequestMapping(value = "/delete")
    List<Media> delete(@RequestParam(value = "mediaId", required = false) Integer mediaId, @RequestParam(value = "mediaIdList", required = false) List<Integer> mediaIdList);
}
