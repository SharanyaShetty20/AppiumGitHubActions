package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPage extends PageBase{

	public TasksListPage(AndroidDriver<WebElement> appiumDriver) {
		super(appiumDriver);
	}
	
	@AndroidFindBy(id = "com.samsung.android.app.memo:id/fab_btn")
	MobileElement addTaskBtn;
	
	public void clickAddTaskBtn() {
		click(addTaskBtn);
	}

}