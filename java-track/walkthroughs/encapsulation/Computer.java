package encapsulation;

public class Computer {
	
	//Fields:
	
	//memory-int
	private int memory;
	
	//size-double
	private double size;
	
	//processor-double
	private double processor;
	
	//brand-string
	private String brand;
	
	
	//Behaviors:
	
	//Create a computer
	public Computer(int memory, double size, double processor, String brand)
	{
	
		this.memory = memory;
		this.size = size;
		this.processor = processor;
		this.brand = brand;	
	}
	

	public int getMemory()
	{
		return this.memory;
	}
	
	public double getSize()
	{
		return this.size;
	}
	
	public double getProcessor()
	{
		return this.processor;
	}
		
	public String getBrand()
	{
		return this.brand;
	}
	
	
	public void addMemory(int newMemory)
	{
		if(this.memory + newMemory > 8)
		{
			return;
		}
		else
		{
			this.memory = this.memory + newMemory;
		}
	}
	
	
	public void setProcessor(double newProcessor)
	{
		this.processor = newProcessor;
	}
	
	public String toString()
	{
		return "Memory: " + this.memory + " Processor: " + this.processor + " Size: " + this.size + " Brand: " + this.brand;
	}
	
	//Add memory
	//Swap out processor
	//Display information as a string
	
	public static void main(String args[])
	{
		Computer newComputer = new Computer(8, 16.5, 2.4, "HP");
		System.out.println(newComputer.getBrand());
		
		Computer oldComputer = new Computer(2, 14, 1.2, "Acer");
		System.out.println(oldComputer.getBrand());
		
		newComputer.addMemory(4);	
		System.out.println(newComputer.getMemory());
		
		oldComputer.addMemory(4);
		System.out.println(oldComputer.getMemory());
		
		System.out.println(newComputer);
	
		
	}
}

