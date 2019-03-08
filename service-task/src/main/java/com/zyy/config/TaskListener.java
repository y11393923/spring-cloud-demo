package com.zyy.config;

import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

/**
 *  定时任务监听
 */
@Component
public class TaskListener implements TaskExecutionListener {

    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        System.out.println("定时任务开始！！");
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        System.out.println("定时任务结束！！");
    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
        System.out.println("定时任务异常！！");
    }
}
