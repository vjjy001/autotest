$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cukeTest.feature");
formatter.feature({
  "id": "",
  "description": "",
  "name": "",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": ";",
  "description": "",
  "name": "",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "i test cucumber",
  "keyword": "Given ",
  "line": 4
});
formatter.match({
  "location": "CukeSteps.testCuke()"
});
formatter.result({
  "duration": 3680954413,
  "status": "passed"
});
});