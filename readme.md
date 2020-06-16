###### **Java-Akita example by Sergey Kievskiy**

*****
**Run command:**

$ `gradle(w) clean test` running tests parallels
    
$ `gradle clean generateCucumberReport -i -Ptag=@api` run only API test's

$ `gradle clean generateCucumberReport -i -Ptag=@ui`  run only UI test's

$ `gradle clean generateCucumberReport -i` running tests parallels and generate cucumber report

$ `allure serve build/allure-results` generate allure report  

*****
**Recommended:**
* Java 1.8
* Gradle 4+
  