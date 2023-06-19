package edu.jspider.Person;

import edu.jspider.AadharEntity.Aadhar;
import edu.jspider.AssociationRepository.AssociationRepository;
import edu.jspider.PersonEntity.Person;

/**
 * Hello world!
 *
 */
public class PersonDemo 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Aadhar aadhar = new Aadhar();
    	aadhar.setAadharNumber("713321675328");
    	aadhar.setCity("Bengaluru");
    	aadhar.setCountry("India");
    	aadhar.setPinCode("111222");
    	
    	 Person person = new Person();
         person.setPersonName("Rivu Naskar");
         person.setGender("Male");
         person.setAge(55);
         person.setContactNumber(6299686342L);
         person.setAadhar(aadhar);
         
         AssociationRepository repository = new AssociationRepository();
         repository.savePersonDetails(person);
    }
}
