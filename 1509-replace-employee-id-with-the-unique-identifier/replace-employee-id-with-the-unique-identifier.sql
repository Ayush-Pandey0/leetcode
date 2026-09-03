SELECT second.unique_id, first.name
FROM Employees AS first
LEFT JOIN EmployeeUNI AS second
    ON first.id = second.id;

