//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/DocumentReferenceStatusList.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/DocumentReferenceStatusList.java
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentReferenceStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentReferenceStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="current"/&gt;
 *     &lt;enumeration value="superceded"/&gt;
 *     &lt;enumeration value="entered in error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentReferenceStatus-list")
@XmlEnum
public enum DocumentReferenceStatusList {


    /**
     * This is the current reference for this document.
     * 
     */
    @XmlEnumValue("current")
    CURRENT("current"),

    /**
     * This reference has been superseded by another reference.
     * 
     */
    @XmlEnumValue("superceded")
    SUPERCEDED("superceded"),

    /**
     * This reference was created in error.
     * 
     */
    @XmlEnumValue("entered in error")
    ENTERED_IN_ERROR("entered in error");
    private final java.lang.String value;

    DocumentReferenceStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DocumentReferenceStatusList fromValue(java.lang.String v) {
        for (DocumentReferenceStatusList c: DocumentReferenceStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
