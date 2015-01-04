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

import java.io.OutputStream;

import com.gisgraphy.addressparser.exception.AddressParserException;


/**
 * 
 * do a textual annalyse of a raw address, it doesn't care if the street, city, and so on exists, it is based on address patterns 
 * of the universal postal union recommandations
 * 
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 *
 */
public interface IAddressParserService {
    
    /**
     * Execute the query. It is thread safe
     * 
     * @param query
     *                The query to execute
     * @throws AddressParserException
     *                 If an error occurred
     */
    public AddressResultsDto execute(AddressQuery query)
	    throws AddressParserException;
    
    /**
     * Execute the query and serialize the results in an {@link OutputStream}.
     * It is thread safe and can be used in a servlet container
     * 
     * @param query
     *                the query to execute
     * @param outputStream
     *                the outputstream we want to serialize in
     * @throws AddressParserException
     *                 If an error occurred
     */
    public void executeAndSerialize(AddressQuery query, OutputStream outputStream)
	    throws AddressParserException;

    /**
     * Execute the query and returns the results as String. It is thread safe
     * 
     * @param query
     *                the query to execute
     * @throws AddressParserException
     *                 If an error occurred
     */
    public String executeToString(AddressQuery query) throws AddressParserException;

}
