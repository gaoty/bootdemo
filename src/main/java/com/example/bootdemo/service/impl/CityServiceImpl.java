package com.example.bootdemo.service.impl;

import com.example.bootdemo.dao.CityDao;
import com.example.bootdemo.domain.City;
import com.example.bootdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gaoty
 * @version V1.0
 * @decription
 * @create on 2018/4/24 19:39
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    @Override
    public City findByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
