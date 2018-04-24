package com.example.bootdemo.dao;

import com.example.bootdemo.domain.City;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author gaoty
 * @version V1.0
 * @decription
 * @create on 2018/4/23 22:49
 */

public interface CityDao {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
