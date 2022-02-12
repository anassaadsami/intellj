package AbstractFactoryIntro;

abstract class MCSandwich {
	String name;
	int price;

	@Override
	public String toString() {
		return "MCSandwich [name=" + name + ", price=" + price + "]";
	}
}

class CheeseBurger extends MCSandwich {

	public CheeseBurger() {
		this.name = "cheeseBurger";
		this.price = 90;
	}

}

class ChickenBurger extends MCSandwich {

	public ChickenBurger() {
		this.name = "chickenBurger";
		this.price = 100;
	}
}

class NaturalBurger extends MCSandwich {

	public NaturalBurger() {
		this.name = "naturalBurger";
		this.price = 80;
	}
}
