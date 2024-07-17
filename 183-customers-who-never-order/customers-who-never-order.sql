# Write your MySQL query statement below
#did not order
select name as Customers from Customers left outer join Orders on 
Customers.id=Orders.customerId where Orders.id is null