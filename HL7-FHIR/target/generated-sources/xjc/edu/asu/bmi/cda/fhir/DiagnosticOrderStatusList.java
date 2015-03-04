//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/DiagnosticOrderStatusList.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/DiagnosticOrderStatusList.java
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticOrderStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticOrderStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="requested"/&gt;
 *     &lt;enumeration value="received"/&gt;
 *     &lt;enumeration value="accepted"/&gt;
 *     &lt;enumeration value="in progress"/&gt;
 *     &lt;enumeration value="review"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="suspended"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *     &lt;enumeration value="failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticOrderStatus-list")
@XmlEnum
public enum DiagnosticOrderStatusList {


    /**
     * The request has been placed.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * The receiving system has received the order, but not yet decided whether it will be performed.
     * 
     */
    @XmlEnumValue("received")
    RECEIVED("received"),

    /**
     * The receiving system has accepted the order, but work has not yet commenced.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The work to fulfill the order is happening.
     * 
     */
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),

    /**
     * The work is complete, and the outcomes are being reviewed for approval.
     * 
     */
    @XmlEnumValue("review")
    REVIEW("review"),

    /**
     * The work has been complete, the report(s) released, and no further work is planned.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The request has been held by originating system/user request.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),

    /**
     * The receiving system has declined to fulfill the request.
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The diagnostic investigation was attempted, but due to some procedural error, it could not be completed.
     * 
     */
    @XmlEnumValue("failed")
    FAILED("failed");
    private final java.lang.String value;

    DiagnosticOrderStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticOrderStatusList fromValue(java.lang.String v) {
        for (DiagnosticOrderStatusList c: DiagnosticOrderStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
