package jan9;

 class CopyCons {
	int x,y;
	private CopyCons(){
		x=10;
		y=23;
		System.out.println(x+" "+y);
	
	}
	public static void main(String args[]) {
	CopyCons obj=new CopyCons();
	}
	
 }

