# Write your MySQL query statement below
select emp1.employee_id,emp1.name,count(emp2.employee_id) reports_count, round(avg(emp2.age)) as average_age
from Employees as emp1
join Employees as emp2
on emp1.employee_id = emp2.reports_to
group by emp1.employee_id,emp1.name
having reports_count>0
order by emp1.employee_id;