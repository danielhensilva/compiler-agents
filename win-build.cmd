@echo off

ECHO Killing java...
powershell kill -name "java" -ErrorAction SilentlyContinue

ECHO Cleaning bin folder...
RMDIR bin /S /Q
MKDIR bin

ECHO Preparing folder...
SET CLASSPATH=;%~dp0\lib\antlr-4.5.1-complete.jar

ECHO Generating parser...
PUSHD "src\gramatica"
JAVA org.antlr.v4.Tool -visitor -listener -package gramatica FableGrammar.g4
POPD

ECHO Compiling project...
JAVAC -d bin -Xlint:unchecked src/agente/*.java src/comunicacao/*.java src/dominio/*.java src/gramatica/*.java src/planejamento/*.java src/utilitario/*.java src/*.java

ECHO Executing...
PUSHD bin
JAVA Main
POPD

ECHO Everything done!
