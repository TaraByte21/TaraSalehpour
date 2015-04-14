//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Procedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="indication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Procedure.Performer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="report" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="complication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="followUp" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedItem" type="{http://hl7.org/fhir}Procedure.RelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure", propOrder = {
    "identifiers",
    "subject",
    "type",
    "bodySites",
    "indications",
    "performers",
    "date",
    "encounter",
    "outcome",
    "reports",
    "complications",
    "followUp",
    "relatedItems",
    "notes"
})
@XmlRootElement(name = "Procedure")
public class Procedure
    extends Resource
    implements Serializable
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "bodySite")
    protected List<CodeableConcept> bodySites;
    @XmlElement(name = "indication")
    protected List<CodeableConcept> indications;
    @XmlElement(name = "performer")
    protected List<ProcedurePerformer> performers;
    protected Period date;
    protected ResourceReference encounter;
    protected edu.asu.bmi.cda.fhir.String outcome;
    @XmlElement(name = "report")
    protected List<ResourceReference> reports;
    @XmlElement(name = "complication")
    protected List<CodeableConcept> complications;
    protected edu.asu.bmi.cda.fhir.String followUp;
    @XmlElement(name = "relatedItem")
    protected List<ProcedureRelatedItem> relatedItems;
    protected edu.asu.bmi.cda.fhir.String notes;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
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
     * Gets the value of the bodySites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getBodySites() {
        if (bodySites == null) {
            bodySites = new ArrayList<CodeableConcept>();
        }
        return this.bodySites;
    }

    /**
     * Gets the value of the indications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getIndications() {
        if (indications == null) {
            indications = new ArrayList<CodeableConcept>();
        }
        return this.indications;
    }

    /**
     * Gets the value of the performers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedurePerformer }
     * 
     * 
     */
    public List<ProcedurePerformer> getPerformers() {
        if (performers == null) {
            performers = new ArrayList<ProcedurePerformer>();
        }
        return this.performers;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
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
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setOutcome(edu.asu.bmi.cda.fhir.String value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getReports() {
        if (reports == null) {
            reports = new ArrayList<ResourceReference>();
        }
        return this.reports;
    }

    /**
     * Gets the value of the complications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getComplications() {
        if (complications == null) {
            complications = new ArrayList<CodeableConcept>();
        }
        return this.complications;
    }

    /**
     * Gets the value of the followUp property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getFollowUp() {
        return followUp;
    }

    /**
     * Sets the value of the followUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setFollowUp(edu.asu.bmi.cda.fhir.String value) {
        this.followUp = value;
    }

    /**
     * Gets the value of the relatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureRelatedItem }
     * 
     * 
     */
    public List<ProcedureRelatedItem> getRelatedItems() {
        if (relatedItems == null) {
            relatedItems = new ArrayList<ProcedureRelatedItem>();
        }
        return this.relatedItems;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setNotes(edu.asu.bmi.cda.fhir.String value) {
        this.notes = value;
    }

    public Procedure withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public Procedure withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
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

    public Procedure withBodySites(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getBodySites().add(value);
            }
        }
        return this;
    }

    public Procedure withBodySites(Collection<CodeableConcept> values) {
        if (values!= null) {
            getBodySites().addAll(values);
        }
        return this;
    }

    public Procedure withIndications(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getIndications().add(value);
            }
        }
        return this;
    }

    public Procedure withIndications(Collection<CodeableConcept> values) {
        if (values!= null) {
            getIndications().addAll(values);
        }
        return this;
    }

    public Procedure withPerformers(ProcedurePerformer... values) {
        if (values!= null) {
            for (ProcedurePerformer value: values) {
                getPerformers().add(value);
            }
        }
        return this;
    }

    public Procedure withPerformers(Collection<ProcedurePerformer> values) {
        if (values!= null) {
            getPerformers().addAll(values);
        }
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

    public Procedure withOutcome(edu.asu.bmi.cda.fhir.String value) {
        setOutcome(value);
        return this;
    }

    public Procedure withReports(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getReports().add(value);
            }
        }
        return this;
    }

    public Procedure withReports(Collection<ResourceReference> values) {
        if (values!= null) {
            getReports().addAll(values);
        }
        return this;
    }

    public Procedure withComplications(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getComplications().add(value);
            }
        }
        return this;
    }

    public Procedure withComplications(Collection<CodeableConcept> values) {
        if (values!= null) {
            getComplications().addAll(values);
        }
        return this;
    }

    public Procedure withFollowUp(edu.asu.bmi.cda.fhir.String value) {
        setFollowUp(value);
        return this;
    }

    public Procedure withRelatedItems(ProcedureRelatedItem... values) {
        if (values!= null) {
            for (ProcedureRelatedItem value: values) {
                getRelatedItems().add(value);
            }
        }
        return this;
    }

    public Procedure withRelatedItems(Collection<ProcedureRelatedItem> values) {
        if (values!= null) {
            getRelatedItems().addAll(values);
        }
        return this;
    }

    public Procedure withNotes(edu.asu.bmi.cda.fhir.String value) {
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
    public Procedure withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Procedure withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Procedure withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Procedure withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Procedure withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Procedure withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Procedure withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
