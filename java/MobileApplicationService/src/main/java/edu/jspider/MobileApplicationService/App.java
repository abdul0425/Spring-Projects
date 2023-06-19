package edu.jspider.MobileApplicationService;

import java.util.ArrayList;
import java.util.List;

import edu.jspider.ApplicationEntity.Application;
import edu.jspider.AssociationRepository.Repository;
import edu.jspider.MobileEntity.Mobile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Application application1 = new Application();
        application1.setAppName("WatsApp");
        application1.setAppSize("87MB");
        application1.setOs("Android/ios");
        Application application2 = new Application();
        application2.setAppName("YouTube");
        application2.setAppSize("165MB");
        application2.setOs("Android/ios");
        Application application3 = new Application();
        application3.setAppName("Spotify");
        application3.setAppSize("65MB");
        application3.setOs("Android/ios");
        List<Application> appList=new ArrayList<>();
        appList.add(application1);
        appList.add(application2);
        appList.add(application3);
        
        Mobile mobile1 = new Mobile();
        mobile1.setMobileName("Oppo F21 Pro");
        mobile1.setRam("12GB");
        
        mobile1.setRom("256GB");
        mobile1.setAppList(appList);
        Mobile mobile2 = new Mobile();
        mobile1.setMobileName("Iphone 14Pro");
        mobile1.setRam("12GB");
        mobile1.setRom("500GB");
        mobile2.setAppList(appList);
        
        Repository repository = new Repository();
        repository.saveMobileDetails(mobile1);
        repository.saveMobileDetails(mobile2);
    }
}
