package tests;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateTaskPage;
import pages.CreateTaskPageVD;
import pages.TasksListPage;
import pages.TasksListPageVD;
import utils.JsonReader;

public class ToDo_Android extends TestBase{

	CreateTaskPage createTaskPage;
	TasksListPage tasksListPage;
	CreateTaskPageVD createTaskPagevd;
	TasksListPageVD tasksListPagevd;
	
	@DataProvider(name = "tasks data")
	public Object[][] passData() throws IOException, ParseException, Exception{
		return JsonReader.getJSONData(System.getProperty("user.dir") + "/data/TaskData.json", "Task Data", 2);
	}

	@Test(dataProvider = "tasks data")
	public void test_add_task(String taskName, String taskDesc) throws Exception{
		try {
			setup("4723", "Galaxy J7", "6.0.1", "3300868aa3f4b2f9");
			tasksListPage = new TasksListPage(driver);
			createTaskPage = new CreateTaskPage(driver);
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
	
	@Test(dataProvider = "tasks data")
	public void test_add_task2(String taskName, String taskDesc) throws Exception{
		try {
			setupVD("4000", "Android Emulator", "13", "emulator-5554");
			tasksListPagevd = new TasksListPageVD(driver);
			createTaskPagevd = new CreateTaskPageVD(driver);
			tasksListPagevd.clickAddTaskBtn();
			createTaskPagevd.enterTaskName(taskName);
			createTaskPagevd.enterTaskDesc(taskDesc);
			driver.hideKeyboard();
			createTaskPagevd.clickSaveBtn();
		} catch (Exception e) {
			System.out.println("Cause is : " + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
