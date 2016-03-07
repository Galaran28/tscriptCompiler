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

cd ../test/phase2/initial

# test programs with errors
for prog in 
do
  ../build/bin/ts $prog.ts >&$prog.err
  cmp -s $prog.err results/$prog.err
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.err
done

# test programs without errors
for prog in p1 p2 p3 p4 p5a p5b
do
  node $prog.ts >&$prog.node
  ../../../build/bin/ts $prog.ts >&$prog.out
  cmp -s $prog.out $prog.node
  if [ $? -ne 0 ]
  then echo $prog.ts failed
  fi
  rm -f $prog.out $prog.node
done

cd ../../../bin
