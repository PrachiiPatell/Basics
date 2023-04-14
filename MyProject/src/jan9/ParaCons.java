package jan9;

public class ParaCons {
	
	int x,y;
	
	ParaCons(int a,int b)
	{
		x=a; 
		y=b;
	}
	void show() 
	{
		System.out.println(x + " " +y);
	}
	class B
	{	
	public static void main(String args[]) {
		ParaCons obj=new ParaCons(67,76);
		obj.show();        
	}
}
}