create database Ecommerce
use Ecommerce
drop database customer
create table customers(
CustomerId int primary key, 
firstname char(10),
lastname char (10),
email char(15),
phone int,
Address varchar(25)
)
create table Products(
ProductId int primary key,
productName char(10),
descriptions varchar(25),
priza int

)
create table orders(
 orderID int primary key,
 customerid int,
 orderdate int,
 totalAmount int,
 foreign key (customerid) references customers(CustomerId)
)
create table orderitems(
orderiditem int ,
orderid int,
productid int,
quantity int,
prize int,
foreign key (orderiditem) references orders(orderID),
foreign key (productid) references Products(ProductId)
)
