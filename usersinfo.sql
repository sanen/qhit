--query  查询部分 
insert into usersinfo values('lidind','boy',18)
--1
select *From usersinfo where id<8
--1
select *from usersinfo where username='Tom'
--1
select *From usersinfo where age>21
--1
select *From usersinfo where age between 19 and 20
--1
select *From usersinfo where age in(19,20)
--1
select *from usersinfo where username like '%y%'
--1

select username From usersinfo 
--1
select id,username,age from usersinfo
--1
select count(*) from usersinfo
--1
select distinct username From usersinfo where username='guests' 
--1
--select distinct username,age From usersinfo where username='guests' or age=25
--1 单项修改
update usersinfo set age=17 where id=9
--批量修改
--update usersinfo set sex='girl' where id>10
select id,username,age from Usersinfo where id<5 and username like '%l%'
--1单项删除
delete usersinfo where id=13
--批量删除
--delete usersinfo where id>10
--查询并排序
select *From usersinfo order by username
--查询并分组
select count(*)人数 ,age from usersinfo group by age
select count(*) ,age from usersinfo group by age  having count(age)>1

--查询分组并筛选
select count(*),age from usersinfo group by age having count(age)>1


select max(age) maxage,count(*) counts,min(username) minusername from usersinfo group by id order by id
select max(age) maxage,count(*) counts,min(username) minusername from usersinfo

