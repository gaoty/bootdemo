package com.example.bootdemo.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author gaoty
 * @version V1.0
 * @decription
 * @create on 2018/5/5 14:49
 */
@Component
@ConfigurationProperties(prefix = "girl")
@Data
public class GirlProperties {
    private Integer age;
    private Integer high;
}
