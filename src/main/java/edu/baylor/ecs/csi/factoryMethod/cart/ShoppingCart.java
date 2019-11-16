package edu.baylor.ecs.csi.factoryMethod.cart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import edu.baylor.ecs.csi.factoryMethod.product.Product;

public class ShoppingCart implements CartInterface{

	private List<CartLineItem> orderList = new ArrayList<CartLineItem>();

	public CartInterface addLine(Product product, int amount) {
		// aggregation
		for(CartLineItem line : orderList) {
			if (line.getProduct() == product) { // left == on purpose!
				line.setQuantity(line.getQuantity()+amount);
				break;
			}
		}
		
		orderList.add(CartLineItem.make(product, amount));
		return this;
	}

	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (CartLineItem orderLine : orderList) {
			total = total.add(orderLine.getSubTotal());
		}
		return total;
	}

	public List<CartLineItem> getOrderList() {
		return orderList;
	}
}
