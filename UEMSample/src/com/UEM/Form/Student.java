package com.UEM.Form;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@Column(name="StudentID")
	@GeneratedValue
	private int studentID;
	
	@Column(name="StudentName")
	private String studentName;
	
	@Column(name="StudentAge")
	private int studentAge;
	
	@Column(name="SchoolName")
	private String studentSchool;
	
	@Column(name="PhotoPath")
	private String studentPhotoPath;
	
	@Column(name="CreatedDate")
	private String createdDate;
	
}
