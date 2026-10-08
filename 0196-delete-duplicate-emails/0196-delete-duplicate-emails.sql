# Write your MySQL query statement below
delete  
p from person p ,person o
where p.email = o.email and p.id >o.id;