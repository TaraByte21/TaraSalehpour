//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 01:43:53 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Significant health events and conditions for people related to the subject relevant in the context of care for the subject.
 * 
 * <p>Java class for FamilyHistory.Relation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyHistory.Relation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="bornPeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *           &lt;element name="bornDate" type="{http://hl7.org/fhir}date"/&gt;
 *           &lt;element name="bornString" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="deceasedBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="deceasedAge" type="{http://hl7.org/fhir}Age"/&gt;
 *           &lt;element name="deceasedRange" type="{http://hl7.org/fhir}Range"/&gt;
 *           &lt;element name="deceasedDate" type="{http://hl7.org/fhir}date"/&gt;
 *           &lt;element name="deceasedString" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="condition" type="{http://hl7.org/fhir}FamilyHistory.Condition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistory.Relation", propOrder = {
    "name",
    "relationship",
    "bornString",
    "bornDate",
    "bornPeriod",
    "deceasedString",
    "deceasedDate",
    "deceasedRange",
    "deceasedAge",
    "deceasedBoolean",
    "note",
    "conditions"
})
public class FamilyHistoryRelation
    extends BackboneElement
    implements Serializable
{

    protected edu.asu.bmi.cda.fhir.String name;
    @XmlElement(required = true)
    protected CodeableConcept relationship;
    protected edu.asu.bmi.cda.fhir.String bornString;
    protected Date bornDate;
    protected Period bornPeriod;
    protected edu.asu.bmi.cda.fhir.String deceasedString;
    protected Date deceasedDate;
    protected Range deceasedRange;
    protected Age deceasedAge;
    protected Boolean deceasedBoolean;
    protected edu.asu.bmi.cda.fhir.String note;
    @XmlElement(name = "condition")
    protected List<FamilyHistoryCondition> conditions;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setName(edu.asu.bmi.cda.fhir.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRelationship(CodeableConcept value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the bornString property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getBornString() {
        return bornString;
    }

    /**
     * Sets the value of the bornString property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setBornString(edu.asu.bmi.cda.fhir.String value) {
        this.bornString = value;
    }

    /**
     * Gets the value of the bornDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * Sets the value of the bornDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBornDate(Date value) {
        this.bornDate = value;
    }

    /**
     * Gets the value of the bornPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getBornPeriod() {
        return bornPeriod;
    }

    /**
     * Sets the value of the bornPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setBornPeriod(Period value) {
        this.bornPeriod = value;
    }

    /**
     * Gets the value of the deceasedString property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getDeceasedString() {
        return deceasedString;
    }

    /**
     * Sets the value of the deceasedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setDeceasedString(edu.asu.bmi.cda.fhir.String value) {
        this.deceasedString = value;
    }

    /**
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDeceasedDate(Date value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the deceasedRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getDeceasedRange() {
        return deceasedRange;
    }

    /**
     * Sets the value of the deceasedRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDeceasedRange(Range value) {
        this.deceasedRange = value;
    }

    /**
     * Gets the value of the deceasedAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getDeceasedAge() {
        return deceasedAge;
    }

    /**
     * Sets the value of the deceasedAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setDeceasedAge(Age value) {
        this.deceasedAge = value;
    }

    /**
     * Gets the value of the deceasedBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    /**
     * Sets the value of the deceasedBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedBoolean(Boolean value) {
        this.deceasedBoolean = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setNote(edu.asu.bmi.cda.fhir.String value) {
        this.note = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyHistoryCondition }
     * 
     * 
     */
    public List<FamilyHistoryCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<FamilyHistoryCondition>();
        }
        return this.conditions;
    }

    public FamilyHistoryRelation withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public FamilyHistoryRelation withRelationship(CodeableConcept value) {
        setRelationship(value);
        return this;
    }

    public FamilyHistoryRelation withBornString(edu.asu.bmi.cda.fhir.String value) {
        setBornString(value);
        return this;
    }

    public FamilyHistoryRelation withBornDate(Date value) {
        setBornDate(value);
        return this;
    }

    public FamilyHistoryRelation withBornPeriod(Period value) {
        setBornPeriod(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedString(edu.asu.bmi.cda.fhir.String value) {
        setDeceasedString(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedDate(Date value) {
        setDeceasedDate(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedRange(Range value) {
        setDeceasedRange(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedAge(Age value) {
        setDeceasedAge(value);
        return this;
    }

    public FamilyHistoryRelation withDeceasedBoolean(Boolean value) {
        setDeceasedBoolean(value);
        return this;
    }

    public FamilyHistoryRelation withNote(edu.asu.bmi.cda.fhir.String value) {
        setNote(value);
        return this;
    }

    public FamilyHistoryRelation withConditions(FamilyHistoryCondition... values) {
        if (values!= null) {
            for (FamilyHistoryCondition value: values) {
                getConditions().add(value);
            }
        }
        return this;
    }

    public FamilyHistoryRelation withConditions(Collection<FamilyHistoryCondition> values) {
        if (values!= null) {
            getConditions().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistoryRelation withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
