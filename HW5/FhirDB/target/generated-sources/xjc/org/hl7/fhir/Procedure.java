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
 * <p>Java class for Procedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Procedure.Performer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="report" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="complication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="followUp" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="relatedItem" type="{http://hl7.org/fhir}Procedure.RelatedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure", propOrder = {
    "identifier",
    "subject",
    "type",
    "bodySite",
    "indication",
    "performer",
    "date",
    "encounter",
    "outcome",
    "report",
    "complication",
    "followUp",
    "relatedItem",
    "notes"
})
@Entity(name = "Procedure")
@Table(name = "PROCEDURE_")
public class Procedure
    extends Resource
    implements Equals, HashCode
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected CodeableConcept type;
    protected List<CodeableConcept> bodySite;
    protected List<CodeableConcept> indication;
    protected List<ProcedurePerformer> performer;
    protected Period date;
    protected ResourceReference encounter;
    protected org.hl7.fhir.String outcome;
    protected List<ResourceReference> report;
    protected List<CodeableConcept> complication;
    protected org.hl7.fhir.String followUp;
    protected List<ProcedureRelatedItem> relatedItem;
    protected org.hl7.fhir.String notes;

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
    @JoinColumn(name = "IDENTIFIER_PROCEDURE__HJID")
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
    @JoinColumn(name = "SUBJECT_PROCEDURE__HJID")
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__PROCEDURE__HJID")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BODYSITE_PROCEDURE__HJID")
    public List<CodeableConcept> getBodySite() {
        if (bodySite == null) {
            bodySite = new ArrayList<CodeableConcept>();
        }
        return this.bodySite;
    }

    /**
     * 
     * 
     */
    public void setBodySite(List<CodeableConcept> bodySite) {
        this.bodySite = bodySite;
    }

    /**
     * Gets the value of the indication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INDICATION_PROCEDURE__HJID")
    public List<CodeableConcept> getIndication() {
        if (indication == null) {
            indication = new ArrayList<CodeableConcept>();
        }
        return this.indication;
    }

    /**
     * 
     * 
     */
    public void setIndication(List<CodeableConcept> indication) {
        this.indication = indication;
    }

    /**
     * Gets the value of the performer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedurePerformer }
     * 
     * 
     */
    @OneToMany(targetEntity = ProcedurePerformer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERFORMER_PROCEDURE__HJID")
    public List<ProcedurePerformer> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<ProcedurePerformer>();
        }
        return this.performer;
    }

    /**
     * 
     * 
     */
    public void setPerformer(List<ProcedurePerformer> performer) {
        this.performer = performer;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATE__PROCEDURE__HJID")
    public Period getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setDate(Period value) {
        this.date = value;
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
    @JoinColumn(name = "ENCOUNTER_PROCEDURE__HJID")
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
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OUTCOME_PROCEDURE__HJID")
    public org.hl7.fhir.String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setOutcome(org.hl7.fhir.String value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
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
    @JoinColumn(name = "REPORT_PROCEDURE__HJID")
    public List<ResourceReference> getReport() {
        if (report == null) {
            report = new ArrayList<ResourceReference>();
        }
        return this.report;
    }

    /**
     * 
     * 
     */
    public void setReport(List<ResourceReference> report) {
        this.report = report;
    }

    /**
     * Gets the value of the complication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COMPLICATION_PROCEDURE__HJID")
    public List<CodeableConcept> getComplication() {
        if (complication == null) {
            complication = new ArrayList<CodeableConcept>();
        }
        return this.complication;
    }

    /**
     * 
     * 
     */
    public void setComplication(List<CodeableConcept> complication) {
        this.complication = complication;
    }

    /**
     * Gets the value of the followUp property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FOLLOWUP_PROCEDURE__HJID")
    public org.hl7.fhir.String getFollowUp() {
        return followUp;
    }

    /**
     * Sets the value of the followUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setFollowUp(org.hl7.fhir.String value) {
        this.followUp = value;
    }

    /**
     * Gets the value of the relatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureRelatedItem }
     * 
     * 
     */
    @OneToMany(targetEntity = ProcedureRelatedItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATEDITEM_PROCEDURE__HJID")
    public List<ProcedureRelatedItem> getRelatedItem() {
        if (relatedItem == null) {
            relatedItem = new ArrayList<ProcedureRelatedItem>();
        }
        return this.relatedItem;
    }

    /**
     * 
     * 
     */
    public void setRelatedItem(List<ProcedureRelatedItem> relatedItem) {
        this.relatedItem = relatedItem;
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
    @JoinColumn(name = "NOTES_PROCEDURE__HJID")
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

    public Procedure withIdentifier(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifier().add(value);
            }
        }
        return this;
    }

    public Procedure withIdentifier(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifier().addAll(values);
        }
        return this;
    }

    public Procedure withIdentifier(List<Identifier> identifier) {
        setIdentifier(identifier);
        return this;
    }

    public Procedure withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public Procedure withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public Procedure withBodySite(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getBodySite().add(value);
            }
        }
        return this;
    }

    public Procedure withBodySite(Collection<CodeableConcept> values) {
        if (values!= null) {
            getBodySite().addAll(values);
        }
        return this;
    }

    public Procedure withBodySite(List<CodeableConcept> bodySite) {
        setBodySite(bodySite);
        return this;
    }

    public Procedure withIndication(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getIndication().add(value);
            }
        }
        return this;
    }

    public Procedure withIndication(Collection<CodeableConcept> values) {
        if (values!= null) {
            getIndication().addAll(values);
        }
        return this;
    }

    public Procedure withIndication(List<CodeableConcept> indication) {
        setIndication(indication);
        return this;
    }

    public Procedure withPerformer(ProcedurePerformer... values) {
        if (values!= null) {
            for (ProcedurePerformer value: values) {
                getPerformer().add(value);
            }
        }
        return this;
    }

    public Procedure withPerformer(Collection<ProcedurePerformer> values) {
        if (values!= null) {
            getPerformer().addAll(values);
        }
        return this;
    }

    public Procedure withPerformer(List<ProcedurePerformer> performer) {
        setPerformer(performer);
        return this;
    }

    public Procedure withDate(Period value) {
        setDate(value);
        return this;
    }

    public Procedure withEncounter(ResourceReference value) {
        setEncounter(value);
        return this;
    }

    public Procedure withOutcome(org.hl7.fhir.String value) {
        setOutcome(value);
        return this;
    }

    public Procedure withReport(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getReport().add(value);
            }
        }
        return this;
    }

    public Procedure withReport(Collection<ResourceReference> values) {
        if (values!= null) {
            getReport().addAll(values);
        }
        return this;
    }

    public Procedure withReport(List<ResourceReference> report) {
        setReport(report);
        return this;
    }

    public Procedure withComplication(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getComplication().add(value);
            }
        }
        return this;
    }

    public Procedure withComplication(Collection<CodeableConcept> values) {
        if (values!= null) {
            getComplication().addAll(values);
        }
        return this;
    }

    public Procedure withComplication(List<CodeableConcept> complication) {
        setComplication(complication);
        return this;
    }

    public Procedure withFollowUp(org.hl7.fhir.String value) {
        setFollowUp(value);
        return this;
    }

    public Procedure withRelatedItem(ProcedureRelatedItem... values) {
        if (values!= null) {
            for (ProcedureRelatedItem value: values) {
                getRelatedItem().add(value);
            }
        }
        return this;
    }

    public Procedure withRelatedItem(Collection<ProcedureRelatedItem> values) {
        if (values!= null) {
            getRelatedItem().addAll(values);
        }
        return this;
    }

    public Procedure withRelatedItem(List<ProcedureRelatedItem> relatedItem) {
        setRelatedItem(relatedItem);
        return this;
    }

    public Procedure withNotes(org.hl7.fhir.String value) {
        setNotes(value);
        return this;
    }

    @Override
    public Procedure withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Procedure withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Procedure withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public Procedure withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public Procedure withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public Procedure withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public Procedure withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public Procedure withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public Procedure withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public Procedure withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public Procedure withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public Procedure withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Procedure)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Procedure that = ((Procedure) object);
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
            CodeableConcept lhsType;
            lhsType = this.getType();
            CodeableConcept rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsBodySite;
            lhsBodySite = (((this.bodySite!= null)&&(!this.bodySite.isEmpty()))?this.getBodySite():null);
            List<CodeableConcept> rhsBodySite;
            rhsBodySite = (((that.bodySite!= null)&&(!that.bodySite.isEmpty()))?that.getBodySite():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bodySite", lhsBodySite), LocatorUtils.property(thatLocator, "bodySite", rhsBodySite), lhsBodySite, rhsBodySite)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsIndication;
            lhsIndication = (((this.indication!= null)&&(!this.indication.isEmpty()))?this.getIndication():null);
            List<CodeableConcept> rhsIndication;
            rhsIndication = (((that.indication!= null)&&(!that.indication.isEmpty()))?that.getIndication():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indication", lhsIndication), LocatorUtils.property(thatLocator, "indication", rhsIndication), lhsIndication, rhsIndication)) {
                return false;
            }
        }
        {
            List<ProcedurePerformer> lhsPerformer;
            lhsPerformer = (((this.performer!= null)&&(!this.performer.isEmpty()))?this.getPerformer():null);
            List<ProcedurePerformer> rhsPerformer;
            rhsPerformer = (((that.performer!= null)&&(!that.performer.isEmpty()))?that.getPerformer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performer", lhsPerformer), LocatorUtils.property(thatLocator, "performer", rhsPerformer), lhsPerformer, rhsPerformer)) {
                return false;
            }
        }
        {
            Period lhsDate;
            lhsDate = this.getDate();
            Period rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
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
            org.hl7.fhir.String lhsOutcome;
            lhsOutcome = this.getOutcome();
            org.hl7.fhir.String rhsOutcome;
            rhsOutcome = that.getOutcome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outcome", lhsOutcome), LocatorUtils.property(thatLocator, "outcome", rhsOutcome), lhsOutcome, rhsOutcome)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsReport;
            lhsReport = (((this.report!= null)&&(!this.report.isEmpty()))?this.getReport():null);
            List<ResourceReference> rhsReport;
            rhsReport = (((that.report!= null)&&(!that.report.isEmpty()))?that.getReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "report", lhsReport), LocatorUtils.property(thatLocator, "report", rhsReport), lhsReport, rhsReport)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsComplication;
            lhsComplication = (((this.complication!= null)&&(!this.complication.isEmpty()))?this.getComplication():null);
            List<CodeableConcept> rhsComplication;
            rhsComplication = (((that.complication!= null)&&(!that.complication.isEmpty()))?that.getComplication():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complication", lhsComplication), LocatorUtils.property(thatLocator, "complication", rhsComplication), lhsComplication, rhsComplication)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsFollowUp;
            lhsFollowUp = this.getFollowUp();
            org.hl7.fhir.String rhsFollowUp;
            rhsFollowUp = that.getFollowUp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "followUp", lhsFollowUp), LocatorUtils.property(thatLocator, "followUp", rhsFollowUp), lhsFollowUp, rhsFollowUp)) {
                return false;
            }
        }
        {
            List<ProcedureRelatedItem> lhsRelatedItem;
            lhsRelatedItem = (((this.relatedItem!= null)&&(!this.relatedItem.isEmpty()))?this.getRelatedItem():null);
            List<ProcedureRelatedItem> rhsRelatedItem;
            rhsRelatedItem = (((that.relatedItem!= null)&&(!that.relatedItem.isEmpty()))?that.getRelatedItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relatedItem", lhsRelatedItem), LocatorUtils.property(thatLocator, "relatedItem", rhsRelatedItem), lhsRelatedItem, rhsRelatedItem)) {
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
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<CodeableConcept> theBodySite;
            theBodySite = (((this.bodySite!= null)&&(!this.bodySite.isEmpty()))?this.getBodySite():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bodySite", theBodySite), currentHashCode, theBodySite);
        }
        {
            List<CodeableConcept> theIndication;
            theIndication = (((this.indication!= null)&&(!this.indication.isEmpty()))?this.getIndication():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indication", theIndication), currentHashCode, theIndication);
        }
        {
            List<ProcedurePerformer> thePerformer;
            thePerformer = (((this.performer!= null)&&(!this.performer.isEmpty()))?this.getPerformer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performer", thePerformer), currentHashCode, thePerformer);
        }
        {
            Period theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encounter", theEncounter), currentHashCode, theEncounter);
        }
        {
            org.hl7.fhir.String theOutcome;
            theOutcome = this.getOutcome();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outcome", theOutcome), currentHashCode, theOutcome);
        }
        {
            List<ResourceReference> theReport;
            theReport = (((this.report!= null)&&(!this.report.isEmpty()))?this.getReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "report", theReport), currentHashCode, theReport);
        }
        {
            List<CodeableConcept> theComplication;
            theComplication = (((this.complication!= null)&&(!this.complication.isEmpty()))?this.getComplication():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complication", theComplication), currentHashCode, theComplication);
        }
        {
            org.hl7.fhir.String theFollowUp;
            theFollowUp = this.getFollowUp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "followUp", theFollowUp), currentHashCode, theFollowUp);
        }
        {
            List<ProcedureRelatedItem> theRelatedItem;
            theRelatedItem = (((this.relatedItem!= null)&&(!this.relatedItem.isEmpty()))?this.getRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedItem", theRelatedItem), currentHashCode, theRelatedItem);
        }
        {
            org.hl7.fhir.String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}