//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/SensitivityStatusList.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/SensitivityStatusList.java
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SensitivityStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SensitivityStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="suspected"/&gt;
 *     &lt;enumeration value="confirmed"/&gt;
 *     &lt;enumeration value="refuted"/&gt;
 *     &lt;enumeration value="resolved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SensitivityStatus-list")
@XmlEnum
public enum SensitivityStatusList {


    /**
     * A suspected sensitivity to a substance.
     * 
     */
    @XmlEnumValue("suspected")
    SUSPECTED("suspected"),

    /**
     * The sensitivity has been confirmed and is active.
     * 
     */
    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed"),

    /**
     * The sensitivity has been shown to never have existed.
     * 
     */
    @XmlEnumValue("refuted")
    REFUTED("refuted"),

    /**
     * The sensitivity used to exist but no longer does.
     * 
     */
    @XmlEnumValue("resolved")
    RESOLVED("resolved");
    private final java.lang.String value;

    SensitivityStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SensitivityStatusList fromValue(java.lang.String v) {
        for (SensitivityStatusList c: SensitivityStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
