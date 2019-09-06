package com.southwind.feign;

import com.southwind.entity.Student;
import com.southwind.feign.impl.FeignProviderClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignProviderClientImpl.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();

    @GetMapping("/student/findById/{id}")
    Student findById(@PathVariable("id") Long id);

}
