package homework_ch3;

public class P17
{
	public static void main(String[] args)
	{
		Car17 car1;
		car1 = new Car17();
		car1.setNumGas(1234,20.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O" + number + "�A�T�o�q�O"+gasoline);
	
		
	}
}
class Car17
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("�լd����");
		return num;
	}
	double getGas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
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





