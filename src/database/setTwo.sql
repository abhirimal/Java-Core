/*
    1.	Display first name and last name after converting the first letter of each name to upper case
    and the rest to lower case.
 */
        Select CONCAT(UPPER(SUBSTRING(first_name,1,1)),LOWER(SUBSTRING(first_name,2)))
            AS first_name from employees;
