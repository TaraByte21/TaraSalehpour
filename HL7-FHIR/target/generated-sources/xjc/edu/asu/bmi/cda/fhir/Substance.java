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
 * <p>Java class for Substance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Substance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="instance" type="{http://hl7.org/fhir}Substance.Instance" minOccurs="0"/&gt;
 *         &lt;element name="ingredient" type="{http://hl7.org/fhir}Substance.Ingredient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Substance", propOrder = {
    "type",
    "description",
    "instance",
    "ingredients"
})
@XmlRootElement(name = "Substance")
public class Substance
    extends Resource
    implements Serializable
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected edu.asu.bmi.cda.fhir.String description;
    protected SubstanceInstance instance;
    @XmlElement(name = "ingredient")
    protected List<SubstanceIngredient> ingredients;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

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
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceInstance }
     *     
     */
    public SubstanceInstance getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceInstance }
     *     
     */
    public void setInstance(SubstanceInstance value) {
        this.instance = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstanceIngredient }
     * 
     * 
     */
    public List<SubstanceIngredient> getIngredients() {
        if (ingredients == null) {
            ingredients = new ArrayList<SubstanceIngredient>();
        }
        return this.ingredients;
    }

    public Substance withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public Substance withDescription(edu.asu.bmi.cda.fhir.String value) {
        setDescription(value);
        return this;
    }

    public Substance withInstance(SubstanceInstance value) {
        setInstance(value);
        return this;
    }

    public Substance withIngredients(SubstanceIngredient... values) {
        if (values!= null) {
            for (SubstanceIngredient value: values) {
                getIngredients().add(value);
            }
        }
        return this;
    }

    public Substance withIngredients(Collection<SubstanceIngredient> values) {
        if (values!= null) {
            getIngredients().addAll(values);
        }
        return this;
    }

    @Override
    public Substance withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Substance withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Substance withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Substance withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Substance withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Substance withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Substance withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Substance withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Substance withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
