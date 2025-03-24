package exceptiontopic;

import java.io.IOException;

public class TwVehicle extends Vehicle
{
	@Override
	public void getSpec() throws Exception
	{
		System.out.println("TwVehicle --getSpec()");
	}
}
