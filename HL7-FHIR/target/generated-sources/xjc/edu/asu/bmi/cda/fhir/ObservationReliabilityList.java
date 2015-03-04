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
 * <p>Java class for ObservationReliability-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationReliability-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ok"/&gt;
 *     &lt;enumeration value="ongoing"/&gt;
 *     &lt;enumeration value="early"/&gt;
 *     &lt;enumeration value="questionable"/&gt;
 *     &lt;enumeration value="calibrating"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationReliability-list")
@XmlEnum
public enum ObservationReliabilityList {


    /**
     * The result has no reliability concerns.
     * 
     */
    @XmlEnumValue("ok")
    OK("ok"),

    /**
     * An early estimate of value; measurement is still occurring.
     * 
     */
    @XmlEnumValue("ongoing")
    ONGOING("ongoing"),

    /**
     * An early estimate of value; processing is still occurring.
     * 
     */
    @XmlEnumValue("early")
    EARLY("early"),

    /**
     * The observation value should be treated with care.
     * 
     */
    @XmlEnumValue("questionable")
    QUESTIONABLE("questionable"),

    /**
     * The result has been generated while calibration is occurring.
     * 
     */
    @XmlEnumValue("calibrating")
    CALIBRATING("calibrating"),

    /**
     * The observation could not be completed because of an error.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * No observation value was available.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final java.lang.String value;

    ObservationReliabilityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ObservationReliabilityList fromValue(java.lang.String v) {
        for (ObservationReliabilityList c: ObservationReliabilityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
