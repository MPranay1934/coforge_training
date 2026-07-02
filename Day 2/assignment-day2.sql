CREATE DATABASE EmployeeManagement;
USE EmployeeManagement;
CREATE TABLE Department (
   DeptID INT PRIMARY KEY,
   DeptName VARCHAR(50),
   Location VARCHAR(50)
);
INSERT INTO Department VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');
CREATE TABLE Employee (
   EmpID INT PRIMARY KEY,
   EmpName VARCHAR(50),
   Gender VARCHAR(10),
   Age INT,
   Salary DECIMAL(10,2),
   Designation VARCHAR(50),
   DeptID INT,
   HireDate DATE,
   FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);
INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');
CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);
INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');

select * from Employee;
select EmpName,Salary from 
Employee;
select * from Employee where Salary>50000;
select * from Employee where age>30;

select * from Department where DeptName='IT';
select * from Employee where Gender='Female';
select * from Employee where HireDate > '2022-01-01';

select * from Employee 
order by salary asc;
select * from Employee 
order by EmpName asc;


select count(*) as "total no. of employees" from Employee ;
select max(Salary) from Employee;
select min(Salary) from Employee;
select avg(Salary) from Employee;
select sum(Salary) from Employee;

select DeptName,count(*) as "total no. of employees" from Department group by DeptName;
select DeptName,avg(Salary) as "total no. of employees" from Department,Employee group by DeptName;
select DeptName,max(Salary) as "total no. of employees" from Department,Employee group by DeptName;

select e.EmpName,d.DeptName from Employee e join Department d;   
select e.EmpName,d.DeptName,d.Location from Employee e join Department d;
select a.AttendanceID,e.EmpName,a.AttendanceDate,a.Status from Attendance a
inner join Employee e
on a.EmpID = e.EmpID;

update Employee set Salary = Salary * 1.10 where DeptID = (
    select DeptID from Department where DeptName = 'IT'
);

update Employee
set Designation = 'Senior Developer'
where EmpID = 1;
update Employee
set DeptID = 101
where EmpID = 1;

SET SQL_SAFE_UPDATES = 0;
delete from Employee
where Salary<40000;
select * from Attendance
where AttendanceDate = '2026-07-01';

CREATE VIEW EmployeeDetails AS
SELECT e.EmpID, e.EmpName, d.DeptName, e.Salary
FROM Employee e
JOIN Department d ON e.DeptID = d.DeptID;

DELIMITER //

CREATE procedure GetEmployees()
BEGIN
   SELECT * FROM Employee;
END //

DELIMITER ;

CALL GetEmployees();
