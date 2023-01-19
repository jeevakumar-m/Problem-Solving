# Write your MySQL query statement below
select name as Employee from Employee A where salary>(select salary from Employee B where B.id=A.managerId)