//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 10:25:06 PM MST 
//


package edu.asu.bmi.cad.fhir_model_noDB;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressUse-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressUse-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="home"/&gt;
 *     &lt;enumeration value="work"/&gt;
 *     &lt;enumeration value="temp"/&gt;
 *     &lt;enumeration value="old"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressUse-list")
@XmlEnum
public enum AddressUseList {


    /**
     * A communication address at a home.
     * 
     */
    @XmlEnumValue("home")
    HOME("home"),

    /**
     * An office address. First choice for business related contacts during business hours.
     * 
     */
    @XmlEnumValue("work")
    WORK("work"),

    /**
     * A temporary address. The period can provide more detailed information.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * This address is no longer in use (or was never correct, but retained for records).
     * 
     */
    @XmlEnumValue("old")
    OLD("old");
    private final java.lang.String value;

    AddressUseList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AddressUseList fromValue(java.lang.String v) {
        for (AddressUseList c: AddressUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
