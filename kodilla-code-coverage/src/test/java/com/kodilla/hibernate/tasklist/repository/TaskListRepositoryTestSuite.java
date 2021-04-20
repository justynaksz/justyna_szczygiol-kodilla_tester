package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test Description";

    @Test
    public void testTaskListRepositoryFindByListName() {
        TaskList taskList = new TaskList("My first task", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        List<TaskList> readTaskLists = taskListRepository.findByListName(listName);

        Assert.assertEquals(1, readTaskLists.size());

        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
