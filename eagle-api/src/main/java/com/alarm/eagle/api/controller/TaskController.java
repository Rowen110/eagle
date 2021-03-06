package com.alarm.eagle.api.controller;

import com.alarm.eagle.api.service.TaskService;
import com.alarm.eagle.api.bean.Task;
import com.alarm.eagle.response.Response;
import com.alarm.eagle.response.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by luxiaoxun on 18/1/2.
 */
@RestController
@RequestMapping("/task")
public class TaskController {
    @Resource
    public TaskService taskService;

    @RequestMapping("/query")
    public Response queryTask(@RequestParam Integer taskId) {
        Task task = taskService.queryTask(taskId);
        return ResponseUtil.success(task);
    }
}
