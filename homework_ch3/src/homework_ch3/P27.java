package homework_ch3;

public class P27
{
	public static void main(String[] args)
	{
	Car27 car1;
	car1 = new Car27();
	car1.show();
	
	Car27 car2;
	car2 = new Car27(1234,25.0);
	car2.show();

	}
}

class Car27
{
	private int num;
	private double gas;
	
	public Car27()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car27(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q�]��"+gas+"�����l");
		
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
}
	

