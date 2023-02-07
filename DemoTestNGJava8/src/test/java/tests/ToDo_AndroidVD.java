package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CreateTaskPageVD;
import pages.TasksListPageVD;
import utils.JsonReader;

public class ToDo_AndroidVD extends TestBaseVD{

	CreateTaskPageVD createTaskPage;
	TasksListPageVD tasksListPage;
	
	@DataProvider(name = "tasks data")
	public Object[][] passData() throws IOException, ParseException, Exception{
		return JsonReader.getJSONData(System.getProperty("user.dir") + "/data/TaskData.json", "Task Data", 2);
	}

	@Test(dataProvider = "tasks data")
	public void test_add_task(String taskName, String taskDesc) throws Exception{
		try {
			setup();
			tasksListPage = new TasksListPageVD(driver);
			createTaskPage = new CreateTaskPageVD(driver);
			tasksListPage.clickAddTaskBtn();
			createTaskPage.enterTaskName(taskName);
			createTaskPage.enterTaskDesc(taskDesc);
			driver.hideKeyboard();
			createTaskPage.clickSaveBtn();
		} catch (Exception e) {
			System.out.println("Cause is : " + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
