package org.yq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yq.Service.IMessageProviderService;

import javax.annotation.Resource;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-22  09:22
 * @Description:
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProviderService messageProviderService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProviderService.send();
    }
}
