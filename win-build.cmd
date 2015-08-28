@echo off

ECHO Preparing folder...
SET CLASSPATH=;%~dp0\lib\antlr-4.5.1-complete.jar;%CLASSPATH%

ECHO Generating parser...
PUSHD "src\grammar"
JAVA org.antlr.v4.Tool -visitor -listener -package grammar FableGrammar.g4
POPD

ECHO Cleaning bin folder...
RMDIR bin /S /Q
MKDIR bin

ECHO Compiling project...
JAVAC -d bin -Xlint:unchecked src/agent/*.java src/communication/*.java src/grammar/*.java src/planner/*.java src/utils/*.java src/*.java

ECHO Executing...
PUSHD bin
JAVA Main
POPD

ECHO Everything done!
