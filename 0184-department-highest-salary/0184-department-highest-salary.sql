# Write your MySQL query statement below
-- select d.name as department,
-- e.name as employee,
-- e.salary as salary
-- from employee e 
-- join department d where e.departmentid = d.id
-- where e.salary=(select max(salary) from employee where departmentid = e.departmentid);
SELECT d.name AS Department, 
       e.name AS Employee, 
       e.salary AS Salary
FROM Employee e
JOIN Department d ON e.departmentId = d.id
WHERE e.salary = (
    SELECT MAX(salary)
    FROM Employee
    WHERE departmentId = e.departmentId
);