//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 01:43:53 PM MST 
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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for HumanName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HumanName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="use" type="{http://hl7.org/fhir}NameUse" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="family" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="given" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="prefix" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="suffix" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "HumanName", propOrder = {
    "use",
    "text",
    "families",
    "givens",
    "prefixes",
    "suffixes",
    "period"
})
public class HumanName
    extends Element
    implements Serializable
{

    protected NameUse use;
    protected edu.asu.bmi.cda.fhir.String text;
    @XmlElement(name = "family")
    protected List<edu.asu.bmi.cda.fhir.String> families;
    @XmlElement(name = "given")
    protected List<edu.asu.bmi.cda.fhir.String> givens;
    @XmlElement(name = "prefix")
    protected List<edu.asu.bmi.cda.fhir.String> prefixes;
    @XmlElement(name = "suffix")
    protected List<edu.asu.bmi.cda.fhir.String> suffixes;
    protected Period period;

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link NameUse }
     *     
     */
    public NameUse getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameUse }
     *     
     */
    public void setUse(NameUse value) {
        this.use = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setText(edu.asu.bmi.cda.fhir.String value) {
        this.text = value;
    }

    /**
     * Gets the value of the families property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the families property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link edu.asu.bmi.cda.fhir.String }
     * 
     * 
     */
    public List<edu.asu.bmi.cda.fhir.String> getFamilies() {
        if (families == null) {
            families = new ArrayList<edu.asu.bmi.cda.fhir.String>();
        }
        return this.families;
    }

    /**
     * Gets the value of the givens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link edu.asu.bmi.cda.fhir.String }
     * 
     * 
     */
    public List<edu.asu.bmi.cda.fhir.String> getGivens() {
        if (givens == null) {
            givens = new ArrayList<edu.asu.bmi.cda.fhir.String>();
        }
        return this.givens;
    }

    /**
     * Gets the value of the prefixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link edu.asu.bmi.cda.fhir.String }
     * 
     * 
     */
    public List<edu.asu.bmi.cda.fhir.String> getPrefixes() {
        if (prefixes == null) {
            prefixes = new ArrayList<edu.asu.bmi.cda.fhir.String>();
        }
        return this.prefixes;
    }

    /**
     * Gets the value of the suffixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suffixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link edu.asu.bmi.cda.fhir.String }
     * 
     * 
     */
    public List<edu.asu.bmi.cda.fhir.String> getSuffixes() {
        if (suffixes == null) {
            suffixes = new ArrayList<edu.asu.bmi.cda.fhir.String>();
        }
        return this.suffixes;
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

    public HumanName withUse(NameUse value) {
        setUse(value);
        return this;
    }

    public HumanName withText(edu.asu.bmi.cda.fhir.String value) {
        setText(value);
        return this;
    }

    public HumanName withFamilies(edu.asu.bmi.cda.fhir.String... values) {
        if (values!= null) {
            for (edu.asu.bmi.cda.fhir.String value: values) {
                getFamilies().add(value);
            }
        }
        return this;
    }

    public HumanName withFamilies(Collection<edu.asu.bmi.cda.fhir.String> values) {
        if (values!= null) {
            getFamilies().addAll(values);
        }
        return this;
    }

    public HumanName withGivens(edu.asu.bmi.cda.fhir.String... values) {
        if (values!= null) {
            for (edu.asu.bmi.cda.fhir.String value: values) {
                getGivens().add(value);
            }
        }
        return this;
    }

    public HumanName withGivens(Collection<edu.asu.bmi.cda.fhir.String> values) {
        if (values!= null) {
            getGivens().addAll(values);
        }
        return this;
    }

    public HumanName withPrefixes(edu.asu.bmi.cda.fhir.String... values) {
        if (values!= null) {
            for (edu.asu.bmi.cda.fhir.String value: values) {
                getPrefixes().add(value);
            }
        }
        return this;
    }

    public HumanName withPrefixes(Collection<edu.asu.bmi.cda.fhir.String> values) {
        if (values!= null) {
            getPrefixes().addAll(values);
        }
        return this;
    }

    public HumanName withSuffixes(edu.asu.bmi.cda.fhir.String... values) {
        if (values!= null) {
            for (edu.asu.bmi.cda.fhir.String value: values) {
                getSuffixes().add(value);
            }
        }
        return this;
    }

    public HumanName withSuffixes(Collection<edu.asu.bmi.cda.fhir.String> values) {
        if (values!= null) {
            getSuffixes().addAll(values);
        }
        return this;
    }

    public HumanName withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    @Override
    public HumanName withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public HumanName withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public HumanName withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
