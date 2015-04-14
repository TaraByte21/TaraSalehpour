//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositionAttestationMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompositionAttestationMode-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="personal"/&gt;
 *     &lt;enumeration value="professional"/&gt;
 *     &lt;enumeration value="legal"/&gt;
 *     &lt;enumeration value="official"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompositionAttestationMode-list")
@XmlEnum
public enum CompositionAttestationModeList {


    /**
     * The person authenticated the content in their personal capacity.
     * 
     */
    @XmlEnumValue("personal")
    PERSONAL("personal"),

    /**
     * The person authenticated the content in their professional capacity.
     * 
     */
    @XmlEnumValue("professional")
    PROFESSIONAL("professional"),

    /**
     * The person authenticated the content and accepted legal responsibility for its content.
     * 
     */
    @XmlEnumValue("legal")
    LEGAL("legal"),

    /**
     * The organization authenticated the content as consistent with their policies and procedures.
     * 
     */
    @XmlEnumValue("official")
    OFFICIAL("official");
    private final java.lang.String value;

    CompositionAttestationModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CompositionAttestationModeList fromValue(java.lang.String v) {
        for (CompositionAttestationModeList c: CompositionAttestationModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
