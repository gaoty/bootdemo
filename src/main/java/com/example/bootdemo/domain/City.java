package com.example.bootdemo.domain;

import lombok.Data;

/**
 * @author gaoty
 * @version V1.0
 * @decription
 * @create on 2018/4/23 22:51
 */
@Data
public class City {
    /**
     * 城市编号
     */
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;

}
