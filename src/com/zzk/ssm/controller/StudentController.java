package com.zzk.ssm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzk.ssm.entity.Student;
import com.zzk.ssm.service.StudentService;

@Controller
public class StudentController {

	private static final Logger log = LoggerFactory
			.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "Hello SSM!";
	}

	/**
	 * 查询所有的学生
	 * 
	 * @return 学生集合json数据
	 */
	@RequestMapping(value = "/getstudent", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> queryStudents() {
		// 返回查询的所有学生集合
		return studentService.listStudents();
	}

	/**
	 * 查询指定Id的学生信息
	 * 
	 * @param stuId
	 *            学生ID
	 * @return 学生信息的json数据
	 */
	@RequestMapping(value = "/getstudent/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Student queryStudentById(@PathVariable("id") Integer stuId) {
		// 返回指定的学生信息
		return studentService.getStudentById(stuId);
	}

	/**
	 * 新增一名学生信息
	 * 
	 * @param student
	 *            学生信息
	 * @return 记录新增标志:0->失败/1->成功
	 */
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	@ResponseBody
	public Integer addStudent(Student student) {
		// 返回指定的学生信息
		return studentService.insertStudent(student);
	}

	/**
	 * 删除一名学生信息
	 * 
	 * @param stuId
	 *            学生ID
	 * @return 记录删除标志:0->失败/1->成功
	 */
	@RequestMapping(value = "/deletestudent/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Integer deleteStudentById(@PathVariable("id") Integer stuId) {
		return studentService.deleteStudent(stuId);
	}

	/**
	 * 更新一名学生信息
	 * 
	 * @param student
	 *            学生信息
	 * @return 记录更新标志:0->失败/1->成功
	 */
	@RequestMapping(value = "/updatestudent", method = RequestMethod.PUT)
	@ResponseBody
	public Integer updateStudent(Student student) {
		log.info("student id is :" + student.getStuId());
		return studentService.updateStudent(student);
	}
}
