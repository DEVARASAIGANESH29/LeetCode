# Write your MySQL query statement below
select employee_id
from Employees
WHERE manager_id NOT IN (SELECT employee_id FROM Employees)
    and manager_id != employee_id
    and salary<30000
order by employee_id asc;