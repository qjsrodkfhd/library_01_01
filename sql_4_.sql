CREATE TABLE USERINFO
(
	user_name varchar2(10),
	user_address varchar2(50),
	user_barcode int,
	user_id varchar2(20),
	user_pw varchar2(20),
	user_tel int

);

CREATE TABLE BOOKINFO
(
	book_name varchar2(10),
	book_writer varchar2(10),
	book_publisher varchar2(20),
	book_cartegory varchar2(50),
	book_barcode int,
	book_loancheck int,
	book_loanbarcode int

);

CREATE TABLE ADMININFO
(

	admin_id varchar2(10),
	admin_pw varchar2(10),
	admin_positon varchar2(50),
	admin_name varchar2(50)
		
);

select * from admininfo;

select * from bookinfo;