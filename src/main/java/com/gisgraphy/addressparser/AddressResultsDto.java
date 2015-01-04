/*******************************************************************************
 *   Gisgraphy Project 
 * 
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 * 
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *   Lesser General Public License for more details.
 * 
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA
 * 
 *  Copyright 2008  Gisgraphy project 
 *  David Masclet <davidmasclet@gisgraphy.com>
 *  
 *  
 *******************************************************************************/
/**
 *
 */
package com.gisgraphy.addressparser;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO (data transfer object) for a list of {@link Address} The node
 * name is {@link Constants#ADDRESS_RESULT_ROOT_JAXB_NAME}
 * 
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 */
@XmlRootElement(name = Constants.ADDRESS_RESULT_ROOT_JAXB_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressResultsDto {
	
	private String message;
    private Integer numFound = 0;
    private Long QTime = 0L;
    private Address parsedAddress = null;
    private List<Address> result=new ArrayList<Address>();


    /**
     * @param result
     *                The {@link Address}'s Collection
     * @param QTime
     *                The execution time
     */
    public AddressResultsDto(List<Address> result, Long QTime) {
	super();
	this.result = result;
	this.numFound = result == null ? 0 : result.size();
	this.QTime = QTime;
    }

    /**
     * Default Constructor
     */
    public AddressResultsDto() {
	super();
    }

    /**
     * @return The list of {@link GisFeatureDistance}
     */
    public List<Address> getResult() {
	return result;
    }

   

    /**
     * @return the numFound
     */
    public int getNumFound() {
	return numFound;
    }

   

    /**
     * @return the qTime (aka : the execution Time) in ms
     */
    public Long getQTime() {
	return QTime;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final AddressResultsDto other = (AddressResultsDto) obj;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		return true;
	}

	/**
	 * @param time the time the execution of the query took
	 */
	public void setQTime(Long time) {
		QTime = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Address getParsedAddress() {
		return parsedAddress;
	}

	public void setParsedAddress(Address parsedAddress) {
		this.parsedAddress = parsedAddress;
	}

   
}
