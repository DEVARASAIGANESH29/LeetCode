# Write your MySQL query statement below
select NAME ,sum(amount) as BALANCE from Users as u
join Transactions as t
    on u.account  = t.account
group by t.account
HAVING Balance > 10000
ORDER BY Balance DESC;