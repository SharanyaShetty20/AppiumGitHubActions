package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageBase{

	public CreateTaskPage(AndroidDriver<WebElement> appiumDriver) {
		super(appiumDriver);
	}
	
	@AndroidFindBy(id = "com.samsung.android.app.memo:id/editor_title")
	MobileElement taskTitle;
	
	@AndroidFindBy(id = "com.samsung.android.app.memo:id/editText1")
	MobileElement task;
	
	@AndroidFindBy(id = "com.samsung.android.app.memo:id/mitem_done")
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