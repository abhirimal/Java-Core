/*
    1.	Display country name, city, and department name.
 */
        select country_name, city, department_name from departments
            inner join locations on departments.location_id=locations.location_id
                inner join countries on locations.country_id=countries.country_id;
/*
    2.	Display job title, department name, employee last name, starting date for all jobs from 2000 to 2005.
 */

        select job_title,department_name, last_name from employees
            inner join jobs on employees.job_id=jobs.job_id
                inner join departments on employees.department_id=departments.department_id
                    inner join job_history on employees.employee_id=job_history.employee_id
                        where (start_date between "2000-01-01" and "2004-12-30");

/*
    3.	Display job title and average salary of employees
 */
        select job_title,department_id, AVG(salary) as Average_Salary from employees
            inner join jobs on employees.job_id=jobs.job_id
                group by job_title;

/*
    4.	Display department name, manager name, and salary of the manager for all managers whose experience is more than 5 years.
 */
            select department_name,first_name as manager_name, salary from employees
                inner join departments on employees.department_id=departments.department_id
                    inner join job_history on employees.employee_id=job_history.employee_id
                        where datediff(end_date,start_date) /365>5;