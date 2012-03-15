/*
 * Copyright (C) 2012, Emergya (http://www.emergya.com)
 *
 * @author <a href="mailto:marias@emergya.com">María Arias de Reyna</a>
 *
 * This file is part of GoFleetLS
 *
 * This software is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * As a special exception, if you link this library with other files to
 * produce an executable, this library does not by itself cause the
 * resulting executable to be covered by the GNU General Public License.
 * This exception does not however invalidate any other reasons why the
 * executable file might be covered by the GNU General Public License.
 */
package com.emergya.openfleetservices.importer;

import java.io.File;
import java.util.Iterator;

import com.emergya.openfleetservices.importer.data.DataSetDescriptor;

/**
 * 
 * Interface which all importers have to implement
 * 
 * @author marias
 * 
 */
public interface IConnector {

	/**
	 * Should be called on the constructor so the datasetdescriptor can be
	 * initialized
	 * 
	 * @param f
	 * @param typefile
	 */
	public void initialize(File f);

	/**
	 * Given a dataset, it returns the column names
	 * 
	 * @param file
	 * @return
	 */
	public Iterator<Object[]> getIterator();

	/**
	 * Given a dataset, it returns the dataset descriptor
	 * 
	 * @param file
	 * @return
	 */
	public DataSetDescriptor getDescriptor();

}
