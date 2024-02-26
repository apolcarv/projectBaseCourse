package co.com.screenplay.project.utils;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@Slf4j
public class WebActions {


    private WebActions() {}

    public static void click(WebElement element) {
        final String ACTION = "click";
        try {
            element.click();
        } catch (Exception e) {
            log.info(ACTION + AssertExceptions.getErrorStackTrace(e));
        }
    }
}