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
 * <p>Java class for DeviceObservationReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceObservationReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="instant" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="virtualDevice" type="{http://hl7.org/fhir}DeviceObservationReport.VirtualDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceObservationReport", propOrder = {
    "instant",
    "identifier",
    "source",
    "subject",
    "virtualDevice"
})
@Entity(name = "DeviceObservationReport")
@Table(name = "DEVICEOBSERVATIONREPORT")
public class DeviceObservationReport
    extends Resource
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected Instant instant;
    protected Identifier identifier;
    @XmlElement(required = true)
    protected ResourceReference source;
    protected ResourceReference subject;
    protected List<DeviceObservationReportVirtualDevice> virtualDevice;

    /**
     * Gets the value of the instant property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    @ManyToOne(targetEntity = Instant.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INSTANT_DEVICEOBSERVATIONREP_0")
    public Instant getInstant() {
        return instant;
    }

    /**
     * Sets the value of the instant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setInstant(Instant value) {
        this.instant = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_DEVICEOBSERVATION_0")
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
    @JoinColumn(name = "SOURCE__DEVICEOBSERVATIONREP_0")
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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBJECT_DEVICEOBSERVATIONREP_0")
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the virtualDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceObservationReportVirtualDevice }
     * 
     * 
     */
    @OneToMany(targetEntity = DeviceObservationReportVirtualDevice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VIRTUALDEVICE_DEVICEOBSERVAT_0")
    public List<DeviceObservationReportVirtualDevice> getVirtualDevice() {
        if (virtualDevice == null) {
            virtualDevice = new ArrayList<DeviceObservationReportVirtualDevice>();
        }
        return this.virtualDevice;
    }

    /**
     * 
     * 
     */
    public void setVirtualDevice(List<DeviceObservationReportVirtualDevice> virtualDevice) {
        this.virtualDevice = virtualDevice;
    }

    public DeviceObservationReport withInstant(Instant value) {
        setInstant(value);
        return this;
    }

    public DeviceObservationReport withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public DeviceObservationReport withSource(ResourceReference value) {
        setSource(value);
        return this;
    }

    public DeviceObservationReport withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public DeviceObservationReport withVirtualDevice(DeviceObservationReportVirtualDevice... values) {
        if (values!= null) {
            for (DeviceObservationReportVirtualDevice value: values) {
                getVirtualDevice().add(value);
            }
        }
        return this;
    }

    public DeviceObservationReport withVirtualDevice(Collection<DeviceObservationReportVirtualDevice> values) {
        if (values!= null) {
            getVirtualDevice().addAll(values);
        }
        return this;
    }

    public DeviceObservationReport withVirtualDevice(List<DeviceObservationReportVirtualDevice> virtualDevice) {
        setVirtualDevice(virtualDevice);
        return this;
    }

    @Override
    public DeviceObservationReport withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public DeviceObservationReport withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public DeviceObservationReport withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReport withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReport withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public DeviceObservationReport withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReport withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReport withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public DeviceObservationReport withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReport withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReport withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public DeviceObservationReport withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DeviceObservationReport)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DeviceObservationReport that = ((DeviceObservationReport) object);
        {
            Instant lhsInstant;
            lhsInstant = this.getInstant();
            Instant rhsInstant;
            rhsInstant = that.getInstant();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instant", lhsInstant), LocatorUtils.property(thatLocator, "instant", rhsInstant), lhsInstant, rhsInstant)) {
                return false;
            }
        }
        {
            Identifier lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Identifier rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
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
            ResourceReference lhsSubject;
            lhsSubject = this.getSubject();
            ResourceReference rhsSubject;
            rhsSubject = that.getSubject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subject", lhsSubject), LocatorUtils.property(thatLocator, "subject", rhsSubject), lhsSubject, rhsSubject)) {
                return false;
            }
        }
        {
            List<DeviceObservationReportVirtualDevice> lhsVirtualDevice;
            lhsVirtualDevice = (((this.virtualDevice!= null)&&(!this.virtualDevice.isEmpty()))?this.getVirtualDevice():null);
            List<DeviceObservationReportVirtualDevice> rhsVirtualDevice;
            rhsVirtualDevice = (((that.virtualDevice!= null)&&(!that.virtualDevice.isEmpty()))?that.getVirtualDevice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualDevice", lhsVirtualDevice), LocatorUtils.property(thatLocator, "virtualDevice", rhsVirtualDevice), lhsVirtualDevice, rhsVirtualDevice)) {
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
            Instant theInstant;
            theInstant = this.getInstant();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instant", theInstant), currentHashCode, theInstant);
        }
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            ResourceReference theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            List<DeviceObservationReportVirtualDevice> theVirtualDevice;
            theVirtualDevice = (((this.virtualDevice!= null)&&(!this.virtualDevice.isEmpty()))?this.getVirtualDevice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "virtualDevice", theVirtualDevice), currentHashCode, theVirtualDevice);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
