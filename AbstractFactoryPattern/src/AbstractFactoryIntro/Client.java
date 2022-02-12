package AbstractFactoryIntro;

 class Client {
	/*
	 *  the Client deals just the factory as in Factory method pattern
	 *  but here if i want to add or delete or change a product the factory never changes
	 *  and that it the benefit of Abstract Factory Pattern
	 */
	public static void main(String[] args) {
	MCSandwich cheese = MCSandwichFactory.createSandwich(new CheeseBurgerFactory());
	System.out.println(cheese.toString());
	
	MCSandwich chicken = MCSandwichFactory.createSandwich(new ChickenBurgerFactory());
	System.out.println(chicken.toString());
	
	MCSandwich natural = MCSandwichFactory.createSandwich(new NaturalBurgerFactory());
	System.out.println(natural.toString());

	}

}
