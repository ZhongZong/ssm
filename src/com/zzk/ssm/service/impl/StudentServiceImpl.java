package com.zzk.ssm.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zzk.ssm.dao.StudentDao;
import com.zzk.ssm.entity.Student;
import com.zzk.ssm.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	private static final Logger log = LoggerFactory
			.getLogger(StudentServiceImpl.class);

	@Override
	@Transactional(readOnly = true)
	public List<Student> listStudents() {
		log.info("listStudents");
		return studentDao.listStudents();
	}

	@Override
	@Transactional(readOnly = true)
	public Student getStudentById(Integer stuId) {
		log.info("get id is {} student", stuId);
		return studentDao.getStudentById(stuId);
	}

	@Override
	@Transactional
	public int insertStudent(Student student) {
		return studentDao.insertStudent(student);
	}

	@Override
	@Transactional
	public int deleteStudent(Integer stuId) {
		log.info("delete id is {} student", stuId);
		return studentDao.deleteStudent(stuId);
	}

	@Override
	@Transactional
	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

}
