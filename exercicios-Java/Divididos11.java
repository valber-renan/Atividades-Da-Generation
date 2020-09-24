package atividades;

public class Divididos11 {
	public static void main (String args[])
	{
		int x,mult;
		
		for(x=1000;x<2000;x++)
		{
			if(x%11==5)
			{
				mult=x;
				System.out.println(mult);
			}
		}
	}
}
