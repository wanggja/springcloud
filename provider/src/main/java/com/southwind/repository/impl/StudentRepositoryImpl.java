package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: StudentRepositoryImpl
 * @Author: wanggj
 * @Date: 2019/9/5 14:46
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long, Student> map;
    static {
        map = new HashMap<>();
        map.put(1L, new Student(1L, "张三", 12));
        map.put(2L, new Student(2L, "里斯", 15));
        map.put(3L, new Student(3L, "王五", 16));
        map.put(4L, new Student(4L, "赵六", 10));
    }
    @Override
    public Collection<Student> findAll() {
        return map.values();
    }

    @Override
    public Student findById(Long id) {
        return map.get(id);
    }

    @Override
    public void updateOrSave(Student student) {
        map.put(student.getId(), student);
    }

    @Override
    public void delStudent(Student student) {
        map.remove(student.getId());
    }
}
