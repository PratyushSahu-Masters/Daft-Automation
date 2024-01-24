# Daft-Automation

Hybrid Framework Setup
======================

Pre-requisite for project setup
===============================
-> An Eclipse IDE/Visual Studio Code to write/execute tests 

-> Install java 17 or above

-> Install testNG

-> Install maven in local machine https://maven.apache.org/install.html

	1. Type command "mvn install" in terminal

	2. Check installed maven version by typing command "mvn -version" in terminal

To execute code through MAVEN
==============================
-> Before you run any command: 

	1. Go to POM file and uncomment SuiteXml file which you wants to execute, comment other SuiteXML file.

	2. Go to terminal and type mvn clean and press enter.

	3. After successfully executing clean command type > "mvn integration-test" command and press enter which is our goal to run all SuiteXMLs.

	4. It will successfully execute the SuiteXML which is set in POM file.

To execute code through testNG
==============================
-> Right click on project

-> Click on Run as

-> Select Run configurations...

-> From dialog box click on browse and select project 'DaftAutomation'

-> Select class/method/suite name you wants to execute and click on apply

-> Click on Run 

Project components
==================
	•	Page objects are in the package com.locators

	•	Test classes are in the package com.daft.pages

	•   Configuration and driver's setup in the package com.daft.init

	•	SuiteXML file in the folder build
    
	• 	Drivers source files for Mac or Windows in the folder drivers
 
