package com.southwind.feign.impl;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @ClassName: FeignProviderClientImpl
 * @Author: wanggj
 * @Date: 2019/9/5 20:07
 **/

@Component
public class FeignProviderClientImpl implements FeignProviderClient {


    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

}
