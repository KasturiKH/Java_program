//"class Chocolate
//{
//double money=50.0;//0
//double chocolatePrice=15.0;

//void buy(int noOfChocolates)//5
//{
 //     double tempMoney=noOfChocolates * chocolatePrice;//40
  //    this.money=this.money-tempMoney;
//}

//}


class Chocolate{

double money=50.0;
double chocolatePrice=15.0;
int noOfChocolates=10;

void buy(int noOfChocolates)
{
	 double tempMoney=noOfChocolates * chocolatePrice;//25
	 this.money=this.money-tempMoney;
	 
	 System.out.println("cholate price " + tempMoney);
	 if (this.money>=tempMoney)
	 {
		 double money=noOfChocolates/chocolatePrice;
		 System.out.println("how many chocolate " + noOfChocolates);
		 
	 }
	 
	 else
	 {
		 System.out.println("how many chocolate are more " + noOfChocolates);
	 }
}
}