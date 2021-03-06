//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
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
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Goal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}CarePlanGoalStatus" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="concern" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Goal", propOrder = {
    "description",
    "status",
    "notes",
    "concerns"
})
public class CarePlanGoal
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected edu.asu.bmi.cda.fhir.String description;
    protected CarePlanGoalStatus status;
    protected edu.asu.bmi.cda.fhir.String notes;
    @XmlElement(name = "concern")
    protected List<ResourceReference> concerns;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setDescription(edu.asu.bmi.cda.fhir.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanGoalStatus }
     *     
     */
    public CarePlanGoalStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanGoalStatus }
     *     
     */
    public void setStatus(CarePlanGoalStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setNotes(edu.asu.bmi.cda.fhir.String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the concerns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concerns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcerns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getConcerns() {
        if (concerns == null) {
            concerns = new ArrayList<ResourceReference>();
        }
        return this.concerns;
    }

    public CarePlanGoal withDescription(edu.asu.bmi.cda.fhir.String value) {
        setDescription(value);
        return this;
    }

    public CarePlanGoal withStatus(CarePlanGoalStatus value) {
        setStatus(value);
        return this;
    }

    public CarePlanGoal withNotes(edu.asu.bmi.cda.fhir.String value) {
        setNotes(value);
        return this;
    }

    public CarePlanGoal withConcerns(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getConcerns().add(value);
            }
        }
        return this;
    }

    public CarePlanGoal withConcerns(Collection<ResourceReference> values) {
        if (values!= null) {
            getConcerns().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanGoal withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanGoal withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanGoal withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanGoal withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanGoal withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
