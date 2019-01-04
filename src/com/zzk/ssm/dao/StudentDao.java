package com.zzk.ssm.dao;

import java.util.List;

import com.zzk.ssm.entity.Student;

public interface StudentDao {

	/**
	 * 列出所有的学生
	 * 
	 * @return 学生集合
	 */
	List<Student> listStudents();

	/**
	 * 查询指定ID的学生信息
	 * 
	 * @param stuId
	 *            学生ID
	 * @return 学生对象
	 */
	Student getStudentById(Integer stuId);

	/**
	 * 新增一名学生
	 * 
	 * @param student
	 *            学生对象
	 * @return 0:新增成功/1:新增失败
	 */
	int insertStudent(Student student);

	/**
	 * 删除指定ID的学生信息
	 * 
	 * @param stuId
	 *            学生ID
	 * @return 0:删除成功/1:删除失败
	 */
	int deleteStudent(Integer stuId);

	/**
	 * 更新一名学生信息
	 * 
	 * @param student
	 *            学生对象
	 * @return 0:更新成功/1:更新失败
	 */
	int updateStudent(Student student);
}
