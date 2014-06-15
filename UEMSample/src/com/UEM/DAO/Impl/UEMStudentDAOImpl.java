package com.UEM.DAO.Impl;

//Spring libraries
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
// Student form
import com.UEM.DAO.UEMStudentDAO;
import com.UEM.Form.Student;
import java.util.List;

@Repository
public class UEMStudentDAOImpl implements UEMStudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public  List<Student> getStudentList()
	{
		List<Student> lstStudent = null;
		try{
			//Retriving all Student info from Student object
			//Planning to create a new file for executing query - HibernateDAO.java
			lstStudent = sessionFactory.getCurrentSession().createQuery("From Student").list();
		}
		catch(Exception ex)
		{
			
		}
		return lstStudent;
	}

}
