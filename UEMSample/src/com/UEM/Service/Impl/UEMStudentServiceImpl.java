package com.UEM.Service.Impl;

//Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UEM.DAO.UEMStudentDAO;
import com.UEM.Form.Student;
import java.util.List;
import com.UEM.Service.UEMStudentService;

@Service
public class UEMStudentServiceImpl implements UEMStudentService {

	@Autowired
	UEMStudentDAO studentDAO;
	
	@Transactional
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentDAO.getStudentList();
	}

}
