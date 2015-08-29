#!/bin/bash

echo Generating parser...
pushd src/grammar
java org.antlr.v4.Tool -visitor -listener -package grammar FableGrammar.g4
popd

echo Cleaning bin folder...
rm -r bin
mkdir bin

echo Compiling project...
javac -d bin -Xlint:unchecked src/agent/*.java src/communication/*.java src/grammar/*.java src/planner/*.java src/utils/*.java src/*.java

echo Executing...
pushd bin
java Main
popd

echo Everything done!
