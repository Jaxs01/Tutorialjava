::del src\com\tamingjava\*.class
:: Print needs to be compiled first because it gets called from Main
::javac src\com\tamingjava\Print.java
::Main needs to know where Print.class is located...
::javac -classpath src; src\com\tamingjava\Main.java 
::calling the programm with the variable "Jaxs "
::java -classpath src; com.tamingjava.Main "Jaxs"
:: Compile, package and run the application via ant
:: ant clean compile jar run 
::java -jar "bin/jar/Main.jar" Jaxs
::java -classpath lib/commons-lang3-3.5.jar;bin/Main.jar com.tamingjava.Main Jaxs
::Run withith Gradle setup
::gradle clean build
::Run the project with Gradle Wrapper
gradle wrapper
