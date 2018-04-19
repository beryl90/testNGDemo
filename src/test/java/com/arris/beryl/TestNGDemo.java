package com.arris.beryl;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class TestNGDemo {

    @BeforeClass
    public void setup() {
        System.out.println("begin test");
    }

    @Test
    public void test1() {
        System.out.println("at test1");
    }

    @Test
    public void test2() {
        System.out.println("at test2");
    }

    @Test
    public void test3() {
        System.out.println("at test3");
    }

    @Test
    public void testgooglrsearch(){
//        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        //it will open the goggle page
        driver.get("http://google.in");
        //we expect the title “Google “ should be present
        String Expectedtitle = "Google";
        //it will fetch the actual title
        String Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        //it will compare actual title and expected title
        Assert.assertEquals(Actualtitle, Expectedtitle);
        //print out the result
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
        driver.quit();
    }

    @AfterClass
    public void teardown() {
        System.out.println("end test");
    }


}
