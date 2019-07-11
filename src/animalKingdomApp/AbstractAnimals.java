package animalKingdomApp;

public abstract class AbstractAnimals
{
	

	private static int maxId = 0;
	private int id;
	private String name;
	private int year;



	public AbstractAnimals(String name, int year)
	{
		maxId++;
		id=maxId;

		this.name = name;
		this.year = year;
	}

	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	public int getYear()
	{
		return year;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public String consume()
	{
		return "Consumes";
	}



	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();



}