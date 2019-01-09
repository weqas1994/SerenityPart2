$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/firstFeature.feature");
formatter.feature({
  "name": "This will Test Landing Page Properties",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This Scenario will execute to see current Landing Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I Open A Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.i_Open_A_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to Google",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.i_go_to_Google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Input Text",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.i_Input_Text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "some other action",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.some_other_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "yet another action",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.yet_another_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
});