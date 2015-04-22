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
 * Records an unexpected reaction suspected to be related to the exposure of the reaction subject to a substance.
 * 
 * <p>Java class for AdverseReaction.Exposure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdverseReaction.Exposure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}ExposureType" minOccurs="0"/>
 *         &lt;element name="causalityExpectation" type="{http://hl7.org/fhir}CausalityExpectation" minOccurs="0"/>
 *         &lt;element name="substance" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdverseReaction.Exposure", propOrder = {
    "date",
    "type",
    "causalityExpectation",
    "substance"
})
@Entity(name = "AdverseReactionExposure")
@Table(name = "ADVERSEREACTIONEXPOSURE")
public class AdverseReactionExposure
    extends BackboneElement
    implements Equals, HashCode
{

    protected DateTime date;
    protected ExposureType type;
    protected CausalityExpectation causalityExpectation;
    protected ResourceReference substance;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATE__ADVERSEREACTIONEXPOSUR_0")
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType }
     *     
     */
    @ManyToOne(targetEntity = ExposureType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__ADVERSEREACTIONEXPOSUR_0")
    public ExposureType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType }
     *     
     */
    public void setType(ExposureType value) {
        this.type = value;
    }

    /**
     * Gets the value of the causalityExpectation property.
     * 
     * @return
     *     possible object is
     *     {@link CausalityExpectation }
     *     
     */
    @ManyToOne(targetEntity = CausalityExpectation.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CAUSALITYEXPECTATION_ADVERSE_0")
    public CausalityExpectation getCausalityExpectation() {
        return causalityExpectation;
    }

    /**
     * Sets the value of the causalityExpectation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CausalityExpectation }
     *     
     */
    public void setCausalityExpectation(CausalityExpectation value) {
        this.causalityExpectation = value;
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
    @JoinColumn(name = "SUBSTANCE_ADVERSEREACTIONEXP_0")
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

    public AdverseReactionExposure withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public AdverseReactionExposure withType(ExposureType value) {
        setType(value);
        return this;
    }

    public AdverseReactionExposure withCausalityExpectation(CausalityExpectation value) {
        setCausalityExpectation(value);
        return this;
    }

    public AdverseReactionExposure withSubstance(ResourceReference value) {
        setSubstance(value);
        return this;
    }

    @Override
    public AdverseReactionExposure withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReactionExposure withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReactionExposure withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public AdverseReactionExposure withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReactionExposure withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReactionExposure withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public AdverseReactionExposure withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AdverseReactionExposure)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AdverseReactionExposure that = ((AdverseReactionExposure) object);
        {
            DateTime lhsDate;
            lhsDate = this.getDate();
            DateTime rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            ExposureType lhsType;
            lhsType = this.getType();
            ExposureType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            CausalityExpectation lhsCausalityExpectation;
            lhsCausalityExpectation = this.getCausalityExpectation();
            CausalityExpectation rhsCausalityExpectation;
            rhsCausalityExpectation = that.getCausalityExpectation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "causalityExpectation", lhsCausalityExpectation), LocatorUtils.property(thatLocator, "causalityExpectation", rhsCausalityExpectation), lhsCausalityExpectation, rhsCausalityExpectation)) {
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
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            ExposureType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            CausalityExpectation theCausalityExpectation;
            theCausalityExpectation = this.getCausalityExpectation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "causalityExpectation", theCausalityExpectation), currentHashCode, theCausalityExpectation);
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