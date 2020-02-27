use department ;

Create table Employee (
	id int primary key,
    name varchar(15),
    department varchar(15)
);

INSERT INTO Employee VALUES (1, 'Amila', 'HR');
INSERT INTO Employee VALUES (2, 'Kasun', 'IT');
INSERT INTO Employee VALUES (3, 'Saman', 'QA');

select * from Employee;