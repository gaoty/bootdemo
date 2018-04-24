package com.example.bootdemo.service;

import com.example.bootdemo.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * @author gaoty
 * @version V1.0
 * @decription
 * @create on 2018/4/23 22:55
 */

public interface CityService {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
