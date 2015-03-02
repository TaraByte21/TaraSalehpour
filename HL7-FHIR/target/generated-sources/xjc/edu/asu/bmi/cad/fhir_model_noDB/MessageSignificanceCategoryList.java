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
 * <p>Java class for MessageSignificanceCategory-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageSignificanceCategory-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Consequence"/&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="Notification"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageSignificanceCategory-list")
@XmlEnum
public enum MessageSignificanceCategoryList {


    /**
     * The message represents/requests a change that should not be processed more than once. E.g. Making a booking for an appointment.
     * 
     */
    @XmlEnumValue("Consequence")
    CONSEQUENCE("Consequence"),

    /**
     * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.
     * 
     */
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),

    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.
     * 
     */
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification");
    private final java.lang.String value;

    MessageSignificanceCategoryList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MessageSignificanceCategoryList fromValue(java.lang.String v) {
        for (MessageSignificanceCategoryList c: MessageSignificanceCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
