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
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
 * 
 * <p>Java class for CarePlan.Goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan.Goal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}CarePlanGoalStatus" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="concern" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Goal", propOrder = {
    "description",
    "status",
    "notes",
    "concern"
})
@Entity(name = "CarePlanGoal")
@Table(name = "CAREPLANGOAL")
public class CarePlanGoal
    extends BackboneElement
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected org.hl7.fhir.String description;
    protected CarePlanGoalStatus status;
    protected org.hl7.fhir.String notes;
    protected List<ResourceReference> concern;

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
    @JoinColumn(name = "DESCRIPTION_CAREPLANGOAL_HJID")
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanGoalStatus }
     *     
     */
    @ManyToOne(targetEntity = CarePlanGoalStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_CAREPLANGOAL_HJID")
    public CarePlanGoalStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanGoalStatus }
     *     
     */
    public void setStatus(CarePlanGoalStatus value) {
        this.status = value;
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
    @JoinColumn(name = "NOTES_CAREPLANGOAL_HJID")
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
     * Gets the value of the concern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcern().add(newItem);
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
    @JoinColumn(name = "CONCERN_CAREPLANGOAL_HJID")
    public List<ResourceReference> getConcern() {
        if (concern == null) {
            concern = new ArrayList<ResourceReference>();
        }
        return this.concern;
    }

    /**
     * 
     * 
     */
    public void setConcern(List<ResourceReference> concern) {
        this.concern = concern;
    }

    public CarePlanGoal withDescription(org.hl7.fhir.String value) {
        setDescription(value);
        return this;
    }

    public CarePlanGoal withStatus(CarePlanGoalStatus value) {
        setStatus(value);
        return this;
    }

    public CarePlanGoal withNotes(org.hl7.fhir.String value) {
        setNotes(value);
        return this;
    }

    public CarePlanGoal withConcern(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getConcern().add(value);
            }
        }
        return this;
    }

    public CarePlanGoal withConcern(Collection<ResourceReference> values) {
        if (values!= null) {
            getConcern().addAll(values);
        }
        return this;
    }

    public CarePlanGoal withConcern(List<ResourceReference> concern) {
        setConcern(concern);
        return this;
    }

    @Override
    public CarePlanGoal withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanGoal withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanGoal withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public CarePlanGoal withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanGoal withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanGoal withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public CarePlanGoal withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CarePlanGoal)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CarePlanGoal that = ((CarePlanGoal) object);
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
            CarePlanGoalStatus lhsStatus;
            lhsStatus = this.getStatus();
            CarePlanGoalStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
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
            List<ResourceReference> lhsConcern;
            lhsConcern = (((this.concern!= null)&&(!this.concern.isEmpty()))?this.getConcern():null);
            List<ResourceReference> rhsConcern;
            rhsConcern = (((that.concern!= null)&&(!that.concern.isEmpty()))?that.getConcern():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concern", lhsConcern), LocatorUtils.property(thatLocator, "concern", rhsConcern), lhsConcern, rhsConcern)) {
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
            org.hl7.fhir.String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            CarePlanGoalStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            org.hl7.fhir.String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        {
            List<ResourceReference> theConcern;
            theConcern = (((this.concern!= null)&&(!this.concern.isEmpty()))?this.getConcern():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "concern", theConcern), currentHashCode, theConcern);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
