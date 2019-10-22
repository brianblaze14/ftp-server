# ftp-server


The FTP server code is attached a simple java server could be used for the file transfer.

---------------------------------------------------------------------------------------
The jar is also attached to be executed in the local environment,

# Path
/deploy/one-ftpserver.jar

Run the following commands in the local to test the issue:

# Command to set the username and the password
java -jar one-ftpserver.jar port=10021 id=brian password=1234

# Command to set the username and password and the root directory path
java -jar one-ftpserver.jar port=10021 id=brian password=1234 home=C:/Users/144273/Documents/workspace-spring-tool-suite-4-4.4.0.RELEASE/springboot-camelinaction/data/ftp


Console Output to test:

FTP sever started : ftp://10.100.191.60:10021
# Configuration parameters
- ssl : false
- port : 10021
- passivePorts :
- id : brian
- password : 1234
- home : C:/Users/144273/Documents/workspace-spring-tool-suite-4-4.4.0.RELEASE/springboot-camelinaction/data/ftp

You can specify these parameters by command line arguments with 'key=value' format.
        example 1> java -jar one-ftpserver.jar port=10021 id=benelog password=1234
        example 2> java -jar one-ftpserver.jar port=10021 passivePorts=10125-10199 ssl=true id=benelog password=1234 home=/home/benelog/programs

# Ussage examples of clients
## wget
- download : wget ftp://brian:1234@10.100.191.60:10021/[filename]
## curl
- upload : curl -T [filename] ftp://10.100.191.60:10021 -u brian:1234
- download : curl ftp://10.100.191.60:10021/[filename] -u brian:1234


##URL to test: ftp://10.100.191.60:10021/?username=brian&password=1234



