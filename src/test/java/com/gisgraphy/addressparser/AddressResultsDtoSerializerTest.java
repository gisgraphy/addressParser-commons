package com.gisgraphy.addressparser;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

import org.junit.Test;

import com.gisgraphy.serializer.common.OutputFormat;
import com.gisgraphy.serializer.exception.UnsupportedFormatException;

public class AddressResultsDtoSerializerTest {

	@Test
	public void testSupportedLanguage() {
		AddressResultsDtoSerializer serializer = new AddressResultsDtoSerializer();
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.XML, new AddressResultsDto(), true, new HashMap<String, Object>());
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.JSON, new AddressResultsDto(), true, new HashMap<String, Object>());
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.PHP, new AddressResultsDto(), true, new HashMap<String, Object>());
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.PYTHON, new AddressResultsDto(), true, new HashMap<String, Object>());
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.RUBY, new AddressResultsDto(), true, new HashMap<String, Object>());
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.YAML, new AddressResultsDto(), true, new HashMap<String, Object>());
		
	}
	
	@Test(expected=UnsupportedFormatException.class)
	public void testUnSupportedLanguageGeorss() {
		AddressResultsDtoSerializer serializer = new AddressResultsDtoSerializer();
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.GEORSS, new AddressResultsDto(), true, new HashMap<String, Object>());
		
	}
	
	@Test(expected=UnsupportedFormatException.class)
	public void testUnSupportedLanguageATOM() {
		AddressResultsDtoSerializer serializer = new AddressResultsDtoSerializer();
		serializer.serialize(new ByteArrayOutputStream(), OutputFormat.ATOM, new AddressResultsDto(), true, new HashMap<String, Object>());
		
	}

}
