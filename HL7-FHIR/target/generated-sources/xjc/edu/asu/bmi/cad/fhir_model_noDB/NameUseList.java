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
 * <p>Java class for NameUse-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameUse-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="usual"/&gt;
 *     &lt;enumeration value="official"/&gt;
 *     &lt;enumeration value="temp"/&gt;
 *     &lt;enumeration value="nickname"/&gt;
 *     &lt;enumeration value="anonymous"/&gt;
 *     &lt;enumeration value="old"/&gt;
 *     &lt;enumeration value="maiden"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameUse-list")
@XmlEnum
public enum NameUseList {


    /**
     * Known as/conventional/the one you normally use.
     * 
     */
    @XmlEnumValue("usual")
    USUAL("usual"),

    /**
     * The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called "legal name".
     * 
     */
    @XmlEnumValue("official")
    OFFICIAL("official"),

    /**
     * A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * A name that is used to address the person in an informal manner, but is not part of their formal or usual name.
     * 
     */
    @XmlEnumValue("nickname")
    NICKNAME("nickname"),

    /**
     * Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons).
     * 
     */
    @XmlEnumValue("anonymous")
    ANONYMOUS("anonymous"),

    /**
     * This name is no longer in use (or was never correct, but retained for records).
     * 
     */
    @XmlEnumValue("old")
    OLD("old"),

    /**
     * A name used prior to marriage. Marriage naming customs vary greatly around the world. This name use is for use by applications that collect and store "maiden" names. Though the concept of maiden name is often gender specific, the use of this term is not gender specific. The use of this term does not imply any particular history for a person's name, nor should the maiden name be determined algorithmically.
     * 
     */
    @XmlEnumValue("maiden")
    MAIDEN("maiden");
    private final java.lang.String value;

    NameUseList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NameUseList fromValue(java.lang.String v) {
        for (NameUseList c: NameUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
