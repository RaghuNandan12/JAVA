package demo;

 class bike
{
   int max_speed=210;
   bike(int max_speed)
   {
	this.max_speed=max_speed;
   }
    void showmaxspeed()
   {
	   System.out.println("the top speed is "+max_speed);
   }
   
}
public class Vehicle extends bike
{	
	Vehicle(int max_speed) 
	{
		super(max_speed);
		// TODO Auto-generated constructor stub
	}

    public static void main1(String[] args)
    {
	   Vehicle a=new Vehicle(50);
	   a.showmaxspeed();
    }

}

