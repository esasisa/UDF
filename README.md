# UDF
    Create and configure User Defined Function (UDF) in Hive:- 
      1-	Create a java class UpperCase.java - 
      
      2-    Add Following jar into classpath -
      
                commons-logging-1.1.3.jar
            	hive-jdbc-0.13.1.2.1.15.0-946.jar
            	hive-service-0.13.1.2.1.15.0-946.jar
            	libfb303-0.9.0.jar
            	libthrift-0.9.0.jar
            	log4j-1.2.16.jar
            	slf4j-api-1.6.1.jar
            	slf4j-log4j12-1.6.1.jar
            	httpclient-4.2.5.jar
            	httpcore-4.2.5.jar
            	hadoop-common-2.4.0.2.1.15.0-946.jar
            	hive-exec-0.13.1.2.1.15.0-946.jar
      
      2-	Compile java file and Create jar –
      
      3-	Import jar in hive – 
      
            Open hive console and import jar file in class path using following command
            add jar file://<Jar file path>;
            Example jar file path = /home/input/my_udf.jar

      4-	Create function in hive –
      
            Open hive console and run following command
            create function upper_func as '<UDF class name>'
            example - com.my.udf.UpperCase
       
      5-	Test UDF  -
      
            Run this query to test the UDF
            select upper_func (<table column name >) from <hive table name>
