/*
    1.	Display country name, city, and department name.
 */
        select country_name, city, department_name from departments
            inner join locations on departments.location_id=locations.location_id
                inner join countries on locations.country_id=countries.country_id;