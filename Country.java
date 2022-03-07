class Country{

int index=20;
String countryy;


String[] countries=new String[20];
int temp=0;

void addCountry(String country)
{
	System.out.println("countryNam "+ country);
	if(country.length()>3 && country.length()<50 && country!=null)
	{
		this.countries[temp]=country;
		this.temp++;
	}
	else
	{
	System.out.println("country is less than 3 "+country);
System.out.println("country is greater than 50 "+country);
System.out.println("country is null"+country);	
	}
}


boolean find(String country)
{
	System.out.println("country");
	boolean found = false;
	
	for(int countTemp=0;countTemp<this.countries.length; countTemp++)
		
		{
			String countNam1= this.countries[countTemp];
			if(countNam1.equals(country))
			{
				System.out.println("countries are found "+ country);
				found=true;
			}
		}
			if(!found)
			{
				System.out.println("countries are not found "+ country);
			}
			return found;
		
}




void displayCountry()
{
	for(int countr=0;countr<countries.length;countr++)
	{
		System.out.println(countries[countr]);
	}
	System.out.println("list of all the country "+ temp);
}


void update(int index,String country)
{
int leng=this.countries.length;

if(index<=leng)
	
{
System.out.println("countries are updated " + countries );
this.countries[index] = country;
	
}
if(index>leng)
{
	System.out.println("updated countries" + "index" );
}
}


void delet(int index)
{
	int size= this.countries.length-1;
	if (index<size)
	{
		System.out.println("countries have name " + countries[index]);
		this.countries[index]=null;
		
	}
	if(index>size)
	{
		System.out.println("countries with name " + "index");
	}
}

void delete(String country ){
	
	String delete=this.countries[index];
	System.out.println ("delete countries " + country);

}
}