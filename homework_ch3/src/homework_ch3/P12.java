package homework_ch3;

public class P12
{
	public static void main(String[] args)
	{
		Car12 car1;
		car1 = new Car12();
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showcar();
	}
}
class Car12
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
	void showcar()
	{
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
	
}





