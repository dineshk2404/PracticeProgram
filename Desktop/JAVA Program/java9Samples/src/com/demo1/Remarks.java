package com.demo1;

public class Remarks {
/**
 * 
 *Maven config
 *
 * Download Apache maven
 * Extrct zip
 * Set MAVEN_HOME = maven's root folder dont include bin folder
 * make sure you have 
 * JAVA_HOME = which is pointing to jdk's root folder dont include bin 
 * 
 * 
 * add following in path variable
 * %JAVA_HOME%\bin;%MAVEN_HOME%/bin;
 * 
 *
 *Open fresh command
 *	>mvn
 *Expected output -- Build failure
 *
 *Navigate to user's directory there should be .m2 folder which is created by MAVEN
 *
 *
 *  .m2
 *  	--repository
 *  	--{settings.xml}  -- either you need to download it from net or copy from teammatesD
 *
 *
 *
 *
 *
 * In case maven installtion is not there add it thur eclipse marketplace
 * 
 * In case maven artytype is not there or not able to create project due archtype issue
 * follow below mentioned steps
 * 
 * Windows -> Preferences -> Maven -> Archetypes -- click on add remote catelog
 * File -- http://repo1.maven.org/maven2/archetype-catalog.xml
 * Description  --  add comments
 * 
 * 
 * Maven-archtype-quickstart  -- desktop app
 * Maven-archtype-webapp  -- this is for webapp
 * 
 * 
 *  * FIle - new -- Other -- next -- Select (Maven-archtype-quickstart) --
 * specify 
 * 		groupid  -- tells this projects belongs to which group
 * 		artifactid  -- Project name
 * 		version   -- version no
 *
 *
 *  com.scp.java.nine
 *  MavenDemo
 *  1.0.0-SNAPSHOT
 *
 *
 * 
 * MavenDemo  (desktop App)
 * 	--src/main/java  -- Add your business logic
 * 	--src/test/java   -- Add Modulebase/unit testcase -- TestNG/jUnit (testing frameworks) -- whitebox testing
 * 	--src/main/resources  -- Config file for your business logic such env parameters
 * 	--src/test/resources  -- Test Data and Test related env parameters
 * 	--Libraries 
 * 		--Maven Dependencies  -- these are the proj dependencies specified in pom.xml
 * 		--JRE  -- java library
 *	--src  -- ABove mentioned structure only
 *  --target -- final jar/war  -- compiled files
 *  --pom.xml  -- Project object model -- 
 * 
 * 
 * 
 * Window --Preferences -- Maven -- UserSetting -- make sure
 * Global setting and User settings are pointing to settings.xml that you kept 
 * inside .m2 folder
 * 
 * 
 * Types of pluings
 * 		-- maven compiler  -- To restrict compliance level of ur project
 * 		-- maven surfire  -- for testng test execution
 * 		-- maven jar  -- to build jars
 * 		-- maven resources -- what resources to add and what not to add while building jar/war
 * 
 * 
 * MAven Lifecycle
 * 		-- Generate sources  -- 
 * 		-- compile  -- Complie all the files
 * 		-- Test-compile  -- Compile test classes
 * 		-- test  -- you need to execute test cases-- surfire plugin
 * 		--package  -- 
 * 		-- integration test  -- jar
 * 		-- install  -- target .jar -- repository
 * 		--deploy -- .m2 jar 
 * 
 * 
 * 
 * 
 * 
 * read all screenshots and write down in your own lang
 * Configure maven project on your machine
 * Database crud operations
 * 		Add database jar in pom.xml as a dependency
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	
	
	
	
}
