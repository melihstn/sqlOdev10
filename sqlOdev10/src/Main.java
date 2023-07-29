/*
1)
    select city,country from city
    left join country on country.country_id = city.country_id;

2)
    select payment_id,first_name,last_name from customer
    right join payment on customer.customer_id = payment.customer_id;

3)
    select rental.rental_id,customer.first_name,customer.last_name from customer
    full join rental on rental.customer_id = customer.customer_id;

 */