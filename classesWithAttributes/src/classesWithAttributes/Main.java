package classesWithAttributes;

import java.awt.image.ImageProducer;

public class Main {

	public static void main(String[] args) {

		// Product product = new Product(1, "Laptop", "Asus", 3000, 2, "Siyah");
		Product product = new Product();
		product.setDescription("HP");
		product.setName("TV");
		product.setId(1);
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
