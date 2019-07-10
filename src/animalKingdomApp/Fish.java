package animalKingdomApp;

public class Fish extends AbstractsAnimals
{
	public Fish(String name, int year)
	{
		super(name);
		super(year);
	}

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breath()
	{
		return "gills";
	}

	@Override
	public Sting reproduce()
	{
		return "eggs";
	}
}