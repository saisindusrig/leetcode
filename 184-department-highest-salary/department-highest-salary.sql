# Write your MySQL query statement below
# who have the highest salary in each of the departments.
select d.name as department , e.name as employee, e.salary as Salary 
from Employee e left join Department d  on e.departmentId = d.id
where (d.id,e.salary) in (select departmentId,max(salary) 
from Employee group by departmentId)