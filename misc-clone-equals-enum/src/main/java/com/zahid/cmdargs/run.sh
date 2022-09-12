#!/usr/bin/bash

# code 2: refined
current_path=$(pwd)
if [[ ! -d bin/ ]]
then
	$(mkdir bin/)
fi

src_path=$(find . -type d -name "src")
cd $src_path
javac -d "$current_path/bin" com/zahid/Main.java
java -cp "$current_path/bin" com.zahid.Main
cd $current_path

# code 1: simple
#cd src
#javac -d bin/ com/zahid/Main.java
#java -cp bin/ com.zahid.Main
#cd ..
