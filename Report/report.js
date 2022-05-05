$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the Hotel booking functionality in Adactin Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Must Enter The \"\u003cUsername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Must Enter The \"\u003cPassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "checking-the-hotel-booking-functionality-in-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "xyz",
        "123"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-in-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "elakkiyav",
        "K5597X"
      ],
      "line": 12,
      "id": "checking-the-hotel-booking-functionality-in-adactin-application;login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1197900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Must Enter The \"xyz\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Must Enter The \"123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 3230001000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_Must_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 131072700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_Must_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 67164500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 382913500,
  "status": "passed"
});
formatter.after({
  "duration": 233700,
  "status": "passed"
});
formatter.before({
  "duration": 127300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Must Enter The \"elakkiyav\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Must Enter The \"K5597X\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 320933400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "elakkiyav",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_Must_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 88760300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "K5597X",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_Must_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 90612400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2084430300,
  "status": "passed"
});
formatter.after({
  "duration": 81100,
  "status": "passed"
});
formatter.before({
  "duration": 68800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user Must Select The \"1\" In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Must Select The \"Hotel Hervey\" In Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Must Select The \"Standard\" In Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Must Select The \"1\" In Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Must Enter The Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Must Enter The Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Must Select the \"1\" In Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Must Select the \"1\" In Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click the search Button And Navigates to Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_Must_Select_The_In_Location_Field(int)"
});
formatter.result({
  "duration": 226502300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Hervey",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_Must_Select_The_In_Hotel_Field(String)"
});
formatter.result({
  "duration": 145171200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_Must_Select_The_In_Room_Field(String)"
});
formatter.result({
  "duration": 132993700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_Must_Select_The_In_Number_Of_Rooms_Field(String)"
});
formatter.result({
  "duration": 115042500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Enter_The_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 69867700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Enter_The_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 80129300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_Must_Select_the_In_Adults_Per_Room_Field(String)"
});
formatter.result({
  "duration": 97312300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_Must_Select_the_In_Children_Per_Room_Field(int)"
});
formatter.result({
  "duration": 175415900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_search_Button_And_Navigates_to_Select_Hotel_Page()"
});
formatter.result({
  "duration": 647264300,
  "status": "passed"
});
formatter.after({
  "duration": 69800,
  "status": "passed"
});
formatter.before({
  "duration": 57700,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user Must Click The Radio Button Under Select Field",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user Click The Continue Button And Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Click_The_Radio_Button_Under_Select_Field()"
});
formatter.result({
  "duration": 66833500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 675348600,
  "status": "passed"
});
formatter.after({
  "duration": 85500,
  "status": "passed"
});
formatter.before({
  "duration": 53300,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Book A Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;book-a-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user Must Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Must Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Must Enter The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Must Enter The Credit Card No In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Must Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Must Select The Expiry Date In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Must Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Click The Book Now Button And Navigates To Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 112481200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 81481800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 132319500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Enter_The_Credit_Card_No_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 86076200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 205565500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Select_The_Expiry_Date_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 415507200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Must_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 121841300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Book_Now_Button_And_Navigates_To_Logout_Page()"
});
formatter.result({
  "duration": 10071048700,
  "status": "passed"
});
formatter.after({
  "duration": 122600,
  "status": "passed"
});
formatter.before({
  "duration": 83400,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Logout Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-in-adactin-application;logout-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "user Click The Logout Button And Navigates to Logged Out Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Logout_Button_And_Navigates_to_Logged_Out_Page()"
});
formatter.result({
  "duration": 402755600,
  "status": "passed"
});
formatter.after({
  "duration": 85100,
  "status": "passed"
});
});