package homework_ch3;

public class P15
{
	public static void main(String[] args)
	{
		Car15 car1;
		car1 = new Car15();
		
		int number = 1234;
		double gasoline = 20.5;
	
		car1.setNumGas(number,gasoline);
	}
}
class Car15
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		
	}
	
}





