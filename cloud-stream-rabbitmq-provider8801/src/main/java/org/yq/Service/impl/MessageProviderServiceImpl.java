package org.yq.Service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.yq.Service.IMessageProviderService;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author: YQ_l
 * @CreatTime: 2022-11-22  09:17
 * @Description:
 */

@Slf4j
@EnableBinding(Source.class)
public class MessageProviderServiceImpl implements IMessageProviderService {

     @Resource
     private MessageChannel output;

     @Override
    public String send() {
         String serial = UUID.randomUUID().toString();
         this.output.send(MessageBuilder.withPayload(serial).build());
         log.info("*************************serial*************************"+serial);
         return serial;
    }
}
