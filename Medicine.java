class Medicine{

String[] medicines=new String[4];
int temp=0;

void addMedicine(String medicine)
{
	System.out.println("medicineNam "+ medicine);
	if(medicine.length()>4 && medicine.length()<50 && medicine!=null)
	{
		this.medicines[temp]=medicine;
		this.temp++;
	}
	else
	{
	System.out.println("medicine is less than 4 "+medicine);
System.out.println("medicine is greater than 50 "+medicine);
System.out.println("medicine is null"+medicine);	
	}
}


boolean find(String medicine)
{
	System.out.println("medicine");
	boolean found = false;
	
	for(int medTemp=0;medTemp<this.medicines.length; medTemp++)
		
		{
			String medNam1= this.medicines[medTemp];
			if(medNam1.equals(medicine))
			{
				System.out.println("medicines are found "+ medicine);
				found=true;
			}
		}
			if(!found)
			{
				System.out.println("medicines are not found "+ medicine);
			}
			return found;
		
}




void displayMedicine()
{
	for(int medi=0;medi<medicines.length;medi++)
	{
		System.out.println(medicines[medi]);
	}
	System.out.println("list of all the medicine "+ temp);
}
}