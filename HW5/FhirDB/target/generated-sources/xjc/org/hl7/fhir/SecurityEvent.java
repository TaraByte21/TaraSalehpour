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
 * <p>Java class for SecurityEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="event" type="{http://hl7.org/fhir}SecurityEvent.Event"/>
 *         &lt;element name="participant" type="{http://hl7.org/fhir}SecurityEvent.Participant" maxOccurs="unbounded"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}SecurityEvent.Source"/>
 *         &lt;element name="object" type="{http://hl7.org/fhir}SecurityEvent.Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent", propOrder = {
    "event",
    "participant",
    "source",
    "object"
})
@Entity(name = "SecurityEvent")
@Table(name = "SECURITYEVENT")
public class SecurityEvent
    extends Resource
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected SecurityEventEvent event;
    @XmlElement(required = true)
    protected List<SecurityEventParticipant> participant;
    @XmlElement(required = true)
    protected SecurityEventSource source;
    protected List<SecurityEventObject> object;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventEvent }
     *     
     */
    @ManyToOne(targetEntity = SecurityEventEvent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENT_SECURITYEVENT_HJID")
    public SecurityEventEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventEvent }
     *     
     */
    public void setEvent(SecurityEventEvent value) {
        this.event = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEventParticipant }
     * 
     * 
     */
    @OneToMany(targetEntity = SecurityEventParticipant.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARTICIPANT_SECURITYEVENT_HJ_0")
    public List<SecurityEventParticipant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<SecurityEventParticipant>();
        }
        return this.participant;
    }

    /**
     * 
     * 
     */
    public void setParticipant(List<SecurityEventParticipant> participant) {
        this.participant = participant;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventSource }
     *     
     */
    @ManyToOne(targetEntity = SecurityEventSource.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__SECURITYEVENT_HJID")
    public SecurityEventSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventSource }
     *     
     */
    public void setSource(SecurityEventSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEventObject }
     * 
     * 
     */
    @OneToMany(targetEntity = SecurityEventObject.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OBJECT__SECURITYEVENT_HJID")
    public List<SecurityEventObject> getObject() {
        if (object == null) {
            object = new ArrayList<SecurityEventObject>();
        }
        return this.object;
    }

    /**
     * 
     * 
     */
    public void setObject(List<SecurityEventObject> object) {
        this.object = object;
    }

    public SecurityEvent withEvent(SecurityEventEvent value) {
        setEvent(value);
        return this;
    }

    public SecurityEvent withParticipant(SecurityEventParticipant... values) {
        if (values!= null) {
            for (SecurityEventParticipant value: values) {
                getParticipant().add(value);
            }
        }
        return this;
    }

    public SecurityEvent withParticipant(Collection<SecurityEventParticipant> values) {
        if (values!= null) {
            getParticipant().addAll(values);
        }
        return this;
    }

    public SecurityEvent withParticipant(List<SecurityEventParticipant> participant) {
        setParticipant(participant);
        return this;
    }

    public SecurityEvent withSource(SecurityEventSource value) {
        setSource(value);
        return this;
    }

    public SecurityEvent withObject(SecurityEventObject... values) {
        if (values!= null) {
            for (SecurityEventObject value: values) {
                getObject().add(value);
            }
        }
        return this;
    }

    public SecurityEvent withObject(Collection<SecurityEventObject> values) {
        if (values!= null) {
            getObject().addAll(values);
        }
        return this;
    }

    public SecurityEvent withObject(List<SecurityEventObject> object) {
        setObject(object);
        return this;
    }

    @Override
    public SecurityEvent withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public SecurityEvent withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public SecurityEvent withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEvent withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEvent withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public SecurityEvent withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEvent withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEvent withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public SecurityEvent withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEvent withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEvent withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public SecurityEvent withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecurityEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityEvent that = ((SecurityEvent) object);
        {
            SecurityEventEvent lhsEvent;
            lhsEvent = this.getEvent();
            SecurityEventEvent rhsEvent;
            rhsEvent = that.getEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "event", lhsEvent), LocatorUtils.property(thatLocator, "event", rhsEvent), lhsEvent, rhsEvent)) {
                return false;
            }
        }
        {
            List<SecurityEventParticipant> lhsParticipant;
            lhsParticipant = (((this.participant!= null)&&(!this.participant.isEmpty()))?this.getParticipant():null);
            List<SecurityEventParticipant> rhsParticipant;
            rhsParticipant = (((that.participant!= null)&&(!that.participant.isEmpty()))?that.getParticipant():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participant", lhsParticipant), LocatorUtils.property(thatLocator, "participant", rhsParticipant), lhsParticipant, rhsParticipant)) {
                return false;
            }
        }
        {
            SecurityEventSource lhsSource;
            lhsSource = this.getSource();
            SecurityEventSource rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            List<SecurityEventObject> lhsObject;
            lhsObject = (((this.object!= null)&&(!this.object.isEmpty()))?this.getObject():null);
            List<SecurityEventObject> rhsObject;
            rhsObject = (((that.object!= null)&&(!that.object.isEmpty()))?that.getObject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "object", lhsObject), LocatorUtils.property(thatLocator, "object", rhsObject), lhsObject, rhsObject)) {
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
            SecurityEventEvent theEvent;
            theEvent = this.getEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "event", theEvent), currentHashCode, theEvent);
        }
        {
            List<SecurityEventParticipant> theParticipant;
            theParticipant = (((this.participant!= null)&&(!this.participant.isEmpty()))?this.getParticipant():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participant", theParticipant), currentHashCode, theParticipant);
        }
        {
            SecurityEventSource theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            List<SecurityEventObject> theObject;
            theObject = (((this.object!= null)&&(!this.object.isEmpty()))?this.getObject():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "object", theObject), currentHashCode, theObject);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
