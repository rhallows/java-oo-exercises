package encapsulation;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
		
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int area(int length, int width)
	{
		return this.length * this.width;
	}
	
	public int perimeter(int lenght, int width)
	{
		return (this.length * 2) + (this.width * 2);
		
	}
	
	public String isSquare(Rectangle rectangle)
	{
		if(rectangle.length == rectangle.width)
		{
			return "This is a square";
		}
		else
			return "This is not a square";
	}
	
	public static String isEqual(Rectangle rectangle_one, Rectangle rectangle_two)
	{
		int area_one = rectangle_one.area(rectangle_one.length, rectangle_two.width);
		int area_two = rectangle_two.area(rectangle_two.length, rectangle_two.width);
		
		
		if(area_one == area_two)
		{
			return "These rectangles are both equal in area";	
		}
		else if(area_one > area_two)
		{
			return "The first rectangle has a larger area";
		}
		else
		{
			return "The second rectangle has a larger area";
		}
	}
	
	public static void main(String[] args)
	{
		Rectangle rectangle_one = new Rectangle(5,9);
		System.out.println(rectangle_one.getLength());
		System.out.println(rectangle_one.getWidth());
		System.out.println(rectangle_one.area(rectangle_one.length, rectangle_one.width));
		System.out.println(rectangle_one.perimeter(rectangle_one.length, rectangle_one.width));
		
		Rectangle rectangle_two = new Rectangle(1,1);
		System.out.println(rectangle_two.getLength());
		System.out.println(rectangle_two.getWidth());
		System.out.println(rectangle_two.area(rectangle_two.length, rectangle_two.width));
		System.out.println(rectangle_two.perimeter(rectangle_two.length, rectangle_two.width));
		
		System.out.println(Rectangle.isEqual(rectangle_one, rectangle_two));
		
		
		
	}
	
	
	
}
