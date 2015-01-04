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

import junit.framework.Assert;

import org.junit.Test;

import com.gisgraphy.serializer.common.OutputFormat;


public class AddressQueryTest {
    
    @Test
    public void toStringWithNullProperty(){
	AddressQuery query =new AddressQuery("address","countrycode");
	query.toString();
    }
    
    @Test
    public void constructorWithFields(){
    	AddressQuery query =new AddressQuery("address","countrycode");
	Assert.assertEquals("address",query.getAddress());
	Assert.assertEquals("countrycode",query.getCountry());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void constructorWithNullAddress(){
    	new AddressQuery(null,"countrycode");
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void constructorWithEmptyAddress(){
    	new AddressQuery(" ","countrycode");
    }
    
    
    @Test
    public void constructorWithNullCountrycode(){
    	AddressQuery query  = new AddressQuery("address",null);
    	Assert.assertEquals("address", query.getAddress());
    	Assert.assertEquals(null, query.getCountry());
    }
    
    @Test
    public void constructorWithOnlyAddress(){
    	AddressQuery query  = new AddressQuery("address");
    	Assert.assertEquals("address", query.getAddress());
    	Assert.assertEquals(null, query.getCountry());
    }
    
    @Test
    public void constructorWithEmptyCountrycode(){
    	AddressQuery query  = new AddressQuery("address"," ");
    	Assert.assertEquals("address", query.getAddress());
    	Assert.assertEquals(null, query.getCountry());
    }
    
    @Test
    public void toStringShouldContainsAllData(){
    AddressQuery query =new AddressQuery("foo","bar");
	query.setFormat(OutputFormat.XML);
	query.setIndent(true);
	query.setCallback("callfoo");
	String toString = query.toString();
	Assert.assertTrue(toString.contains("foo"));
	Assert.assertTrue(toString.contains("bar"));
	Assert.assertTrue(toString.contains("XML"));
	Assert.assertTrue(toString.contains("true"));
	Assert.assertTrue(toString.contains("callfoo"));
    }
    
    @Test
    public void defaultOutputFormat(){
    AddressQuery query =new AddressQuery("foo","bar");
   Assert.assertEquals(OutputFormat.getDefault(), query.getFormat());
    }
    
    @Test
    public void callbackNotAlphanumerique(){
    AddressQuery query =new AddressQuery("foo","bar");
    query.setCallback("doIt(");
   Assert.assertNull(query.getCallback());
    }
    
    @Test
    public void callbackAlphanumerique(){
    AddressQuery query =new AddressQuery("foo","bar");
    query.setCallback("doIt");
   Assert.assertEquals("doIt",query.getCallback());
    }
    
  

}
