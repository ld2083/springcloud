package org.yq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-21  20:41
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/get/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
