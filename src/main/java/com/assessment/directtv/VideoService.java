package com.assessment.directtv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class VideoService {

    @Value("${direct.tv.api.base.url}")
    private String apiBaseUrl;

    @Autowired
    private RestTemplate restTemplate;


    public Object getAllMetadataRecord(){
        return restTemplate.getForObject(apiBaseUrl+"/metadata", Object.class);
    }

    public Object getMetadatByResourceId(String resourceId){
        return restTemplate.getForObject(apiBaseUrl+"/metadata/"+resourceId, Object.class);
    }

    public String createMetaData(MetaData metaData){
        return restTemplate.postForObject(apiBaseUrl + "/metadata", metaData, String.class);
    }

    public void deleteMetadata(String resourceId){
        try{
            restTemplate.delete(apiBaseUrl+"/metadata/"+resourceId);
        }catch (Exception e){
            throw new RuntimeException("MetaData not found with id: "+ resourceId);
        }
    }

}
