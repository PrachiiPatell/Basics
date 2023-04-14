package jan9;
public class Person {
	String name="Prachi";
	int age=67;
	double weight=76.00;

    void eat() {
    	System.out.println("Eating");
	}
    void walk() {
    	System.out.println("Walking");
    }
    public static void main(String args[])
    {
    	Person p=new Person();
    	System.out.println(p.name);
    	System.out.println(p.age);
    	System.out.println(p.weight);
    	p.eat();
    	p.walk();
    }
}
