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
 * Describes the data produced by a device at a point in time.
 * 
 * <p>Java class for DeviceObservationReport.VirtualDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceObservationReport.VirtualDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://hl7.org/fhir}DeviceObservationReport.Channel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceObservationReport.VirtualDevice", propOrder = {
    "code",
    "channel"
})
@Entity(name = "DeviceObservationReportVirtualDevice")
@Table(name = "DEVICEOBSERVATIONREPORTVIRTU_0")
public class DeviceObservationReportVirtualDevice
    extends BackboneElement
    implements Equals, HashCode
{

    protected CodeableConcept code;
    protected List<DeviceObservationReportChannel> channel;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_DEVICEOBSERVATIONREPORT_1")
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceObservationReportChannel }
     * 
     * 
     */
    @OneToMany(targetEntity = DeviceObservationReportChannel.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CHANNEL_DEVICEOBSERVATIONREP_0")
    public List<DeviceObservationReportChannel> getChannel() {
        if (channel == null) {
            channel = new ArrayList<DeviceObservationReportChannel>();
        }
        return this.channel;
    }

    /**
     * 
     * 
     */
    public void setChannel(List<DeviceObservationReportChannel> channel) {
        this.channel = channel;
    }

    public DeviceObservationReportVirtualDevice withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public DeviceObservationReportVirtualDevice withChannel(DeviceObservationReportChannel... values) {
        if (values!= null) {
            for (DeviceObservationReportChannel value: values) {
                getChannel().add(value);
            }
        }
        return this;
    }

    public DeviceObservationReportVirtualDevice withChannel(Collection<DeviceObservationReportChannel> values) {
        if (values!= null) {
            getChannel().addAll(values);
        }
        return this;
    }

    public DeviceObservationReportVirtualDevice withChannel(List<DeviceObservationReportChannel> channel) {
        setChannel(channel);
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DeviceObservationReportVirtualDevice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DeviceObservationReportVirtualDevice that = ((DeviceObservationReportVirtualDevice) object);
        {
            CodeableConcept lhsCode;
            lhsCode = this.getCode();
            CodeableConcept rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            List<DeviceObservationReportChannel> lhsChannel;
            lhsChannel = (((this.channel!= null)&&(!this.channel.isEmpty()))?this.getChannel():null);
            List<DeviceObservationReportChannel> rhsChannel;
            rhsChannel = (((that.channel!= null)&&(!that.channel.isEmpty()))?that.getChannel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "channel", lhsChannel), LocatorUtils.property(thatLocator, "channel", rhsChannel), lhsChannel, rhsChannel)) {
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
            CodeableConcept theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            List<DeviceObservationReportChannel> theChannel;
            theChannel = (((this.channel!= null)&&(!this.channel.isEmpty()))?this.getChannel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "channel", theChannel), currentHashCode, theChannel);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}