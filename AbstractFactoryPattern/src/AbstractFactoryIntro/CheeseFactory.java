package AbstractFactoryIntro;

/*
 *  we can called this factory of factories
 */
interface MCSandwichAbsractFactory {
	public MCSandwich createSandwich();

}
/*
 *  we create for every sandwich it's own factory
 *  and it can be more than product produced by one factory 
 *  we will see it in another ex
 */
class CheeseBurgerFactory implements MCSandwichAbsractFactory {

	@Override
	public MCSandwich createSandwich() {
		return new CheeseBurger();
	}

}
class ChickenBurgerFactory implements MCSandwichAbsractFactory {
	
	@Override
	public MCSandwich createSandwich() {
		return new ChickenBurger();
	}
	
}
class NaturalBurgerFactory implements MCSandwichAbsractFactory {
	
	@Override
	public MCSandwich createSandwich() {
		return new NaturalBurger();
	}
	
}
