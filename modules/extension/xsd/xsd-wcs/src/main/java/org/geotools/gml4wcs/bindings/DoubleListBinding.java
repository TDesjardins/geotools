/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2019, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 */

package org.geotools.gml4wcs.bindings;

import java.util.List;
import javax.xml.namespace.QName;
import org.geotools.gml4wcs.GML;
import org.geotools.xsd.AbstractSimpleBinding;
import org.geotools.xsd.InstanceComponent;

/**
 * Binding object for the type http://www.opengis.net/gml:doubleList.
 *
 * <p>
 *
 * <pre>
 *  <code>
 *  &lt;simpleType name=&quot;doubleList&quot;&gt;
 *      &lt;annotation&gt;
 *          &lt;documentation&gt;XML List based on XML Schema double type.  An element of this type contains a space-separated list of double values&lt;/documentation&gt;
 *      &lt;/annotation&gt;
 *      &lt;list itemType=&quot;double&quot;/&gt;
 *  &lt;/simpleType&gt;
 *
 * </code>
 *  </pre>
 *
 * @generated
 */
public class DoubleListBinding extends AbstractSimpleBinding {

    /** @generated */
    @Override
    public QName getTarget() {
        return GML.doubleList;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Class getType() {
        // return double[].class;
        return Double[].class;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Object parse(InstanceComponent instance, Object value) throws Exception {
        @SuppressWarnings("unchecked")
        List<Double> list = (List) value;

        return list.toArray(new Double[list.size()]);

        // String[] values = ((String) value).split(" +");
        // double[] doubles = new double[values.length];
        //
        // for (int i = 0; i < values.length; i++) {
        // doubles[i] = Double.parseDouble(values[i]);
        // }
        //
        // return doubles;
    }
}
