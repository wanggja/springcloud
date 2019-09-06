package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.executable.ValidateOnExecution;
import java.util.Collection;

/**
 * @ClassName: StudentHandler
 * @Author: wanggj
 * @Date: 2019/9/5 14:54
 **/
@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository repository;
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return repository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        repository.updateOrSave(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        repository.updateOrSave(student);

    }

    @DeleteMapping("/delete")
    public void delStudent(@RequestBody Student student) {
        repository.delStudent(student);
    }

    @GetMapping("/index")
    public String index() {
        return "当前端口：" + this.port;
    }


}
