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
 * <p>Java class for CausalityExpectation-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CausalityExpectation-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="likely"/&gt;
 *     &lt;enumeration value="unlikely"/&gt;
 *     &lt;enumeration value="confirmed"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CausalityExpectation-list")
@XmlEnum
public enum CausalityExpectationList {


    /**
     * Likely that this specific exposure caused the reaction.
     * 
     */
    @XmlEnumValue("likely")
    LIKELY("likely"),

    /**
     * Unlikely that this specific exposure caused the reaction - the exposure is being linked to for information purposes.
     * 
     */
    @XmlEnumValue("unlikely")
    UNLIKELY("unlikely"),

    /**
     * It has been confirmed that this exposure was one of the causes of the reaction.
     * 
     */
    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed"),

    /**
     * It is unknown whether this exposure had anything to do with the reaction.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final java.lang.String value;

    CausalityExpectationList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CausalityExpectationList fromValue(java.lang.String v) {
        for (CausalityExpectationList c: CausalityExpectationList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
