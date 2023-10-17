create database subjects
use subjects
create table subjectdetails(
subjectname char(10) primary key,
authorname char(10),
prizeOfBook int 
)
insert into subjectdetails values('physics','newton',200)
select * from subjectdetails
insert into subjectdetails values('biology','pranay',100);
insert into subjectdetails values('chemistry','shubham',600);
insert into subjectdetails values('math','neha',900);
select * from subjectdetails
create table subjectdetails(
subjectname char(10) primary key,
authorname char(10),
prizeOfBook int 
)
drop table subjectdetails
select * from subjectdetails
create table subjectdetails(
subjectname char(10) primary key,
authorname char(10),
prizeOfBook int 
)
insert into subjectdetails values('math','neha',900);

 insert into subjectdetails values('biology','suraj',800);
insert into subjectdetails values('chem','swraj',100);

  select * from subjectdetails
  drop table Subjectsname
  
  create table Subjectsname(
  algebra char(10),
  bookPrize int ,
   FOREIGN KEY (algebra) REFERENCES subjectdetails(subjectname)
  )
  insert into Subjectsname values('math',200)
  insert into Subjectsname values('algeb',100)
  select * from Subjectsname
  select * from subjectdetails

insert into Subjectsname values('math','400')
insert into Subjectsname values('math','800')

select algebra from Subjectsname where algebra='math' and bookPrize=400
insert into Subjectsname values('algeb','800')
