#!/bin/bash

# do regression testing of ts
#
# if nothing printed, then all tests passed
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#
# this script assumes Node.js is installed as "node" in your path.
#

cd ../test

# test programs with errors
for prog in illegalAssignment undeclaredLval undeclaredRval
do
  ../build/bin/ts $prog.ts >&$prog.err
  cmp -s $prog.err results/$prog.err
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.err
done

# test programs without errors
for prog in ambig assign bigHex exp first fpLiteral hexLiterals nodef redundant str type
do
  node $prog.ts >&$prog.node
  ../build/bin/ts $prog.ts >&$prog.out
  cmp -s $prog.out $prog.node
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.out $prog.node
done

cd ../bin
