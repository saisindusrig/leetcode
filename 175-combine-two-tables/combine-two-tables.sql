# Write your MySQL query statement below
select firstName,lastName,state,city from Person left join Address 
on Person.personId = Address.personId