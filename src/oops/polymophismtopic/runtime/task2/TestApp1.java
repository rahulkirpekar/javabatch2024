package oops.polymophismtopic.runtime.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static void getPersonProfileByPlace(Person person) 
	{
		person.getBehave();
		if (person instanceof Org) 
		{
			Org org = (Org)person;
			org.getWorkOnTask();
			
		} else if (person instanceof School)
		{
			School school = (School)person;
			school.getAttendAnnualFunction();
			
		}else if (person instanceof PublicPlace)
		{
			PublicPlace publicPlace = (PublicPlace)person;
			publicPlace.getParticipaneInElection();
		}else if (person instanceof Home)
		{
			Home home = (Home)person;
			home.getMovieTime();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Person's Place : ");
		System.out.println("1) for Organisation");
		System.out.println("2) for School");
		System.out.println("3) for PublicPlace");
		System.out.println("4) for Home");
		int choice  = sc.nextInt();
		
		switch(choice) 
		{
			case 1: Org org = new Org();
					getPersonProfileByPlace(org);
					break;
			case 2:
					School school = new School();
					getPersonProfileByPlace(school);
					break;
			case 3:
					PublicPlace	 publicPlace = new PublicPlace	();
					getPersonProfileByPlace(publicPlace);
					break;
			case 4:
					Home home = new Home();
					getPersonProfileByPlace(home);
					break;
			default:	
		}
	}
}
/*
 * 
 * 		     Person(getBehave())
			  	|
 ------------------------------------------------------------------------
 |			  		|						|			  				|
Org				  School  				PublicPlace		 				Home	
 |			  		|						|			  				  |
getWorkOnTask()  getAttendAnnualFunction()  getParticipaneInElection()  getMovieTime()
 |			  |			|			|
getBehave()		getBehave()	    getBehave()		    getBehave()
 |			  |			|			|
Employee		Student		     Citizen		      Child
 * 
 * */



