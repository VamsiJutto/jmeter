/*
 * Copyright 2006 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *  
 */

package org.apache.jmeter.extractor;

import java.beans.PropertyDescriptor;

import org.apache.jmeter.testbeans.BeanInfoSupport;
import org.apache.jmeter.testbeans.gui.TextAreaEditor;

public class BeanShellPostProcessorBeanInfo extends BeanInfoSupport {

	/**
	 * @param beanClass
	 */
	public BeanShellPostProcessorBeanInfo() {
		super(BeanShellPostProcessor.class);

        createPropertyGroup("scripting", new String[] { "script" });

		PropertyDescriptor p = property("script");
		p.setValue(NOT_UNDEFINED, Boolean.TRUE);
		p.setValue(DEFAULT, "");
        p.setPropertyEditorClass(TextAreaEditor.class);
        
	}

}
