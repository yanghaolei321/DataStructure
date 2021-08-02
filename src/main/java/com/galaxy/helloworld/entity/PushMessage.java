package com.galaxy.helloworld.entity;

import lombok.Data;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date
 */

@Data
public class PushMessage {

    private String userId;

    private String bizType;

    private String deviceId;

    private String messageInfo;

    private String messageType;
}

