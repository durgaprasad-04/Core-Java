package Inheritence;
class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog is  barking");
	}
}
class Puppy extends Dog{
	void weep() {
		System.out.println("Puppy is weeping");
	}
}

public class Multi {
	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weep();
	}
}
