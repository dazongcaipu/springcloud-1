package com.example.servicemenu.service;

import com.example.servicemenu.entity.Media;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "service-media")
@RequestMapping("/media")
public interface MediaProvider {

    @RequestMapping(value = "/media",method = RequestMethod.POST)
    List<Media> add(@PathVariable("media") Media media);

    @RequestMapping(value = "/media",method = RequestMethod.PUT)
    List<Media> update(@PathVariable("media") Media media);

    @RequestMapping(value = "/media",method = RequestMethod.GET)
    List<Media> get(@PathVariable("media") Media media);

    @RequestMapping(value = "/media",method = RequestMethod.DELETE)
    List<Media> delete(@PathVariable("mediaId") String mediaId);
}
