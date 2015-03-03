//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:21:42 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the data produced by a device at a point in time.
 * 
 * <p>Java class for DeviceObservationReport.VirtualDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceObservationReport.VirtualDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://hl7.org/fhir}DeviceObservationReport.Channel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceObservationReport.VirtualDevice", propOrder = {
    "code",
    "channels"
})
public class DeviceObservationReportVirtualDevice
    extends BackboneElement
    implements Serializable
{

    protected CodeableConcept code;
    @XmlElement(name = "channel")
    protected List<DeviceObservationReportChannel> channels;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
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
     * Gets the value of the channels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceObservationReportChannel }
     * 
     * 
     */
    public List<DeviceObservationReportChannel> getChannels() {
        if (channels == null) {
            channels = new ArrayList<DeviceObservationReportChannel>();
        }
        return this.channels;
    }

    public DeviceObservationReportVirtualDevice withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public DeviceObservationReportVirtualDevice withChannels(DeviceObservationReportChannel... values) {
        if (values!= null) {
            for (DeviceObservationReportChannel value: values) {
                getChannels().add(value);
            }
        }
        return this;
    }

    public DeviceObservationReportVirtualDevice withChannels(Collection<DeviceObservationReportChannel> values) {
        if (values!= null) {
            getChannels().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDevice withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
