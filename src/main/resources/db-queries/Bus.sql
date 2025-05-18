INSERT INTO public.bus(
	date_of_journey, price, amenities, arrival_time, bus_company_name, bus_number, bus_type, departure_time, driver_details, from_city, id, mid_stations, seat_configuration, to_city)
	VALUES (current_date+ 1, 2000, 'wifi, ac', current_date + 1, 'Sharad Bus Services', 12345, 'Slepper', current_date + 1, 'Sharad Kumar', 'Nagpur', 1, 'Pune', '1+2', 'Ratnagiri');

	select * from public.bus