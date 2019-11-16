package edu.baylor.ecs.csi.factoryMethod.product.impl;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import edu.baylor.ecs.csi.factoryMethod.product.Product;

public class WalmartProduct extends Product {

	private static final Map<String, Double> productRank;
    static {
        Map<String, Double> temporary = new HashMap<String, Double>();
        temporary.put("Soap", 2.4);
        temporary.put("Lego", 5.0);
        temporary.put("Tabaco", 4.1);
        temporary.put("Book", 2.1);
        productRank = Collections.unmodifiableMap(temporary);
    }

	private double rank = 0.0;
	
	public WalmartProduct(String name, String describtion, BigDecimal price, double rank) {
		super(name, describtion, price);
		this.rank = rank;
	}
	
	public WalmartProduct(String name) {
		super(name);
		if (productRank.containsKey(name)) {
			rank = productRank.get(name);
		}
	}
	
	public WalmartProduct() {
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public static WalmartProduct make(String name) {
		return new WalmartProduct(name);
	}
	public WalmartProduct init(String describtion, BigDecimal price, double rank) {
		super.init(describtion, price);
		this.rank = rank;
		return this;
	}
}
