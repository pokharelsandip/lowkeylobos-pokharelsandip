package com.assessment.directtv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/metadata")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public Object getAllMetaData(){
        return videoService.getAllMetadataRecord();
    }

    @GetMapping("/{resourceId}")
    public Object getMetaDataByResourceId(@PathVariable("resourceId") String resourceId){
        return videoService.getMetadatByResourceId(resourceId);
    }

    @PostMapping()
    public String createMetaData(@RequestBody MetaData metaData){
        return videoService.createMetaData(metaData);
    }

    @DeleteMapping("/{resourceId}")
    public void deleteMetaDataByResourceId(@PathVariable("resourceId") String resourceId){
        videoService.deleteMetadata(resourceId);
    }

}
