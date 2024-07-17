# Write your MySQL query statement below
select name as Employee from Employee e where managerId is not null and 
Salary > (select Salary from Employee where id = e.managerId)