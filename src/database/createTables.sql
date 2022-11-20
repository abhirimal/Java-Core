/*
    Creating table departments
 */

create table departments
(
    department_id   int NOT NULL,
    department_name varchar(100),
    manager_id      varchar(100),
    location_id     varchar(100),
    primary key (department_id)
);

/*
    Inserting data into departments
 */

insert into departments(department_id, department_name, manager_id, location_id)
values (21, "Logistics", 51, 5000);
insert into departments(department_id, department_name, manager_id, location_id)
values (22, "IT", 52, 5000);
insert into departments(department_id, department_name, manager_id, location_id)
values (23, "Human Resource", 53, 5000);
insert into departments(department_id, department_name, manager_id, location_id)
values (24, "Account", 54, 5000);
insert into departments(department_id, department_name, manager_id, location_id)
values (25, "Design", 55, 5000);

/*
    Creating table regions
 */

create table regions
(
    region_id   varchar(255) not null primary key,
    region_name varchar(255)
);

/*
    Inserting data into regions
 */

insert into regions(region_id, region_name)
values ("EU", "Europe");
insert into regions(region_id, region_name)
values ("AU", "Australia");
insert into regions(region_id, region_name)
values ("ASIA", "Asia");

/*
    Creating table countries
 */
create table countries
(
    country_id   varchar(255) not null primary key,
    country_name varchar(255),
    region_id    varchar(255),
    foreign key (region_id) references regions (region_id)
);

/*
        Inserting data into countries
 */

insert into countries(country_id, country_name, region_id)
values ("NP", "Nepal", "ASIA");
insert into countries(country_id, country_name, region_id)
values ("GE", "Germany", "EU");
insert into countries(country_id, country_name, region_id)
values ("IN", "India", "ASIA");
insert into countries(country_id, country_name, region_id)
values ("NZ", "New Zealand", "AU");

/*
    Creating table locations
 */
create table locations
(
    location_id    varchar(255) NOT NULL,
    street_address varchar(100),
    postal_code    varchar(100),
    city           varchar(100),
    state_province varchar(255),
    country_id     varchar(255),
    foreign key (country_id) references countries (country_id)
);

/*
    Inserting data into locations
*/

insert into locations(location_id, street_address, postal_code, city, state_province, country_id)
values ("BNS", "Baneswor", "44600", "Kathmandu", "Bagmati", "NP");

insert into locations(location_id, street_address, postal_code, city, state_province, country_id)
values ("LMC", "Lamachowr", "49182", "Pokhara", "Gandaki", "NP");

insert into locations(location_id, street_address, postal_code, city, state_province, country_id)
values ("BhG", "Bhangra Chowk", "81900", "Mumbai", "Maharastra", "IN");

/*
    Creating table job_history
 */
create table job_history
(
    employee_id   int not null primary key,
    start_date    date,
    end_date      date,
    job_id        int,
    department_id int,
    foreign key (employee_id) references employees (employee_id),
    foreign key (job_id) references jobs (job_id),
    foreign key (department_id) references departments (department_id)
);

/*
    inserting data into job history
 */
insert into job_history(employee_id, start_date, end_date, job_id, department_id)
values (100, "2018-05-23", current_date(), 1, 21);

/*
    Creating table employees
 */
create table employees
(
    employee_id   int NOT NULL PRIMARY KEY,
    first_name    varchar(100),
    last_name     varchar(100),
    email         varchar(100),
    phone_number  varchar(100),
    hire_date     varchar(100),
    job_id        int,
    salary        varchar(100),
    comission_pct varchar(100),
    manager_id    int,
    department_id int,
    foreign key (job_id) references jobs (job_id),
    foreign key (department_id) references departments (department_id)
);

/*
    inserting data into employees
 */

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (100, "Ram", "Sharma", "ram@gmail.com", "9810298176", "2018-05-23", 1, 35000, 5, 51, 21);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (101, "Bhakti", "Thapa", "bhakti@gmail.com", "9810290181", "2003-08-09", 1, 40000, 5, 51, 21);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (102, "Laxman", "Gurung", "laxman@gmail.com", "9801982716", "2004-12-01", 1, 38000, 10, 51, 21);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (103, "Sita", "Devi", "sita@gmail.com", "9819018278", "2002-01-28", 7, 30000, 2, 51, 21);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (104, "Raju", "Paudel", "raju@gmail.com", "981726981", "2004-09-13", 6, 25000, 5, 52, 22);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, manager_id,
                      department_id)
values (105, "Birat", "Dhakal", "birat@gmail.com", "9891827109", "2009-10-05", 6, 25000, 52, 22);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (110, "Radhe", "Shyam", "radhe@gmail.com", "9810298161", "2012-04-18", 6, 9000, 500, 54, 24);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (111, "Chulbul", "Pandey", "pandey@gmail.com", "98918029187", "2016-07-09", 6, 8000, 5, 54, 24);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (112, "Simanta", "Parajului", "simanta@gmail.com", "9817201981", "2019-02-08", 6, 15000, 5, 51, 21);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (113, "manish", "gupta", "manish@gmail.com", "98172019827", "2018-02-08", 8, 20000, 5, 53, 23);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (150, "Ramesh", "Baral", "ramesh@gmail.com", "9817019281", "2020-04-03", 4, 30000, 5, 52, 22);

insert into employees(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
                      comission_pct, manager_id, department_id)
values (160, "Anurag", "Baskota", "anurag@gmail.com", "9108291762", "2022-09-23", 2, 30000, 5, 53, 23);


/*
    Creating table jobs
 */
create table jobs
(
    job_id     int NOT NULL PRIMARY KEY,
    job_title  varchar(100),
    min_salary int,
    max_salary int
);

/*
    Inserting data into jobs
 */

insert into jobs(job_id, job_title, min_salary, max_salary)
values (1, "Software Engineer", 30000, 50000);
insert into jobs(job_id, job_title, min_salary, max_salary)
values (7, "IT Programmer", 250000, 50000);
insert into jobs(job_id, job_title, min_salary, max_salary)
values (2, "HR", 20000, 35000);
insert into jobs(job_id, job_title, min_salary, max_salary)
values (3, "Sales Executive", 25000, 30000);
insert into jobs(job_id, job_title, min_salary, max_salary)
values (4, "Graphic Designer", 30000, 50000);
insert into jobs(job_id, job_title, min_salary, max_salary)
values (5, "Cleaner", 15000, 25000);
insert into jobs(job_id, job_title, min_salary, max_salary)
values (6, "Maintenance", 8000, 20000);
insert into jobs(job_id, job_title, min_salary, max_salary)
values (8, "Salesman", 18000, 30000);


/*
    Changes made later
 */

alter table employees modify column comission_pct int;

update jobs set min_salary=25000 where job_id=2;

update jobs set max_salary=35000 where job_id=2;

update employees set comission_pct=null where employee_id=111;

update employees set salary=8000 where employee_id=115;

update employees set department_id=10 where employee_id=110;

update employees set job_id=7 where employee_id=110 and department_id=10;

update departments set location_id="BNS" where department_id=21;

update departments set location_id="LMC" where department_id=22;

update departments set location_id="BhG" where department_id=23;

update departments set location_id="LMC" where department_id=24;

update departments set location_id="BhG" where department_id=25;

alter table employees modify column comission_pct int;

alter table departments add foreign key(location_id)
    references locations(location_id);

alter table locations add primary key(location_id);

alter table employees modify column salary int;


