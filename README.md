Automation and Testing Projects
This repository contains three projects related to automation and software testing, each focused on different technologies and testing approaches.

Prerequisites
Before running any of the projects, make sure you have the following installed:

Java v11 or higher and JDK (environment variables configured)
IntelliJ IDEA (2023.1) or higher
Gradle v6.5 or higher (environment variables configured)
Cucumber
Git
Maven 3.9.6
Apache JMeter 5.6.3

Installation
Import the project into IntelliJ IDEA as an existing Gradle project.
Import the project into IntelliJ IDEA as an existing Maven project.
Configure JRE System Library with JavaSE-8 or higher.
Configure the project encoding to UTF-8 once imported.
Projects
JMeter Load and Stress Test
This project uses Apache JMeter to perform load and stress testing on the API.
It provides a set of predefined configurations and test scenarios to simulate different loads on the application under test.

Automation with TestNG
In this project, TestNG is used as the testing framework for functional test automation.
It offers an organized structure to write and execute unit, integration, and end-to-end tests.
It includes test cases where the functionality of the "Contact Us" button and error messages that may occur when filling out the information are reviewed.
It also includes a test case for changing the language on the Amazon page, where the language change is validated with the page titles.

Automation with Screenplay Design Pattern
This project implements the Screenplay design pattern for acceptance test automation.
It focuses on creating interactions between actors and UI elements to improve the readability and maintainability of tests.
The tests performed in this project are the same tests that were carried out in TestNG.

co.com.certification.entreamigos.exceptions

Classes that capture custom exceptions when automation fails to find an expected code.
co.com.certification.entreamigos.interactions

Classes that perform actions not provided by the SerenityBDD/screenplay framework, such as selecting a date on a calendar, waiting for a specific time, injecting authentic messages.
co.com.certification.entreamigos.model

Classes used to construct data models using the builder pattern.
co.com.certification.entreamigos.questions

Classes used to ask questions to the system to be later verified in the step definitions (asserts).
co.com.certification.entreamigos.tasks

Classes that perform high-level actions, such as authenticating in the application, entering data into a form, etc.
co.com.certification.entreamigos.userinterface

Classes where user interface elements are mapped and also for interaction with each of these elements.
co.com.certification.entreamigos.util

Classes containing common functionalities.
co.com.certification.entreamigos.runners

Runners to execute automation with the scenarios indicated in the feature.
co.com.certification.entreamigos.stepdefinitions

Classes that are the entry point of the feature for automation execution.
features

Contains the features of the project.