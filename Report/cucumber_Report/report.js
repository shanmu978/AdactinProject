$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/Feature/Feature_Demo");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking Using Adactin Application",
  "description": "",
  "id": "hotel-booking-using-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Testing The Adactin App",
  "description": "",
  "id": "hotel-booking-using-adactin-application;testing-the-adactin-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Navigate Into The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The UserName \"\u003cusername\u003e\" Details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter the Password \"\u003cpassword\u003e\" Details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Navigates To Search For Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-using-adactin-application;testing-the-adactin-app;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "hotel-booking-using-adactin-application;testing-the-adactin-app;;1"
    },
    {
      "cells": [
        "vishnubalan",
        "Idlysambar@2024"
      ],
      "line": 13,
      "id": "hotel-booking-using-adactin-application;testing-the-adactin-app;;2"
    },
    {
      "cells": [
        "shan30footbal",
        "Sh@n123"
      ],
      "line": 14,
      "id": "hotel-booking-using-adactin-application;testing-the-adactin-app;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Testing The Adactin App",
  "description": "",
  "id": "hotel-booking-using-adactin-application;testing-the-adactin-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Navigate Into The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The UserName \"vishnubalan\" Details",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter the Password \"Idlysambar@2024\" Details",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Navigates To Search For Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Navigate_Into_The_Adactin_Application()"
});
formatter.result({
  "duration": 4623588698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vishnubalan",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_Enter_The_UserName_Details(String)"
});
formatter.result({
  "duration": 1603745479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Idlysambar@2024",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_Enter_the_Password_Details(String)"
});
formatter.result({
  "duration": 409809517,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Navigates_To_Search_For_Hotel_Page()"
});
formatter.result({
  "duration": 3191606458,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Testing The Adactin App",
  "description": "",
  "id": "hotel-booking-using-adactin-application;testing-the-adactin-app;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Navigate Into The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The UserName \"shan30footbal\" Details",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter the Password \"Sh@n123\" Details",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Navigates To Search For Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Navigate_Into_The_Adactin_Application()"
});
formatter.result({
  "duration": 1127061157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shan30footbal",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_Enter_The_UserName_Details(String)"
});
formatter.result({
  "duration": 393638408,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sh@n123",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_Enter_the_Password_Details(String)"
});
formatter.result({
  "duration": 250013797,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Navigates_To_Search_For_Hotel_Page()"
});
formatter.result({
  "duration": 1332499480,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Search For Hotel",
  "description": "",
  "id": "hotel-booking-using-adactin-application;search-for-hotel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Choose the Location Where To Stay",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Choose the Hotel Based On Location",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Choose Which Type of Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Choose Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Choose The CheckIn Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Choose The CheckOut Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Choose AdultsPerRoom",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Choose ChildrenPerRoom",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "hotel-booking-using-adactin-application;search-for-hotel;",
  "rows": [
    {
      "cells": [
        "location",
        "location1"
      ],
      "line": 30,
      "id": "hotel-booking-using-adactin-application;search-for-hotel;;1"
    },
    {
      "cells": [
        "Los Angeles",
        "Hotel Sunshine"
      ],
      "line": 31,
      "id": "hotel-booking-using-adactin-application;search-for-hotel;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Search For Hotel",
  "description": "",
  "id": "hotel-booking-using-adactin-application;search-for-hotel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Choose the Location Where To Stay",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Choose the Hotel Based On Location",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Choose Which Type of Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Choose Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Choose The CheckIn Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Choose The CheckOut Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Choose AdultsPerRoom",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Choose ChildrenPerRoom",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Choose_the_Location_Where_To_Stay()"
});
formatter.result({
  "duration": 1758846944,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_the_Hotel_Based_On_Location()"
});
formatter.result({
  "duration": 403941931,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_Which_Type_of_Room()"
});
formatter.result({
  "duration": 358836370,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_Number_Of_Rooms()"
});
formatter.result({
  "duration": 247521975,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_The_CheckIn_Date()"
});
formatter.result({
  "duration": 248936002,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_The_CheckOut_Date()"
});
formatter.result({
  "duration": 194451208,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_AdultsPerRoom()"
});
formatter.result({
  "duration": 337680690,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_ChildrenPerRoom()"
});
formatter.result({
  "duration": 214026369,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1849619224,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-using-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user Choose the HotelName TO Stay",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Choose_the_HotelName_TO_Stay()"
});
formatter.result({
  "duration": 313404781,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1301911232,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Book A Hotel",
  "description": "",
  "id": "hotel-booking-using-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "user Provide The FirstName",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "user Provide The LastName",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Provide The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Provide Credit Card No",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Provide Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user Provide Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user Provide CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user Navigates to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Provide_The_FirstName()"
});
formatter.result({
  "duration": 783563431,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Provide_The_LastName()"
});
formatter.result({
  "duration": 378306720,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Provide_The_Billing_Address()"
});
formatter.result({
  "duration": 377912054,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Provide_Credit_Card_No()"
});
formatter.result({
  "duration": 339030253,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Provide_Credit_Card_Type()"
});
formatter.result({
  "duration": 319245005,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Provide_Expiry_Date()"
});
formatter.result({
  "duration": 3256414252,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Provide_CVV_Number()"
});
formatter.result({
  "duration": 286231254,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Navigates_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 275159269,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Booking Confirmation",
  "description": "",
  "id": "hotel-booking-using-adactin-application;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 53,
  "name": "user Navigates to Booked Itenary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Navigates_to_Booked_Itenary_Page()"
});
formatter.result({
  "duration": 8471134417,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Booked Itenary",
  "description": "",
  "id": "hotel-booking-using-adactin-application;booked-itenary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 57,
  "name": "user Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Logout()"
});
formatter.result({
  "duration": 620985,
  "status": "passed"
});
});