$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login into Browserstack application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Open the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on the SignIn link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Username and Password",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the webpage has loggedin",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the iphone add to cart",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on checkout button",
  "keyword": "Then "
});
formatter.step({
  "name": "Fill the firstname as \u003cname\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Fill the lastname as \u003clastname\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Fill the address \u003caddress\u003e state \u003cstate\u003e and Postcode \u003cpostcode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the order confirmation message",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the order summary",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "lastname",
        "address",
        "state",
        "postcode"
      ]
    },
    {
      "cells": [
        "Aruna",
        "Manoharan",
        "12 post",
        "NSW",
        "2118"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login into Browserstack application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Open the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.loginStepDef.open_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the SignIn link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.loginStepDef.click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.loginStepDef.enter_username_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the webpage has loggedin",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.verify_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the iphone add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.click_on_iphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkout button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.click_on_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the firstname as Aruna",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.fill_shipping_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the lastname as Manoharan",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.fill_the_lastname_as_lastname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the address 12 post state NSW and Postcode 2118",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.fill_the_address_state_and_Postcode(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the order confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.verify_order_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the order summary",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.loginStepDef.verify_order_summary()"
});
formatter.result({
  "status": "passed"
});
});