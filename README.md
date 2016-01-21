# UDF
    Create and configure User Defined Function (UDF) in Hive:- 
      1-	Create a java class UpperCase.java - 
            
           
      2-	Compile java file and Create jar – 
          
      3-	Import jar in hive – 
          Open hive console and import jar file in class path using following command
          add jar file://<Jar file path>;
          Example jar file path = /home/input/my_udf.jar

      4-	Create function in hive –
          Open hive console and run following command
          create function upper_func as '<UDF class name>'
          example - com.my.udf.Upper
       
      5-	Test UDF  -
        Run this query to test the UDF
        select upper_func (<table column name >) from <hive table name>
