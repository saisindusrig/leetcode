# Write your MySQL query statement below
delete p2 from person p1,person p2 
where p1.Email = p2.Email and p1.id<p2.id 
