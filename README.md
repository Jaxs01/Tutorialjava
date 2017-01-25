# README #


### How do I get set up? ###


### Install the following software ###
*     Java (JDK 1.8), 
*     Eclipse,
*      Slack(create a slack account also),
*      Git and Bitbucket (create bit bucket accounts) 
*      Gradle
*      Ant
*      Notepad++ or SublimeText
*      SourceTree
* - Learn basics of working with Git/Bitbucket/SourceTree


* Install Slack for comunication...Team is assurites.slack.com ... #tamingjava


### JAVA ###
*	Check the Java installation on your machine (JDK) otherwise install
*	set home environment JAVA_HOME C:\Program Files (x86)\Java\jdk1.8.0_112  
*	and the path of location of the jdk (google will help)
*		//this should be showing on command line
*	$ java -version
*		java version "1.8.0_112"
*		Java(TM) SE Runtime Environment (build 1.8.0_112-b15)
*		Java HotSpot(TM) 64-Bit Server VM (build 25.112-b15, mixed mode)


### GRADLE ###
*	download Gradle from ...
*	https://docs.gradle.org/current/userguide/installation.html#sec:download
*	set environment for Gradle 
*	(advanced system settings-> GRADLE_HOME C:\Program Files\Gradle\gradle-3.1)
*	& Path %GRADLE_HOME%/bin 
* if everything is right cmd c:\Users\xxx\gradle -version is showing the installed version

	
### MAVEN ###
*	download and install Maven if required ....otherwise go without it ;-)
	
### ANT ###
*	https://www.mkyong.com/ant/how-to-install-apache-ant-on-windows/
	
	
### GIT ###
*	download and install git (https://git-scm.com/download/win)... 
*	it will give you a gitbash also 
	
### Bitbucket ###
* Create a repository in Bitbucket Assurit
* JaxsRepo
* ssh key needs to be added
* install puttygen.exe to generate your personal ssh key for your machine or use it in SourceTree
* download from here http://www.chiark.greenend.org.uk/~sgtatham/putty/download.html
* PuTTYgen: puttygen.exe


### Install Intellij ###

* Create a local Project
* Create a Folder for the Project 
* Create a Java file to print Hello World 

### bitbucket ###

* install SourceTree
* https://www.sourcetreeapp.com/

### GIT ###
* git clone 
* git@bitbucket.org:Jaxs/jaxsrepo.git 
* cd jaxsrepo 
* echo "# My project's README" >> README.md 
* git add README.md git commit -m "Initial commit" 
* git push -u origin master
* If you want to revert changes made to your working copy, do this:
* git checkout .
* If you want to revert changes made to the index (i.e., that you have added), do this. Warning this will reset all of your unpushed commits to master!:
* git reset
* If you want to revert a change that you have committed, do this:
* git revert <commit 1> <commit 2>
* If you want to remove untracked files (e.g., new files, generated files):
* git clean -f
* Or untracked directories (e.g., new or automatically generated directories): 
* git clean -fd


### What are the assignments? ###

* First step: create a repo in assurity bitbucket for yourselves and checkout the same.. no need to create anything else in the repo. Just a readme.md
* Step2 : Create a Java file in the base folder. No need to create maven/gradle project structure yet. write a small main program to print hello world. Call the file Main.java (edited)
* Step3 : add a bash/bat script to compile the file and run it using javac and java commands only
* Step 4: change the directory of the java file to <your project>/src/main/java/Main.java and update your build script to compile from a different folder.
* Step5: create a package com.tamingjava. Move Main.java into this package. Update the compile and run scripts to make sure this change does not break the scripts. (DONOT use IDE like eclipse yet)
* Step6: Add a new Print.java class in com.tamingjava.print package. Add a static method in this class that accepts a String param and prints it.
* Step 7: Call Print.java class from Main.java to print “hello world”.
* Step8: Once done with the above steps, try to checkout each others code and make it work in your machines. This is important to make sure you are writing code/scripts that work in any machine. We can debug this if you face any problems when we meet next
* Step 9: Create a branch and add comments to your code. Once you have added comments, create a pull request for others to review. Donot merge without review.
* Step 10: review each others code. You should atleast review pull request from 3 people.
* Step 11: all steps should be done on a separate branch and pull request has to be used to get it reviewed and merged
* Step 12: Use ANT to compile the code you have written. Also update the compile/run script you have written to call ANT to do the compiling.(Hint: https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html)
* Step 13: Add ANT target to create a jar out of the compiled classes
* Step 14: Create lib folder in your existing project and add this jar into it “http://central.maven.org/maven2/org/apache/commons/commons-lang3/3.5/commons-lang3-3.5.jar". Now update your ant config to use this jar in classpath for compile and run. Use org.apache.commons.lang3.StringUtils to convert “hello world” to uppercase while printing it (edited)
* Step 15: Import the project in eclipse as a java project and set the classpath. review the .classpath and .project file that it creates in the project. add these to .gitignore so you donot checkin the files.
* Step 16: Change the program to print any name you pass while starting the project. (Hint: use args param) (edited)
* Step 17: Write a method that converts the name passed in args and adds it to a string “<uppercaseName> is awesome!!”. Use the String returned by that programme to print in the Print.class
* Step 18: Write a junit testcase to test the new method that returns - “<uppercaseName> is awesome!!”.


### Background ### 
* JAVA - JAVAC how to run from CMD
* http://www.tech-recipes.com/rx/30018/how-to-compile-java-programs-through-windows-cmd/
* Domain modeling

### Set up Eclipse ###
* Project -> New -> Java Project 
* Unclick "Use default location" and browse to the folder where the Project is locatet localy-> finish
* Run -> Run Configuration ->Project = TutorialJava, Main class = com.tamingjava.Main
* Arguments = Jaxs
* Classpath -> User Entries = Folder TutorialJava and commons-lang3-3.5jar -\TutorialJava\lib\