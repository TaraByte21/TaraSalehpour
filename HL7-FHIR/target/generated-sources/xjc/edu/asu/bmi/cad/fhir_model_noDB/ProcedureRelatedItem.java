//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 10:25:06 PM MST 
//


package edu.asu.bmi.cad.fhir_model_noDB;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An action that is performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
 * 
 * <p>Java class for Procedure.RelatedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure.RelatedItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}ProcedureRelationshipType" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure.RelatedItem", propOrder = {
    "type",
    "target"
})
public class ProcedureRelatedItem
    extends BackboneElement
    implements Serializable
{

    protected ProcedureRelationshipType type;
    protected ResourceReference target;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureRelationshipType }
     *     
     */
    public ProcedureRelationshipType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureRelationshipType }
     *     
     */
    public void setType(ProcedureRelationshipType value) {
        this.type = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setTarget(ResourceReference value) {
        this.target = value;
    }

    public ProcedureRelatedItem withType(ProcedureRelationshipType value) {
        setType(value);
        return this;
    }

    public ProcedureRelatedItem withTarget(ResourceReference value) {
        setTarget(value);
        return this;
    }

    @Override
    public ProcedureRelatedItem withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProcedureRelatedItem withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProcedureRelatedItem withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProcedureRelatedItem withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProcedureRelatedItem withId(java.lang.String value) {
        setId(value);
        return this;
    }

}