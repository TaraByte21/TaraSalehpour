//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 10:25:06 PM MST 
//


package edu.asu.bmi.cad.fhir_model_noDB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A patient's point-of-time immunization status and recommendation with optional supporting justification.
 * 
 * <p>Java class for ImmunizationRecommendation.Recommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmunizationRecommendation.Recommendation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/&gt;
 *         &lt;element name="vaccineType" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="doseNumber" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="forecastStatus" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="dateCriterion" type="{http://hl7.org/fhir}ImmunizationRecommendation.DateCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="protocol" type="{http://hl7.org/fhir}ImmunizationRecommendation.Protocol" minOccurs="0"/&gt;
 *         &lt;element name="supportingImmunization" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supportingPatientInformation" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmunizationRecommendation.Recommendation", propOrder = {
    "date",
    "vaccineType",
    "doseNumber",
    "forecastStatus",
    "dateCriterions",
    "protocol",
    "supportingImmunizations",
    "supportingPatientInformations"
})
public class ImmunizationRecommendationRecommendation
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected DateTime date;
    @XmlElement(required = true)
    protected CodeableConcept vaccineType;
    protected Integer doseNumber;
    @XmlElement(required = true)
    protected CodeableConcept forecastStatus;
    @XmlElement(name = "dateCriterion")
    protected List<ImmunizationRecommendationDateCriterion> dateCriterions;
    protected ImmunizationRecommendationProtocol protocol;
    @XmlElement(name = "supportingImmunization")
    protected List<ResourceReference> supportingImmunizations;
    @XmlElement(name = "supportingPatientInformation")
    protected List<ResourceReference> supportingPatientInformations;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the vaccineType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVaccineType() {
        return vaccineType;
    }

    /**
     * Sets the value of the vaccineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVaccineType(CodeableConcept value) {
        this.vaccineType = value;
    }

    /**
     * Gets the value of the doseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoseNumber() {
        return doseNumber;
    }

    /**
     * Sets the value of the doseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoseNumber(Integer value) {
        this.doseNumber = value;
    }

    /**
     * Gets the value of the forecastStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getForecastStatus() {
        return forecastStatus;
    }

    /**
     * Sets the value of the forecastStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setForecastStatus(CodeableConcept value) {
        this.forecastStatus = value;
    }

    /**
     * Gets the value of the dateCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationRecommendationDateCriterion }
     * 
     * 
     */
    public List<ImmunizationRecommendationDateCriterion> getDateCriterions() {
        if (dateCriterions == null) {
            dateCriterions = new ArrayList<ImmunizationRecommendationDateCriterion>();
        }
        return this.dateCriterions;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ImmunizationRecommendationProtocol }
     *     
     */
    public ImmunizationRecommendationProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmunizationRecommendationProtocol }
     *     
     */
    public void setProtocol(ImmunizationRecommendationProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the supportingImmunizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingImmunizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingImmunizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getSupportingImmunizations() {
        if (supportingImmunizations == null) {
            supportingImmunizations = new ArrayList<ResourceReference>();
        }
        return this.supportingImmunizations;
    }

    /**
     * Gets the value of the supportingPatientInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingPatientInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingPatientInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getSupportingPatientInformations() {
        if (supportingPatientInformations == null) {
            supportingPatientInformations = new ArrayList<ResourceReference>();
        }
        return this.supportingPatientInformations;
    }

    public ImmunizationRecommendationRecommendation withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public ImmunizationRecommendationRecommendation withVaccineType(CodeableConcept value) {
        setVaccineType(value);
        return this;
    }

    public ImmunizationRecommendationRecommendation withDoseNumber(Integer value) {
        setDoseNumber(value);
        return this;
    }

    public ImmunizationRecommendationRecommendation withForecastStatus(CodeableConcept value) {
        setForecastStatus(value);
        return this;
    }

    public ImmunizationRecommendationRecommendation withDateCriterions(ImmunizationRecommendationDateCriterion... values) {
        if (values!= null) {
            for (ImmunizationRecommendationDateCriterion value: values) {
                getDateCriterions().add(value);
            }
        }
        return this;
    }

    public ImmunizationRecommendationRecommendation withDateCriterions(Collection<ImmunizationRecommendationDateCriterion> values) {
        if (values!= null) {
            getDateCriterions().addAll(values);
        }
        return this;
    }

    public ImmunizationRecommendationRecommendation withProtocol(ImmunizationRecommendationProtocol value) {
        setProtocol(value);
        return this;
    }

    public ImmunizationRecommendationRecommendation withSupportingImmunizations(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getSupportingImmunizations().add(value);
            }
        }
        return this;
    }

    public ImmunizationRecommendationRecommendation withSupportingImmunizations(Collection<ResourceReference> values) {
        if (values!= null) {
            getSupportingImmunizations().addAll(values);
        }
        return this;
    }

    public ImmunizationRecommendationRecommendation withSupportingPatientInformations(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getSupportingPatientInformations().add(value);
            }
        }
        return this;
    }

    public ImmunizationRecommendationRecommendation withSupportingPatientInformations(Collection<ResourceReference> values) {
        if (values!= null) {
            getSupportingPatientInformations().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationRecommendation withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationRecommendation withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationRecommendation withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationRecommendation withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationRecommendation withId(java.lang.String value) {
        setId(value);
        return this;
    }

}