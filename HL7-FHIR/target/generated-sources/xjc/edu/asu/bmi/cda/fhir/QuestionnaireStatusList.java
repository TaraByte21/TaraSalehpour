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
 * <p>Java class for QuestionnaireStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionnaireStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="draft"/&gt;
 *     &lt;enumeration value="published"/&gt;
 *     &lt;enumeration value="retired"/&gt;
 *     &lt;enumeration value="in progress"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="amended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuestionnaireStatus-list")
@XmlEnum
public enum QuestionnaireStatusList {


    /**
     * This Questionnaire is used as a template but the template is not ready for use or publication.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * This Questionnaire is used as a template, is published and ready for use.
     * 
     */
    @XmlEnumValue("published")
    PUBLISHED("published"),

    /**
     * This Questionnaire is used as a template but should no longer be used for new Questionnaires.
     * 
     */
    @XmlEnumValue("retired")
    RETIRED("retired"),

    /**
     * This Questionnaire has been filled out with answers, but changes or additions are still expected to be made to it.
     * 
     */
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),

    /**
     * This Questionnaire has been filled out with answers, and the current content is regarded as definitive.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * This Questionnaire has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
     * 
     */
    @XmlEnumValue("amended")
    AMENDED("amended");
    private final java.lang.String value;

    QuestionnaireStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static QuestionnaireStatusList fromValue(java.lang.String v) {
        for (QuestionnaireStatusList c: QuestionnaireStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
