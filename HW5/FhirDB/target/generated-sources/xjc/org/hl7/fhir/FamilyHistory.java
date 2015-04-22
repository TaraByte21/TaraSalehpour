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
 * <p>Java class for FamilyHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="relation" type="{http://hl7.org/fhir}FamilyHistory.Relation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistory", propOrder = {
    "identifier",
    "subject",
    "note",
    "relation"
})
@Entity(name = "FamilyHistory")
@Table(name = "FAMILYHISTORY")
public class FamilyHistory
    extends Resource
    implements Equals, HashCode
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected ResourceReference subject;
    protected org.hl7.fhir.String note;
    protected List<FamilyHistoryRelation> relation;

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
    @JoinColumn(name = "IDENTIFIER_FAMILYHISTORY_HJID")
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
    @JoinColumn(name = "SUBJECT_FAMILYHISTORY_HJID")
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NOTE_FAMILYHISTORY_HJID")
    public org.hl7.fhir.String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setNote(org.hl7.fhir.String value) {
        this.note = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyHistoryRelation }
     * 
     * 
     */
    @OneToMany(targetEntity = FamilyHistoryRelation.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATION_FAMILYHISTORY_HJID")
    public List<FamilyHistoryRelation> getRelation() {
        if (relation == null) {
            relation = new ArrayList<FamilyHistoryRelation>();
        }
        return this.relation;
    }

    /**
     * 
     * 
     */
    public void setRelation(List<FamilyHistoryRelation> relation) {
        this.relation = relation;
    }

    public FamilyHistory withIdentifier(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifier().add(value);
            }
        }
        return this;
    }

    public FamilyHistory withIdentifier(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifier().addAll(values);
        }
        return this;
    }

    public FamilyHistory withIdentifier(List<Identifier> identifier) {
        setIdentifier(identifier);
        return this;
    }

    public FamilyHistory withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public FamilyHistory withNote(org.hl7.fhir.String value) {
        setNote(value);
        return this;
    }

    public FamilyHistory withRelation(FamilyHistoryRelation... values) {
        if (values!= null) {
            for (FamilyHistoryRelation value: values) {
                getRelation().add(value);
            }
        }
        return this;
    }

    public FamilyHistory withRelation(Collection<FamilyHistoryRelation> values) {
        if (values!= null) {
            getRelation().addAll(values);
        }
        return this;
    }

    public FamilyHistory withRelation(List<FamilyHistoryRelation> relation) {
        setRelation(relation);
        return this;
    }

    @Override
    public FamilyHistory withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FamilyHistory withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public FamilyHistory withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistory withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistory withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public FamilyHistory withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistory withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistory withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public FamilyHistory withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public FamilyHistory withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public FamilyHistory withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public FamilyHistory withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FamilyHistory)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FamilyHistory that = ((FamilyHistory) object);
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
            ResourceReference lhsSubject;
            lhsSubject = this.getSubject();
            ResourceReference rhsSubject;
            rhsSubject = that.getSubject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subject", lhsSubject), LocatorUtils.property(thatLocator, "subject", rhsSubject), lhsSubject, rhsSubject)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsNote;
            lhsNote = this.getNote();
            org.hl7.fhir.String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
                return false;
            }
        }
        {
            List<FamilyHistoryRelation> lhsRelation;
            lhsRelation = (((this.relation!= null)&&(!this.relation.isEmpty()))?this.getRelation():null);
            List<FamilyHistoryRelation> rhsRelation;
            rhsRelation = (((that.relation!= null)&&(!that.relation.isEmpty()))?that.getRelation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relation", lhsRelation), LocatorUtils.property(thatLocator, "relation", rhsRelation), lhsRelation, rhsRelation)) {
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
            List<Identifier> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            org.hl7.fhir.String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        {
            List<FamilyHistoryRelation> theRelation;
            theRelation = (((this.relation!= null)&&(!this.relation.isEmpty()))?this.getRelation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relation", theRelation), currentHashCode, theRelation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
