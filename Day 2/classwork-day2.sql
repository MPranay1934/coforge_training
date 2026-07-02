create database employee;
use employee;
create table tbl_emplo(
eid integer,
ename varchar(50),
esalary int,
dno int);
desc tbl_emplo;
insert into tbl_emplo values(101,'Suresh',10000,10);
insert into tbl_emplo values(102,'Ramesh',20000,20);
insert into tbl_emplo values(103,'Naresh',30000,10);
insert into tbl_emplo values(104,'Kamesh',40000,20);

SET SQL_SAFE_UPDATES = 0;


select * from tbl_empl;
select dno, count(*) as "total no. of employees" from tbl_emplo group by dno;
select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_emplo group by dno;
select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_emplo group by dno 
having min(esalary)>10000;
select dno,sum(esalary),avg(esalary),min(esalary),max(esalary) from tbl_emplo group by dno 
order by dno desc;
select * from tbl_emplo order by eid desc;






create table tbl_dept(
dno int,
dname varchar(50));
insert into tbl_dept values(10,'Development');
insert into tbl_dept values(20,'Testing');
select * from tbl_dept;
select dname from tbl_dept where dno=(select dno from tbl_emplo where eid=101);
select * from tbl_emplo where dno=(select dno from tbl_dept where dname='Testing');
select dname from tbl_dept where dno=(select dno from tbl_emplo where ename='Suresh');
select dname from tbl_dept where dno=(select dno from tbl_emplo where eid=101 or eid=102);
select dname from tbl_dept where dno in (select dno from tbl_emplo where eid=101 or eid=102);

drop table tbl_emplo;


create table tbl_emplo(
eid integer primary key,
ename varchar(50) not null,
esalary int check(esalary > 0),
email varchar(20) unique,
dno int);

insert into tbl_emplo values(102,'s',20000,34,10);
drop table tbl_emplo;
drop table tbl_dept;
create table tbl_dept(dno int primary key,dname varchar(50));
create table tbl_emplo(
eid integer primary key,
ename varchar(50) not null,
esalary int check(esalary > 0),
email varchar(20) unique,
dno int);
drop table tbl_emplo;
create table tbl_emplo(
eid integer primary key,
ename varchar(50),
esalary int,
dno int, foreign key (dno) references tbl_dept(dno));
drop table tbl_emplo;
insert into tbl_emplo values(101,'P',1000,10);
DELIMITER //
create procedure insertEmployee(in eid integer,in ename varchar(20),in esalary integer,in dno integer)
begin
insert into tbl_emplo (eid,ename,esalary,dno)
values (eid,ename,esalary,dno);
end //
DELIMITER ;
drop procedure insertEmployee;
create table tbl_emplo(
eid integer primary key,
ename varchar(50),
esalary int,
dno int);
select * from tbl_emplo;
insert into tbl_emplo values(101,'varun',20000,20);
call insertEmployee(103,'valan',30000,10);
desc table tbl_emplo;
desc tbl_emplo;


DELIMITER //
create procedure getEmployeeName(in empid int,out empname varchar(20))
begin 
 select ename into empname from tbl_emplo where eid=empid;
 end//

 call getEmployeeName(101,@empname);
 select @empname;
 insert into tbl_emplo values (101,'Ramesh',10000,10);
 DELIMITER //
create function getEmpName(empid int) returns varchar(20) deterministic
begin
 declare empname varchar(20);
 select ename into empname from tbl_emplo where eid=empid;
 return empname;
 end //
select getEmpName(101);
drop function getEmpName;


select * from tbl_emplo;

insert into tbl_emplo values(104,'Roop',40000,10);
insert into tbl_emplo values(105,'Errp',50000,20);

select * from tbl_dept;

insert into tbl_dept values(20,'Manufacturing');
insert into tbl_dept values(30,'Speaking');

select tbl_emplo.eid,tbl_dept.dname,tbl_dept.dno from tbl_emplo,tbl_dept where tbl_emplo.dno=tbl_dept.dno;
select e.eid,d.dname,d.dno from tbl_emplo e,tbl_dept d where e.dno=d.dno;
select e.eid,d.dname,d.dno from tbl_emplo e join tbl_dept d on e.dno=d.dno;
select e.eid,d.dname,d.dno from tbl_emplo e join tbl_dept d on e.dno<>d.dno;
select tbl_emplo.eid,tbl_dept.dname,tbl_dept.dno from tbl_emplo inner join tbl_dept on tbl_emplo.dno=tbl_dept.dno;

select * from tbl_emplo left join tbl_dept on tbl_emplo.dno=tbl_dept.dno;
select * from tbl_emplo right join tbl_dept on tbl_emplo.dno=tbl_dept.dno;