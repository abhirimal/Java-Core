/*
    1. Display details of jobs where the minimum salary is greater than 10000.
 */
        select * from jobs where min_salary>10000;

/*
    2.	Display the first name and join date of the employees who joined between 2002 and 2005.
 */
        select first_name, hire_date from employees
        where hire_date between '2002-01-01' and '2005-01-01';