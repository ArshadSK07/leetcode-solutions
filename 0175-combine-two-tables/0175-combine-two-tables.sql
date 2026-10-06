# Write your MySQL query statement below
select p.firstname , p.lastname , o.city ,o.state from person p left join address o on p.personId = o.personId;