package Intro2;

abstract class Product {
	String name;
	int price;

	@Override
	public String toString() {
		return "MCSandwich [name=" + name + ", price=" + price + "]";
	}
}
/*
 *  here we have many Products and there is just 2 factories produce them 
 *  so it meant we have share products comes from the same factory
 */

class Laptop extends Product {
	public Laptop() {
		name = "laptop";
		price = 3000;
	}
}

class PC extends Product {
	public PC() {
		name = "pc";
		price = 1000;
	}
}

class Iphone extends Product {
	public Iphone() {
		name = "iphone";
		price = 2000;
	}
}

class Nokia extends Product {
	public Nokia() {
		name = "nokia";
		price = 500;
	}
}
