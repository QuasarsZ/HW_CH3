package homework_ch3;

public class P26 
{
	public static void main(String[] args)
	{
	Car26 car1;
	car1 = new Car26();
	
	car1.show();

	}
}

class Car26
{
	private int num;
	private double gas;
	
	public Car26()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
}
	

