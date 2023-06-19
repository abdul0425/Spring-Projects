package edu.jspider.driver;

import java.util.ArrayList;
import java.util.List;

import edu.jspider.association_repository.Repository;
import edu.jspider.entity.Bus;
import edu.jspider.entity.Passenger;

public class PassengerBusService {

	public static void main(String[] args) {
		System.out.println("List Is Being Added ...");
		Bus bus1 = new Bus();
		bus1.setBusName("BMTC Akash");
		bus1.setBusNumber("KA 01B 2012 ");
		bus1.setBusRoute("Marathalli to BTM");

		Bus bus2 = new Bus();
		bus2.setBusName("BMTC Rashi");
		bus2.setBusNumber("KA 05C 6495 ");
		bus2.setBusRoute("Majestic to Electronic City");

		Bus bus3 = new Bus();
		bus3.setBusName("BMTC Humsafar");
		bus3.setBusNumber("KA 01A 9999 ");
		bus3.setBusRoute("Phoneix to Corporate");

		Passenger passenger1 = new Passenger();
		passenger1.setPassengerName("Ram Charan");
		passenger1.setContactNumber("1234554321");

		Passenger passenger2 = new Passenger();
		passenger2.setPassengerName("Allu Arjun");
		passenger2.setContactNumber("1234567891");

		Passenger passenger3 = new Passenger();
		passenger3.setPassengerName("Jr NTR");
		passenger3.setContactNumber("9876543219");

		List<Bus> busList = new ArrayList<>();
		busList.add(bus1);
		busList.add(bus2);
		busList.add(bus3);

		List<Passenger> passengerList = new ArrayList<>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);

		bus1.setPassengerList(passengerList);
		bus2.setPassengerList(passengerList);
		bus3.setPassengerList(passengerList);

		passenger1.setBusList(busList);
		passenger2.setBusList(busList);
		passenger3.setBusList(busList);

		Repository repository = new Repository();
		repository.savePassengerDetails(passenger1);
		repository.savePassengerDetails(passenger2);
		repository.savePassengerDetails(passenger3);

		System.out.println("Added Successfully .");
	}
	
}
