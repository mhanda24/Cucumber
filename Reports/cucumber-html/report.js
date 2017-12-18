$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Test the Login functionality of the demosite",
  "description": "I want to test the login functionlaity of the demo site with valid and invalid login credentials",
  "id": "test-the-login-functionality-of-the-demosite",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Test Login with valid user name and password",
  "description": "",
  "id": "test-the-login-functionality-of-the-demosite;test-login-with-valid-user-name-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters username as \u003cuser\u003e and password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Login Successfull",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "test-the-login-functionality-of-the-demosite;test-login-with-valid-user-name-and-password;",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ],
      "line": 15,
      "id": "test-the-login-functionality-of-the-demosite;test-login-with-valid-user-name-and-password;;1"
    },
    {
      "cells": [
        "LearnCucumber",
        "VGVzdFBhc3N3b3JkMTIzQA\u003d\u003d"
      ],
      "line": 16,
      "id": "test-the-login-functionality-of-the-demosite;test-login-with-valid-user-name-and-password;;2"
    },
    {
      "cells": [
        "Test",
        "VGVzdA\u003d\u003d"
      ],
      "line": 17,
      "id": "test-the-login-functionality-of-the-demosite;test-login-with-valid-user-name-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3355208434,
  "status": "passed"
});
formatter.before({
  "duration": 2204715597,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User navigates to http://store.demoqa.com page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on MyAccount link",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://store.demoqa.com",
      "offset": 18
    }
  ],
  "location": "TestLogin.browse_website(String)"
});
formatter.result({
  "duration": 6227283179,
  "status": "passed"
});
formatter.match({
  "location": "TestLogin.user_clicks_on_MyAccount_link()"
});
formatter.result({
  "duration": 3240308559,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Test Login with valid user name and password",
  "description": "",
  "id": "test-the-login-functionality-of-the-demosite;test-login-with-valid-user-name-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Feature"
    },
    {
      "line": 9,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters username as LearnCucumber and password as VGVzdFBhc3N3b3JkMTIzQA\u003d\u003d",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Login Successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "LearnCucumber",
      "offset": 24
    },
    {
      "val": "VGVzdFBhc3N3b3JkMTIzQA\u003d\u003d",
      "offset": 54
    }
  ],
  "location": "TestLogin.loginTest(String,String)"
});
formatter.result({
  "duration": 278625760,
  "status": "passed"
});
formatter.match({
  "location": "TestLogin.login_Successful()"
});
formatter.result({
  "duration": 6748420300,
  "status": "passed"
});
formatter.after({
  "duration": 9062,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.after({
  "duration": 1250031245,
  "status": "passed"
});
formatter.before({
  "duration": 2234632020,
  "status": "passed"
});
formatter.before({
  "duration": 2179819856,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User navigates to http://store.demoqa.com page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on MyAccount link",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://store.demoqa.com",
      "offset": 18
    }
  ],
  "location": "TestLogin.browse_website(String)"
});
formatter.result({
  "duration": 5122459406,
  "status": "passed"
});
formatter.match({
  "location": "TestLogin.user_clicks_on_MyAccount_link()"
});
formatter.result({
  "duration": 3256926235,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Test Login with valid user name and password",
  "description": "",
  "id": "test-the-login-functionality-of-the-demosite;test-login-with-valid-user-name-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Feature"
    },
    {
      "line": 9,
      "name": "@FirstTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters username as Test and password as VGVzdA\u003d\u003d",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Login Successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 24
    },
    {
      "val": "VGVzdA\u003d\u003d",
      "offset": 45
    }
  ],
  "location": "TestLogin.loginTest(String,String)"
});
formatter.result({
  "duration": 259661802,
  "status": "passed"
});
formatter.match({
  "location": "TestLogin.login_Successful()"
});
formatter.result({
  "duration": 15077914021,
  "error_message": "java.lang.AssertionError: expected:\u003c(Logout)\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat Steps.TestLogin.login_Successful(TestLogin.java:74)\r\n\tat ✽.Then Login Successfull(src/test/resources/Feature/Login.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 9061,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2465092157,
  "status": "passed"
});
});