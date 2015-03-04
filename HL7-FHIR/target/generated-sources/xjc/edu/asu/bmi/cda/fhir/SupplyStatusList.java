//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 01:43:53 PM MST 
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="requested"/&gt;
 *     &lt;enumeration value="dispensed"/&gt;
 *     &lt;enumeration value="received"/&gt;
 *     &lt;enumeration value="failed"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplyStatus-list")
@XmlEnum
public enum SupplyStatusList {


    /**
     * Supply has been requested, but not dispensed.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * Supply is part of a pharmacy order and has been dispensed.
     * 
     */
    @XmlEnumValue("dispensed")
    DISPENSED("dispensed"),

    /**
     * Supply has been received by the requestor.
     * 
     */
    @XmlEnumValue("received")
    RECEIVED("received"),

    /**
     * The supply will not be completed because the supplier was unable or unwilling to supply the item.
     * 
     */
    @XmlEnumValue("failed")
    FAILED("failed"),

    /**
     * The orderer of the supply cancelled the request.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final java.lang.String value;

    SupplyStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SupplyStatusList fromValue(java.lang.String v) {
        for (SupplyStatusList c: SupplyStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
