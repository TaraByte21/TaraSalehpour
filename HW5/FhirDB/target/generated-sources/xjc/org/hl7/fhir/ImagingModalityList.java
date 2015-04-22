//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImagingModality-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImagingModality-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BDUS"/>
 *     &lt;enumeration value="EPS"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DX"/>
 *     &lt;enumeration value="ECG"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="XC"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="IVOCT"/>
 *     &lt;enumeration value="IVUS"/>
 *     &lt;enumeration value="KER"/>
 *     &lt;enumeration value="LEN"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="OAM"/>
 *     &lt;enumeration value="OCT"/>
 *     &lt;enumeration value="OPM"/>
 *     &lt;enumeration value="OP"/>
 *     &lt;enumeration value="OPR"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="OPV"/>
 *     &lt;enumeration value="PX"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="RF"/>
 *     &lt;enumeration value="RG"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SRF"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="XA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImagingModality-list")
@XmlEnum
public enum ImagingModalityList {

    AR,
    BMD,
    BDUS,
    EPS,
    CR,
    CT,
    DX,
    ECG,
    ES,
    XC,
    GM,
    HD,
    IO,
    IVOCT,
    IVUS,
    KER,
    LEN,
    MR,
    MG,
    NM,
    OAM,
    OCT,
    OPM,
    OP,
    OPR,
    OPT,
    OPV,
    PX,
    PT,
    RF,
    RG,
    SM,
    SRF,
    US,
    VA,
    XA;

    public java.lang.String value() {
        return name();
    }

    public static ImagingModalityList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}