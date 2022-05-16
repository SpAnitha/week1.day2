package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("http://leaftaps.com/opentaps/control/main");
}
}

