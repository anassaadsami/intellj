package AbstractFactoryIntro;
/*
 *  this the factory that Client deals with
 *  and in it's method we pass one of these sandwich factories  to create that factory's  
 *  sandwich 
 *  and also we don't need to create an object of factory class just use it's static method
 */
 class MCSandwichFactory {

	public static MCSandwich createSandwich(MCSandwichAbsractFactory x) {
		return x.createSandwich();
	}
}

