package com.weddingasia.TaskWeddingAsia;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class weddingasia_Task {

    private int taskId;
    private String taskName;
    private boolean isDone;
    private String createdAt;
    private String doneAt;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(String doneAt) {
        this.doneAt = doneAt;
    }

    @Override
    public String toString() {
        return "weddingasia_Task [taskId=" + taskId + ", taskName=" + taskName + ", isDone=" + isDone + ", createdAt="
                + createdAt + ", doneAt=" + doneAt + "]";
    }
}
