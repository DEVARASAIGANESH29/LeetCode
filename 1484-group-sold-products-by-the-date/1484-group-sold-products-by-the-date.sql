# Write your MySQL query statement below
select sell_date,
COUNT(DISTINCT product) as num_sold,
group_concat(DISTINCT product)as products
from Activities
group by sell_date;