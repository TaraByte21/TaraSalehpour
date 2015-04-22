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
 * <p>Java class for Profile.Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Structure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="publish" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="element" type="{http://hl7.org/fhir}Profile.Element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchParam" type="{http://hl7.org/fhir}Profile.SearchParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Structure", propOrder = {
    "type",
    "name",
    "publish",
    "purpose",
    "element",
    "searchParam"
})
@Entity(name = "ProfileStructure")
@Table(name = "PROFILESTRUCTURE")
public class ProfileStructure
    extends BackboneElement
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected Code type;
    protected org.hl7.fhir.String name;
    protected Boolean publish;
    protected org.hl7.fhir.String purpose;
    protected List<ProfileElement> element;
    protected List<ProfileSearchParam> searchParam;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    @ManyToOne(targetEntity = Code.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__PROFILESTRUCTURE_HJID")
    public Code getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setType(Code value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__PROFILESTRUCTURE_HJID")
    public org.hl7.fhir.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setName(org.hl7.fhir.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PUBLISH_PROFILESTRUCTURE_HJID")
    public Boolean getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublish(Boolean value) {
        this.publish = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PURPOSE_PROFILESTRUCTURE_HJID")
    public org.hl7.fhir.String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setPurpose(org.hl7.fhir.String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileElement }
     * 
     * 
     */
    @OneToMany(targetEntity = ProfileElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ELEMENT_PROFILESTRUCTURE_HJID")
    public List<ProfileElement> getElement() {
        if (element == null) {
            element = new ArrayList<ProfileElement>();
        }
        return this.element;
    }

    /**
     * 
     * 
     */
    public void setElement(List<ProfileElement> element) {
        this.element = element;
    }

    /**
     * Gets the value of the searchParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileSearchParam }
     * 
     * 
     */
    @OneToMany(targetEntity = ProfileSearchParam.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SEARCHPARAM_PROFILESTRUCTURE_0")
    public List<ProfileSearchParam> getSearchParam() {
        if (searchParam == null) {
            searchParam = new ArrayList<ProfileSearchParam>();
        }
        return this.searchParam;
    }

    /**
     * 
     * 
     */
    public void setSearchParam(List<ProfileSearchParam> searchParam) {
        this.searchParam = searchParam;
    }

    public ProfileStructure withType(Code value) {
        setType(value);
        return this;
    }

    public ProfileStructure withName(org.hl7.fhir.String value) {
        setName(value);
        return this;
    }

    public ProfileStructure withPublish(Boolean value) {
        setPublish(value);
        return this;
    }

    public ProfileStructure withPurpose(org.hl7.fhir.String value) {
        setPurpose(value);
        return this;
    }

    public ProfileStructure withElement(ProfileElement... values) {
        if (values!= null) {
            for (ProfileElement value: values) {
                getElement().add(value);
            }
        }
        return this;
    }

    public ProfileStructure withElement(Collection<ProfileElement> values) {
        if (values!= null) {
            getElement().addAll(values);
        }
        return this;
    }

    public ProfileStructure withElement(List<ProfileElement> element) {
        setElement(element);
        return this;
    }

    public ProfileStructure withSearchParam(ProfileSearchParam... values) {
        if (values!= null) {
            for (ProfileSearchParam value: values) {
                getSearchParam().add(value);
            }
        }
        return this;
    }

    public ProfileStructure withSearchParam(Collection<ProfileSearchParam> values) {
        if (values!= null) {
            getSearchParam().addAll(values);
        }
        return this;
    }

    public ProfileStructure withSearchParam(List<ProfileSearchParam> searchParam) {
        setSearchParam(searchParam);
        return this;
    }

    @Override
    public ProfileStructure withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileStructure withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileStructure withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public ProfileStructure withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileStructure withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileStructure withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public ProfileStructure withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProfileStructure)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProfileStructure that = ((ProfileStructure) object);
        {
            Code lhsType;
            lhsType = this.getType();
            Code rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsName;
            lhsName = this.getName();
            org.hl7.fhir.String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Boolean lhsPublish;
            lhsPublish = this.getPublish();
            Boolean rhsPublish;
            rhsPublish = that.getPublish();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publish", lhsPublish), LocatorUtils.property(thatLocator, "publish", rhsPublish), lhsPublish, rhsPublish)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsPurpose;
            lhsPurpose = this.getPurpose();
            org.hl7.fhir.String rhsPurpose;
            rhsPurpose = that.getPurpose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purpose", lhsPurpose), LocatorUtils.property(thatLocator, "purpose", rhsPurpose), lhsPurpose, rhsPurpose)) {
                return false;
            }
        }
        {
            List<ProfileElement> lhsElement;
            lhsElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
            List<ProfileElement> rhsElement;
            rhsElement = (((that.element!= null)&&(!that.element.isEmpty()))?that.getElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "element", lhsElement), LocatorUtils.property(thatLocator, "element", rhsElement), lhsElement, rhsElement)) {
                return false;
            }
        }
        {
            List<ProfileSearchParam> lhsSearchParam;
            lhsSearchParam = (((this.searchParam!= null)&&(!this.searchParam.isEmpty()))?this.getSearchParam():null);
            List<ProfileSearchParam> rhsSearchParam;
            rhsSearchParam = (((that.searchParam!= null)&&(!that.searchParam.isEmpty()))?that.getSearchParam():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchParam", lhsSearchParam), LocatorUtils.property(thatLocator, "searchParam", rhsSearchParam), lhsSearchParam, rhsSearchParam)) {
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
            Code theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            org.hl7.fhir.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Boolean thePublish;
            thePublish = this.getPublish();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publish", thePublish), currentHashCode, thePublish);
        }
        {
            org.hl7.fhir.String thePurpose;
            thePurpose = this.getPurpose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purpose", thePurpose), currentHashCode, thePurpose);
        }
        {
            List<ProfileElement> theElement;
            theElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "element", theElement), currentHashCode, theElement);
        }
        {
            List<ProfileSearchParam> theSearchParam;
            theSearchParam = (((this.searchParam!= null)&&(!this.searchParam.isEmpty()))?this.getSearchParam():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchParam", theSearchParam), currentHashCode, theSearchParam);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}