package encapsulation;

public class Robot {
	private String name;
	private int speed;
	private int positionX;
	private int positionY;
	private String direction;
	
	
	public Robot(String name, int speed, int positionX, int positionY, String direction)
	{
		this.name = name;
		this.speed = speed;
		this.positionX = positionX;
		this.positionY = positionY;
		this.direction = direction;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int getPositionX()
	{
		return this.positionX;
	}
	
	public int getPositionY()
	{
		return this.positionY;
	}
	
	public String getDirection()
	{
		return this.direction;
	}
	
	public void moveRobot(int movePositionX, int movePositionY)
	{
		this.positionX = this.positionX + movePositionX;
		this.positionY = this.positionY + movePositionY;
	}
	
	public void turnRobot(String newDirection)
	{
		
		{
			
		}
	}
	
	
}
