//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/AlertStatusList.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/AlertStatusList.java
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="inactive"/&gt;
 *     &lt;enumeration value="entered in error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlertStatus-list")
@XmlEnum
public enum AlertStatusList {


    /**
     * A current alert that should be displayed to a user. A system may use the category to determine which roles should view the alert.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The alert does not need to be displayed any more.
     * 
     */
    @XmlEnumValue("inactive")
    INACTIVE("inactive"),

    /**
     * The alert was added in error, and should no longer be displayed.
     * 
     */
    @XmlEnumValue("entered in error")
    ENTERED_IN_ERROR("entered in error");
    private final java.lang.String value;

    AlertStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AlertStatusList fromValue(java.lang.String v) {
        for (AlertStatusList c: AlertStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
