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

import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.junit.Assert;
import org.junit.Test;

import com.gisgraphy.test.FeedChecker;


public class AddressResultsDtoTest {
	@Test
	public void constructor(){
		Address address = new Address();
		address.setCity("city");
		List<Address> list = new ArrayList<Address>();
		list.add(address);
		Long qtime = 234L;
		AddressResultsDto dto = new AddressResultsDto(list,qtime );
		Assert.assertEquals(list, dto.getResult());
		Assert.assertEquals(qtime, dto.getQTime());
		Assert.assertEquals(list.size(), dto.getNumFound());
	}
	
	@Test
	public void defaultConstructor(){
		AddressResultsDto dto = new AddressResultsDto();
		Assert.assertNotNull( dto.getResult());
		Assert.assertNotNull(dto.getQTime());
		Assert.assertEquals(0, dto.getNumFound());
	}
	
	@Test
	public void equalsShouldBeTrueIfAddressAreEquals(){
		Address address = new Address();
		address.setCity("city");
		List<Address> list = new ArrayList<Address>();
		list.add(address);
		Long qtime = 234L;
		AddressResultsDto dto = new AddressResultsDto(list,qtime );
		AddressResultsDto otherDto = new AddressResultsDto(list,4L );
		Assert.assertEquals(dto, otherDto);
		
		List<Address> otherList = new ArrayList<Address>();
		AddressResultsDto otherDtoNotEquals = new AddressResultsDto(otherList,4L );
		Assert.assertFalse(dto.equals(otherDtoNotEquals));
	}
	
	@Test
	public void constructorWithNullList(){
		Long qtime = 234L;
		AddressResultsDto dto = new AddressResultsDto(null,qtime );
		Assert.assertEquals(null, dto.getResult());
		Assert.assertEquals(qtime, dto.getQTime());
		Assert.assertEquals(0,dto.getNumFound());
	}
	
	 @Test
	    public void addressShouldBeMappedWithJAXB() {
		try {
			Long qtime = 234L;
			String streetName = "streetName";
			String name = "name";
			String city = "city";
			String country = "FR";
			double lng = 3D;
			double lat = 2D;
		    JAXBContext context = JAXBContext
			    .newInstance(AddressResultsDto.class);
		    Marshaller m = context.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    Address address= new Address();
			address.setName(name);
			address.setStreetName(streetName);
			address.setCity(city);
			address.setCountry(country);
			address.setLat(lat);
			address.setLng(lng);
			address.getGeocodingLevel();
		    List<Address> addresses = new ArrayList<Address>();
		    addresses.add(address);
		    AddressResultsDto dto = new AddressResultsDto(addresses,qtime );
		    
		    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		    
		    m.marshal(dto, outputStream);
		    String dtoSerializeed = outputStream.toString("UTF-8");
		    FeedChecker.assertQ("AddressResultDtoTest is not correctly serialized", dtoSerializeed, 
		    		"/"+com.gisgraphy.addressparser.Constants.ADDRESS_RESULT_ROOT_JAXB_NAME+"/result/name[.='"+name+"']"
		    		,"/"+com.gisgraphy.addressparser.Constants.ADDRESS_RESULT_ROOT_JAXB_NAME+"/result/streetName[.='"+streetName+"']"
		    		,"/"+com.gisgraphy.addressparser.Constants.ADDRESS_RESULT_ROOT_JAXB_NAME+"/result/city[.='"+city+"']"
		    		,"/"+com.gisgraphy.addressparser.Constants.ADDRESS_RESULT_ROOT_JAXB_NAME+"/result/lat[.='"+lat+"']"
		    		,"/"+com.gisgraphy.addressparser.Constants.ADDRESS_RESULT_ROOT_JAXB_NAME+"/result/lng[.='"+lng+"']"
		    		,"/"+com.gisgraphy.addressparser.Constants.ADDRESS_RESULT_ROOT_JAXB_NAME+"/result/geocodingLevel[.='"+address.getGeocodingLevel()+"']");
		} catch (PropertyException e) {
		    fail(e.getMessage());
		} catch (JAXBException e) {
		    fail(e.getMessage());
		} catch (UnsupportedEncodingException e) {
		    fail(e.getMessage());
		}
	    }
	
}
