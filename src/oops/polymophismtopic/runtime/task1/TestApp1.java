package oops.polymophismtopic.runtime.task1;
import java.util.Scanner;
public class TestApp1 
{
	
	// vehicle = new TwVehicle();
	// vehicle = new LmvVehicle();
	// vehicle = new HmvVehicle();
	
	
	public static void getVehicleInfo(Vehicle vehicle) 
	{
		vehicle.getSpec();
//		vehicle.getTwModelInfo();/// CompileTime
		
		if(vehicle instanceof TwVehicle) 
		{
			// vehicle--promise---TwVehicle
			System.out.println("(vehicle instanceof TwVehicle) :: " +(vehicle instanceof TwVehicle)) ;
			// Downcasting
			TwVehicle twVehicle = (TwVehicle)vehicle;// TwVehicle<===LmvVehicle--CRASHED
			twVehicle.getTwModelInfo();
			
		}else if(vehicle instanceof LmvVehicle) 
		{
			System.out.println("(vehicle instanceof LmvVehicle) :: " +(vehicle instanceof LmvVehicle)) ;

			LmvVehicle lmvVehicle = (LmvVehicle)vehicle;
			lmvVehicle.getLmvModelInfo();
			
		}else if(vehicle instanceof HmvVehicle) 
		{
			System.out.println("(vehicle instanceof HmvVehicle) :: " +(vehicle instanceof HmvVehicle)) ;

			HmvVehicle hmvVehicle = (HmvVehicle)vehicle;
			hmvVehicle.getHmvModelInfo();
		}
		
//		vehicle.getLmvModelInfo();
//		vehicle.getHmvModelInfo();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice = sc.nextInt();
		
		Vehicle vehicle = null;
		
		switch(choice) 
		{
			case 1: // Runtime Polymorphism
					// Late Binding
					// Dynamic Binding
					// Polymorphic Object
					// Upcasting[Parent Reference variable = child Object]
					TwVehicle  tw= new TwVehicle();
					getVehicleInfo(tw);
					break;
					
			case 2: LmvVehicle lmv = new LmvVehicle();
					getVehicleInfo(lmv);
					break;
					
			case 3: HmvVehicle hmv = new HmvVehicle();
					getVehicleInfo(hmv);
					break;
		}
	}
}

/*
Runtime Polymorphism:-
---------------------


		Vehicle(void getSpec(){ .. General Specification ..})
		  |
 ----------------------------------------
 |		  |			|
TwVehicle      LmvVehicle	    HmvVehicle		
 |		  |			|
void getSpec() void getSpec()	    void getSpec()
{
  // Tw Specifications
}
*/
