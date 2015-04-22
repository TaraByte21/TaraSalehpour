//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * A homogeneous material with a definite composition.
 * 
 * <p>Java class for Substance.Ingredient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Substance.Ingredient">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *         &lt;element name="substance" type="{http://hl7.org/fhir}ResourceReference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Substance.Ingredient", propOrder = {
    "quantity",
    "substance"
})
@Entity(name = "SubstanceIngredient")
@Table(name = "SUBSTANCEINGREDIENT")
public class SubstanceIngredient
    extends BackboneElement
    implements Equals, HashCode
{

    protected Ratio quantity;
    @XmlElement(required = true)
    protected ResourceReference substance;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUANTITY_SUBSTANCEINGREDIENT_0")
    public Ratio getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setQuantity(Ratio value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the substance property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBSTANCE_SUBSTANCEINGREDIEN_0")
    public ResourceReference getSubstance() {
        return substance;
    }

    /**
     * Sets the value of the substance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubstance(ResourceReference value) {
        this.substance = value;
    }

    public SubstanceIngredient withQuantity(Ratio value) {
        setQuantity(value);
        return this;
    }

    public SubstanceIngredient withSubstance(ResourceReference value) {
        setSubstance(value);
        return this;
    }

    @Override
    public SubstanceIngredient withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public SubstanceIngredient withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public SubstanceIngredient withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public SubstanceIngredient withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public SubstanceIngredient withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public SubstanceIngredient withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public SubstanceIngredient withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SubstanceIngredient)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SubstanceIngredient that = ((SubstanceIngredient) object);
        {
            Ratio lhsQuantity;
            lhsQuantity = this.getQuantity();
            Ratio rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            ResourceReference lhsSubstance;
            lhsSubstance = this.getSubstance();
            ResourceReference rhsSubstance;
            rhsSubstance = that.getSubstance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substance", lhsSubstance), LocatorUtils.property(thatLocator, "substance", rhsSubstance), lhsSubstance, rhsSubstance)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Ratio theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            ResourceReference theSubstance;
            theSubstance = this.getSubstance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substance", theSubstance), currentHashCode, theSubstance);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
