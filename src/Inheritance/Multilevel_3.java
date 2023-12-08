package Inheritance;

public class Multilevel_3 extends Multilevel_2 
{
public void Myself()
{
	System.out.println("SDA");
}
public static void main(String[] args) 
{
Multilevel_3 m3=new Multilevel_3();

m3.Dadaji(); 
m3.Pappa();
m3.Myself();
	
	
	
}
}

