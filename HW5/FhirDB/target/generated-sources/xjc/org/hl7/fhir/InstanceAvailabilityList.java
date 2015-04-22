//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceAvailability-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstanceAvailability-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONLINE"/>
 *     &lt;enumeration value="OFFLINE"/>
 *     &lt;enumeration value="NEARLINE"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstanceAvailability-list")
@XmlEnum
public enum InstanceAvailabilityList {


    /**
     * Resources are immediately available,.
     * 
     */
    ONLINE,

    /**
     * Resources need to be retrieved by manual intervention.
     * 
     */
    OFFLINE,

    /**
     * Resources need to be retrieved from relatively slow media.
     * 
     */
    NEARLINE,

    /**
     * Resources cannot be retrieved.
     * 
     */
    UNAVAILABLE;

    public java.lang.String value() {
        return name();
    }

    public static InstanceAvailabilityList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
