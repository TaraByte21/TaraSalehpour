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
 * <p>Java class for DiagnosticOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="orderer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="clinicalNotes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="specimen" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}DiagnosticOrderStatus" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://hl7.org/fhir}DiagnosticOrderPriority" minOccurs="0"/>
 *         &lt;element name="event" type="{http://hl7.org/fhir}DiagnosticOrder.Event" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="item" type="{http://hl7.org/fhir}DiagnosticOrder.Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticOrder", propOrder = {
    "subject",
    "orderer",
    "identifier",
    "encounter",
    "clinicalNotes",
    "specimen",
    "status",
    "priority",
    "event",
    "item"
})
@Entity(name = "DiagnosticOrder")
@Table(name = "DIAGNOSTICORDER")
public class DiagnosticOrder
    extends Resource
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected ResourceReference subject;
    protected ResourceReference orderer;
    protected List<Identifier> identifier;
    protected ResourceReference encounter;
    protected org.hl7.fhir.String clinicalNotes;
    protected List<ResourceReference> specimen;
    protected DiagnosticOrderStatus status;
    protected DiagnosticOrderPriority priority;
    protected List<DiagnosticOrderEvent> event;
    protected List<DiagnosticOrderItem> item;

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
    @JoinColumn(name = "SUBJECT_DIAGNOSTICORDER_HJID")
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
     * Gets the value of the orderer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORDERER_DIAGNOSTICORDER_HJID")
    public ResourceReference getOrderer() {
        return orderer;
    }

    /**
     * Sets the value of the orderer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOrderer(ResourceReference value) {
        this.orderer = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_DIAGNOSTICORDER_H_0")
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * 
     * 
     */
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENCOUNTER_DIAGNOSTICORDER_HJ_0")
    public ResourceReference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setEncounter(ResourceReference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the clinicalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLINICALNOTES_DIAGNOSTICORDE_0")
    public org.hl7.fhir.String getClinicalNotes() {
        return clinicalNotes;
    }

    /**
     * Sets the value of the clinicalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setClinicalNotes(org.hl7.fhir.String value) {
        this.clinicalNotes = value;
    }

    /**
     * Gets the value of the specimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecimen().add(newItem);
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
    @JoinColumn(name = "SPECIMEN_DIAGNOSTICORDER_HJID")
    public List<ResourceReference> getSpecimen() {
        if (specimen == null) {
            specimen = new ArrayList<ResourceReference>();
        }
        return this.specimen;
    }

    /**
     * 
     * 
     */
    public void setSpecimen(List<ResourceReference> specimen) {
        this.specimen = specimen;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticOrderStatus }
     *     
     */
    @ManyToOne(targetEntity = DiagnosticOrderStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_DIAGNOSTICORDER_HJID")
    public DiagnosticOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticOrderStatus }
     *     
     */
    public void setStatus(DiagnosticOrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticOrderPriority }
     *     
     */
    @ManyToOne(targetEntity = DiagnosticOrderPriority.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRIORITY_DIAGNOSTICORDER_HJID")
    public DiagnosticOrderPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticOrderPriority }
     *     
     */
    public void setPriority(DiagnosticOrderPriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticOrderEvent }
     * 
     * 
     */
    @OneToMany(targetEntity = DiagnosticOrderEvent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENT_DIAGNOSTICORDER_HJID")
    public List<DiagnosticOrderEvent> getEvent() {
        if (event == null) {
            event = new ArrayList<DiagnosticOrderEvent>();
        }
        return this.event;
    }

    /**
     * 
     * 
     */
    public void setEvent(List<DiagnosticOrderEvent> event) {
        this.event = event;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticOrderItem }
     * 
     * 
     */
    @OneToMany(targetEntity = DiagnosticOrderItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ITEM_DIAGNOSTICORDER_HJID")
    public List<DiagnosticOrderItem> getItem() {
        if (item == null) {
            item = new ArrayList<DiagnosticOrderItem>();
        }
        return this.item;
    }

    /**
     * 
     * 
     */
    public void setItem(List<DiagnosticOrderItem> item) {
        this.item = item;
    }

    public DiagnosticOrder withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public DiagnosticOrder withOrderer(ResourceReference value) {
        setOrderer(value);
        return this;
    }

    public DiagnosticOrder withIdentifier(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifier().add(value);
            }
        }
        return this;
    }

    public DiagnosticOrder withIdentifier(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifier().addAll(values);
        }
        return this;
    }

    public DiagnosticOrder withIdentifier(List<Identifier> identifier) {
        setIdentifier(identifier);
        return this;
    }

    public DiagnosticOrder withEncounter(ResourceReference value) {
        setEncounter(value);
        return this;
    }

    public DiagnosticOrder withClinicalNotes(org.hl7.fhir.String value) {
        setClinicalNotes(value);
        return this;
    }

    public DiagnosticOrder withSpecimen(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getSpecimen().add(value);
            }
        }
        return this;
    }

    public DiagnosticOrder withSpecimen(Collection<ResourceReference> values) {
        if (values!= null) {
            getSpecimen().addAll(values);
        }
        return this;
    }

    public DiagnosticOrder withSpecimen(List<ResourceReference> specimen) {
        setSpecimen(specimen);
        return this;
    }

    public DiagnosticOrder withStatus(DiagnosticOrderStatus value) {
        setStatus(value);
        return this;
    }

    public DiagnosticOrder withPriority(DiagnosticOrderPriority value) {
        setPriority(value);
        return this;
    }

    public DiagnosticOrder withEvent(DiagnosticOrderEvent... values) {
        if (values!= null) {
            for (DiagnosticOrderEvent value: values) {
                getEvent().add(value);
            }
        }
        return this;
    }

    public DiagnosticOrder withEvent(Collection<DiagnosticOrderEvent> values) {
        if (values!= null) {
            getEvent().addAll(values);
        }
        return this;
    }

    public DiagnosticOrder withEvent(List<DiagnosticOrderEvent> event) {
        setEvent(event);
        return this;
    }

    public DiagnosticOrder withItem(DiagnosticOrderItem... values) {
        if (values!= null) {
            for (DiagnosticOrderItem value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DiagnosticOrder withItem(Collection<DiagnosticOrderItem> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    public DiagnosticOrder withItem(List<DiagnosticOrderItem> item) {
        setItem(item);
        return this;
    }

    @Override
    public DiagnosticOrder withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public DiagnosticOrder withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public DiagnosticOrder withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticOrder withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticOrder withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public DiagnosticOrder withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticOrder withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticOrder withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public DiagnosticOrder withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticOrder withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticOrder withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public DiagnosticOrder withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DiagnosticOrder)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DiagnosticOrder that = ((DiagnosticOrder) object);
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
            ResourceReference lhsOrderer;
            lhsOrderer = this.getOrderer();
            ResourceReference rhsOrderer;
            rhsOrderer = that.getOrderer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderer", lhsOrderer), LocatorUtils.property(thatLocator, "orderer", rhsOrderer), lhsOrderer, rhsOrderer)) {
                return false;
            }
        }
        {
            List<Identifier> lhsIdentifier;
            lhsIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            List<Identifier> rhsIdentifier;
            rhsIdentifier = (((that.identifier!= null)&&(!that.identifier.isEmpty()))?that.getIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            ResourceReference lhsEncounter;
            lhsEncounter = this.getEncounter();
            ResourceReference rhsEncounter;
            rhsEncounter = that.getEncounter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encounter", lhsEncounter), LocatorUtils.property(thatLocator, "encounter", rhsEncounter), lhsEncounter, rhsEncounter)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsClinicalNotes;
            lhsClinicalNotes = this.getClinicalNotes();
            org.hl7.fhir.String rhsClinicalNotes;
            rhsClinicalNotes = that.getClinicalNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clinicalNotes", lhsClinicalNotes), LocatorUtils.property(thatLocator, "clinicalNotes", rhsClinicalNotes), lhsClinicalNotes, rhsClinicalNotes)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsSpecimen;
            lhsSpecimen = (((this.specimen!= null)&&(!this.specimen.isEmpty()))?this.getSpecimen():null);
            List<ResourceReference> rhsSpecimen;
            rhsSpecimen = (((that.specimen!= null)&&(!that.specimen.isEmpty()))?that.getSpecimen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specimen", lhsSpecimen), LocatorUtils.property(thatLocator, "specimen", rhsSpecimen), lhsSpecimen, rhsSpecimen)) {
                return false;
            }
        }
        {
            DiagnosticOrderStatus lhsStatus;
            lhsStatus = this.getStatus();
            DiagnosticOrderStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            DiagnosticOrderPriority lhsPriority;
            lhsPriority = this.getPriority();
            DiagnosticOrderPriority rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority)) {
                return false;
            }
        }
        {
            List<DiagnosticOrderEvent> lhsEvent;
            lhsEvent = (((this.event!= null)&&(!this.event.isEmpty()))?this.getEvent():null);
            List<DiagnosticOrderEvent> rhsEvent;
            rhsEvent = (((that.event!= null)&&(!that.event.isEmpty()))?that.getEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "event", lhsEvent), LocatorUtils.property(thatLocator, "event", rhsEvent), lhsEvent, rhsEvent)) {
                return false;
            }
        }
        {
            List<DiagnosticOrderItem> lhsItem;
            lhsItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            List<DiagnosticOrderItem> rhsItem;
            rhsItem = (((that.item!= null)&&(!that.item.isEmpty()))?that.getItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem)) {
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
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            ResourceReference theOrderer;
            theOrderer = this.getOrderer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderer", theOrderer), currentHashCode, theOrderer);
        }
        {
            List<Identifier> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encounter", theEncounter), currentHashCode, theEncounter);
        }
        {
            org.hl7.fhir.String theClinicalNotes;
            theClinicalNotes = this.getClinicalNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clinicalNotes", theClinicalNotes), currentHashCode, theClinicalNotes);
        }
        {
            List<ResourceReference> theSpecimen;
            theSpecimen = (((this.specimen!= null)&&(!this.specimen.isEmpty()))?this.getSpecimen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specimen", theSpecimen), currentHashCode, theSpecimen);
        }
        {
            DiagnosticOrderStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            DiagnosticOrderPriority thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority);
        }
        {
            List<DiagnosticOrderEvent> theEvent;
            theEvent = (((this.event!= null)&&(!this.event.isEmpty()))?this.getEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "event", theEvent), currentHashCode, theEvent);
        }
        {
            List<DiagnosticOrderItem> theItem;
            theItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
