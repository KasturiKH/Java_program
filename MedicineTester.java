class MedicineTester{

public static void main(String[] medicine)
{
	Medicine medicine1=new Medicine();
	String medici="Paracetamol";
	medicine1.addMedicine(medici);
	medicine1.addMedicine("Aspirin");
	medicine1.addMedicine("Docosanol");
	medicine1.addMedicine("Ketoprofen");
	//medicine1.addMedicine("Metamizole");
	
	
	boolean aspirinFound=medicine1.find("Aspirin");
	System.out.println(aspirinFound);
	
	
	medicine1.displayMedicine();
}

}