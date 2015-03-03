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
import javax.xml.bind.annotation.XmlType;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Include complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Include"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri"/&gt;
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://hl7.org/fhir}ValueSet.Filter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Include", propOrder = {
    "system",
    "version",
    "codes",
    "filters"
})
public class ValueSetInclude
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Uri system;
    protected edu.asu.bmi.cda.fhir.String version;
    @XmlElement(name = "code")
    protected List<Code> codes;
    @XmlElement(name = "filter")
    protected List<ValueSetFilter> filters;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setVersion(edu.asu.bmi.cda.fhir.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getCodes() {
        if (codes == null) {
            codes = new ArrayList<Code>();
        }
        return this.codes;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetFilter }
     * 
     * 
     */
    public List<ValueSetFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<ValueSetFilter>();
        }
        return this.filters;
    }

    public ValueSetInclude withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    public ValueSetInclude withVersion(edu.asu.bmi.cda.fhir.String value) {
        setVersion(value);
        return this;
    }

    public ValueSetInclude withCodes(Code... values) {
        if (values!= null) {
            for (Code value: values) {
                getCodes().add(value);
            }
        }
        return this;
    }

    public ValueSetInclude withCodes(Collection<Code> values) {
        if (values!= null) {
            getCodes().addAll(values);
        }
        return this;
    }

    public ValueSetInclude withFilters(ValueSetFilter... values) {
        if (values!= null) {
            for (ValueSetFilter value: values) {
                getFilters().add(value);
            }
        }
        return this;
    }

    public ValueSetInclude withFilters(Collection<ValueSetFilter> values) {
        if (values!= null) {
            getFilters().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetInclude withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetInclude withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetInclude withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetInclude withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetInclude withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
