package week1.ass1;

public class Mobile{
	public void makecall(String model,float weight)
	{
	System.out.println("the mobile model is=" +model);
	System.out.println("the mobile weight is="+weight);
	}
	
	public void sendMesg(int cost,boolean fullycharged)
	{
	System.out.println("the mobile cost is="+cost);
	System.out.println("the mobile charge is="+fullycharged);
	}
	public static void main(String[] args)
	{
		Mobile v= new Mobile();
		v.makecall("vivo", 3260);
		System.out.println("this is my new mobile");
	}
	
	

}
