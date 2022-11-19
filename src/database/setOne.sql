/*
    1. Display details of jobs where the minimum salary is greater than 10000.
 */
        select * from jobs where min_salary>10000;

/*
    2.	Display the first name and join date of the employees who joined between 2002 and 2005.
 */
        select first_name, hire_date from employees
        where hire_date between '2002-01-01' and '2005-01-01';

/*
    3.	Display first name and join date of the employees who is either IT Programmer or Salesman.
 */
        select first_name,hire_date from employees
            join jobs on employees.job_id = jobs.job_id
                where job_title="Salesman" or job_title="IT Programmer";

/*
    4.	Display employees who joined after 1st January 2008.
 */
        select * from employees where hire_date>"2008-01-01";

/*
    5.	Display details of employees with ID 150 or 160.
 */

        select * from employees where employee_id=150 or employee_id=160;

/*
    6.  Display first name, salary, commission pct, and hire date for employees
            with salary less than 10000.
 */

        select first_name, salary, comission_pct,hire_date from employees where salary<10000;

/*
    7.	Display job Title, the difference between minimum and maximum salaries for jobs with max
        salary in the range 10000 to 20000.
 */
        select job_title,max_salary-min_salary as difference
        from jobs where max_salary>=10000 and max_salary<=20000;

/*
    8.	Display details of jobs in the descending order of the title.
 */

        select * from jobs order by job_title desc;

/*
    9.	Display employees where the first name or last name starts with S.
 */

        select * from employees where first_name LIKE 'S%' or last_name like 'S%';

/*
    10.	Display details of the employees where commission percentage is null and salary in
        the range 5000 to 10000 and department is 30.
 */

        select * from employees where comission_pct is null and department_id=30
        and salary>=5000 and salary<=10000 ;