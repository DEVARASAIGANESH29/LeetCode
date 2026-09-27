# Write your MySQL query statement below
SELECT product_id, 'store1' AS store,store1 as price FROM Products
where store1 IS NOT  null
UNION
SELECT product_id,'store2' AS store, store2 FROM Products where store2 IS NOT  null
UNION
SELECT product_id, 'store3' AS store,store3 FROM Products where store3 IS NOT  null;