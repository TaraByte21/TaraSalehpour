//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:21:42 PM MST 
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConformanceStatementStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConformanceStatementStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="draft"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="retired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConformanceStatementStatus-list")
@XmlEnum
public enum ConformanceStatementStatusList {


    /**
     * This conformance statement is still under development.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * This conformance statement is ready for use in production systems.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * This conformance statement has been withdrawn or superceded and should no longer be used.
     * 
     */
    @XmlEnumValue("retired")
    RETIRED("retired");
    private final java.lang.String value;

    ConformanceStatementStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConformanceStatementStatusList fromValue(java.lang.String v) {
        for (ConformanceStatementStatusList c: ConformanceStatementStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
