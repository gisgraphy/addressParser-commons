package com.gisgraphy.addressparser;

import org.junit.Assert;
import org.junit.Test;

public class StructuredAddressQueryTest {

	@Test
	public void constructor() {
		Address address = new Address();
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address, "FR");
		Assert.assertEquals(address, addressQuery.getStructuredAddress());
		Assert.assertEquals("FR", addressQuery.getCountry());
	}
	
	@Test(expected=RuntimeException.class)
	public void constructorWithNullAddres() {
		new StructuredAddressQuery(null, "FR");
	}
	
	@Test
	public void constructorWithNullCountry() {
		Address address = new Address();
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address, null);
		Assert.assertNotNull(addressQuery.getStructuredAddress());
		Assert.assertNull(addressQuery.getCountry());
	}
	
	@Test
	public void constructorWithEmptyCountry() {
		Address address = new Address();
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address, "");
		Assert.assertNotNull(addressQuery.getStructuredAddress());
		Assert.assertNull("empty countrycode should be considered as null",addressQuery.getCountry());
	}
	
	@Test
	public void constructorWithOnlyAddress() {
		Address address = new Address();
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address);
		Assert.assertNotNull(addressQuery.getStructuredAddress());
		Assert.assertNull(addressQuery.getCountry());
	}
	
	@Test
	public void constructorWithSpaceCountry() {
		Address address = new Address();
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address, " ");
		Assert.assertNotNull(addressQuery.getStructuredAddress());
		Assert.assertNull("empty countrycode should be considered as null",addressQuery.getCountry());
	}
	
	@Test(expected=RuntimeException.class)
	public void setAddress() {
		Address address = new Address();
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address, "FR");
		addressQuery.setAddress("foo");
	}
	
	@Test(expected=RuntimeException.class)
	public void getAddress() {
		Address address = new Address();
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address, "FR");
		addressQuery.getAddress();
	}
	
	@Test
	public void toStringTest() {
		Address address = new Address();
		address.setStreetName("streetName");
		address.setCity("city");
		StructuredAddressQuery addressQuery = new StructuredAddressQuery(address, "FR");
		String queryToString = addressQuery.toString();
		Assert.assertTrue(queryToString.contains(addressQuery.getClass().getSimpleName()));
	}

}
