package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.transavia.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateAccount() throws Exception {
    driver.get(baseUrl + "/en-EU/home/");
    driver.findElement(By.linkText("Create account")).click();
    driver.findElement(By.id("gigya-multiChoice-0-66487867454129580")).click();
    driver.findElement(By.id("gigya-textbox-54597904065241600")).clear();
    driver.findElement(By.id("gigya-textbox-54597904065241600")).sendKeys("Erwin");
    driver.findElement(By.id("gigya-textbox-26490271492521504")).clear();
    driver.findElement(By.id("gigya-textbox-26490271492521504")).sendKeys("Biharie");
    driver.findElement(By.id("profile.birthDay")).clear();
    driver.findElement(By.id("profile.birthDay")).sendKeys("09");
    driver.findElement(By.id("profile.birthMonth")).clear();
    driver.findElement(By.id("profile.birthMonth")).sendKeys("10");
    driver.findElement(By.id("profile.birthYear")).clear();
    driver.findElement(By.id("profile.birthYear")).sendKeys("1980");
    driver.findElement(By.id("gigya-textbox-121730692964830750")).clear();
    driver.findElement(By.id("gigya-textbox-121730692964830750")).sendKeys("0646875598");
    driver.findElement(By.id("gigya-textbox-49229335767728376")).clear();
    driver.findElement(By.id("gigya-textbox-49229335767728376")).sendKeys("Erwin");
    driver.findElement(By.id("gigya-loginID-133899628919463360")).clear();
    driver.findElement(By.id("gigya-loginID-133899628919463360")).sendKeys("ebiharie@immune.it");
    driver.findElement(By.id("gigya-password-36143761262294260")).clear();
    driver.findElement(By.id("gigya-password-36143761262294260")).sendKeys("mypassword");
    driver.findElement(By.id("gigya-checkbox-70739364290276500")).click();
    driver.findElement(By.cssSelector("div.checkfield-wrapper > label")).click();
    driver.findElement(By.xpath("//footer/button")).click();
    driver.findElement(By.xpath("//footer/button")).click();
    driver.findElement(By.cssSelector("button.button.button-primary")).click();
    driver.findElement(By.cssSelector("input.is-hidden")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
