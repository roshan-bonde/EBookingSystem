INSERT INTO public.vehicle(
	date_of_journey, id, price, type, arrival_time, departure_time, from_city, mid_stations, to_city)
	VALUES (current_timestamp, 1, 1500, 'Bus',current_timestamp, current_timestamp, 'Nagpur', 'Pune, Kolhapur', 'Ratnagiri');
INSERT INTO public.vehicle(
	date_of_journey, id, price, type, arrival_time, departure_time, from_city, mid_stations, to_city)
	VALUES (current_timestamp, 2, 3500, 'Train',current_timestamp, current_timestamp, 'Nagpur', 'Secunderabad, Hyderabad', 'Bangalore');
INSERT INTO public.vehicle(
	date_of_journey, id, price, type, arrival_time, departure_time, from_city, mid_stations, to_city)
	VALUES (current_timestamp, 3, 6500, 'Flight',current_timestamp, current_timestamp, 'Nagpur', '', 'Delhi');
-- Bus
INSERT INTO public.bus(
	id, total_seats, amenities, bus_company_name, bus_number, bus_type, driver_details, seat_configuration)
	VALUES (1, 35, 'WiFi, AC, Beadsheets, Pillow', 'Sharad Travels', 23445, 'Sleeper', 'Sharad Kumar', '1+2');
-- Flight
INSERT INTO public.flight(
	baggage_allowance, flight_duration, id, airline_name, arrival_terminal, departure_terminal, flight_class, flight_number, flight_type, in_flight_services, seat_configuration)
	VALUES (10, 2, 3, 'Indigo Airlines', 'Nagpur Terminal 1', 'Delhi terminal 6', 'Economy', 97234, 'Domestic', 'Breakfast, Lunch, Dinner, WiFi, Water', '3-3');
-- Train
INSERT INTO public.train(
	id, number_of_coaches, train_speed, operator_name, train_name, train_number, train_type)
	VALUES (2, 16, 120, 'Indian Railways', 'SBC Rajhdani', 22962, 'AC');