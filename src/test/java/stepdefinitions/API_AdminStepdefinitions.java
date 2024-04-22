package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import org.json.JSONObject;


import java.util.HashMap;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static stepdefinitions.API_RegisterCustomerStepdefinitions.id;

public class API_AdminStepdefinitions {

    JSONObject requestJsonObject;
    HashMap<String, Object> requestMap;
    JsonPath jsonPath;
    HashMap<String, Object> responseMap;

    //******************************************* api/get-users ******************************************************

    // ***************************************************************************************************************
}
