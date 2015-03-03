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
 * <p>Java class for ListMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListMode-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="working"/&gt;
 *     &lt;enumeration value="snapshot"/&gt;
 *     &lt;enumeration value="changes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListMode-list")
@XmlEnum
public enum ListModeList {


    /**
     * This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes.
     * 
     */
    @XmlEnumValue("working")
    WORKING("working"),

    /**
     * This list was prepared as a snapshot. It should not be assumed to be current.
     * 
     */
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot"),

    /**
     * The list is prepared as a statement of changes that have been made or recommended.
     * 
     */
    @XmlEnumValue("changes")
    CHANGES("changes");
    private final java.lang.String value;

    ListModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ListModeList fromValue(java.lang.String v) {
        for (ListModeList c: ListModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
