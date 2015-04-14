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
 * <p>Java class for DiagnosticReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}DiagnosticReportStatus"/&gt;
 *         &lt;element name="issued" type="{http://hl7.org/fhir}dateTime"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="performer" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="requestDetail" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serviceCategory" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="diagnosticDateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *           &lt;element name="diagnosticPeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="specimen" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="imagingStudy" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://hl7.org/fhir}DiagnosticReport.Image" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="conclusion" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="codedDiagnosis" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="presentedForm" type="{http://hl7.org/fhir}Attachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticReport", propOrder = {
    "name",
    "status",
    "issued",
    "subject",
    "performer",
    "identifier",
    "requestDetails",
    "serviceCategory",
    "diagnosticPeriod",
    "diagnosticDateTime",
    "specimens",
    "results",
    "imagingStudies",
    "images",
    "conclusion",
    "codedDiagnosises",
    "presentedForms"
})
@XmlRootElement(name = "DiagnosticReport")
public class DiagnosticReport
    extends Resource
    implements Serializable
{

    @XmlElement(required = true)
    protected CodeableConcept name;
    @XmlElement(required = true)
    protected DiagnosticReportStatus status;
    @XmlElement(required = true)
    protected DateTime issued;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected ResourceReference performer;
    protected Identifier identifier;
    @XmlElement(name = "requestDetail")
    protected List<ResourceReference> requestDetails;
    protected CodeableConcept serviceCategory;
    protected Period diagnosticPeriod;
    protected DateTime diagnosticDateTime;
    @XmlElement(name = "specimen")
    protected List<ResourceReference> specimens;
    @XmlElement(name = "result")
    protected List<ResourceReference> results;
    @XmlElement(name = "imagingStudy")
    protected List<ResourceReference> imagingStudies;
    @XmlElement(name = "image")
    protected List<DiagnosticReportImage> images;
    protected edu.asu.bmi.cda.fhir.String conclusion;
    @XmlElement(name = "codedDiagnosis")
    protected List<CodeableConcept> codedDiagnosises;
    @XmlElement(name = "presentedForm")
    protected List<Attachment> presentedForms;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setName(CodeableConcept value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticReportStatus }
     *     
     */
    public DiagnosticReportStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticReportStatus }
     *     
     */
    public void setStatus(DiagnosticReportStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setIssued(DateTime value) {
        this.issued = value;
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
     * Gets the value of the performer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPerformer() {
        return performer;
    }

    /**
     * Sets the value of the performer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPerformer(ResourceReference value) {
        this.performer = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the requestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getRequestDetails() {
        if (requestDetails == null) {
            requestDetails = new ArrayList<ResourceReference>();
        }
        return this.requestDetails;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setServiceCategory(CodeableConcept value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the diagnosticPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getDiagnosticPeriod() {
        return diagnosticPeriod;
    }

    /**
     * Sets the value of the diagnosticPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setDiagnosticPeriod(Period value) {
        this.diagnosticPeriod = value;
    }

    /**
     * Gets the value of the diagnosticDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDiagnosticDateTime() {
        return diagnosticDateTime;
    }

    /**
     * Sets the value of the diagnosticDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDiagnosticDateTime(DateTime value) {
        this.diagnosticDateTime = value;
    }

    /**
     * Gets the value of the specimens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specimens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecimens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getSpecimens() {
        if (specimens == null) {
            specimens = new ArrayList<ResourceReference>();
        }
        return this.specimens;
    }

    /**
     * Gets the value of the results property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the results property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getResults() {
        if (results == null) {
            results = new ArrayList<ResourceReference>();
        }
        return this.results;
    }

    /**
     * Gets the value of the imagingStudies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagingStudies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagingStudies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getImagingStudies() {
        if (imagingStudies == null) {
            imagingStudies = new ArrayList<ResourceReference>();
        }
        return this.imagingStudies;
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticReportImage }
     * 
     * 
     */
    public List<DiagnosticReportImage> getImages() {
        if (images == null) {
            images = new ArrayList<DiagnosticReportImage>();
        }
        return this.images;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setConclusion(edu.asu.bmi.cda.fhir.String value) {
        this.conclusion = value;
    }

    /**
     * Gets the value of the codedDiagnosises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codedDiagnosises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodedDiagnosises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCodedDiagnosises() {
        if (codedDiagnosises == null) {
            codedDiagnosises = new ArrayList<CodeableConcept>();
        }
        return this.codedDiagnosises;
    }

    /**
     * Gets the value of the presentedForms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentedForms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentedForms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getPresentedForms() {
        if (presentedForms == null) {
            presentedForms = new ArrayList<Attachment>();
        }
        return this.presentedForms;
    }

    public DiagnosticReport withName(CodeableConcept value) {
        setName(value);
        return this;
    }

    public DiagnosticReport withStatus(DiagnosticReportStatus value) {
        setStatus(value);
        return this;
    }

    public DiagnosticReport withIssued(DateTime value) {
        setIssued(value);
        return this;
    }

    public DiagnosticReport withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public DiagnosticReport withPerformer(ResourceReference value) {
        setPerformer(value);
        return this;
    }

    public DiagnosticReport withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public DiagnosticReport withRequestDetails(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getRequestDetails().add(value);
            }
        }
        return this;
    }

    public DiagnosticReport withRequestDetails(Collection<ResourceReference> values) {
        if (values!= null) {
            getRequestDetails().addAll(values);
        }
        return this;
    }

    public DiagnosticReport withServiceCategory(CodeableConcept value) {
        setServiceCategory(value);
        return this;
    }

    public DiagnosticReport withDiagnosticPeriod(Period value) {
        setDiagnosticPeriod(value);
        return this;
    }

    public DiagnosticReport withDiagnosticDateTime(DateTime value) {
        setDiagnosticDateTime(value);
        return this;
    }

    public DiagnosticReport withSpecimens(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getSpecimens().add(value);
            }
        }
        return this;
    }

    public DiagnosticReport withSpecimens(Collection<ResourceReference> values) {
        if (values!= null) {
            getSpecimens().addAll(values);
        }
        return this;
    }

    public DiagnosticReport withResults(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getResults().add(value);
            }
        }
        return this;
    }

    public DiagnosticReport withResults(Collection<ResourceReference> values) {
        if (values!= null) {
            getResults().addAll(values);
        }
        return this;
    }

    public DiagnosticReport withImagingStudies(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getImagingStudies().add(value);
            }
        }
        return this;
    }

    public DiagnosticReport withImagingStudies(Collection<ResourceReference> values) {
        if (values!= null) {
            getImagingStudies().addAll(values);
        }
        return this;
    }

    public DiagnosticReport withImages(DiagnosticReportImage... values) {
        if (values!= null) {
            for (DiagnosticReportImage value: values) {
                getImages().add(value);
            }
        }
        return this;
    }

    public DiagnosticReport withImages(Collection<DiagnosticReportImage> values) {
        if (values!= null) {
            getImages().addAll(values);
        }
        return this;
    }

    public DiagnosticReport withConclusion(edu.asu.bmi.cda.fhir.String value) {
        setConclusion(value);
        return this;
    }

    public DiagnosticReport withCodedDiagnosises(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getCodedDiagnosises().add(value);
            }
        }
        return this;
    }

    public DiagnosticReport withCodedDiagnosises(Collection<CodeableConcept> values) {
        if (values!= null) {
            getCodedDiagnosises().addAll(values);
        }
        return this;
    }

    public DiagnosticReport withPresentedForms(Attachment... values) {
        if (values!= null) {
            for (Attachment value: values) {
                getPresentedForms().add(value);
            }
        }
        return this;
    }

    public DiagnosticReport withPresentedForms(Collection<Attachment> values) {
        if (values!= null) {
            getPresentedForms().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticReport withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public DiagnosticReport withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public DiagnosticReport withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticReport withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticReport withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticReport withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticReport withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticReport withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticReport withId(java.lang.String value) {
        setId(value);
        return this;
    }

}