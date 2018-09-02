Project Assessment:
    Cross-Ride is a ride-sharing application developed by a startup company. Cross-Ride allows its users to register as drivers and/or riders. Registered drivers and riders advertise their usual travel schedule on the application. At the end of shared ride driver sends a request to the server with driver id, rider id, the start time of shared ride, the end time of shared ride and the distance covered in kilometers.
    
Notes:
    - Cross-Ride should only accept the data from registered drivers and riders only. 
    - The driver is not allowed to add a ride with end time less than or equal to start time.
    - The driver can enter shared rides with overlapping entries. Like 1 shared ride from 2018-08-24 09:00 to 2018-08-24 10:00 and another ride with start time 2018-08-24 09:30 to 2018-08-24 10:10.
    - Frontend application is out of our scope. It is a separate, fully-functioning application handled by another team, so we do not want to modify it.
    
Tasks:
    1) Increase unit test coverage to reach 60%, achieving more than 60% will only consume your valuable time without an extra score.  
    2) Cross-Ride APIs are developed by inexperienced developer and contains functional/logical bugs. You need to find those issues and fix them and write unit tests.
    3) Frontend team needs a new API to display top 5 drivers with a maximum duration of their shared rides and show average distance covered during that time.

We'll be evaluating your submission from the following perspectives:
    - Code quality and best practices
    - Implementation of new feature
    - Bug fixes
    - Unit Tests
    
Prerequisites:
    Any IDE
    GIT
    Java 8
    MySQL 5.6+

Development Environment:
  MySQL:
    Cross-Ride applications require MySQL database to store its data. Make sure to update application.properties with spring.datasource.URL(change hostname only), spring.datasource.username, and  spring.datasource.password. You are free to choose MySQL service in a cloud or installed on the local machine or MySQL container.
    
    The Cross-Ride application uses liquibase for Database changes. In case you need to update the Database, please create a new changeset file in resources/db.changelog folder and include the newly created file in db.changelog-master.xml
    For more details on liquibase follow https://www.liquibase.org/documentation/changeset.html 
  Cross-Ride Application:
    To start the application run CrossRideApplication.java main method from your IDE.

Production Environment:
  This is how we are going to run and evaluate your submission, so please make sure to run below steps before submitting your answer.

  1) Make sure to run unit tests, check code coverage, ensure the application is compiling and all dependencies are included.
  2) Commit everything using (git add --all && git commit -m "My submission")
  3) Create patch file with name without spaces 'cross-ride-java_<YourNameHere>.patch', using the specified tag as the starting point (git format-patch initial-commit --stdout > cross-ride-java_<yournamehere>.patch)
  4) Store your file in a shared location where Crossover team can access and download it for evaluation. and add your sharable link in the answer field of this question.


