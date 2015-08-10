@echo off

cls

SET CLASSPATH=.;..\lib\antlr-4.5-complete.jar

doskey antlr4=java org.antlr.v4.Tool $*
doskey grun=java org.antlr.v4.runtime.misc.TestRig $*

javac -d bin -Xlint:unchecked src/agent/*.java src/communication/*.java src/domain/knowledge/*.java src/domain/scene/*.java src/domain/sequence/*.java src/domain/*.java src/planner/*.java src/ui/*.java src/utils/*.java src/Main.java