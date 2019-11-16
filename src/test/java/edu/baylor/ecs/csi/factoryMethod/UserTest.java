package edu.baylor.ecs.csi.factoryMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import edu.baylor.ecs.csi.factoryMethod.distributor.DistributionByRankStrategy;
import edu.baylor.ecs.csi.factoryMethod.distributor.IDistributionSelectionStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.baylor.ecs.csi.factoryMethod.cart.ShoppingCart;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.store.Store;

public abstract class UserTest {
	
	private Product soap;
	private Product anotherSoap;
	private Product tabaco;
	private Product book;
	private Product lego;
	protected IDistributionSelectionStrategy distruStra;

	@BeforeEach
	public void setUp() {
		// pick product type
		// what if Target product? we need to have a special init
		soap = makeProduct("Soap").init("Nice protocol", new BigDecimal(30));
		anotherSoap = makeProduct("Soap").init("Nice protocol", new BigDecimal(30));
		tabaco = makeProduct("Tabaco").init("Don't smoke", new BigDecimal(20));
		book = makeProduct("Book").init("Read me", new BigDecimal(25));
		lego = makeProduct("Lego").init("Play me", new BigDecimal(35));
		distruStra = new DistributionByRankStrategy();
	}
	
	private ShoppingCart makeAnOrder() {
		// make an order
		ShoppingCart cart = new ShoppingCart(); // change to fluent interface

		cart.addLine(soap,2).addLine(anotherSoap,2)
				.addLine(tabaco,2).addLine(lego,1).addLine(book,1);
		return cart;
	}

	// pick a store
	abstract Store makeStore();

	protected Product makeProduct(String name) {
		return new Product(name);
	}

	@Test
	public void testCompatibleStoreProducts() throws Exception {
		Store store = makeStore();
		ShoppingCart cart = makeAnOrder();
		
		int index = distruStra.select(store);
		store.selectDistributor(index);
		// process
		store.process(cart);
	}

	@Test
	public void testExceptionThrow() {
		assertThrows(Exception.class, () -> {
			Store store = makeStore();
			ShoppingCart cart = makeAnOrder();
			// try to process but we did not select a shipment
			store.process(cart);
		});
	}

	/**
	 * Expect the soap order to be aggregated
	 * 
	 * @throws Exception
	 */
	@Test
	public void testItemAggregation() throws Exception {
		ShoppingCart cart = makeAnOrder();
		assertEquals(4, cart.getOrderList().size());
	}

	@Test
	public void testTotal() throws Exception {
		ShoppingCart cart = makeAnOrder();
		assertEquals(new BigDecimal("190"), cart.getTotal());
	}

	
}
