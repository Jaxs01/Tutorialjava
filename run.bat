del src\com\tamingjava\*.class
:: Print needs to be compiled first because it gets called from Main
javac src\com\tamingjava\Print.java
::Main needs to know where Print.class is located...
javac -classpath src; src\com\tamingjava\Main.java 
::calling the programm with the variable "Jaxs "
java -classpath src; com.tamingjava.Main "Jaxs"


 