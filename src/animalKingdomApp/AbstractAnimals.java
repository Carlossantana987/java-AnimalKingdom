package animalKingdomApp;

public abstract class AbstractsAnimals
{
	

	private static int maxId = 0;
	private int id;
	private String name;
	private int year;



	public AbstractsAnimals(int id, String name, int year)
	{
		maxId++;
		id=maxId;

		this.name = name;
		this.year = year;
	}



	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();



}