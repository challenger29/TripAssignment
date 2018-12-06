# TripAssignment
Problem Statement:

Design a simple solution for a cab company. Queries are given, output the correct values corresponding to it.
q1 : AVG DriverID => give the average rating points for the driver ID given
q2 : AVG CustomerID => give the average rating points for the customer ID given
q3 : TRIP CustomerID Rating DriverID Rating => Add the trip and rating points with customerID and driverID
q4 : TOP Drivers => List the top drivers sorted according to the rating points
q5 : TOP Customers => List the top customers sorted according to the rating points
q6 : ELIGIBLE CustomerID => Give the eligible drivers for the customerID. Eligible drivers had the following criteria ->
(i) The average rating of the driver should be greater than the customer
(ii) If the customer had given the driver a 1 star rating earlier then this driver is not to be considered
(iii) If there are no drivers found, print the ones for which the customer had rode earlier
