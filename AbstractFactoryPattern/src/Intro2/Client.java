package Intro2;

public class Client {

	public static void main(String[] args) {
		Product laptop = ProductFactory.createProduct(new LaptopAndPCFactory(), "laptop");
		System.out.println(laptop.toString());
		Product pc = ProductFactory.createProduct(new LaptopAndPCFactory(), "pc");
		System.out.println(pc.toString());

	}

}
