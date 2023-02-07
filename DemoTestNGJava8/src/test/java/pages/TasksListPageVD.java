package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPageVD extends PageBase{

	public TasksListPageVD(AndroidDriver<WebElement> appiumDriver) {
		super(appiumDriver);
	}
	
	@AndroidFindBy(id = "goo.tasks:id/floating_button_add")
	MobileElement addTaskBtn;
	
	public void clickAddTaskBtn() {
		click(addTaskBtn);
	}

}