❯ sudo -u postgres psql

postgres=# CREATE USER shrikant WITH PASSWORD 'kale';
CREATE ROLE

students_db=# CREATE DATABASE schools_db OWNER shrikant;
CREATE DATABASE

students_db=# GRANT ALL PRIVILEGES ON DATABASE schools_db TO shrikant;
GRANT

students_db=# \c schools_db;
You are now connected to database "schools_db" as user "postgres".

schools_db=# \l
                                    List of databases
    Name     |   Owner   | Encoding |   Collate   |    Ctype    |    Access privileges
-------------+-----------+----------+-------------+-------------+-------------------------
 postgres    | postgres  | UTF8     | en_US.UTF-8 | en_US.UTF-8 |
 schools_db  | shrikant  | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =Tc/shrikant           +
             |           |          |             |             | shrikant=CTc/shrikant
 students_db | shrikant  | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =Tc/shrikant           +
       |           |          |             |             | shrikant=CTc/shrikant
(2 rows)
