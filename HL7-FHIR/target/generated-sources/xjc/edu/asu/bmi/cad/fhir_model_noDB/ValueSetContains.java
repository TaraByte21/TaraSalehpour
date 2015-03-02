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
import javax.xml.bind.annotation.XmlType;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Contains complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Contains"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *         &lt;element name="display" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="contains" type="{http://hl7.org/fhir}ValueSet.Contains" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Contains", propOrder = {
    "system",
    "code",
    "display",
    "contains"
})
public class ValueSetContains
    extends BackboneElement
    implements Serializable
{

    protected Uri system;
    protected Code code;
    protected edu.asu.bmi.cad.fhir_model_noDB.String display;
    protected List<ValueSetContains> contains;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSystem(Uri value) {
        this.system = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public edu.asu.bmi.cad.fhir_model_noDB.String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cad.fhir_model_noDB.String }
     *     
     */
    public void setDisplay(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        this.display = value;
    }

    /**
     * Gets the value of the contains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetContains }
     * 
     * 
     */
    public List<ValueSetContains> getContains() {
        if (contains == null) {
            contains = new ArrayList<ValueSetContains>();
        }
        return this.contains;
    }

    public ValueSetContains withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    public ValueSetContains withCode(Code value) {
        setCode(value);
        return this;
    }

    public ValueSetContains withDisplay(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        setDisplay(value);
        return this;
    }

    public ValueSetContains withContains(ValueSetContains... values) {
        if (values!= null) {
            for (ValueSetContains value: values) {
                getContains().add(value);
            }
        }
        return this;
    }

    public ValueSetContains withContains(Collection<ValueSetContains> values) {
        if (values!= null) {
            getContains().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetContains withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetContains withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetContains withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetContains withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetContains withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
