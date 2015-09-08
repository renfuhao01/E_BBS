package com.ebbs.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ebbs.bean.Student;
import com.ebbs.dao.studentDao;
import com.ebbs.service.studentService;
@Service
@Transactional
public class studentServiceImpl implements studentService {
	@Autowired
	private studentDao studentDao;
    @Test
	public List<Student> findstudent() {
		// TODO Auto-generated method stub
		return studentDao.findstudent();
		
	}
	

}
