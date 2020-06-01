package com.ldbmcs.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer")
public interface ProducerFeign {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
