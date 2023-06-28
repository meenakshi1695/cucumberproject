$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/7cancel/eclipse-workspace/javacucumber/src/test/java/cucumber/userlogin.feature");
formatter.feature({
  "name": "Check sauce login page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "validate login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "name": "lanch the sauce browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.lanch_the_sauce_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to give username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_tries_to_give_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});