#!/bin/bash

# Compile Java files with JavaMail libraries in classpath
echo "Compiling Java files..."

CLASSPATH="lib/javax.mail-api-1.6.2.jar:lib/javax.mail-1.6.2.jar"

javac -cp $CLASSPATH src/*.java

if [ $? -eq 0 ]; then
    echo "✓ Compilation successful!"
else
    echo "✗ Compilation failed"
fi
