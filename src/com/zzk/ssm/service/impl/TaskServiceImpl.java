package com.zzk.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzk.ssm.dao.TaskAssignDao;
import com.zzk.ssm.entity.TaskAssign;
import com.zzk.ssm.service.TaskService;

@Service("taskService")
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskAssignDao taskAssignDao;

	@Override
	public List<TaskAssign> listTaskAssigns() {
		return taskAssignDao.listTasks();
	}

}
