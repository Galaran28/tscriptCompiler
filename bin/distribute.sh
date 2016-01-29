#!/bin/bash

#
# tar up the Tscript files
#
# it places the created tar file in the directory that contains the
# tscript directory (the root of the distribution)
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#

# delete any class files that were left in the src directory tree
rm -f ../src/ts/*.class ../src/ts/parse/*.class ../src/ts/support/*.class ../src/ts/tree/*.class ../src/ts/tree/visit/*.class ../src/ts/tree/type/*.class

cd ../..

/bin/rm -f tscript.tar
pushd tscript/src/ts/parse >&/dev/null
make -silent clean
popd >&/dev/null
tar cvf tscript.tar ./tscript/bin ./tscript/README ./tscript/scripts ./tscript/src ./tscript/test

cd tscript/bin

