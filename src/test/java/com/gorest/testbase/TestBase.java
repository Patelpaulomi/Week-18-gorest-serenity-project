package com.gorest.testbase;


import com.gorest.constants.UserPath;
import com.gorest.utilis.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void inIt()
    {

        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = UserPath.RESOURCES;

    }
}
