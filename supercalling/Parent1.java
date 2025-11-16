package supercalling;

   class Parent{
	int age;
	Parent(int a){
		age=a;
	}
}
	class child extends Parent{
		String name;
		child(String name, int age){
			super(age);
			this.name=name;
		
	}
	}
	public class Parent1{
	public static void main(String[] args) {
	child c = new child("dp",23);
	System.out.println(c.name+" "+c.age);
	Parent p =new Parent(50);
	System.out.println(p.age);
	}


}


