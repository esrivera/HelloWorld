public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello Santiago");

	Chicken chickenOne;
	chickenOne=new Chicken();
	chickenOne.initializeData("Lucy","Brown",2);
	chickenOne.print();
	chickenOne.layAnEgg();
	chickenOne.poop();
	chickenOne.drink();
	Chicken chickenTwo;
	chickenTwo=new Chicken();
	chickenTwo.initializeData("Catalina","Black",3);
	chickenTwo.print();
	chickenTwo.layAnEgg();
	chickenTwo.noPoop();
	chickenTwo.noDrink();
	Chicken chickenThree;
	chickenThree=new Chicken();
	chickenThree.initializeData("Camila","White",1);
	chickenThree.print();
	chickenThree.noLayAnEgg();
	chickenThree.poop();
	chickenThree.noDrink();
	Chicken chickenFour;
	chickenFour=new Chicken();
	chickenFour.initializeData("Leticia","Yelow",2);
	chickenFour.print();
	chickenFour.noLayAnEgg();
	chickenFour.noPoop();
	chickenFour.drink();
	}

}
