package animalKingdomApp;

import java.util.*;

public class Main
{


	public static void printAnimalsList(ArrayList<AbstractAnimals> animal, CheckAnimals tester)
    {
        for (AbstractAnimals i : animal)
        {
            if (tester.test(i))
            {
                System.out.println(i.getName());
            }
        }
    }



	public static void main(String args[])
	{
		ArrayList<AbstractAnimals> theAnimals = new ArrayList<>();

// Mammifères:
		theAnimals.add(new Mammals("Panda",1869));
		theAnimals.add(new Mammals("Zebra",1778));
		theAnimals.add(new Mammals("Koala",1816));
		theAnimals.add(new Mammals("Sloth",1804));
		theAnimals.add(new Mammals("Armadillo",1758));
		theAnimals.add(new Mammals("Raccoon",1758));
		theAnimals.add(new Mammals("Bigfoot",2021));

// Des oiseaux:
		theAnimals.add(new Birds("Pigeon",1837));
		theAnimals.add(new Birds("Peacock",1821));
		theAnimals.add(new Birds("Toucan",1758));
		theAnimals.add(new Birds("Parrot",1824));
		theAnimals.add(new Birds("Swan",1758));

// Poisson:
		theAnimals.add(new Fish("Salmon", 1758));
		theAnimals.add(new Fish("Catfish", 1817));
		theAnimals.add(new Fish("Perch",1758));

//Lambda Expressions:

		System.out.println("*** 1 ***");
		theAnimals.sort((a1,a2) -> a2.getYear() - a1.getYear());
		theAnimals.forEach(animal -> System.out.println(animal.getName() + " was discovered in: " + animal.getYear()));

System.out.println();

		System.out.println("*** 2 ***");
		theAnimals.sort((a1,a2) -> a1.getName().compareToIgnoreCase( a2.getName()));
		theAnimals.forEach(animal -> System.out.println(animal.getName()));

System.out.println();

		System.out.println("*** 3 ***");
		theAnimals.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
		theAnimals.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

System.out.println();

		System.out.println("*** 4 ***");
		System.out.println("'Animals that breath with lungs'");
		printAnimalsList(theAnimals, a -> a.breath() == "lungs");

System.out.println();

		System.out.println("*** 5 ***");
		System.out.println("'Animals that breath with lungs and were named in 1758'");
		printAnimalsList(theAnimals,a -> a.breath() == "lungs" && a.getYear() == 1758);

System.out.println();

		System.out.println("*** 6 ***");
		System.out.println("'Animals that lay eggs and breath with there lungs'");
		printAnimalsList(theAnimals,a -> a.reproduce() == "eggs" && a.breath() == "lungs");

System.out.println();

		System.out.println("*** 7 ***");
		System.out.println("'Animals that were named in 1758'");
		theAnimals.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		printAnimalsList(theAnimals,a -> a.getYear() == 1758);

	}
}