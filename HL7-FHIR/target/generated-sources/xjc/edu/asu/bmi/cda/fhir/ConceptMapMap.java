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
 * A statement of relationships from one set of concepts to one or more other concept systems.
 * 
 * <p>Java class for ConceptMap.Map complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap.Map"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *         &lt;element name="equivalence" type="{http://hl7.org/fhir}ConceptMapEquivalence"/&gt;
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://hl7.org/fhir}ConceptMap.DependsOn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.Map", propOrder = {
    "system",
    "code",
    "equivalence",
    "comments",
    "products"
})
public class ConceptMapMap
    extends BackboneElement
    implements Serializable
{

    protected Uri system;
    protected Code code;
    @XmlElement(required = true)
    protected ConceptMapEquivalence equivalence;
    protected edu.asu.bmi.cda.fhir.String comments;
    @XmlElement(name = "product")
    protected List<ConceptMapDependsOn> products;

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
     * Gets the value of the equivalence property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    public ConceptMapEquivalence getEquivalence() {
        return equivalence;
    }

    /**
     * Sets the value of the equivalence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    public void setEquivalence(ConceptMapEquivalence value) {
        this.equivalence = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setComments(edu.asu.bmi.cda.fhir.String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapDependsOn }
     * 
     * 
     */
    public List<ConceptMapDependsOn> getProducts() {
        if (products == null) {
            products = new ArrayList<ConceptMapDependsOn>();
        }
        return this.products;
    }

    public ConceptMapMap withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    public ConceptMapMap withCode(Code value) {
        setCode(value);
        return this;
    }

    public ConceptMapMap withEquivalence(ConceptMapEquivalence value) {
        setEquivalence(value);
        return this;
    }

    public ConceptMapMap withComments(edu.asu.bmi.cda.fhir.String value) {
        setComments(value);
        return this;
    }

    public ConceptMapMap withProducts(ConceptMapDependsOn... values) {
        if (values!= null) {
            for (ConceptMapDependsOn value: values) {
                getProducts().add(value);
            }
        }
        return this;
    }

    public ConceptMapMap withProducts(Collection<ConceptMapDependsOn> values) {
        if (values!= null) {
            getProducts().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMapMap withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMapMap withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMapMap withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptMapMap withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptMapMap withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
