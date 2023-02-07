package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPageVD extends PageBase{

	public CreateTaskPageVD(AndroidDriver<WebElement> appiumDriver) {
		super(appiumDriver);
	}
	
	@AndroidFindBy(id = "goo.tasks:id/editTextTask")
	MobileElement taskTitle;
	
	@AndroidFindBy(id = "goo.tasks:id/editTextDesc")
	MobileElement task;
	
	@AndroidFindBy(id = "goo.tasks:id/button_save")
	MobileElement saveBtn;
	
	public void enterTaskName(String taskName) {
        clear(taskTitle);
        sendText(taskTitle, taskName);
    }
	
	public void enterTaskDesc(String descText) {
        click(task);
		clear(task);
        sendText(task, descText);
    }
	
	public void clickSaveBtn() {
        click(saveBtn);
    }

}