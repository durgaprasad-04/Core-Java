package Inheritence;


interface Father{
	void fatherProperty();
}
interface Mother{
	void motherProperty();
}
class Child implements Father, Mother{
	@Override
	public void fatherProperty() {
		System.out.println("Fathers Property:House");
	}
	@Override 
	public void motherProperty() {
		System.out.println("Mother Property:Gold");
	}
}
public class multipleInheritence {

	public static void main(String[] args) {
	Child c = new Child();
	c.fatherProperty();
	c.motherProperty();

	}

}
