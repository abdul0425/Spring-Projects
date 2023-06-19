package edu.jspider.Person;

import java.util.ArrayList;
import java.util.List;

import edu.jspider.Application.Application;
import edu.jspider.AssociationRepository.AssociationRepository;
import edu.jspider.Mobile.Mobile;

public class MobileDemo {

	public static void main(String[] args) {
		Application app1 = new Application();
		app1.setAppName("Twitter");
		app1.setOsType("Android/ios");
		app1.setSize(65);
		app1.setVersion("3.8");

		Application app2 = new Application();
		app2.setAppName("Cricbuzz");
		app2.setOsType("Android/ios");
		app2.setSize(110);
		app2.setVersion("9.8");

		Application app3 = new Application();
		app3.setAppName("Dream11");
		app3.setOsType("Android/ios");
		app3.setSize(167);
		app3.setVersion("13.6");

		List<Application> list = new ArrayList<>();
		list.add(app1);
		list.add(app2);
		list.add(app3);

		Mobile mobile = new Mobile();
		mobile.setColor("Slate");
		mobile.setMemory("128GB");
		mobile.setMobileName("Iphone-14 pro");
		mobile.setRam("12GB");
		mobile.setAppList(list);

		AssociationRepository repository = new AssociationRepository();
		repository.saveMobileDetails(mobile);
	}
}
