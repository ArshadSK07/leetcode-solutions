SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee m1 
  ON e1.managerId = m1.id
WHERE e1.salary > m1.salary;