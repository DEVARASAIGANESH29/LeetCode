select MAX(num) as num from
(
    select num from Mynumbers
    group by num
    having COUNT(num) = 1
) as Unique_number