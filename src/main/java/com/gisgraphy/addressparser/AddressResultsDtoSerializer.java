package com.gisgraphy.addressparser;

import java.io.OutputStream;
import java.util.Map;

import org.apache.log4j.Logger;

import com.gisgraphy.addressparser.exception.AddressParserException;
import com.gisgraphy.serializer.UniversalSerializer;
import com.gisgraphy.serializer.common.OutputFormat;
import com.gisgraphy.serializer.exception.UnsupportedFormatException;

public class AddressResultsDtoSerializer {
	protected static final Logger logger = Logger
			.getLogger(AddressResultsDtoSerializer.class);

	public void serialize(OutputStream outputStream, OutputFormat outputFormat,
			AddressResultsDto addressResultsDto, boolean indent,
			Map<String, Object> extraParameters) {
		if (outputFormat!= OutputFormat.JSON &&
				outputFormat!= OutputFormat.XML &&
				outputFormat!= OutputFormat.PHP &&
				outputFormat!= OutputFormat.RUBY &&
				outputFormat!= OutputFormat.PYTHON &&
				outputFormat!= OutputFormat.YAML
				) {
			throw new UnsupportedFormatException(outputFormat
					+ " is not applicable for address parser");
		} else {
			serializeWithUniversalSerializer(outputStream, addressResultsDto,
					indent, outputFormat, extraParameters);
		}

	}

	private void serializeWithUniversalSerializer(OutputStream outputStream,
			AddressResultsDto addressResultsDto, boolean indent,
			OutputFormat format, Map<String, Object> extraParameters) {
		try {
			getUniversalSerializer().write(outputStream, addressResultsDto,
					indent, extraParameters, format);
		} catch (Exception e) {
			throw new AddressParserException(e);
		}
	}

	protected UniversalSerializer getUniversalSerializer() {
		return UniversalSerializer.getInstance();
	}
}
