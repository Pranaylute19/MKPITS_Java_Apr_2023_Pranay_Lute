create database Hospital
use Hospital
create table HospitalDetail(
doctorName char(10),
HospitalName char(10) primary key,
Address varchar(25)
);
select * from HospitalDetail
insert into HospitalDetail values('giri','neuron','dhantolinagpur')
select * from HospitalDetail

 create table chemistLibrary(
 sname char(10),
 hospitalName varchar(25) ,
 Constraint Hospital foreign key (hospitalName) references HospitalDetail(HospitalName)
 )
 insert into chemistLibrary('avinash','neuron') 