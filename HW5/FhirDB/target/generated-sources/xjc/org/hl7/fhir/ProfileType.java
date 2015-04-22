//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="aggregation" type="{http://hl7.org/fhir}AggregationMode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Type", propOrder = {
    "code",
    "profile",
    "aggregation"
})
@Entity(name = "ProfileType")
@Table(name = "PROFILETYPE")
public class ProfileType
    extends BackboneElement
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected Code code;
    protected Uri profile;
    protected List<AggregationMode> aggregation;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    @ManyToOne(targetEntity = Code.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_PROFILETYPE_HJID")
    public Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROFILE_PROFILETYPE_HJID")
    public Uri getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setProfile(Uri value) {
        this.profile = value;
    }

    /**
     * Gets the value of the aggregation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregationMode }
     * 
     * 
     */
    @OneToMany(targetEntity = AggregationMode.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AGGREGATION_PROFILETYPE_HJID")
    public List<AggregationMode> getAggregation() {
        if (aggregation == null) {
            aggregation = new ArrayList<AggregationMode>();
        }
        return this.aggregation;
    }

    /**
     * 
     * 
     */
    public void setAggregation(List<AggregationMode> aggregation) {
        this.aggregation = aggregation;
    }

    public ProfileType withCode(Code value) {
        setCode(value);
        return this;
    }

    public ProfileType withProfile(Uri value) {
        setProfile(value);
        return this;
    }

    public ProfileType withAggregation(AggregationMode... values) {
        if (values!= null) {
            for (AggregationMode value: values) {
                getAggregation().add(value);
            }
        }
        return this;
    }

    public ProfileType withAggregation(Collection<AggregationMode> values) {
        if (values!= null) {
            getAggregation().addAll(values);
        }
        return this;
    }

    public ProfileType withAggregation(List<AggregationMode> aggregation) {
        setAggregation(aggregation);
        return this;
    }

    @Override
    public ProfileType withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileType withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileType withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public ProfileType withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileType withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileType withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public ProfileType withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProfileType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProfileType that = ((ProfileType) object);
        {
            Code lhsCode;
            lhsCode = this.getCode();
            Code rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            Uri lhsProfile;
            lhsProfile = this.getProfile();
            Uri rhsProfile;
            rhsProfile = that.getProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profile", lhsProfile), LocatorUtils.property(thatLocator, "profile", rhsProfile), lhsProfile, rhsProfile)) {
                return false;
            }
        }
        {
            List<AggregationMode> lhsAggregation;
            lhsAggregation = (((this.aggregation!= null)&&(!this.aggregation.isEmpty()))?this.getAggregation():null);
            List<AggregationMode> rhsAggregation;
            rhsAggregation = (((that.aggregation!= null)&&(!that.aggregation.isEmpty()))?that.getAggregation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregation", lhsAggregation), LocatorUtils.property(thatLocator, "aggregation", rhsAggregation), lhsAggregation, rhsAggregation)) {
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
            Code theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            Uri theProfile;
            theProfile = this.getProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profile", theProfile), currentHashCode, theProfile);
        }
        {
            List<AggregationMode> theAggregation;
            theAggregation = (((this.aggregation!= null)&&(!this.aggregation.isEmpty()))?this.getAggregation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregation", theAggregation), currentHashCode, theAggregation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
