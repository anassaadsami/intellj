package Intro2;
/*
 *  this class always deals with Client and it takes a factory as a parameter and 
 *  in this ex we add the product's name to know which product will create from the same factory 
 */
 class ProductFactory {
	public static Product createProduct( ProductAbstractFactory  productFactory , String name) {
		return productFactory.createProduct(name);
	}

}
