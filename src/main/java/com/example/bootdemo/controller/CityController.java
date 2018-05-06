package com.example.bootdemo.controller;

import com.example.bootdemo.domain.City;
import com.example.bootdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gaoty
 * @version V1.0
 * @decription
 * @create on 2018/4/23 22:48
 */
@RequestMapping("/city")
@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping("/findByName")
    public String findByName(Model model, String cityName){
        City city = cityService.findByName(cityName);
        model.addAttribute("city",city);
        model.addAttribute("girl","年龄："+girlProperties.getAge()+"身高："+girlProperties.getHigh());
        return "city/detail";
    }
}
