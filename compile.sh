#!/bin/bash

javac -d ./model/ ./model/*.java
javac -d ./controller/ ./controller/*.java -cp ../model/
javac -d ./utilities/ ./utilities/*.java
javac -d ./view/ ./view/*.java

rm ./controller/*.class
rm ./utilities/*.class
rm ./view/*.class

javac Main.java
