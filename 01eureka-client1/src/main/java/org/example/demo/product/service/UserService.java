package org.example.demo.product.service;

import org.example.demo.product.api.UserDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: wangjing
 * @Date 2021/12/8
 **/
@FeignClient("UserService")
public interface UserService {
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    List<UserDto> findAll();

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    UserDto load(@PathVariable("id") Long id);

}
