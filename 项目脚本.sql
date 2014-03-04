
use qhits309_02
go

select * From sys.tables order by modify_date desc
select *From users
select *From student
/*
select *from student where  englishMarks in
(
select Max(englishMarks) from student
)
*/
select *From student order by englishMarks --学生成绩表
select *From person --登录用户表
select *From userinfo --用户基本信息表
select *From usersinfo
insert into student values('T03','user',63,90,85)

--映射方式一  父子同表
select *From usersll

--映射方式二  父子表
select *From dbo.usersll_2
select *From dbo.guest_user
select *From dbo.power_user
--映射方式一图书信息表
select *From book
--映射方式二 图书信息表

select *from book2
select *From goodbook
select *From newbook
--select *From book2,goodbook where book2.id=goodbook.goodbook_id

--客户与订单
select *From customer
select *From orders
--insert into orders values(9,'48',2)

drop table ordersTest
drop table customerTest

select *From customerTest

select *From ordersTest


select *From customer2
select *From orders2
/*
 alter table ordersTest 
        drop constraint FK2E212117B56FFFB0

    drop table customertest

    drop table ordersTest

    create table customertest (
        id int identity not null,
        name varchar(255) null,
        address varchar(255) null,
        primary key (id)
    )

    create table ordersTest (
        id int identity not null,
        orderNumber varchar(255) null,
        order_id int null,
        primary key (id)
    )

    alter table ordersTest 
        add constraint FK2E212117B56FFFB0 
        foreign key (order_id) 
        references customertest
*/
--单向

select *From room
select *From people

/*
 alter table people 
        drop constraint FKC4E2328F4FD4173E

    drop table people

    drop table room

    create table people (
        id numeric(19,0) identity not null,
        name varchar(255) null,
        room_id numeric(19,0) null unique,
        primary key (id)
    )

    create table room (
        id numeric(19,0) identity not null,
        address varchar(255) null,
        primary key (id)
    )

    alter table people 
        add constraint FKC4E2328F4FD4173E 
        foreign key (room_id) 
        references room

*/


select *From t_person
select *From idcard



select t.id,t.name,i.cname from t_person t,idcard i where t.id=i.id
/*
alter table testaa 
        drop constraint FKCBB7743216C3BB24

    drop table testaa

    drop table testbb

    create table testaa (
        id int identity not null,
        name varchar(255) null,
        bb_id int not null unique,
        primary key (id)
    )

    create table testbb (
        id int identity not null,
        name varchar(255) null,
        primary key (id)
    )

    alter table testaa 
        add constraint FKCBB7743216C3BB24 
        foreign key (bb_id) 
        references testbb

*/
/*
--测试死锁表如何进行删除
--两个表产生死锁的情况
--注意带有主外键约束的表与表来说 要想删除它们 首先要先删除它们的约束 然后进行对表的删除
    alter table testaa 
        drop constraint FKCBB77432E0567032

    alter table testbb 
        drop constraint FKCBB77452E047E432

    drop table testaa

    drop table testbb

    create table testaa (
        id int identity not null,
        name varchar(255) null,
        bb_id int null unique,
        primary key (id)
    )

    create table testbb (
        id int identity not null,
        name varchar(255) null,
        aa_id int null unique,
        primary key (id)
    )

    alter table testaa 
        add constraint FKCBB77432E0567032 
        foreign key (bb_id) 
        references testbb

    alter table testbb 
        add constraint FKCBB77452E047E432 
        foreign key (aa_id) 
        references testaa

insert into testaa values('testaa',1)
insert into testbb values('testbb',1)

*/

sp_help testbb

select *From testaa
select *From testbb
select *From testaa a,testbb b where a.id=b.id --此种表间查询错误 不能查询出符合要求的完整性数据
select *From testaa a,testbb b where a.bb_id=b.id 
select *From testaa a,testbb b where b.aa_id=a.id 


--多对多 实体映射
/*
 alter table five_user_server 
        drop constraint FKC231502AA14188BA

    alter table five_user_server 
        drop constraint FKC231502A7450D632

    alter table five_user_server 
        drop constraint FKC231502AA4411F32

    drop table five_server

    drop table five_user

    drop table five_user_server

    create table five_server (
        server_id numeric(19,0) not null,
        address varchar(255) null,
        primary key (server_id)
    )

    create table five_user (
        user_id numeric(19,0) not null,
        name varchar(255) null,
        primary key (user_id)
    )

    create table five_user_server (
        server_id numeric(19,0) not null,
        user_id numeric(19,0) not null
    )

    alter table five_user_server 
        add constraint FKC231502AA14188BA 
        foreign key (server_id) 
        references five_user

    alter table five_user_server 
        add constraint FKC231502A7450D632 
        foreign key (server_id) 
        references five_server

    alter table five_user_server 
        add constraint FKC231502AA4411F32 
        foreign key (user_id) 
        references five_user
*/
select *from five_user
select *from five_server
select *From five_user_server order by [user_id]

select *From sys.tables

select *From customer2
select *From orders2
---体验

select *From dbo.practice_student
select *From practice_score

insert 
    into
        practice_student
        (sname, sage) 
    values
        (?, ?)

    insert 
    into
        practice_score
        (yewen, shuxue, student_id) 
    values
        (?, ?, ?)

    update
        practice_score 
    set
        student_id=? 
    where
        score_id=?





