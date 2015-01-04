/*******************************************************************************
 * Gisgraphy Project 
 *  
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *  
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *    Lesser General Public License for more details.
 *  
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA
 *  
 *   Copyright 2008  Gisgraphy project 
 * 
 *   David Masclet <davidmasclet@gisgraphy.com>
 ******************************************************************************/
package com.gisgraphy.addressparser;

import org.junit.Assert;
import org.junit.Test;

import com.gisgraphy.addressparser.commons.GeocodingLevels;


public class AddressTest {

    
    @Test
    public void setEmptyExtraInfoShouldNotSet(){
	Address address  =new Address();
	address.setExtraInfo(" ");
	Assert.assertNull(address.getExtraInfo());
	address.setExtraInfo("");
	Assert.assertNull(address.getExtraInfo());
	address.setExtraInfo(null);
	Assert.assertNull(address.getExtraInfo());
	
	address.setExtraInfo("foo");
	Assert.assertEquals("foo",address.getExtraInfo());
	
    }
    
    @Test
    public void ToString_geocodingLevelGetterShouldBeCallInsteadOfProperty(){
	Address address  =new Address();
	address.setStreetName("foo");
	Assert.assertTrue(address.toString().contains("foo"));
	Assert.assertTrue(address.toString().contains("geocodingLevel=STREET"));
	
	
    }
    
    @Test
    public void getGeocodingLevel_whenProcessed(){
	Address address =new Address();
	Assert.assertEquals(GeocodingLevels.NONE,address.getGeocodingLevel());
	address.setCountry("country");
	Assert.assertEquals(GeocodingLevels.COUNTRY,address.getGeocodingLevel());
	address.setState("state");
	Assert.assertEquals(GeocodingLevels.STATE,address.getGeocodingLevel());
	address.setCity("city");
	Assert.assertEquals(GeocodingLevels.CITY,address.getGeocodingLevel());
	address.setStreetName("street");
	Assert.assertEquals(GeocodingLevels.STREET,address.getGeocodingLevel());
	address.setHouseNumber("houseNumber");
	Assert.assertEquals(GeocodingLevels.HOUSE_NUMBER,address.getGeocodingLevel());
    }
    
}
