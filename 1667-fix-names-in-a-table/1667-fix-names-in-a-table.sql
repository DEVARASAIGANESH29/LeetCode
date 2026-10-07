# Write your MySQL query statement below
select user_id,concat(upper(substr(name,1,1)),Lower(substr(name,2))) as name
from Users
order by user_id;