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

import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.gisgraphy.serializer.common.OutputFormat;
import com.vividsolutions.jts.geom.Point;

/**
 * Represent an unstructured address (as string).
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 * you can also use {@link StructuredAddressQuery}.
 * 
 */
public class AddressQuery {

    public final static boolean DEFAULT_INDENTATION = false;
    public static final int DEFAULT_LIMIT = 10;
    private static Pattern callbackValidationPattern = Pattern.compile("\\w+");
    private static Logger logger = Logger.getLogger(AddressQuery.class);

    private String address;
    private String apikey;
    private String country;
    private OutputFormat format = OutputFormat.getDefault();
    private String callback;
    private boolean postal = false;
    private boolean indent = DEFAULT_INDENTATION;
    private boolean standardize = false;
    private boolean geocode = false;
    private int parsedAddressUnlockKey;
    private int limitNbResult = DEFAULT_LIMIT;
    
    /**
     * Default radius in meters
     */
    public static final double DEFAULT_RADIUS = 100000;
    private Point point;
    private double radius = DEFAULT_RADIUS;
    
    private boolean fuzzy = true;
    
    
    /**
     * @param point
     *                The point to search around
     *                @see #withRadius(double)
     */
    public AddressQuery around(Point point) {
	    this.point = point;
	    return this;
    }
    
    /**
     * @return The radius
     */
    public Point getPoint() {
    	return this.point;
    }
    
    /**
     * @return The latitude (north-south) .
     * @see #getLongitude()
     */
    public Double getLatitude() {
	Double latitude = null;
	if (this.point != null) {
	    latitude = this.point.getY();
	}
	return latitude;
    }

    /**
     * @return Returns the longitude (east-West).
     * @see #getLongitude()
     */
    public Double getLongitude() {
	Double longitude = null;
	if (this.point != null) {
	    longitude = this.point.getX();
	}
	return longitude;
    }
    /**
     * @param radius
     *                The radius to set in meters. Limit the query to the specified
     *                radius, if the radius is <=0 , it will be set to the
     *                default radius.
     */
    public AddressQuery withRadius(double radius) {
	if (radius < 0) {
	    this.radius = DEFAULT_RADIUS;
	} else {
	    this.radius = radius;
	}
	return this;
    }
    
    /**
     * @return The radius
     */
    public double getRadius() {
	return this.radius;
    }
    

	public int getParsedAddressUnlockKey() {
		return parsedAddressUnlockKey;
	}

	public void setParsedAddressUnlockKey(int parsedAddressUnlockKey) {
		this.parsedAddressUnlockKey = parsedAddressUnlockKey;
	}

	public OutputFormat getFormat() {
	return format;
    }

    public void setFormat(OutputFormat format) {
	this.format = format;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public String getCallback() {
	return callback;
    }

    /**
     * set the callbakparameter only if it is alphanumeric
     * 
     * @param callback
     */
    public void setCallback(String callback) {
    	if (callback!=null && callbackValidationPattern.matcher(callback).matches()){
    	    this.callback= callback;
    	} else if (callback==null){
    		this.callback=null;
    	}
    	else { 
    	    logger.warn("wrong callback specify : "+callback+", callback method sould be alphanumeric");
    	}
    }

    public boolean isIndent() {
	return indent;
    }

    public void setIndent(boolean indent) {
	this.indent = indent;
    }
    
    

    /**
	 * @return the limit
	 */
	public int getLimitNbResult() {
		return limitNbResult;
	}

	/**
	 * @param limit the limit to set
	 */
	public void limitNbResult(int limit) {
		if (limit >=1){
			this.limitNbResult = limit;
		}
	}

	@Override
	public String toString() {
		return "AddressQuery [address=" + address + ", apikey=" + apikey + ", country=" + country + 
				", format=" + format + ", standardize=" + standardize + ", callback=" + callback + 
				", postal=" + postal + ", indent=" + indent + "]";
	}

    protected AddressQuery(){
    	
    }
    
    public AddressQuery(String address, String country) {
	if (address == null || address.trim().equals("")) {
	    throw new IllegalArgumentException("address can not be nul or empty");
	}
	if (country != null && !country.trim().equals("")) {
		this.country = country;
	}
	this.address = address;
    }
    
    public AddressQuery(String address) {
    	this(address,null);
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

	public boolean isPostal() {
		return postal;
	}

	public void setPostal(boolean postal) {
		this.postal = postal;
	}
	
	public boolean isStandardize() {
			return standardize;
	}

	public void setStandardize(boolean standardize) {
			this.standardize = standardize;
	}

	public boolean isGeocode() {
		return geocode;
	}

	public void setGeocode(boolean geocode) {
		this.geocode = geocode;
	}
	
	/**
	 * @return true if the fulltext query is in fuzzy mode
	 */
	public boolean isFuzzy() {
		return fuzzy;
	}

	/**
	 * @param suggest whether the fulltext query is fuzzy
	 */
	public AddressQuery withFuzzy(boolean fuzzy) {
		this.fuzzy = fuzzy;
		return this;
	}

}
