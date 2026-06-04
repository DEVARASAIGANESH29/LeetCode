# Write your MySQL query statement below
select emp.name,b.bonus
from Employee as emp
left join Bonus as b
    on emp.empId = b.empId
where b.bonus IS NULL 
        OR b.bonus < 1000;