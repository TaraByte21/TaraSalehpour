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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for ConceptMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ValueSetStatus"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="target" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="concept" type="{http://hl7.org/fhir}ConceptMap.Concept" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecom",
    "description",
    "copyright",
    "status",
    "experimental",
    "date",
    "source",
    "target",
    "concept"
})
@Entity(name = "ConceptMap")
@Table(name = "CONCEPTMAP")
public class ConceptMap
    extends Resource
    implements Equals, HashCode
{

    protected org.hl7.fhir.String identifier;
    protected org.hl7.fhir.String version;
    @XmlElement(required = true)
    protected org.hl7.fhir.String name;
    protected org.hl7.fhir.String publisher;
    protected List<Contact> telecom;
    protected org.hl7.fhir.String description;
    protected org.hl7.fhir.String copyright;
    @XmlElement(required = true)
    protected ValueSetStatus status;
    protected Boolean experimental;
    protected DateTime date;
    @XmlElement(required = true)
    protected ResourceReference source;
    @XmlElement(required = true)
    protected ResourceReference target;
    protected List<ConceptMapConcept> concept;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_CONCEPTMAP_HJID")
    public org.hl7.fhir.String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setIdentifier(org.hl7.fhir.String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VERSION__CONCEPTMAP_HJID")
    public org.hl7.fhir.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setVersion(org.hl7.fhir.String value) {
        this.version = value;
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
    @JoinColumn(name = "NAME__CONCEPTMAP_HJID")
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
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PUBLISHER_CONCEPTMAP_HJID")
    public org.hl7.fhir.String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setPublisher(org.hl7.fhir.String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    @OneToMany(targetEntity = Contact.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TELECOM_CONCEPTMAP_HJID")
    public List<Contact> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Contact>();
        }
        return this.telecom;
    }

    /**
     * 
     * 
     */
    public void setTelecom(List<Contact> telecom) {
        this.telecom = telecom;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_CONCEPTMAP_HJID")
    public org.hl7.fhir.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setDescription(org.hl7.fhir.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COPYRIGHT_CONCEPTMAP_HJID")
    public org.hl7.fhir.String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setCopyright(org.hl7.fhir.String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetStatus }
     *     
     */
    @ManyToOne(targetEntity = ValueSetStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_CONCEPTMAP_HJID")
    public ValueSetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetStatus }
     *     
     */
    public void setStatus(ValueSetStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXPERIMENTAL_CONCEPTMAP_HJID")
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
    }

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
    @JoinColumn(name = "DATE__CONCEPTMAP_HJID")
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__CONCEPTMAP_HJID")
    public ResourceReference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSource(ResourceReference value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TARGET_CONCEPTMAP_HJID")
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

    /**
     * Gets the value of the concept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = ConceptMapConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONCEPT_CONCEPTMAP_HJID")
    public List<ConceptMapConcept> getConcept() {
        if (concept == null) {
            concept = new ArrayList<ConceptMapConcept>();
        }
        return this.concept;
    }

    /**
     * 
     * 
     */
    public void setConcept(List<ConceptMapConcept> concept) {
        this.concept = concept;
    }

    public ConceptMap withIdentifier(org.hl7.fhir.String value) {
        setIdentifier(value);
        return this;
    }

    public ConceptMap withVersion(org.hl7.fhir.String value) {
        setVersion(value);
        return this;
    }

    public ConceptMap withName(org.hl7.fhir.String value) {
        setName(value);
        return this;
    }

    public ConceptMap withPublisher(org.hl7.fhir.String value) {
        setPublisher(value);
        return this;
    }

    public ConceptMap withTelecom(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecom().add(value);
            }
        }
        return this;
    }

    public ConceptMap withTelecom(Collection<Contact> values) {
        if (values!= null) {
            getTelecom().addAll(values);
        }
        return this;
    }

    public ConceptMap withTelecom(List<Contact> telecom) {
        setTelecom(telecom);
        return this;
    }

    public ConceptMap withDescription(org.hl7.fhir.String value) {
        setDescription(value);
        return this;
    }

    public ConceptMap withCopyright(org.hl7.fhir.String value) {
        setCopyright(value);
        return this;
    }

    public ConceptMap withStatus(ValueSetStatus value) {
        setStatus(value);
        return this;
    }

    public ConceptMap withExperimental(Boolean value) {
        setExperimental(value);
        return this;
    }

    public ConceptMap withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public ConceptMap withSource(ResourceReference value) {
        setSource(value);
        return this;
    }

    public ConceptMap withTarget(ResourceReference value) {
        setTarget(value);
        return this;
    }

    public ConceptMap withConcept(ConceptMapConcept... values) {
        if (values!= null) {
            for (ConceptMapConcept value: values) {
                getConcept().add(value);
            }
        }
        return this;
    }

    public ConceptMap withConcept(Collection<ConceptMapConcept> values) {
        if (values!= null) {
            getConcept().addAll(values);
        }
        return this;
    }

    public ConceptMap withConcept(List<ConceptMapConcept> concept) {
        setConcept(concept);
        return this;
    }

    @Override
    public ConceptMap withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public ConceptMap withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public ConceptMap withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMap withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMap withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public ConceptMap withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMap withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMap withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public ConceptMap withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMap withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMap withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public ConceptMap withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConceptMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConceptMap that = ((ConceptMap) object);
        {
            org.hl7.fhir.String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            org.hl7.fhir.String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsVersion;
            lhsVersion = this.getVersion();
            org.hl7.fhir.String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
            org.hl7.fhir.String lhsPublisher;
            lhsPublisher = this.getPublisher();
            org.hl7.fhir.String rhsPublisher;
            rhsPublisher = that.getPublisher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publisher", lhsPublisher), LocatorUtils.property(thatLocator, "publisher", rhsPublisher), lhsPublisher, rhsPublisher)) {
                return false;
            }
        }
        {
            List<Contact> lhsTelecom;
            lhsTelecom = (((this.telecom!= null)&&(!this.telecom.isEmpty()))?this.getTelecom():null);
            List<Contact> rhsTelecom;
            rhsTelecom = (((that.telecom!= null)&&(!that.telecom.isEmpty()))?that.getTelecom():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecom", lhsTelecom), LocatorUtils.property(thatLocator, "telecom", rhsTelecom), lhsTelecom, rhsTelecom)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsDescription;
            lhsDescription = this.getDescription();
            org.hl7.fhir.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsCopyright;
            lhsCopyright = this.getCopyright();
            org.hl7.fhir.String rhsCopyright;
            rhsCopyright = that.getCopyright();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "copyright", lhsCopyright), LocatorUtils.property(thatLocator, "copyright", rhsCopyright), lhsCopyright, rhsCopyright)) {
                return false;
            }
        }
        {
            ValueSetStatus lhsStatus;
            lhsStatus = this.getStatus();
            ValueSetStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            Boolean lhsExperimental;
            lhsExperimental = this.getExperimental();
            Boolean rhsExperimental;
            rhsExperimental = that.getExperimental();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "experimental", lhsExperimental), LocatorUtils.property(thatLocator, "experimental", rhsExperimental), lhsExperimental, rhsExperimental)) {
                return false;
            }
        }
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
            ResourceReference lhsSource;
            lhsSource = this.getSource();
            ResourceReference rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            ResourceReference lhsTarget;
            lhsTarget = this.getTarget();
            ResourceReference rhsTarget;
            rhsTarget = that.getTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "target", lhsTarget), LocatorUtils.property(thatLocator, "target", rhsTarget), lhsTarget, rhsTarget)) {
                return false;
            }
        }
        {
            List<ConceptMapConcept> lhsConcept;
            lhsConcept = (((this.concept!= null)&&(!this.concept.isEmpty()))?this.getConcept():null);
            List<ConceptMapConcept> rhsConcept;
            rhsConcept = (((that.concept!= null)&&(!that.concept.isEmpty()))?that.getConcept():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concept", lhsConcept), LocatorUtils.property(thatLocator, "concept", rhsConcept), lhsConcept, rhsConcept)) {
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
            org.hl7.fhir.String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            org.hl7.fhir.String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            org.hl7.fhir.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            org.hl7.fhir.String thePublisher;
            thePublisher = this.getPublisher();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publisher", thePublisher), currentHashCode, thePublisher);
        }
        {
            List<Contact> theTelecom;
            theTelecom = (((this.telecom!= null)&&(!this.telecom.isEmpty()))?this.getTelecom():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecom", theTelecom), currentHashCode, theTelecom);
        }
        {
            org.hl7.fhir.String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            org.hl7.fhir.String theCopyright;
            theCopyright = this.getCopyright();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "copyright", theCopyright), currentHashCode, theCopyright);
        }
        {
            ValueSetStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            Boolean theExperimental;
            theExperimental = this.getExperimental();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "experimental", theExperimental), currentHashCode, theExperimental);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            ResourceReference theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            ResourceReference theTarget;
            theTarget = this.getTarget();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "target", theTarget), currentHashCode, theTarget);
        }
        {
            List<ConceptMapConcept> theConcept;
            theConcept = (((this.concept!= null)&&(!this.concept.isEmpty()))?this.getConcept():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "concept", theConcept), currentHashCode, theConcept);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}