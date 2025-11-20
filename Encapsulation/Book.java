package Encapsulation;

public class Book {
	private int pages;
	

public void setpages(int x) {
	if(x>0) {
		pages=x;
	}
	
}
public int getpages() {
	return pages;
}
}
class User{
 public static void main(String args) {
	 Book b = new Book();
	 b.setpages(50);
	 System.out.println(b.getpages());
 }
}
