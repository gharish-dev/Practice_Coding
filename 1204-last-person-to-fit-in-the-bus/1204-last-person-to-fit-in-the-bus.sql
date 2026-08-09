# Write your MySQL query statement below
WITH running_total AS (
    SELECT
        person_name,
        turn,
        SUM(weight) OVER (
            ORDER BY turn
        ) AS total_weight
    FROM Queue
)



/*SELECT *
FROM running_total */

select person_name
from running_total 
where total_weight<=1000
ORDER BY turn DESC
limit 1


