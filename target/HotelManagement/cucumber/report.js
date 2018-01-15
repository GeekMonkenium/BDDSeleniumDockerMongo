$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HotelManagement.feature");
formatter.feature({
  "line": 2,
  "name": "As a Hotel Management Platform User, I want to perform CRUD operations",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HotelManagement"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Verify admin can register a hotel",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@CreateHotel"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user logs in as \u003cUserName\u003e into the system with password \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user logs in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the user creates a hotel as hotel",
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "\u003cHotel Name\u003e"
      ],
      "line": 13
    },
    {
      "cells": [
        "Address",
        "\u003cAddress\u003e"
      ],
      "line": 14
    },
    {
      "cells": [
        "Owner",
        "\u003cOwner\u003e"
      ],
      "line": 15
    },
    {
      "cells": [
        "Phone number",
        "\u003cPhoneNumber\u003e"
      ],
      "line": 16
    },
    {
      "cells": [
        "Email",
        "\u003cEmail\u003e"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the user selects create",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "\u003cHotel Name\u003e is created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the user deletes \u003cHotel Name\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the user logs out",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Hotel Name",
        "Address",
        "Owner",
        "PhoneNumber",
        "Email"
      ],
      "line": 24,
      "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;1"
    },
    {
      "cells": [
        "admin",
        "password",
        "Hotel 1",
        "London City",
        "Parveen",
        "0208571000",
        "abc@abc.com"
      ],
      "line": 25,
      "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4044770574,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 132287509,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify admin can register a hotel",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HotelManagement"
    },
    {
      "line": 7,
      "name": "@CreateHotel"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user logs in as admin into the system with password password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user logs in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the user creates a hotel as hotel",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "Hotel 1"
      ],
      "line": 13
    },
    {
      "cells": [
        "Address",
        "London City"
      ],
      "line": 14
    },
    {
      "cells": [
        "Owner",
        "Parveen"
      ],
      "line": 15
    },
    {
      "cells": [
        "Phone number",
        "0208571000"
      ],
      "line": 16
    },
    {
      "cells": [
        "Email",
        "abc@abc.com"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the user selects create",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Hotel 1 is created successfully",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the user deletes Hotel 1",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 32472,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 16
    },
    {
      "val": "password",
      "offset": 52
    }
  ],
  "location": "HotelManagementStepDef.userLogsInAsAdminIntoTheSystemWithPasswordPassword(String,String)"
});
formatter.result({
  "duration": 1334168921,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.userLogsInSuccessfully()"
});
formatter.result({
  "duration": 249097580,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserCreatesAHotelAsHotel(DataTable)"
});
formatter.result({
  "duration": 422314529,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserSelectsCreate()"
});
formatter.result({
  "duration": 61381887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel 1",
      "offset": 0
    }
  ],
  "location": "HotelManagementStepDef.hotelNameIsCreatedSuccessfully(String)"
});
formatter.result({
  "duration": 625510301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel 1",
      "offset": 17
    }
  ],
  "location": "HotelManagementStepDef.theUserDeletesTheFollowingHotel(String)"
});
formatter.result({
  "duration": 136308372,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserLogsOut()"
});
formatter.result({
  "duration": 316046150,
  "status": "passed"
});
formatter.after({
  "duration": 6481939,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Verify admin can register a hotel",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@DeleteHotel"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user logs in as \u003cUserName\u003e into the system with password \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user logs in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "the user creates a hotel as hotel",
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "\u003cHotel Name\u003e"
      ],
      "line": 33
    },
    {
      "cells": [
        "Address",
        "\u003cAddress\u003e"
      ],
      "line": 34
    },
    {
      "cells": [
        "Owner",
        "\u003cOwner\u003e"
      ],
      "line": 35
    },
    {
      "cells": [
        "Phone number",
        "\u003cPhoneNumber\u003e"
      ],
      "line": 36
    },
    {
      "cells": [
        "Email",
        "\u003cEmail\u003e"
      ],
      "line": 37
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "the user selects create",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "the user deletes \u003cHotel Name\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "the \u003cHotel Name\u003e is deleted successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "the user logs out",
  "keyword": "And "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Hotel Name",
        "Address",
        "Owner",
        "PhoneNumber",
        "Email"
      ],
      "line": 44,
      "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;1"
    },
    {
      "cells": [
        "admin",
        "password",
        "Hotel 2",
        "London Heathrow",
        "Chris",
        "0208571000",
        "abc@abc.com"
      ],
      "line": 45,
      "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 117365494,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 37758,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Verify admin can register a hotel",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@DeleteHotel"
    },
    {
      "line": 1,
      "name": "@HotelManagement"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user logs in as admin into the system with password password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user logs in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "the user creates a hotel as hotel",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "Hotel 2"
      ],
      "line": 33
    },
    {
      "cells": [
        "Address",
        "London Heathrow"
      ],
      "line": 34
    },
    {
      "cells": [
        "Owner",
        "Chris"
      ],
      "line": 35
    },
    {
      "cells": [
        "Phone number",
        "0208571000"
      ],
      "line": 36
    },
    {
      "cells": [
        "Email",
        "abc@abc.com"
      ],
      "line": 37
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "the user selects create",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "the user deletes Hotel 2",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "the Hotel 2 is deleted successfully",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "the user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 58902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 16
    },
    {
      "val": "password",
      "offset": 52
    }
  ],
  "location": "HotelManagementStepDef.userLogsInAsAdminIntoTheSystemWithPasswordPassword(String,String)"
});
formatter.result({
  "duration": 818870458,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.userLogsInSuccessfully()"
});
formatter.result({
  "duration": 132554458,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserCreatesAHotelAsHotel(DataTable)"
});
formatter.result({
  "duration": 355335375,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserSelectsCreate()"
});
formatter.result({
  "duration": 70962636,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel 2",
      "offset": 17
    }
  ],
  "location": "HotelManagementStepDef.theUserDeletesTheFollowingHotel(String)"
});
formatter.result({
  "duration": 262148680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel 2",
      "offset": 4
    }
  ],
  "location": "HotelManagementStepDef.theHotelNameIsDeletedSuccessfully(String)"
});
formatter.result({
  "duration": 90588937,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserLogsOut()"
});
formatter.result({
  "duration": 215286305,
  "status": "passed"
});
formatter.after({
  "duration": 4026150,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 48,
  "name": "Verify admin can register a hotel",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 47,
      "name": "@CreateMultipleHotel"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "user logs in as \u003cUserName\u003e into the system with password \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user logs in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "the user creates a hotel as hotel",
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "\u003cHotel Name\u003e"
      ],
      "line": 53
    },
    {
      "cells": [
        "Address",
        "\u003cAddress\u003e"
      ],
      "line": 54
    },
    {
      "cells": [
        "Owner",
        "\u003cOwner\u003e"
      ],
      "line": 55
    },
    {
      "cells": [
        "Phone number",
        "\u003cPhoneNumber\u003e"
      ],
      "line": 56
    },
    {
      "cells": [
        "Email",
        "\u003cEmail\u003e"
      ],
      "line": 57
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "the user selects create",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "\u003cHotel Name\u003e is created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "the user logs out",
  "keyword": "And "
});
formatter.examples({
  "line": 62,
  "name": "",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Hotel Name",
        "Address",
        "Owner",
        "PhoneNumber",
        "Email"
      ],
      "line": 63,
      "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;1"
    },
    {
      "cells": [
        "admin",
        "password",
        "Hotel 3",
        "Reading",
        "Richard",
        "0208571000",
        "abc@abc.com"
      ],
      "line": 64,
      "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;2"
    },
    {
      "cells": [
        "admin",
        "password",
        "Hotel 4",
        "Croydon",
        "Satish",
        "0208234000",
        "def@def.com"
      ],
      "line": 65,
      "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 80879432,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 42290,
  "status": "passed"
});
formatter.scenario({
  "line": 64,
  "name": "Verify admin can register a hotel",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HotelManagement"
    },
    {
      "line": 47,
      "name": "@CreateMultipleHotel"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "user logs in as admin into the system with password password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user logs in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "the user creates a hotel as hotel",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "Hotel 3"
      ],
      "line": 53
    },
    {
      "cells": [
        "Address",
        "Reading"
      ],
      "line": 54
    },
    {
      "cells": [
        "Owner",
        "Richard"
      ],
      "line": 55
    },
    {
      "cells": [
        "Phone number",
        "0208571000"
      ],
      "line": 56
    },
    {
      "cells": [
        "Email",
        "abc@abc.com"
      ],
      "line": 57
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "the user selects create",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Hotel 3 is created successfully",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "the user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 21145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 16
    },
    {
      "val": "password",
      "offset": 52
    }
  ],
  "location": "HotelManagementStepDef.userLogsInAsAdminIntoTheSystemWithPasswordPassword(String,String)"
});
formatter.result({
  "duration": 866205564,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.userLogsInSuccessfully()"
});
formatter.result({
  "duration": 173523921,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserCreatesAHotelAsHotel(DataTable)"
});
formatter.result({
  "duration": 768549060,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserSelectsCreate()"
});
formatter.result({
  "duration": 71909988,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel 3",
      "offset": 0
    }
  ],
  "location": "HotelManagementStepDef.hotelNameIsCreatedSuccessfully(String)"
});
formatter.result({
  "duration": 642786535,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserLogsOut()"
});
formatter.result({
  "duration": 198576065,
  "status": "passed"
});
formatter.after({
  "duration": 2216780,
  "status": "passed"
});
formatter.before({
  "duration": 91674105,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 31339,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "Verify admin can register a hotel",
  "description": "",
  "id": "as-a-hotel-management-platform-user,-i-want-to-perform-crud-operations;verify-admin-can-register-a-hotel;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HotelManagement"
    },
    {
      "line": 47,
      "name": "@CreateMultipleHotel"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "the user go to the Hotel Management Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "user logs in as admin into the system with password password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user logs in successfully",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "the user creates a hotel as hotel",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "Hotel Name",
        "Hotel 4"
      ],
      "line": 53
    },
    {
      "cells": [
        "Address",
        "Croydon"
      ],
      "line": 54
    },
    {
      "cells": [
        "Owner",
        "Satish"
      ],
      "line": 55
    },
    {
      "cells": [
        "Phone number",
        "0208234000"
      ],
      "line": 56
    },
    {
      "cells": [
        "Email",
        "def@def.com"
      ],
      "line": 57
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "the user selects create",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Hotel 4 is created successfully",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "the user logs out",
  "keyword": "And "
});
formatter.match({
  "location": "HotelManagementStepDef.theUserGoToTheHotelManagementPlatform()"
});
formatter.result({
  "duration": 30207,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 16
    },
    {
      "val": "password",
      "offset": 52
    }
  ],
  "location": "HotelManagementStepDef.userLogsInAsAdminIntoTheSystemWithPasswordPassword(String,String)"
});
formatter.result({
  "duration": 843953563,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.userLogsInSuccessfully()"
});
formatter.result({
  "duration": 172323590,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserCreatesAHotelAsHotel(DataTable)"
});
formatter.result({
  "duration": 400236970,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserSelectsCreate()"
});
formatter.result({
  "duration": 71347014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel 4",
      "offset": 0
    }
  ],
  "location": "HotelManagementStepDef.hotelNameIsCreatedSuccessfully(String)"
});
formatter.result({
  "duration": 217890483,
  "status": "passed"
});
formatter.match({
  "location": "HotelManagementStepDef.theUserLogsOut()"
});
formatter.result({
  "duration": 208759056,
  "status": "passed"
});
formatter.after({
  "duration": 4014445,
  "status": "passed"
});
});