package scenario;

import java.rmi.RemoteException;
import java.util.concurrent.TimeUnit;

import org.apache.axis2.AxisFault;

import webservices.TempWindowWSStub;
import webservices.TempWindowWSStub.LaunchScenarioOnce;

public class TempWindowScenario {

	public static void main(String[] args) throws RemoteException, InterruptedException {
		// TODO Auto-generated method stub
		TempWindowWSStub tempWindowWS = new TempWindowWSStub();
		
		LaunchScenarioOnce launchScenarioOnce = new LaunchScenarioOnce();
		
		while(true)
		{
			tempWindowWS.launchScenarioOnce(launchScenarioOnce);
			
			System.out.println("TempWindow: Scenario launched");
			TimeUnit.SECONDS.sleep(1);
		}
	}

}
