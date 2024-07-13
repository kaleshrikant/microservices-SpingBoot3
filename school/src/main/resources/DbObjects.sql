mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| schools_db         |
| students_db        |
| sys                |
+--------------------+
6 rows in set (0.01 sec)

mysql> use schools_db;
Database changed

mysql> show tables;
+----------------------+
| Tables_in_schools_db |
+----------------------+
| schools              |
| schools_seq          |
+----------------------+
2 rows in set (0.00 sec)

mysql> select * from schools;
+----+------------------------+------------------------------+
| id | email                  | name                         |
+----+------------------------+------------------------------+
|  1 | ddhs@mh_schools.edu    | Shri Deorao Dada High School |
|  2 | nec@mh_schools.edu     | New English Jr. College      |
|  3 | vbm@mh_schools.edu     | Vidya Bharati Mahavidyalaya  |
|  4 | met-bkc@mh_schools.edu | MET's Bhujbal Knowledge City |
+----+------------------------+------------------------------+
4 rows in set (0.00 sec)

mysql> use students_db;
Database changed

mysql> show tables;
+-----------------------+
| Tables_in_students_db |
+-----------------------+
| students              |
| students_seq          |
+-----------------------+
2 rows in set (0.01 sec)

mysql> select * from students;
+----+------------------------+------------+-----------+-----------+
| id | email                  | first_name | last_name | school_id |
+----+------------------------+------------+-----------+-----------+
|  1 | kaleshrikant@live.com  | Shrikant   | Kale      |         1 |
|  2 | prashukale13@gmail.com | Prashant   | Kale      |         2 |
+----+------------------------+------------+-----------+-----------+
2 rows in set (0.00 sec)
