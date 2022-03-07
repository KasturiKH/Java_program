class CountryTester{

public static void main(String[] country)
{
	Country country1=new Country();
	String coun="Afghanistan";
	country1.addCountry(coun);
	country1.addCountry("Australia");
	country1.addCountry("Bangladesh");
	country1.addCountry("Belgium");
	country1.addCountry("Brazil");
	country1.addCountry("India");
	country1.addCountry("Canada");
	country1.addCountry("Colombia");
	country1.addCountry("Denmark");
	country1.addCountry("Egypt");
	country1.addCountry("France");
	country1.addCountry("Iceland");
	country1.addCountry("Iran");
	country1.addCountry("Italy");
	country1.addCountry("Japan");
	country1.addCountry("Kenya");
	country1.addCountry("Malaysia");
	country1.addCountry("Maldives");
	country1.addCountry("Mexico");
	country1.addCountry("Mongolia");
	
	
	boolean indiaFound=country1.find("India");
	System.out.println(indiaFound);
	boolean maldivesFound=country1.find("Maldives");
	System.out.println(maldivesFound);
	
	
	country1.displayCountry();
	
	
	country1.delete("Australia");
	country1.delete("canada");
	
}

}