package com.ebbs.dao.impl;

import java.util.List;

import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;

import com.ebbs.bean.Student;
import com.ebbs.dao.studentDao;
@Repository
public class studentDaoImpl implements studentDao {

	@Autowired
   private SqlSessionTemplate sqlSessionTemplate;

	public List<Student> findstudent() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("findstudent");
	}
	

}
