@echo off

SET CLASSPATH=;C:\Projects\Public\compiler-agents\lib\antlr-4.5.1-complete.jar;%CLASSPATH%

pushd src\grammar
java org.antlr.v4.Tool -visitor -listener -package grammar FableGrammar.g4
popd

del /S /Q bin
mkdir bin

javac -d bin -Xlint:unchecked src/agent/*.java src/communication/*.java src/domain/knowledge/*.java src/domain/scene/*.java src/domain/sequence/*.java src/domain/*.java src/grammar/*.java src/planner/*.java src/ui/*.java src/utils/*.java src/Main.java

pushd bin
java Main
popd
