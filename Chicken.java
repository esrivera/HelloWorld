public class Chicken{
	private String name;
	private String color;
	private int age;

	public void layAnEgg(){
		System.out.println("the chicken lay an egg");
	}
	public void poop(){
		System.out.println("the chicken pooped");
	}
	public void drink(){
		System.out.println("the chicken drank water");
	}
	public void noLayAnEgg(){
		System.out.println("the chicken didn't lay an egg");
	}
	public void noPoop(){
		System.out.println("the chicken didn't poop");
	}
	public void noDrink(){
		System.out.println("the chicken not drank water");
	}


	public void print(){
		System.out.println("the name of the chicken is-->"+name+", color-->"+color+", age-->"+age+" ");
	}
	public void initializeData(String name,String color,int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}

}
