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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Supply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kind" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}SupplyStatus" minOccurs="0"/&gt;
 *         &lt;element name="orderedItem" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="dispense" type="{http://hl7.org/fhir}Supply.Dispense" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supply", propOrder = {
    "kind",
    "identifier",
    "status",
    "orderedItem",
    "patient",
    "dispenses"
})
@XmlRootElement(name = "Supply")
public class Supply
    extends Resource
    implements Serializable
{

    protected CodeableConcept kind;
    protected Identifier identifier;
    protected SupplyStatus status;
    protected ResourceReference orderedItem;
    protected ResourceReference patient;
    @XmlElement(name = "dispense")
    protected List<SupplyDispense> dispenses;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setKind(CodeableConcept value) {
        this.kind = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyStatus }
     *     
     */
    public SupplyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyStatus }
     *     
     */
    public void setStatus(SupplyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the orderedItem property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getOrderedItem() {
        return orderedItem;
    }

    /**
     * Sets the value of the orderedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOrderedItem(ResourceReference value) {
        this.orderedItem = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPatient(ResourceReference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the dispenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyDispense }
     * 
     * 
     */
    public List<SupplyDispense> getDispenses() {
        if (dispenses == null) {
            dispenses = new ArrayList<SupplyDispense>();
        }
        return this.dispenses;
    }

    public Supply withKind(CodeableConcept value) {
        setKind(value);
        return this;
    }

    public Supply withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public Supply withStatus(SupplyStatus value) {
        setStatus(value);
        return this;
    }

    public Supply withOrderedItem(ResourceReference value) {
        setOrderedItem(value);
        return this;
    }

    public Supply withPatient(ResourceReference value) {
        setPatient(value);
        return this;
    }

    public Supply withDispenses(SupplyDispense... values) {
        if (values!= null) {
            for (SupplyDispense value: values) {
                getDispenses().add(value);
            }
        }
        return this;
    }

    public Supply withDispenses(Collection<SupplyDispense> values) {
        if (values!= null) {
            getDispenses().addAll(values);
        }
        return this;
    }

    @Override
    public Supply withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Supply withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Supply withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Supply withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Supply withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Supply withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Supply withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Supply withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Supply withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
