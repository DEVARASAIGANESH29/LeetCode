# Write your MySQL query statement below
select E.employee_id
from Employees as E
left join Salaries as S
on E.employee_id = S.employee_id
where  S.employee_id IS null

union 

select S.employee_id
from Employees as E
right join Salaries as S
on E.employee_id = S.employee_id
where E.employee_id IS null


ORDER BY employee_id ASC;