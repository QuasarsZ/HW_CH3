package homework_ch3;

public class P28
{
	public static void main(String[] args)
	{
	Car28 car1;
	car1 = new Car28();
	car1.show();
	
	Car28 car2;
	car2 = new Car28(1234,25.0);
	car2.show();

	}
}

class Car28
{
	private int num;
	private double gas;
	
	public Car28()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car28(int n,double g)
	{
		this();
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
	

