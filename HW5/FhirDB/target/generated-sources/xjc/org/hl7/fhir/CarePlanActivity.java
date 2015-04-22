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
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
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
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Activity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="goal" type="{http://hl7.org/fhir}xmlIdRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}CarePlanActivityStatus" minOccurs="0"/>
 *         &lt;element name="prohibited" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="actionResulting" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="simple" type="{http://hl7.org/fhir}CarePlan.Simple" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Activity", propOrder = {
    "goal",
    "status",
    "prohibited",
    "actionResulting",
    "notes",
    "detail",
    "simple"
})
@Entity(name = "CarePlanActivity")
@Table(name = "CAREPLANACTIVITY")
public class CarePlanActivity
    extends BackboneElement
    implements Equals, HashCode
{

    protected List<java.lang.String> goal;
    protected CarePlanActivityStatus status;
    @XmlElement(required = true)
    protected Boolean prohibited;
    protected List<ResourceReference> actionResulting;
    protected org.hl7.fhir.String notes;
    protected ResourceReference detail;
    protected CarePlanSimple simple;

    /**
     * Gets the value of the goal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    @ElementCollection
    @OrderColumn(name = "HJINDEX")
    @Column(name = "HJVALUE", length = 255)
    @CollectionTable(name = "CAREPLANACTIVITY_GOAL", joinColumns = {
        @JoinColumn(name = "HJID")
    })
    public List<java.lang.String> getGoal() {
        if (goal == null) {
            goal = new ArrayList<java.lang.String>();
        }
        return this.goal;
    }

    /**
     * 
     * 
     */
    public void setGoal(List<java.lang.String> goal) {
        this.goal = goal;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanActivityStatus }
     *     
     */
    @ManyToOne(targetEntity = CarePlanActivityStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_CAREPLANACTIVITY_HJID")
    public CarePlanActivityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanActivityStatus }
     *     
     */
    public void setStatus(CarePlanActivityStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the prohibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROHIBITED_CAREPLANACTIVITY__0")
    public Boolean getProhibited() {
        return prohibited;
    }

    /**
     * Sets the value of the prohibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibited(Boolean value) {
        this.prohibited = value;
    }

    /**
     * Gets the value of the actionResulting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionResulting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionResulting().add(newItem);
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
    @JoinColumn(name = "ACTIONRESULTING_CAREPLANACTI_0")
    public List<ResourceReference> getActionResulting() {
        if (actionResulting == null) {
            actionResulting = new ArrayList<ResourceReference>();
        }
        return this.actionResulting;
    }

    /**
     * 
     * 
     */
    public void setActionResulting(List<ResourceReference> actionResulting) {
        this.actionResulting = actionResulting;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NOTES_CAREPLANACTIVITY_HJID")
    public org.hl7.fhir.String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setNotes(org.hl7.fhir.String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DETAIL_CAREPLANACTIVITY_HJID")
    public ResourceReference getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDetail(ResourceReference value) {
        this.detail = value;
    }

    /**
     * Gets the value of the simple property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanSimple }
     *     
     */
    @ManyToOne(targetEntity = CarePlanSimple.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SIMPLE__CAREPLANACTIVITY_HJID")
    public CarePlanSimple getSimple() {
        return simple;
    }

    /**
     * Sets the value of the simple property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanSimple }
     *     
     */
    public void setSimple(CarePlanSimple value) {
        this.simple = value;
    }

    public CarePlanActivity withGoal(java.lang.String... values) {
        if (values!= null) {
            for (java.lang.String value: values) {
                getGoal().add(value);
            }
        }
        return this;
    }

    public CarePlanActivity withGoal(Collection<java.lang.String> values) {
        if (values!= null) {
            getGoal().addAll(values);
        }
        return this;
    }

    public CarePlanActivity withGoal(List<java.lang.String> goal) {
        setGoal(goal);
        return this;
    }

    public CarePlanActivity withStatus(CarePlanActivityStatus value) {
        setStatus(value);
        return this;
    }

    public CarePlanActivity withProhibited(Boolean value) {
        setProhibited(value);
        return this;
    }

    public CarePlanActivity withActionResulting(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getActionResulting().add(value);
            }
        }
        return this;
    }

    public CarePlanActivity withActionResulting(Collection<ResourceReference> values) {
        if (values!= null) {
            getActionResulting().addAll(values);
        }
        return this;
    }

    public CarePlanActivity withActionResulting(List<ResourceReference> actionResulting) {
        setActionResulting(actionResulting);
        return this;
    }

    public CarePlanActivity withNotes(org.hl7.fhir.String value) {
        setNotes(value);
        return this;
    }

    public CarePlanActivity withDetail(ResourceReference value) {
        setDetail(value);
        return this;
    }

    public CarePlanActivity withSimple(CarePlanSimple value) {
        setSimple(value);
        return this;
    }

    @Override
    public CarePlanActivity withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanActivity withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanActivity withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public CarePlanActivity withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanActivity withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanActivity withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public CarePlanActivity withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CarePlanActivity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CarePlanActivity that = ((CarePlanActivity) object);
        {
            List<java.lang.String> lhsGoal;
            lhsGoal = (((this.goal!= null)&&(!this.goal.isEmpty()))?this.getGoal():null);
            List<java.lang.String> rhsGoal;
            rhsGoal = (((that.goal!= null)&&(!that.goal.isEmpty()))?that.getGoal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goal", lhsGoal), LocatorUtils.property(thatLocator, "goal", rhsGoal), lhsGoal, rhsGoal)) {
                return false;
            }
        }
        {
            CarePlanActivityStatus lhsStatus;
            lhsStatus = this.getStatus();
            CarePlanActivityStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            Boolean lhsProhibited;
            lhsProhibited = this.getProhibited();
            Boolean rhsProhibited;
            rhsProhibited = that.getProhibited();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prohibited", lhsProhibited), LocatorUtils.property(thatLocator, "prohibited", rhsProhibited), lhsProhibited, rhsProhibited)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsActionResulting;
            lhsActionResulting = (((this.actionResulting!= null)&&(!this.actionResulting.isEmpty()))?this.getActionResulting():null);
            List<ResourceReference> rhsActionResulting;
            rhsActionResulting = (((that.actionResulting!= null)&&(!that.actionResulting.isEmpty()))?that.getActionResulting():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionResulting", lhsActionResulting), LocatorUtils.property(thatLocator, "actionResulting", rhsActionResulting), lhsActionResulting, rhsActionResulting)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsNotes;
            lhsNotes = this.getNotes();
            org.hl7.fhir.String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes)) {
                return false;
            }
        }
        {
            ResourceReference lhsDetail;
            lhsDetail = this.getDetail();
            ResourceReference rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail)) {
                return false;
            }
        }
        {
            CarePlanSimple lhsSimple;
            lhsSimple = this.getSimple();
            CarePlanSimple rhsSimple;
            rhsSimple = that.getSimple();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "simple", lhsSimple), LocatorUtils.property(thatLocator, "simple", rhsSimple), lhsSimple, rhsSimple)) {
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
            List<java.lang.String> theGoal;
            theGoal = (((this.goal!= null)&&(!this.goal.isEmpty()))?this.getGoal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goal", theGoal), currentHashCode, theGoal);
        }
        {
            CarePlanActivityStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            Boolean theProhibited;
            theProhibited = this.getProhibited();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prohibited", theProhibited), currentHashCode, theProhibited);
        }
        {
            List<ResourceReference> theActionResulting;
            theActionResulting = (((this.actionResulting!= null)&&(!this.actionResulting.isEmpty()))?this.getActionResulting():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionResulting", theActionResulting), currentHashCode, theActionResulting);
        }
        {
            org.hl7.fhir.String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        {
            ResourceReference theDetail;
            theDetail = this.getDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detail", theDetail), currentHashCode, theDetail);
        }
        {
            CarePlanSimple theSimple;
            theSimple = this.getSimple();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simple", theSimple), currentHashCode, theSimple);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
