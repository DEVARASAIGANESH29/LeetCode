# Write your MySQL query statement below
select employee_id,if(substr(name,1,1) = 'M' or employee_id%2 = 0 ,0,salary) as bonus
from Employees
order by employee_id;