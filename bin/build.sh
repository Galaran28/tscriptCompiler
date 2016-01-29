#!/bin/bash

#
# build the Tscript system
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#

# disable the JAVA_TOOL_OPTIONS environment variable that exists on agate
unset JAVA_TOOL_OPTIONS

# delete any class files that were left in the src directory tree
rm -f ../src/ts/*.class ../src/ts/parse/*.class ../src/ts/support/*.class ../src/ts/tree/*.class ../src/ts/tree/visit/*.class ../src/ts/tree/type/*.class

# first make sure the generated parser is up to date
cd ..
cd src/ts/parse
make
cd ../../..

# now compile the translator
javac -g -cp src:build/lib/antlr.jar:build/lib/javassist.jar -d build/packages -Xlint:unchecked src/ts/Main.java

# now compile the runtime support
javac -g -cp src -d build/packages -Xlint:unchecked src/ts/support/*.java

# now run javadoc
javadoc -classpath build/packages:build/lib/antlr.jar:build/lib/javassist.jar -d build/html -use -package -quiet -doctitle "ts" src/ts/*.java src/ts/parse/TreeBuilder.java src/ts/support/*.java src/ts/tree/*.java src/ts/tree/visit/*.java src/ts/tree/type/*.java

cd bin
