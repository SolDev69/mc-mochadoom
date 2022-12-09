#!/bin/bash

cd src
find . -type f -name '*.class' -delete
javac -cp . mochadoom/Main.java
jar cmf Manifest.txt mochadoom.jar .
zip -d mochadoom.jar *.java README.md Manifest.txt

