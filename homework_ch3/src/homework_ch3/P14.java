package homework_ch3;

public class P14
{
	public static void main(String[] args)
	{
		Car14 car1;
		car1 = new Car14();
		car1.setNum(1234);
		car1.setGas(20.5);
		
	}
}
class Car14
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("�N�����]��"+num);
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
	
}





