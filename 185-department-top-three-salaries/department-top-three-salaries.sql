# Write your MySQL query statement below
#top three unique
with t as(
    select d.name as Department , e.name as Employee, e.Salary as Salary,
    dense_rank() over (partition by d.id order by e.Salary desc) as the_rank
    from Employee e join Department d on e.departmentId = d.id
)
select Department, Employee,Salary from t 
where the_rank <=3
order by Department,Salary desc



