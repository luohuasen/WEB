package com.study.WEB.service.impl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.study.WEB.mapper.StudentMapper;
import com.study.WEB.model.Student;
import com.study.WEB.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        // TODO Auto-generated method stub
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Student record) {
        // TODO Auto-generated method stub
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        // TODO Auto-generated method stub
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Integer id) {
        // TODO Auto-generated method stub
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        // TODO Auto-generated method stub
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        // TODO Auto-generated method stub
        return studentMapper.updateByPrimaryKey(record);
    }
}
