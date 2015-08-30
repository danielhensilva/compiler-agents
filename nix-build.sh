#!/bin/bash

echo Exporting classpash...
export CLASSPATH=".:/usr/local/lib/antlr-4.5.1-complete.jar"

echo Generating parser...
pushd src/grammar
java org.antlr.v4.Tool -visitor -listener -package grammar FableGrammar.g4
popd

echo Cleaning bin folder...
rm -r bin
mkdir bin

echo Compiling project...
javac -d bin -Xlint:unchecked src/**/*.java src/*.java

echo Executing...
pushd bin
java Main
popd

echo Everything done!
