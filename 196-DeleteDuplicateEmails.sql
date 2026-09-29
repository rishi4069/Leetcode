# Write your MySQL query statement below
delete p from person p
inner join person s on p.email=s.email
 where p.id > s.id