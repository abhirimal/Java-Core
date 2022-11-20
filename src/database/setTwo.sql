/*
    1.	Display first name and last name after converting the first letter of each name to upper case
    and the rest to lower case.
 */
        Select CONCAT(UPPER(SUBSTRING(first_name,1,1)),LOWER(SUBSTRING(first_name,2)))
            AS first_name from employees;
/*
    2.	Display first name and experience of the employees.
 */
        /* the output of datediff is in days, so divide it by 365 to get years*/
        select first_name,datediff(end_date,start_date) /365
            AS experience from employees
                JOIN job_history on employees.employee_id=job_history.employee_id ;

/*
    3.	Display manager ID and number of employees managed by the manager.
 */

        select departments.manager_id, count(employees.manager_id)  As numberOfEmployees
            from departments
                join employees on departments.manager_id=employees.manager_id
                    group by departments.manager_id ;

/*
    4.	Display the country ID and number of cities we have in the country.
 */
        select country_id, count(city) from locations
            group by country_id;
/*
    5.	Display average salary of employees in each department who have commission percentage.
 */
        select department_id, avg(salary) as Average
            from employees where comission_pct is not null
                group by department_id;

/*
    6.	Display job ID, number of employees, sum of salary, and difference between highest salary and
        lowest salary of the employees of the job.
 */
        select employees.job_id, count(employee_id) as Total, max_salary-min_salary as difference
            from employees join jobs on employees.job_id = jobs.job_id
                group by jobs.job_id;

/*
    7.	Display job ID for jobs with average salary more than 10000.
 */
        select job_id, avg(salary) as average from employees
            group by job_id
                having avg(salary)>10000;

/*
    8.	Display employee ID for employees who did more than one job in the past.
 */

        select employee_id from job_history
            group by employee_id
                having count(job_id)>1;