package animalKingdomApp;

public class Birds extends AbstractsAnimals
{
	public Birds(String name, int year)
	{
		super(name);
		super(year);
	}

	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public Sting reproduce()
	{
		return "eggs";
	}
}