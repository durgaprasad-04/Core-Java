package instance;

public class Product {

	int productId;
	String productName;
	double price;
	void display() {
		System.out.println("Product ID:"+productId);
		System.out.println("Product Name :"+ productName);
		System.out.println("Price:"+ price );
	}
	public static void main(String[] args) {
		Product p= new Product();
		p.productId=101;
		p.productName=" puma ";
		p.price=1000.0;
		
		p.display();

	}

}
