# Write your MySQL query statement below

with cte_f1 as
(

    select e.name as Employee,e.salary as Salary,d.name as Department from Employee e 
    inner join Department d on e.departmentId=d.id

)


select Department,Employee,Salary from (
select *,dense_rank() over(partition by Department order by Salary desc) as drank from cte_f1
    ) output where drank<=3 
    
