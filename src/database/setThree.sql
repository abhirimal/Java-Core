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