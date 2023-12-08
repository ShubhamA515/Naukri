package Inheritance;

public class single_level_p2 extends single_level_p1
{
public void son()
{
	System.out.println("car:BMW");
}

public static void main(String[] args) {
	single_level_p2 p2=new single_level_p2();
	p2.father();
	p2.son();
}
}
