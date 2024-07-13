**: To convert the Mono-Repo project to executable modules :**

1. Create Mono-Repo project, e.g. micro-services[]()
2. Create module, e.g. [Api-Gateway](Api-Gateway) 
3. To make this module active follow below steps to import as module.
   1. File --> New --> Module From Existing Source
   2. Under micro-services[]() 
   3. Select `build.gradle` or `POM.xml` of [Api-Gateway](Api-Gateway)
   4. Select `Open` and Setup-JDK
4. Follow same above steps for all other forthcoming modules.


## **Access Denied for User 'root'@'localhost' (using password: YES) - No Privileges?**


Try the following commands

~$ sudo /etc/init.d/mysql stop
~$ sudo mysqld_safe --skip-grant-tables &
~$ mysql -u root
Welcome to the MySQL monitor.  Commands end with ; or \g.

Your MySQL connection id is 1 to server version: 4.1.15-Debian_1-log

Type 'help;' or '\h' for help. Type '\c' to clear the buffer.

mysql>

mysql> use mysql;

mysql> update user set password=PASSWORD("root") where User='root';

mysql> flush privileges;

mysql> quit

~$ sudo /etc/init.d/mysql stop

Stopping MySQL database server: mysqld

STOPPING server from pid file /var/run/mysqld/mysqld.pid

mysqld_safe[6186]: ended

[1]+  Done                    mysqld_safe --skip-grant-tables

~$ sudo /etc/init.d/mysql start

~$ mysql -u root -p

* MySQL Community Server 5.6.35 is started
  ~$ mysql -u root -p
  Enter password:
  Welcome to the MySQL monitor.  Commands end with ; or \g.
  Your MySQL connection id is 1
  Server version: 5.6.35 MySQL Community Server (GPL)

Copyright (c) 2000, 2016, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> 

