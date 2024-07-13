❯ sudo -u postgres psql

postgres=# CREATE USER shrikant WITH PASSWORD 'kale';
CREATE ROLE

postgres=# CREATE DATABASE students_db OWNER shrikant;
CREATE DATABASE

postgres=# GRANT ALL PRIVILEGES ON DATABASE students_db TO shrikant;
GRANT

postgres=# \c students_db
You are now connected to database "students_db" as user "postgres".

students_db=# \l
                                    List of databases
    Name     |   Owner   | Encoding |   Collate   |    Ctype    |    Access privileges
-------------+-----------+----------+-------------+-------------+-------------------------
 students_db | shrikant  | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =Tc/shrikant           +
             |           |          |             |             | shrikant=CTc/shrikant
