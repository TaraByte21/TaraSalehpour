//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Immunization event information.
 * 
 * <p>Java class for Immunization.Reaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Immunization.Reaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="reported" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immunization.Reaction", propOrder = {
    "date",
    "detail",
    "reported"
})
public class ImmunizationReaction
    extends BackboneElement
    implements Serializable
{

    protected DateTime date;
    protected ResourceReference detail;
    protected Boolean reported;

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
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
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
     * Gets the value of the reported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReported() {
        return reported;
    }

    /**
     * Sets the value of the reported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReported(Boolean value) {
        this.reported = value;
    }

    public ImmunizationReaction withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public ImmunizationReaction withDetail(ResourceReference value) {
        setDetail(value);
        return this;
    }

    public ImmunizationReaction withReported(Boolean value) {
        setReported(value);
        return this;
    }

    @Override
    public ImmunizationReaction withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationReaction withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationReaction withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationReaction withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationReaction withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
