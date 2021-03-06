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
 * <p>Java class for MessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="timestamp" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="event" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="response" type="{http://hl7.org/fhir}MessageHeader.Response" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}MessageHeader.Source"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}MessageHeader.Destination" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enterer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="responsible" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="data" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", propOrder = {
    "identifier",
    "timestamp",
    "event",
    "response",
    "source",
    "destination",
    "enterer",
    "author",
    "receiver",
    "responsible",
    "reason",
    "data"
})
@Entity(name = "MessageHeader")
@Table(name = "MESSAGEHEADER")
public class MessageHeader
    extends Resource
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected Id identifier;
    @XmlElement(required = true)
    protected Instant timestamp;
    @XmlElement(required = true)
    protected Coding event;
    protected MessageHeaderResponse response;
    @XmlElement(required = true)
    protected MessageHeaderSource source;
    protected List<MessageHeaderDestination> destination;
    protected ResourceReference enterer;
    protected ResourceReference author;
    protected ResourceReference receiver;
    protected ResourceReference responsible;
    protected CodeableConcept reason;
    protected List<ResourceReference> data;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    @ManyToOne(targetEntity = Id.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_MESSAGEHEADER_HJID")
    public Id getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setIdentifier(Id value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    @ManyToOne(targetEntity = Instant.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMESTAMP__MESSAGEHEADER_HJID")
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setTimestamp(Instant value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    @ManyToOne(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENT_MESSAGEHEADER_HJID")
    public Coding getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setEvent(Coding value) {
        this.event = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderResponse }
     *     
     */
    @ManyToOne(targetEntity = MessageHeaderResponse.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RESPONSE_MESSAGEHEADER_HJID")
    public MessageHeaderResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderResponse }
     *     
     */
    public void setResponse(MessageHeaderResponse value) {
        this.response = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderSource }
     *     
     */
    @ManyToOne(targetEntity = MessageHeaderSource.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__MESSAGEHEADER_HJID")
    public MessageHeaderSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderSource }
     *     
     */
    public void setSource(MessageHeaderSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageHeaderDestination }
     * 
     * 
     */
    @OneToMany(targetEntity = MessageHeaderDestination.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESTINATION_MESSAGEHEADER_HJ_0")
    public List<MessageHeaderDestination> getDestination() {
        if (destination == null) {
            destination = new ArrayList<MessageHeaderDestination>();
        }
        return this.destination;
    }

    /**
     * 
     * 
     */
    public void setDestination(List<MessageHeaderDestination> destination) {
        this.destination = destination;
    }

    /**
     * Gets the value of the enterer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENTERER_MESSAGEHEADER_HJID")
    public ResourceReference getEnterer() {
        return enterer;
    }

    /**
     * Sets the value of the enterer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setEnterer(ResourceReference value) {
        this.enterer = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AUTHOR_MESSAGEHEADER_HJID")
    public ResourceReference getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setAuthor(ResourceReference value) {
        this.author = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RECEIVER_MESSAGEHEADER_HJID")
    public ResourceReference getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReceiver(ResourceReference value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RESPONSIBLE_MESSAGEHEADER_HJ_0")
    public ResourceReference getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setResponsible(ResourceReference value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REASON_MESSAGEHEADER_HJID")
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReason(CodeableConcept value) {
        this.reason = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATA__MESSAGEHEADER_HJID")
    public List<ResourceReference> getData() {
        if (data == null) {
            data = new ArrayList<ResourceReference>();
        }
        return this.data;
    }

    /**
     * 
     * 
     */
    public void setData(List<ResourceReference> data) {
        this.data = data;
    }

    public MessageHeader withIdentifier(Id value) {
        setIdentifier(value);
        return this;
    }

    public MessageHeader withTimestamp(Instant value) {
        setTimestamp(value);
        return this;
    }

    public MessageHeader withEvent(Coding value) {
        setEvent(value);
        return this;
    }

    public MessageHeader withResponse(MessageHeaderResponse value) {
        setResponse(value);
        return this;
    }

    public MessageHeader withSource(MessageHeaderSource value) {
        setSource(value);
        return this;
    }

    public MessageHeader withDestination(MessageHeaderDestination... values) {
        if (values!= null) {
            for (MessageHeaderDestination value: values) {
                getDestination().add(value);
            }
        }
        return this;
    }

    public MessageHeader withDestination(Collection<MessageHeaderDestination> values) {
        if (values!= null) {
            getDestination().addAll(values);
        }
        return this;
    }

    public MessageHeader withDestination(List<MessageHeaderDestination> destination) {
        setDestination(destination);
        return this;
    }

    public MessageHeader withEnterer(ResourceReference value) {
        setEnterer(value);
        return this;
    }

    public MessageHeader withAuthor(ResourceReference value) {
        setAuthor(value);
        return this;
    }

    public MessageHeader withReceiver(ResourceReference value) {
        setReceiver(value);
        return this;
    }

    public MessageHeader withResponsible(ResourceReference value) {
        setResponsible(value);
        return this;
    }

    public MessageHeader withReason(CodeableConcept value) {
        setReason(value);
        return this;
    }

    public MessageHeader withData(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getData().add(value);
            }
        }
        return this;
    }

    public MessageHeader withData(Collection<ResourceReference> values) {
        if (values!= null) {
            getData().addAll(values);
        }
        return this;
    }

    public MessageHeader withData(List<ResourceReference> data) {
        setData(data);
        return this;
    }

    @Override
    public MessageHeader withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MessageHeader withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public MessageHeader withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public MessageHeader withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public MessageHeader withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public MessageHeader withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public MessageHeader withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public MessageHeader withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public MessageHeader withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public MessageHeader withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public MessageHeader withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public MessageHeader withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MessageHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MessageHeader that = ((MessageHeader) object);
        {
            Id lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Id rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            Instant lhsTimestamp;
            lhsTimestamp = this.getTimestamp();
            Instant rhsTimestamp;
            rhsTimestamp = that.getTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timestamp", lhsTimestamp), LocatorUtils.property(thatLocator, "timestamp", rhsTimestamp), lhsTimestamp, rhsTimestamp)) {
                return false;
            }
        }
        {
            Coding lhsEvent;
            lhsEvent = this.getEvent();
            Coding rhsEvent;
            rhsEvent = that.getEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "event", lhsEvent), LocatorUtils.property(thatLocator, "event", rhsEvent), lhsEvent, rhsEvent)) {
                return false;
            }
        }
        {
            MessageHeaderResponse lhsResponse;
            lhsResponse = this.getResponse();
            MessageHeaderResponse rhsResponse;
            rhsResponse = that.getResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "response", lhsResponse), LocatorUtils.property(thatLocator, "response", rhsResponse), lhsResponse, rhsResponse)) {
                return false;
            }
        }
        {
            MessageHeaderSource lhsSource;
            lhsSource = this.getSource();
            MessageHeaderSource rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            List<MessageHeaderDestination> lhsDestination;
            lhsDestination = (((this.destination!= null)&&(!this.destination.isEmpty()))?this.getDestination():null);
            List<MessageHeaderDestination> rhsDestination;
            rhsDestination = (((that.destination!= null)&&(!that.destination.isEmpty()))?that.getDestination():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destination", lhsDestination), LocatorUtils.property(thatLocator, "destination", rhsDestination), lhsDestination, rhsDestination)) {
                return false;
            }
        }
        {
            ResourceReference lhsEnterer;
            lhsEnterer = this.getEnterer();
            ResourceReference rhsEnterer;
            rhsEnterer = that.getEnterer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enterer", lhsEnterer), LocatorUtils.property(thatLocator, "enterer", rhsEnterer), lhsEnterer, rhsEnterer)) {
                return false;
            }
        }
        {
            ResourceReference lhsAuthor;
            lhsAuthor = this.getAuthor();
            ResourceReference rhsAuthor;
            rhsAuthor = that.getAuthor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "author", lhsAuthor), LocatorUtils.property(thatLocator, "author", rhsAuthor), lhsAuthor, rhsAuthor)) {
                return false;
            }
        }
        {
            ResourceReference lhsReceiver;
            lhsReceiver = this.getReceiver();
            ResourceReference rhsReceiver;
            rhsReceiver = that.getReceiver();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receiver", lhsReceiver), LocatorUtils.property(thatLocator, "receiver", rhsReceiver), lhsReceiver, rhsReceiver)) {
                return false;
            }
        }
        {
            ResourceReference lhsResponsible;
            lhsResponsible = this.getResponsible();
            ResourceReference rhsResponsible;
            rhsResponsible = that.getResponsible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responsible", lhsResponsible), LocatorUtils.property(thatLocator, "responsible", rhsResponsible), lhsResponsible, rhsResponsible)) {
                return false;
            }
        }
        {
            CodeableConcept lhsReason;
            lhsReason = this.getReason();
            CodeableConcept rhsReason;
            rhsReason = that.getReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reason", lhsReason), LocatorUtils.property(thatLocator, "reason", rhsReason), lhsReason, rhsReason)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsData;
            lhsData = (((this.data!= null)&&(!this.data.isEmpty()))?this.getData():null);
            List<ResourceReference> rhsData;
            rhsData = (((that.data!= null)&&(!that.data.isEmpty()))?that.getData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
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
            Id theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            Instant theTimestamp;
            theTimestamp = this.getTimestamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timestamp", theTimestamp), currentHashCode, theTimestamp);
        }
        {
            Coding theEvent;
            theEvent = this.getEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "event", theEvent), currentHashCode, theEvent);
        }
        {
            MessageHeaderResponse theResponse;
            theResponse = this.getResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "response", theResponse), currentHashCode, theResponse);
        }
        {
            MessageHeaderSource theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            List<MessageHeaderDestination> theDestination;
            theDestination = (((this.destination!= null)&&(!this.destination.isEmpty()))?this.getDestination():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destination", theDestination), currentHashCode, theDestination);
        }
        {
            ResourceReference theEnterer;
            theEnterer = this.getEnterer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enterer", theEnterer), currentHashCode, theEnterer);
        }
        {
            ResourceReference theAuthor;
            theAuthor = this.getAuthor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "author", theAuthor), currentHashCode, theAuthor);
        }
        {
            ResourceReference theReceiver;
            theReceiver = this.getReceiver();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receiver", theReceiver), currentHashCode, theReceiver);
        }
        {
            ResourceReference theResponsible;
            theResponsible = this.getResponsible();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsible", theResponsible), currentHashCode, theResponsible);
        }
        {
            CodeableConcept theReason;
            theReason = this.getReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reason", theReason), currentHashCode, theReason);
        }
        {
            List<ResourceReference> theData;
            theData = (((this.data!= null)&&(!this.data.isEmpty()))?this.getData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "data", theData), currentHashCode, theData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
