#!/bin/sh
export CLASSPATH=.:lib/*:conf/:bin/
java -jar target/SQLToNoSQLImporter*.jar -cp lib/*.jar
