package io.demo.business.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BusinessController {

    private static final Logger LOG = LoggerFactory.getLogger(BusinessController.class);

    @ResponseBody
    @GetMapping(value = "/healthcheck")
    public String doHealthCheck(){
        return "OK";
    }

}
