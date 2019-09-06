package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * @ClassName: StudentRepository
 * @Author: wanggj
 * @Date: 2019/9/5 12:33
 **/
public interface StudentRepository {
    public Collection<Student> findAll() ;

    public Student findById(Long id);

    public void updateOrSave(Student student);

    public void delStudent(Student student);

}
