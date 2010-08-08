/***
 * Mages: Multiplayer Game Engine for mobile devices
 * Copyright (C) 2008 aksonov
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Contact: aksonov dot gmail dot com
 *
 * Author: Pavlo Aksonov
 */
package org.aksonov.mages.entities;

import java.io.Serializable;

public class Custom  {
	public Serializable obj;
	private Custom(Serializable obj) {
		this.obj = obj;
	}

	public static Custom create(Serializable obj) {
		if (obj == null){
			throw new IllegalArgumentException("Custom.create accepts only non-null serializable objects");
		}
		return new Custom(obj);
	}

	public Object getObject() {
		return obj;
	}

	public void dispose() {
		Custom.dispose(this);
	}
	
	public static void dispose(Custom object){
	}

}
