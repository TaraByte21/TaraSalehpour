//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:21:42 PM MST 
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
 * <p>Java class for AdverseReaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdverseReaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="didNotOccurFlag" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="recorder" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="symptom" type="{http://hl7.org/fhir}AdverseReaction.Symptom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exposure" type="{http://hl7.org/fhir}AdverseReaction.Exposure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdverseReaction", propOrder = {
    "identifiers",
    "date",
    "subject",
    "didNotOccurFlag",
    "recorder",
    "symptoms",
    "exposures"
})
@XmlRootElement(name = "AdverseReaction")
public class AdverseReaction
    extends Resource
    implements Serializable
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    protected DateTime date;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected Boolean didNotOccurFlag;
    protected ResourceReference recorder;
    @XmlElement(name = "symptom")
    protected List<AdverseReactionSymptom> symptoms;
    @XmlElement(name = "exposure")
    protected List<AdverseReactionExposure> exposures;

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
     * Gets the value of the didNotOccurFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDidNotOccurFlag() {
        return didNotOccurFlag;
    }

    /**
     * Sets the value of the didNotOccurFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDidNotOccurFlag(Boolean value) {
        this.didNotOccurFlag = value;
    }

    /**
     * Gets the value of the recorder property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getRecorder() {
        return recorder;
    }

    /**
     * Sets the value of the recorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setRecorder(ResourceReference value) {
        this.recorder = value;
    }

    /**
     * Gets the value of the symptoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symptoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymptoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdverseReactionSymptom }
     * 
     * 
     */
    public List<AdverseReactionSymptom> getSymptoms() {
        if (symptoms == null) {
            symptoms = new ArrayList<AdverseReactionSymptom>();
        }
        return this.symptoms;
    }

    /**
     * Gets the value of the exposures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exposures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExposures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdverseReactionExposure }
     * 
     * 
     */
    public List<AdverseReactionExposure> getExposures() {
        if (exposures == null) {
            exposures = new ArrayList<AdverseReactionExposure>();
        }
        return this.exposures;
    }

    public AdverseReaction withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public AdverseReaction withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public AdverseReaction withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public AdverseReaction withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public AdverseReaction withDidNotOccurFlag(Boolean value) {
        setDidNotOccurFlag(value);
        return this;
    }

    public AdverseReaction withRecorder(ResourceReference value) {
        setRecorder(value);
        return this;
    }

    public AdverseReaction withSymptoms(AdverseReactionSymptom... values) {
        if (values!= null) {
            for (AdverseReactionSymptom value: values) {
                getSymptoms().add(value);
            }
        }
        return this;
    }

    public AdverseReaction withSymptoms(Collection<AdverseReactionSymptom> values) {
        if (values!= null) {
            getSymptoms().addAll(values);
        }
        return this;
    }

    public AdverseReaction withExposures(AdverseReactionExposure... values) {
        if (values!= null) {
            for (AdverseReactionExposure value: values) {
                getExposures().add(value);
            }
        }
        return this;
    }

    public AdverseReaction withExposures(Collection<AdverseReactionExposure> values) {
        if (values!= null) {
            getExposures().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReaction withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public AdverseReaction withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public AdverseReaction withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReaction withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReaction withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReaction withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReaction withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReaction withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReaction withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
