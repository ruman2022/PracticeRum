$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/iftakerahmed/IdeaProjects/ScenarioOutline/src/main/java/Features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "create accounts",
  "description": "",
  "id": "create-accounts",
  "keyword": "Feature"
});
formatter.before({
  "duration": 194382,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "target create account",
  "description": "",
  "id": "create-accounts;target-create-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User on alraedy home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on create account",
  "keyword": "Then "
});
formatter.match({
  "location": "hooksStepDefination.user_on_alraedy_home_page()"
});
formatter.result({
  "duration": 106599664,
  "status": "passed"
});
formatter.match({
  "location": "hooksStepDefination.user_click_on_sign_in()"
});
formatter.result({
  "duration": 61922,
  "status": "passed"
});
formatter.match({
  "location": "hooksStepDefination.click_on_create_account()"
});
formatter.result({
  "duration": 5443076,
  "status": "passed"
});
formatter.after({
  "duration": 117176,
  "status": "passed"
});
});