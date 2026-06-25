package com.mmcoe.cart;

public class TestShopping {
	public static void main(String[] args) throws ShoppingCartException {
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(new Product("Marker",25));
		cart.addToCart(new Product("Duster",75));
		cart.checkout();
	}
}
