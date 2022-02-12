package Intro2;
 /* 
  *  this is the factory of factories and it's interface and have no static method
  */
interface ProductAbstractFactory {
	public  Product createProduct(String name);   // WE ADD THE NAME OF PRODUCT IF ONE FACTORY PRODUCE MANY PRODUCTS
}

/*
 *  here we have just 2 factories for 4 products
 *  this is the first factory 
 */
class LaptopAndPCFactory implements ProductAbstractFactory {
	@Override
	public  Product createProduct(String name) {
		if (name.equals("laptop")) {
			return new Laptop();
		} else if (name.equals("pc")) {
			return new PC();

		} else
			return null;
	}

}
// this is the second factory

class IphoneAndNokiaFactory implements ProductAbstractFactory {
	@Override
	public Product createProduct(String name) {
		if (name.equals("iphone")) {
			return new Laptop();
		} else if (name.equals("nokia")) {
			return new PC();

		} else
			return null;
	}
}
