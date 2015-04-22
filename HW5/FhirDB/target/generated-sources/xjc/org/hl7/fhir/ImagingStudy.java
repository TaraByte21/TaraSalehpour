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
 * <p>Java class for ImagingStudy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingStudy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="uid" type="{http://hl7.org/fhir}oid"/>
 *         &lt;element name="accessionNo" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="order" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modality" type="{http://hl7.org/fhir}ImagingModality" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referrer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="availability" type="{http://hl7.org/fhir}InstanceAvailability" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="numberOfSeries" type="{http://hl7.org/fhir}integer"/>
 *         &lt;element name="numberOfInstances" type="{http://hl7.org/fhir}integer"/>
 *         &lt;element name="clinicalInformation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="procedure" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interpreter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="series" type="{http://hl7.org/fhir}ImagingStudy.Series" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingStudy", propOrder = {
    "dateTime",
    "subject",
    "uid",
    "accessionNo",
    "identifier",
    "order",
    "modality",
    "referrer",
    "availability",
    "url",
    "numberOfSeries",
    "numberOfInstances",
    "clinicalInformation",
    "procedure",
    "interpreter",
    "description",
    "series"
})
@Entity(name = "ImagingStudy")
@Table(name = "IMAGINGSTUDY")
public class ImagingStudy
    extends Resource
    implements Equals, HashCode
{

    protected DateTime dateTime;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected Oid uid;
    protected Identifier accessionNo;
    protected List<Identifier> identifier;
    protected List<ResourceReference> order;
    protected List<ImagingModality> modality;
    protected ResourceReference referrer;
    protected InstanceAvailability availability;
    protected Uri url;
    @XmlElement(required = true)
    protected Integer numberOfSeries;
    @XmlElement(required = true)
    protected Integer numberOfInstances;
    protected org.hl7.fhir.String clinicalInformation;
    protected List<Coding> procedure;
    protected ResourceReference interpreter;
    protected org.hl7.fhir.String description;
    protected List<ImagingStudySeries> series;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATETIME_IMAGINGSTUDY_HJID")
    public DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateTime(DateTime value) {
        this.dateTime = value;
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
    @JoinColumn(name = "SUBJECT_IMAGINGSTUDY_HJID")
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
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    @ManyToOne(targetEntity = Oid.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "UID__IMAGINGSTUDY_HJID")
    public Oid getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setUid(Oid value) {
        this.uid = value;
    }

    /**
     * Gets the value of the accessionNo property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ACCESSIONNO_IMAGINGSTUDY_HJID")
    public Identifier getAccessionNo() {
        return accessionNo;
    }

    /**
     * Sets the value of the accessionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setAccessionNo(Identifier value) {
        this.accessionNo = value;
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
    @JoinColumn(name = "IDENTIFIER_IMAGINGSTUDY_HJID")
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
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
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
    @JoinColumn(name = "ORDER__IMAGINGSTUDY_HJID")
    public List<ResourceReference> getOrder() {
        if (order == null) {
            order = new ArrayList<ResourceReference>();
        }
        return this.order;
    }

    /**
     * 
     * 
     */
    public void setOrder(List<ResourceReference> order) {
        this.order = order;
    }

    /**
     * Gets the value of the modality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagingModality }
     * 
     * 
     */
    @OneToMany(targetEntity = ImagingModality.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MODALITY_IMAGINGSTUDY_HJID")
    public List<ImagingModality> getModality() {
        if (modality == null) {
            modality = new ArrayList<ImagingModality>();
        }
        return this.modality;
    }

    /**
     * 
     * 
     */
    public void setModality(List<ImagingModality> modality) {
        this.modality = modality;
    }

    /**
     * Gets the value of the referrer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REFERRER_IMAGINGSTUDY_HJID")
    public ResourceReference getReferrer() {
        return referrer;
    }

    /**
     * Sets the value of the referrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReferrer(ResourceReference value) {
        this.referrer = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceAvailability }
     *     
     */
    @ManyToOne(targetEntity = InstanceAvailability.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AVAILABILITY_IMAGINGSTUDY_HJ_0")
    public InstanceAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceAvailability }
     *     
     */
    public void setAvailability(InstanceAvailability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "URL_IMAGINGSTUDY_HJID")
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * Gets the value of the numberOfSeries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NUMBEROFSERIES_IMAGINGSTUDY__0")
    public Integer getNumberOfSeries() {
        return numberOfSeries;
    }

    /**
     * Sets the value of the numberOfSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSeries(Integer value) {
        this.numberOfSeries = value;
    }

    /**
     * Gets the value of the numberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NUMBEROFINSTANCES_IMAGINGSTU_0")
    public Integer getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * Sets the value of the numberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfInstances(Integer value) {
        this.numberOfInstances = value;
    }

    /**
     * Gets the value of the clinicalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLINICALINFORMATION_IMAGINGS_0")
    public org.hl7.fhir.String getClinicalInformation() {
        return clinicalInformation;
    }

    /**
     * Sets the value of the clinicalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setClinicalInformation(org.hl7.fhir.String value) {
        this.clinicalInformation = value;
    }

    /**
     * Gets the value of the procedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    @OneToMany(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROCEDURE__IMAGINGSTUDY_HJID")
    public List<Coding> getProcedure() {
        if (procedure == null) {
            procedure = new ArrayList<Coding>();
        }
        return this.procedure;
    }

    /**
     * 
     * 
     */
    public void setProcedure(List<Coding> procedure) {
        this.procedure = procedure;
    }

    /**
     * Gets the value of the interpreter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INTERPRETER_IMAGINGSTUDY_HJID")
    public ResourceReference getInterpreter() {
        return interpreter;
    }

    /**
     * Sets the value of the interpreter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setInterpreter(ResourceReference value) {
        this.interpreter = value;
    }

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
    @JoinColumn(name = "DESCRIPTION_IMAGINGSTUDY_HJID")
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
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagingStudySeries }
     * 
     * 
     */
    @OneToMany(targetEntity = ImagingStudySeries.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SERIES_IMAGINGSTUDY_HJID")
    public List<ImagingStudySeries> getSeries() {
        if (series == null) {
            series = new ArrayList<ImagingStudySeries>();
        }
        return this.series;
    }

    /**
     * 
     * 
     */
    public void setSeries(List<ImagingStudySeries> series) {
        this.series = series;
    }

    public ImagingStudy withDateTime(DateTime value) {
        setDateTime(value);
        return this;
    }

    public ImagingStudy withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public ImagingStudy withUid(Oid value) {
        setUid(value);
        return this;
    }

    public ImagingStudy withAccessionNo(Identifier value) {
        setAccessionNo(value);
        return this;
    }

    public ImagingStudy withIdentifier(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifier().add(value);
            }
        }
        return this;
    }

    public ImagingStudy withIdentifier(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifier().addAll(values);
        }
        return this;
    }

    public ImagingStudy withIdentifier(List<Identifier> identifier) {
        setIdentifier(identifier);
        return this;
    }

    public ImagingStudy withOrder(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getOrder().add(value);
            }
        }
        return this;
    }

    public ImagingStudy withOrder(Collection<ResourceReference> values) {
        if (values!= null) {
            getOrder().addAll(values);
        }
        return this;
    }

    public ImagingStudy withOrder(List<ResourceReference> order) {
        setOrder(order);
        return this;
    }

    public ImagingStudy withModality(ImagingModality... values) {
        if (values!= null) {
            for (ImagingModality value: values) {
                getModality().add(value);
            }
        }
        return this;
    }

    public ImagingStudy withModality(Collection<ImagingModality> values) {
        if (values!= null) {
            getModality().addAll(values);
        }
        return this;
    }

    public ImagingStudy withModality(List<ImagingModality> modality) {
        setModality(modality);
        return this;
    }

    public ImagingStudy withReferrer(ResourceReference value) {
        setReferrer(value);
        return this;
    }

    public ImagingStudy withAvailability(InstanceAvailability value) {
        setAvailability(value);
        return this;
    }

    public ImagingStudy withUrl(Uri value) {
        setUrl(value);
        return this;
    }

    public ImagingStudy withNumberOfSeries(Integer value) {
        setNumberOfSeries(value);
        return this;
    }

    public ImagingStudy withNumberOfInstances(Integer value) {
        setNumberOfInstances(value);
        return this;
    }

    public ImagingStudy withClinicalInformation(org.hl7.fhir.String value) {
        setClinicalInformation(value);
        return this;
    }

    public ImagingStudy withProcedure(Coding... values) {
        if (values!= null) {
            for (Coding value: values) {
                getProcedure().add(value);
            }
        }
        return this;
    }

    public ImagingStudy withProcedure(Collection<Coding> values) {
        if (values!= null) {
            getProcedure().addAll(values);
        }
        return this;
    }

    public ImagingStudy withProcedure(List<Coding> procedure) {
        setProcedure(procedure);
        return this;
    }

    public ImagingStudy withInterpreter(ResourceReference value) {
        setInterpreter(value);
        return this;
    }

    public ImagingStudy withDescription(org.hl7.fhir.String value) {
        setDescription(value);
        return this;
    }

    public ImagingStudy withSeries(ImagingStudySeries... values) {
        if (values!= null) {
            for (ImagingStudySeries value: values) {
                getSeries().add(value);
            }
        }
        return this;
    }

    public ImagingStudy withSeries(Collection<ImagingStudySeries> values) {
        if (values!= null) {
            getSeries().addAll(values);
        }
        return this;
    }

    public ImagingStudy withSeries(List<ImagingStudySeries> series) {
        setSeries(series);
        return this;
    }

    @Override
    public ImagingStudy withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public ImagingStudy withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public ImagingStudy withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public ImagingStudy withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public ImagingStudy withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public ImagingStudy withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ImagingStudy withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ImagingStudy withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public ImagingStudy withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ImagingStudy withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ImagingStudy withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public ImagingStudy withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImagingStudy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ImagingStudy that = ((ImagingStudy) object);
        {
            DateTime lhsDateTime;
            lhsDateTime = this.getDateTime();
            DateTime rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime)) {
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
            Oid lhsUid;
            lhsUid = this.getUid();
            Oid rhsUid;
            rhsUid = that.getUid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uid", lhsUid), LocatorUtils.property(thatLocator, "uid", rhsUid), lhsUid, rhsUid)) {
                return false;
            }
        }
        {
            Identifier lhsAccessionNo;
            lhsAccessionNo = this.getAccessionNo();
            Identifier rhsAccessionNo;
            rhsAccessionNo = that.getAccessionNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessionNo", lhsAccessionNo), LocatorUtils.property(thatLocator, "accessionNo", rhsAccessionNo), lhsAccessionNo, rhsAccessionNo)) {
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
            List<ResourceReference> lhsOrder;
            lhsOrder = (((this.order!= null)&&(!this.order.isEmpty()))?this.getOrder():null);
            List<ResourceReference> rhsOrder;
            rhsOrder = (((that.order!= null)&&(!that.order.isEmpty()))?that.getOrder():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "order", lhsOrder), LocatorUtils.property(thatLocator, "order", rhsOrder), lhsOrder, rhsOrder)) {
                return false;
            }
        }
        {
            List<ImagingModality> lhsModality;
            lhsModality = (((this.modality!= null)&&(!this.modality.isEmpty()))?this.getModality():null);
            List<ImagingModality> rhsModality;
            rhsModality = (((that.modality!= null)&&(!that.modality.isEmpty()))?that.getModality():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modality", lhsModality), LocatorUtils.property(thatLocator, "modality", rhsModality), lhsModality, rhsModality)) {
                return false;
            }
        }
        {
            ResourceReference lhsReferrer;
            lhsReferrer = this.getReferrer();
            ResourceReference rhsReferrer;
            rhsReferrer = that.getReferrer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referrer", lhsReferrer), LocatorUtils.property(thatLocator, "referrer", rhsReferrer), lhsReferrer, rhsReferrer)) {
                return false;
            }
        }
        {
            InstanceAvailability lhsAvailability;
            lhsAvailability = this.getAvailability();
            InstanceAvailability rhsAvailability;
            rhsAvailability = that.getAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availability", lhsAvailability), LocatorUtils.property(thatLocator, "availability", rhsAvailability), lhsAvailability, rhsAvailability)) {
                return false;
            }
        }
        {
            Uri lhsUrl;
            lhsUrl = this.getUrl();
            Uri rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
                return false;
            }
        }
        {
            Integer lhsNumberOfSeries;
            lhsNumberOfSeries = this.getNumberOfSeries();
            Integer rhsNumberOfSeries;
            rhsNumberOfSeries = that.getNumberOfSeries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfSeries", lhsNumberOfSeries), LocatorUtils.property(thatLocator, "numberOfSeries", rhsNumberOfSeries), lhsNumberOfSeries, rhsNumberOfSeries)) {
                return false;
            }
        }
        {
            Integer lhsNumberOfInstances;
            lhsNumberOfInstances = this.getNumberOfInstances();
            Integer rhsNumberOfInstances;
            rhsNumberOfInstances = that.getNumberOfInstances();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfInstances", lhsNumberOfInstances), LocatorUtils.property(thatLocator, "numberOfInstances", rhsNumberOfInstances), lhsNumberOfInstances, rhsNumberOfInstances)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsClinicalInformation;
            lhsClinicalInformation = this.getClinicalInformation();
            org.hl7.fhir.String rhsClinicalInformation;
            rhsClinicalInformation = that.getClinicalInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clinicalInformation", lhsClinicalInformation), LocatorUtils.property(thatLocator, "clinicalInformation", rhsClinicalInformation), lhsClinicalInformation, rhsClinicalInformation)) {
                return false;
            }
        }
        {
            List<Coding> lhsProcedure;
            lhsProcedure = (((this.procedure!= null)&&(!this.procedure.isEmpty()))?this.getProcedure():null);
            List<Coding> rhsProcedure;
            rhsProcedure = (((that.procedure!= null)&&(!that.procedure.isEmpty()))?that.getProcedure():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procedure", lhsProcedure), LocatorUtils.property(thatLocator, "procedure", rhsProcedure), lhsProcedure, rhsProcedure)) {
                return false;
            }
        }
        {
            ResourceReference lhsInterpreter;
            lhsInterpreter = this.getInterpreter();
            ResourceReference rhsInterpreter;
            rhsInterpreter = that.getInterpreter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interpreter", lhsInterpreter), LocatorUtils.property(thatLocator, "interpreter", rhsInterpreter), lhsInterpreter, rhsInterpreter)) {
                return false;
            }
        }
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
            List<ImagingStudySeries> lhsSeries;
            lhsSeries = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            List<ImagingStudySeries> rhsSeries;
            rhsSeries = (((that.series!= null)&&(!that.series.isEmpty()))?that.getSeries():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "series", lhsSeries), LocatorUtils.property(thatLocator, "series", rhsSeries), lhsSeries, rhsSeries)) {
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
            DateTime theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            Oid theUid;
            theUid = this.getUid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uid", theUid), currentHashCode, theUid);
        }
        {
            Identifier theAccessionNo;
            theAccessionNo = this.getAccessionNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessionNo", theAccessionNo), currentHashCode, theAccessionNo);
        }
        {
            List<Identifier> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            List<ResourceReference> theOrder;
            theOrder = (((this.order!= null)&&(!this.order.isEmpty()))?this.getOrder():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "order", theOrder), currentHashCode, theOrder);
        }
        {
            List<ImagingModality> theModality;
            theModality = (((this.modality!= null)&&(!this.modality.isEmpty()))?this.getModality():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modality", theModality), currentHashCode, theModality);
        }
        {
            ResourceReference theReferrer;
            theReferrer = this.getReferrer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referrer", theReferrer), currentHashCode, theReferrer);
        }
        {
            InstanceAvailability theAvailability;
            theAvailability = this.getAvailability();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availability", theAvailability), currentHashCode, theAvailability);
        }
        {
            Uri theUrl;
            theUrl = this.getUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl);
        }
        {
            Integer theNumberOfSeries;
            theNumberOfSeries = this.getNumberOfSeries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfSeries", theNumberOfSeries), currentHashCode, theNumberOfSeries);
        }
        {
            Integer theNumberOfInstances;
            theNumberOfInstances = this.getNumberOfInstances();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfInstances", theNumberOfInstances), currentHashCode, theNumberOfInstances);
        }
        {
            org.hl7.fhir.String theClinicalInformation;
            theClinicalInformation = this.getClinicalInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clinicalInformation", theClinicalInformation), currentHashCode, theClinicalInformation);
        }
        {
            List<Coding> theProcedure;
            theProcedure = (((this.procedure!= null)&&(!this.procedure.isEmpty()))?this.getProcedure():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procedure", theProcedure), currentHashCode, theProcedure);
        }
        {
            ResourceReference theInterpreter;
            theInterpreter = this.getInterpreter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interpreter", theInterpreter), currentHashCode, theInterpreter);
        }
        {
            org.hl7.fhir.String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            List<ImagingStudySeries> theSeries;
            theSeries = (((this.series!= null)&&(!this.series.isEmpty()))?this.getSeries():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "series", theSeries), currentHashCode, theSeries);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
