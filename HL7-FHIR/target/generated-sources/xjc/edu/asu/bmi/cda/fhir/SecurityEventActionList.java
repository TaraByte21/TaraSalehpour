//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 01:43:53 PM MST 
//


package edu.asu.bmi.cda.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityEventAction-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityEventAction-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityEventAction-list")
@XmlEnum
public enum SecurityEventActionList {


    /**
     * Create a new database object, such as Placing an Order.
     * 
     */
    C,

    /**
     * Display or print data, such as a Doctor Census.
     * 
     */
    R,

    /**
     * Update data, such as Revise Patient Information.
     * 
     */
    U,

    /**
     * Delete items, such as a doctor master file record.
     * 
     */
    D,

    /**
     * Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.
     * 
     */
    E;

    public java.lang.String value() {
        return name();
    }

    public static SecurityEventActionList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
