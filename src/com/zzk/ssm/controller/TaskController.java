package com.zzk.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzk.ssm.entity.TaskAssign;
import com.zzk.ssm.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@ResponseBody
	@RequestMapping("/tasks")
	public List<TaskAssign> list(){

		return taskService.listTaskAssigns();
	}

}
