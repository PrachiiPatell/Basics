package jan9;

public class Constru {
	int age;
	String name;
	
	Constru(){
		age=3;
		name="me";
	}
	void show()
	{
		System.out.println(age+" "+name);
	}
}
class B{
	public static void main(String[] args) {
		Constru a=new Constru();
		a.show();
	}
}
