#!/bin/bash

# Run the Mail Manager application
echo "Starting Mail Manager..."

CLASSPATH="lib/javax.mail-api-1.6.2.jar:lib/javax.mail-1.6.2.jar:src"

java -cp $CLASSPATH Main
