package Anudip.LabAsses;

public class Animal
{	
	public void MakeSound()
	{
		System.out.println("The Animals makes Sound.....");
	}
	
	public class Dog extends Animal
	{
		public void MakeSound()
		{
			System.out.println("Dog Barks....");
		}
	}
	
	public class Cat extends Animal
	{

		public void MakeSound()
		{
			System.out.println("Cat Meow......");
		}
	}
	
	
	public static void main(String[] args)
	{
		Animal animal = new Animal();
		Dog dog = animal.new Dog();
		Cat cat = animal.new Cat();
		
		animal.MakeSound();
		System.out.println();
		dog.MakeSound();
		System.out.println();
		cat.MakeSound();
		
		
	}
}
