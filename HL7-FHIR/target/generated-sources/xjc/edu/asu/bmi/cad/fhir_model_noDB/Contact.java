//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 10:25:06 PM MST 
//


package edu.asu.bmi.cad.fhir_model_noDB;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}ContactSystem" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="use" type="{http://hl7.org/fhir}ContactUse" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "system",
    "value",
    "use",
    "period"
})
public class Contact
    extends Element
    implements Serializable
{

    protected ContactSystem system;
    protected edu.asu.bmi.cad.fhir_model_noDB.String value;
    protected ContactUse use;
    protected Period period;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSystem }
     *     
     */
    public ContactSystem getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSystem }
     *     
     */
    public void setSystem(ContactSystem value) {
        this.system = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public edu.asu.bmi.cad.fhir_model_noDB.String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public void setValue(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        this.value = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link ContactUse }
     *     
     */
    public ContactUse getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactUse }
     *     
     */
    public void setUse(ContactUse value) {
        this.use = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    public Contact withSystem(ContactSystem value) {
        setSystem(value);
        return this;
    }

    public Contact withValue(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        setValue(value);
        return this;
    }

    public Contact withUse(ContactUse value) {
        setUse(value);
        return this;
    }

    public Contact withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    @Override
    public Contact withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Contact withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Contact withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
