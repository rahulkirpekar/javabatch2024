package oops.polymophismtopic.runtime.task1;

public class HmvVehicle extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("HmvVehicle--getSpec()");
	}
	public void getHmvModelInfo() 
	{
		System.out.println("HmvVehicle--getHmvModelInfo()");
	}
}
