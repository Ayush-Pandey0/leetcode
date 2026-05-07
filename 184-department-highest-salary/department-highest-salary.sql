# Write your MySQL query statement below
SELECT d.name AS Department,e.name AS Employee, e.salary
FROM Employee e
LEFT JOIN Department d
ON e.departmentId=d.id
WHERE e.salary = (
    SELECT MAX(salary) FROM Employee WHERE e.departmentId=departmentId
)