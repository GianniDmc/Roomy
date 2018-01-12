package scenario;

import java.rmi.RemoteException;
import java.util.concurrent.TimeUnit;

import webservices.LumiBlindWSStub;
import webservices.LumiBlindWSStub.LaunchScenarOnce;

public class LumiBlindScenario {

	public static void main(String[] args) throws RemoteException, InterruptedException{
		
		LumiBlindWSStub lumiBlindWS = new LumiBlindWSStub();
		
		LaunchScenarOnce launchScenarOnce = new LaunchScenarOnce();
		
		while(true)
		{
			lumiBlindWS.launchScenarOnce(launchScenarOnce);
			
			System.out.println("LumiBlind: Scenario launched");
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
