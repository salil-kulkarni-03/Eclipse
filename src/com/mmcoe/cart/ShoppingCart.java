package com.mmcoe.cart;

import com.mmcoe.ds.LinkedList;

public class ShoppingCart {
	private LinkedList<Product> items;
	private double total;
	private int idx;
	private int cap = 5;
	public ShoppingCart() {
		items = new LinkedList<>();
	}

	public void addToCart(Product p) throws ShoppingCartException {
		if(idx == cap)
			throw new ShoppingCartException("Your cart is full");
		else
			items.add(p);
		total += p.getPrice();
	}
	public void checkout() throws ShoppingCartException{
			items.print();
		System.out.println("Cart Total: " + total);
	}
}
