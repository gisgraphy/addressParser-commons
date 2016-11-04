package com.gisgraphy.addressparser.format;

public class AddressFormatInfo {
    
	/*
	 * recipient is always first
	 * * : lf
	 * 0:country
	 * 1: number
	 * 2: street
	 * 3: sub1
	 * 4: sub2
	 * 5: city
	 * 6: state
	 * 7 zip
	 * 8: 
	 * 9 : PO box
	 */
    private String formatString ;
    private String formatRTLString ;
    private String requiredString ;
    private String upperString ;
    private Boolean optionalState;
    /*
     * 0 : no
     * 1 : yes
     * 2: we don't know
     * 3: n/a
     * 4=>both 
     */
    private int streetTypeBeforeStreetName = 2;
    private boolean stateCode = false;
    private int stateLevel = 1;
	public int getStateLevel() {
		return stateLevel;
	}

	public void setStateLevel(int stateLevel) {
		this.stateLevel = stateLevel;
	}

	private boolean poBoxOnly = false;
    private String countryName;
    
    
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Boolean getOptionalState() {
		return optionalState;
	}

	public void setOptionalState(Boolean optionalState) {
		this.optionalState = optionalState;
	}

	public int getStreetTypeBeforeStreetName() {
		return streetTypeBeforeStreetName;
	}

	public void setStreetTypeBeforeStreetName(int streetTypeBeforeStreetName) {
		this.streetTypeBeforeStreetName = streetTypeBeforeStreetName;
	}

	public boolean isStateCode() {
		return stateCode;
	}

	public void setStateCode(boolean stateCode) {
		this.stateCode = stateCode;
	}

	public boolean isPoBoxOnly() {
		return poBoxOnly;
	}

	public void setPoBoxOnly(boolean poBoxOnly) {
		this.poBoxOnly = poBoxOnly;
	}
	
	public String getFormatString() {
        return formatString;
    }
   
	public void setFormatString(String formatString) {
        this.formatString = formatString;
    }
  
	public String getFormatRTLString() {
        return formatRTLString;
    }
   
	public void setFormatRTLString(String formatRTLString) {
        this.formatRTLString = formatRTLString;
    }
    
	public String getRequiredString() {
        return requiredString;
    }
   
	public void setRequiredString(String requiredString) {
        this.requiredString = requiredString;
    }
   
	public String getUpperString() {
        return upperString;
    }
  
	public void setUpperString(String upperString) {
        this.upperString = upperString;
    }
    

}
