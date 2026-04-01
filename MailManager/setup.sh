#!/bin/bash

# Download JavaMail and Activation Framework libraries
echo "Downloading JavaMail libraries..."

cd lib/

# Download JavaMail API
curl -L https://repo1.maven.org/maven2/javax/mail/javax.mail-api/1.6.2/javax.mail-api-1.6.2.jar -o javax.mail-api-1.6.2.jar

# Download JavaMail implementation
curl -L https://repo1.maven.org/maven2/com/sun/mail/javax.mail/1.6.2/javax.mail-1.6.2.jar -o javax.mail-1.6.2.jar

echo "Libraries downloaded successfully to lib/ folder"
