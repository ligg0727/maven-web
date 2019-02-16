package com.zrgj.serviceimpl;

import com.zrgj.dao.StudentDao;
import com.zrgj.entity.Student;
import com.zrgj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/2/2 0002.
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> selectAll() {
        List<Student> students = studentDao.selectAll();
        return students;
    }
}