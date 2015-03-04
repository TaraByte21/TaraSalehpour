//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/SupplyDispenseStatusList.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/SupplyDispenseStatusList.java
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyDispenseStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyDispenseStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="in progress"/&gt;
 *     &lt;enumeration value="dispensed"/&gt;
 *     &lt;enumeration value="abandoned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplyDispenseStatus-list")
@XmlEnum
public enum SupplyDispenseStatusList {


    /**
     * Supply has been requested, but not dispensed.
     * 
     */
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),

    /**
     * Supply is part of a pharmacy order and has been dispensed.
     * 
     */
    @XmlEnumValue("dispensed")
    DISPENSED("dispensed"),

    /**
     * Dispensing was not completed.
     * 
     */
    @XmlEnumValue("abandoned")
    ABANDONED("abandoned");
    private final java.lang.String value;

    SupplyDispenseStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SupplyDispenseStatusList fromValue(java.lang.String v) {
        for (SupplyDispenseStatusList c: SupplyDispenseStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
