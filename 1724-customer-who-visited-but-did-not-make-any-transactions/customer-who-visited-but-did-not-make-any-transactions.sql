# Write your MySQL query statement below
SELECT v.customer_id,COUNT(*) AS count_no_trans
FROM Visits as v
LEFT JOIN Transactions as t
ON v.visit_id =t.visit_id
WHERE t.transaction_id is NULL 
 group by v.customer_id;
