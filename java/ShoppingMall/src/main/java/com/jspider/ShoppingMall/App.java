package com.jspider.ShoppingMall;

import com.jspider.AadharEntity.Aadhar;
import com.jspider.AssociationRepository.AssociationRepository;
import com.jspider.PersonEntity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Aadhar aadhar = new Aadhar();
    	aadhar.setAadharNumber("713386355145");
    	aadhar.setCity("Ranchi");
    	aadhar.setCountry("India");
    	aadhar.setPincode("834001");
    	
    	
        Person person = new Person();
        person.setPersonName("Arshad Alam");
        person.setPersonGender("Male");
        person.setPersonAge(65);
        person.setContactNumber(6299634638L);
       
        person.setAadhar(aadhar);
        
        AssociationRepository repository = new AssociationRepository();
        repository.savePersonDetails(person);
    }
}
