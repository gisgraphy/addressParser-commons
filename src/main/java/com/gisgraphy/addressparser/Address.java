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

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.gisgraphy.addressparser.commons.GeocodingLevels;

@XmlRootElement(name = Constants.ADDRESS_ROOT_JAXB_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class Address implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6185879035945582454L;
	//1
	private Long id;
	//2
    private Double lng;
    //3
    private Double lat;
    //4
    private String name;
    //5
    private String recipientName;
    //6
    private String houseNumber;
    /**
     * fractional number, bis, ter
     */
    //7
    private String houseNumberInfo;
    //8
    private String POBox;
    //9
    private String POBoxInfo;
    //10
    private String POBoxAgency;

    /**
     * for canada, and more
     */
    //11
    private String civicNumberSuffix;
    //12
    private String preDirection;
    //13
    private String streetName;
    //14
    private String streetType;
    //15
    private String postDirection;
    //16
    private String preDirectionIntersection;
    //17
    private String streetNameIntersection;
    //18
    private String StreetTypeIntersection;
    //19
    private String postDirectionIntersection;
    //20
    private String extraInfo;
    //21
    private String suiteType;
    //22
    private String suiteNumber;
    //23
    private String floor;
    //24
    private String quarter;
    //25
    private String zipCode;
    //26
    private String district;
    //27
    private String dependentLocality;
    //28
    private String city;
    //29
    private String citySubdivision;
    //30
    private String postTown;
    //31
    private String state;
    //32
    private String prefecture;//mainly for china and japan
    //33
    private String country;
    //34
    private String countryCode;
    //35
    private String sector;
    //36
    private String quadrant;
    //37
    private String block;
    //38
    private String lote;

    private GeocodingLevels geocodingLevel = GeocodingLevels.NONE;
    //39
    private String confidence;
    //40
    private Double distance;
    //41
    private Double ward;
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

  

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    /**
     * @return the lat
     */
    public Double getLat() {
	return lat;
    }

    /**
     * @param lat
     *            the lat to set
     */
    public void setLat(Double lat) {
	this.lat = lat;
    }

    /**
     * @return the lng
     */
    public Double getLng() {
	return lng;
    }

    /**
     * @param lng
     *            the lng to set
     */
    public void setLng(Double lng) {
	this.lng = lng;
    }

    public String getStreetNameIntersection() {
	return streetNameIntersection;
    }

    public void setStreetNameIntersection(String streetNameIntersection) {
	this.streetNameIntersection = streetNameIntersection;
    }

    public String getStreetTypeIntersection() {
	return StreetTypeIntersection;
    }

    public void setStreetTypeIntersection(String streetTypeIntersection) {
	StreetTypeIntersection = streetTypeIntersection;
    }

    private String PostOfficeBox;

    public String getStreetType() {
	return streetType;
    }

    public void setStreetType(String streetType) {
	this.streetType = streetType;
    }

    public String getFloor() {
	return floor;
    }

    public void setFloor(String floor) {
	this.floor = floor;
    }

    public String getExtraInfo() {
	return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
	if (extraInfo != null && !"".equals(extraInfo.trim())) {
	    this.extraInfo = extraInfo;
	}
    }

    public String getHouseNumber() {
	return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
    }

    public String getStreetName() {
	return streetName;
    }

    public void setStreetName(String streetName) {
	this.streetName = streetName;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getCitySubdivision() {
		return citySubdivision;
	}

	public void setCitySubdivision(String citySubdivision) {
		this.citySubdivision = citySubdivision;
	}

	public String getState() {
	return state;
    }

    public void setState(String state) {
	this.state = state;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public String getSector() {
	return sector;
    }

    public void setSector(String sector) {
	this.sector = sector;
    }

    public String getQuadrant() {
	return quadrant;
    }

    public void setQuadrant(String quadrant) {
	this.quadrant = quadrant;
    }

    public String getBlock() {
	return block;
    }

    public void setBlock(String block) {
	this.block = block;
    }

    public String getHouseNumberInfo() {
	return houseNumberInfo;
    }

    public void setHouseNumberInfo(String houseNumberInfo) {
	this.houseNumberInfo = houseNumberInfo;
    }

    public String getPreDirection() {
	return preDirection;
    }

    public void setPredirection(String preDirection) {
	this.preDirection = preDirection;
    }

    public String getPostDirection() {
	return postDirection;
    }

    public void setPostDirection(String postDirection) {
	this.postDirection = postDirection;
    }

    public String getPreDirectionIntersection() {
	return preDirectionIntersection;
    }

    public void setPredirectionIntersection(String preDirectionIntersection) {
	this.preDirectionIntersection = preDirectionIntersection;
    }

    public String getPostDirectionIntersection() {
	return postDirectionIntersection;
    }

    public void setPostDirectionIntersection(String postDirectionIntersection) {
	this.postDirectionIntersection = postDirectionIntersection;
    }

    public String getPOBox() {
	return POBox;
    }

    public void setPOBox(String pOBox) {
	POBox = pOBox;
    }

    public String getCivicNumberSuffix() {
	return civicNumberSuffix;
    }

    public void setCivicNumberSuffix(String civicNumberSuffix) {
	this.civicNumberSuffix = civicNumberSuffix;
    }

    public String getPOBoxInfo() {
	return POBoxInfo;
    }

    public void setPOBoxInfo(String boxInfo) {
    	if (!"".equals(boxInfo)){
    		this.POBoxInfo = boxInfo;
    	}
    }

    public void setPreDirection(String preDirection) {
	this.preDirection = preDirection;
    }

    /**
     * @param preDirectionIntersection
     *            the preDirectionIntersection to set
     */
    public void setPreDirectionIntersection(String preDirectionIntersection) {
	this.preDirectionIntersection = preDirectionIntersection;
    }

    /**
     * @return the recipientName
     */
    public String getRecipientName() {
	return recipientName;
    }

    public void setRecipientName(String recipientName) {
	this.recipientName = recipientName;
    }

    public String getDistrict() {
	return district;
    }

    public void setDistrict(String district) {
	this.district = district;
    }

    public String getPostTown() {
	return postTown;
    }

    public void setPostTown(String postTown) {
	this.postTown = postTown;
    }

    public String getDependentLocality() {
	return dependentLocality;
    }

    public void setDependentLocality(String dependentLocality) {
	this.dependentLocality = dependentLocality;
    }

    public void setPOBoxAgency(String POBoxAgency) {
	this.POBoxAgency = POBoxAgency;

    }

    public String getPOBoxAgency() {
	return POBoxAgency;
    }

    public String getQuarter() {
	return quarter;
    }

    public void setQuarter(String quarter) {
	this.quarter = quarter;
    }

    public String getPostOfficeBox() {
	return PostOfficeBox;
    }

    public void setPostOfficeBox(String postOfficeBox) {
	PostOfficeBox = postOfficeBox;
    }

    /**
     * Try to determine it if not set, otherwise, return the seted value
     * @return the geocodingLevel
     */
    public GeocodingLevels getGeocodingLevel() {
	this.geocodingLevel=calculateGeocodingLevel();
	return this.geocodingLevel;
	
    }
    
    private GeocodingLevels calculateGeocodingLevel(){
	if (houseNumber!=null){
	    return GeocodingLevels.HOUSE_NUMBER;
	}
	if (streetName!=null || streetType!=null){
	    return GeocodingLevels.STREET;
	}
	if (city != null || dependentLocality != null || zipCode!=null){
	    return GeocodingLevels.CITY;
	}
	if (state!=null || district!=null){
	    return GeocodingLevels.STATE;
	}
	if (country!=null){
	    return GeocodingLevels.COUNTRY;
	}
	return GeocodingLevels.NONE;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((POBox == null) ? 0 : POBox.hashCode());
		result = prime * result
				+ ((POBoxAgency == null) ? 0 : POBoxAgency.hashCode());
		result = prime * result
				+ ((POBoxInfo == null) ? 0 : POBoxInfo.hashCode());
		result = prime * result
				+ ((PostOfficeBox == null) ? 0 : PostOfficeBox.hashCode());
		result = prime
				* result
				+ ((StreetTypeIntersection == null) ? 0
						: StreetTypeIntersection.hashCode());
		result = prime * result + ((block == null) ? 0 : block.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((citySubdivision == null) ? 0 : citySubdivision.hashCode());
		result = prime
				* result
				+ ((civicNumberSuffix == null) ? 0 : civicNumberSuffix
						.hashCode());
		result = prime * result
				+ ((confidence == null) ? 0 : confidence.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime
				* result
				+ ((dependentLocality == null) ? 0 : dependentLocality
						.hashCode());
		result = prime * result
				+ ((distance == null) ? 0 : distance.hashCode());
		result = prime * result
				+ ((district == null) ? 0 : district.hashCode());
		result = prime * result
				+ ((extraInfo == null) ? 0 : extraInfo.hashCode());
		result = prime * result + ((floor == null) ? 0 : floor.hashCode());
		result = prime * result
				+ ((geocodingLevel == null) ? 0 : geocodingLevel.hashCode());
		result = prime * result
				+ ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result
				+ ((houseNumberInfo == null) ? 0 : houseNumberInfo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lat == null) ? 0 : lat.hashCode());
		result = prime * result + ((lng == null) ? 0 : lng.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((postDirection == null) ? 0 : postDirection.hashCode());
		result = prime
				* result
				+ ((postDirectionIntersection == null) ? 0
						: postDirectionIntersection.hashCode());
		result = prime * result
				+ ((postTown == null) ? 0 : postTown.hashCode());
		result = prime * result
				+ ((preDirection == null) ? 0 : preDirection.hashCode());
		result = prime
				* result
				+ ((preDirectionIntersection == null) ? 0
						: preDirectionIntersection.hashCode());
		result = prime * result
				+ ((prefecture == null) ? 0 : prefecture.hashCode());
		result = prime * result
				+ ((quadrant == null) ? 0 : quadrant.hashCode());
		result = prime * result + ((quarter == null) ? 0 : quarter.hashCode());
		result = prime * result
				+ ((recipientName == null) ? 0 : recipientName.hashCode());
		result = prime * result + ((sector == null) ? 0 : sector.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result
				+ ((streetName == null) ? 0 : streetName.hashCode());
		result = prime
				* result
				+ ((streetNameIntersection == null) ? 0
						: streetNameIntersection.hashCode());
		result = prime * result
				+ ((streetType == null) ? 0 : streetType.hashCode());
		result = prime * result
				+ ((suiteNumber == null) ? 0 : suiteNumber.hashCode());
		result = prime * result
				+ ((suiteType == null) ? 0 : suiteType.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (POBox == null) {
			if (other.POBox != null)
				return false;
		} else if (!POBox.equals(other.POBox))
			return false;
		if (POBoxAgency == null) {
			if (other.POBoxAgency != null)
				return false;
		} else if (!POBoxAgency.equals(other.POBoxAgency))
			return false;
		if (POBoxInfo == null) {
			if (other.POBoxInfo != null)
				return false;
		} else if (!POBoxInfo.equals(other.POBoxInfo))
			return false;
		if (PostOfficeBox == null) {
			if (other.PostOfficeBox != null)
				return false;
		} else if (!PostOfficeBox.equals(other.PostOfficeBox))
			return false;
		if (StreetTypeIntersection == null) {
			if (other.StreetTypeIntersection != null)
				return false;
		} else if (!StreetTypeIntersection.equals(other.StreetTypeIntersection))
			return false;
		if (block == null) {
			if (other.block != null)
				return false;
		} else if (!block.equals(other.block))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (citySubdivision == null) {
			if (other.citySubdivision != null)
				return false;
		} else if (!citySubdivision.equals(other.citySubdivision))
			return false;
		if (civicNumberSuffix == null) {
			if (other.civicNumberSuffix != null)
				return false;
		} else if (!civicNumberSuffix.equals(other.civicNumberSuffix))
			return false;
		if (confidence == null) {
			if (other.confidence != null)
				return false;
		} else if (!confidence.equals(other.confidence))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (dependentLocality == null) {
			if (other.dependentLocality != null)
				return false;
		} else if (!dependentLocality.equals(other.dependentLocality))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (extraInfo == null) {
			if (other.extraInfo != null)
				return false;
		} else if (!extraInfo.equals(other.extraInfo))
			return false;
		if (floor == null) {
			if (other.floor != null)
				return false;
		} else if (!floor.equals(other.floor))
			return false;
		if (geocodingLevel != other.geocodingLevel)
			return false;
		if (houseNumber == null) {
			if (other.houseNumber != null)
				return false;
		} else if (!houseNumber.equals(other.houseNumber))
			return false;
		if (houseNumberInfo == null) {
			if (other.houseNumberInfo != null)
				return false;
		} else if (!houseNumberInfo.equals(other.houseNumberInfo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lat == null) {
			if (other.lat != null)
				return false;
		} else if (!lat.equals(other.lat))
			return false;
		if (lng == null) {
			if (other.lng != null)
				return false;
		} else if (!lng.equals(other.lng))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (postDirection == null) {
			if (other.postDirection != null)
				return false;
		} else if (!postDirection.equals(other.postDirection))
			return false;
		if (postDirectionIntersection == null) {
			if (other.postDirectionIntersection != null)
				return false;
		} else if (!postDirectionIntersection
				.equals(other.postDirectionIntersection))
			return false;
		if (postTown == null) {
			if (other.postTown != null)
				return false;
		} else if (!postTown.equals(other.postTown))
			return false;
		if (preDirection == null) {
			if (other.preDirection != null)
				return false;
		} else if (!preDirection.equals(other.preDirection))
			return false;
		if (preDirectionIntersection == null) {
			if (other.preDirectionIntersection != null)
				return false;
		} else if (!preDirectionIntersection
				.equals(other.preDirectionIntersection))
			return false;
		if (prefecture == null) {
			if (other.prefecture != null)
				return false;
		} else if (!prefecture.equals(other.prefecture))
			return false;
		if (quadrant == null) {
			if (other.quadrant != null)
				return false;
		} else if (!quadrant.equals(other.quadrant))
			return false;
		if (quarter == null) {
			if (other.quarter != null)
				return false;
		} else if (!quarter.equals(other.quarter))
			return false;
		if (recipientName == null) {
			if (other.recipientName != null)
				return false;
		} else if (!recipientName.equals(other.recipientName))
			return false;
		if (sector == null) {
			if (other.sector != null)
				return false;
		} else if (!sector.equals(other.sector))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (streetNameIntersection == null) {
			if (other.streetNameIntersection != null)
				return false;
		} else if (!streetNameIntersection.equals(other.streetNameIntersection))
			return false;
		if (streetType == null) {
			if (other.streetType != null)
				return false;
		} else if (!streetType.equals(other.streetType))
			return false;
		if (suiteNumber == null) {
			if (other.suiteNumber != null)
				return false;
		} else if (!suiteNumber.equals(other.suiteNumber))
			return false;
		if (suiteType == null) {
			if (other.suiteType != null)
				return false;
		} else if (!suiteType.equals(other.suiteType))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

   @Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Address [");
	if (id != null) {
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
	}
	if (lng != null) {
		builder.append("lng=");
		builder.append(lng);
		builder.append(", ");
	}
	if (lat != null) {
		builder.append("lat=");
		builder.append(lat);
		builder.append(", ");
	}
	if (name != null) {
		builder.append("name=");
		builder.append(name);
		builder.append(", ");
	}
	if (recipientName != null) {
		builder.append("recipientName=");
		builder.append(recipientName);
		builder.append(", ");
	}
	if (houseNumber != null) {
		builder.append("houseNumber=");
		builder.append(houseNumber);
		builder.append(", ");
	}
	if (houseNumberInfo != null) {
		builder.append("houseNumberInfo=");
		builder.append(houseNumberInfo);
		builder.append(", ");
	}
	if (POBox != null) {
		builder.append("POBox=");
		builder.append(POBox);
		builder.append(", ");
	}
	if (POBoxInfo != null) {
		builder.append("POBoxInfo=");
		builder.append(POBoxInfo);
		builder.append(", ");
	}
	if (POBoxAgency != null) {
		builder.append("POBoxAgency=");
		builder.append(POBoxAgency);
		builder.append(", ");
	}
	if (civicNumberSuffix != null) {
		builder.append("civicNumberSuffix=");
		builder.append(civicNumberSuffix);
		builder.append(", ");
	}
	if (preDirection != null) {
		builder.append("preDirection=");
		builder.append(preDirection);
		builder.append(", ");
	}
	if (streetName != null) {
		builder.append("streetName=");
		builder.append(streetName);
		builder.append(", ");
	}
	if (streetType != null) {
		builder.append("streetType=");
		builder.append(streetType);
		builder.append(", ");
	}
	if (postDirection != null) {
		builder.append("postDirection=");
		builder.append(postDirection);
		builder.append(", ");
	}
	if (preDirectionIntersection != null) {
		builder.append("preDirectionIntersection=");
		builder.append(preDirectionIntersection);
		builder.append(", ");
	}
	if (streetNameIntersection != null) {
		builder.append("streetNameIntersection=");
		builder.append(streetNameIntersection);
		builder.append(", ");
	}
	if (StreetTypeIntersection != null) {
		builder.append("StreetTypeIntersection=");
		builder.append(StreetTypeIntersection);
		builder.append(", ");
	}
	if (postDirectionIntersection != null) {
		builder.append("postDirectionIntersection=");
		builder.append(postDirectionIntersection);
		builder.append(", ");
	}
	if (extraInfo != null) {
		builder.append("extraInfo=");
		builder.append(extraInfo);
		builder.append(", ");
	}
	if (suiteType != null) {
		builder.append("suiteType=");
		builder.append(suiteType);
		builder.append(", ");
	}
	if (suiteNumber != null) {
		builder.append("suiteNumber=");
		builder.append(suiteNumber);
		builder.append(", ");
	}
	if (floor != null) {
		builder.append("floor=");
		builder.append(floor);
		builder.append(", ");
	}
	if (quarter != null) {
		builder.append("quarter=");
		builder.append(quarter);
		builder.append(", ");
	}
	if (zipCode != null) {
		builder.append("zipCode=");
		builder.append(zipCode);
		builder.append(", ");
	}
	if (district != null) {
		builder.append("district=");
		builder.append(district);
		builder.append(", ");
	}
	if (dependentLocality != null) {
		builder.append("dependentLocality=");
		builder.append(dependentLocality);
		builder.append(", ");
	}
	if (city != null) {
		builder.append("city=");
		builder.append(city);
		builder.append(", ");
	}
	if (citySubdivision != null) {
		builder.append("citySubdivision=");
		builder.append(citySubdivision);
		builder.append(", ");
	}
	if (postTown != null) {
		builder.append("postTown=");
		builder.append(postTown);
		builder.append(", ");
	}
	if (state != null) {
		builder.append("state=");
		builder.append(state);
		builder.append(", ");
	}
	if (prefecture != null) {
		builder.append("prefecture=");
		builder.append(prefecture);
		builder.append(", ");
	}
	if (country != null) {
		builder.append("country=");
		builder.append(country);
		builder.append(", ");
	}
	if (countryCode != null) {
		builder.append("countryCode=");
		builder.append(countryCode);
		builder.append(", ");
	}
	if (sector != null) {
		builder.append("sector=");
		builder.append(sector);
		builder.append(", ");
	}
	if (quadrant != null) {
		builder.append("quadrant=");
		builder.append(quadrant);
		builder.append(", ");
	}
	if (block != null) {
		builder.append("block=");
		builder.append(block);
		builder.append(", ");
	}
	if (lote != null) {
		builder.append("lote=");
		builder.append(lote);
		builder.append(", ");
	}
	if (geocodingLevel != null) {
		builder.append("geocodingLevel=");
		builder.append(getGeocodingLevel());
		builder.append(", ");
	}
	if (confidence != null) {
		builder.append("confidence=");
		builder.append(confidence);
		builder.append(", ");
	}
	if (distance != null) {
		builder.append("distance=");
		builder.append(distance);
		builder.append(", ");
	}
	if (PostOfficeBox != null) {
		builder.append("PostOfficeBox=");
		builder.append(PostOfficeBox);
	}
	builder.append("]");
	return builder.toString();
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuiteNumber() {
		return suiteNumber;
	}

	public void setSuiteNumber(String suiteNumber) {
		this.suiteNumber = suiteNumber;
	}

	public String getSuiteType() {
		return suiteType;
	}

	public void setSuiteType(String suiteType) {
		this.suiteType = suiteType;
	}

	public String getConfidence() {
		return confidence;
	}

	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public void setGeocodingLevel(GeocodingLevels geocodingLevel) {
		this.geocodingLevel = geocodingLevel;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Double getWard() {
		return ward;
	}

	public void setWard(Double ward) {
		this.ward = ward;
	}



}