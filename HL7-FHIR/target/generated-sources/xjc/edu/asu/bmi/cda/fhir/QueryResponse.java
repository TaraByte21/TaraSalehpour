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
 * A description of a query with a set of parameters.
 * 
 * <p>Java class for Query.Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Query.Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}uri"/&gt;
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}QueryOutcome"/&gt;
 *         &lt;element name="total" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="first" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="previous" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="next" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="last" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query.Response", propOrder = {
    "identifier",
    "outcome",
    "total",
    "parameters",
    "firsts",
    "previouses",
    "nexts",
    "lasts",
    "references"
})
public class QueryResponse
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Uri identifier;
    @XmlElement(required = true)
    protected QueryOutcome outcome;
    protected Integer total;
    @XmlElement(name = "parameter")
    protected List<Extension> parameters;
    @XmlElement(name = "first")
    protected List<Extension> firsts;
    @XmlElement(name = "previous")
    protected List<Extension> previouses;
    @XmlElement(name = "next")
    protected List<Extension> nexts;
    @XmlElement(name = "last")
    protected List<Extension> lasts;
    @XmlElement(name = "reference")
    protected List<ResourceReference> references;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setIdentifier(Uri value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOutcome }
     *     
     */
    public QueryOutcome getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOutcome }
     *     
     */
    public void setOutcome(QueryOutcome value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Extension>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the firsts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firsts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirsts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getFirsts() {
        if (firsts == null) {
            firsts = new ArrayList<Extension>();
        }
        return this.firsts;
    }

    /**
     * Gets the value of the previouses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previouses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviouses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getPreviouses() {
        if (previouses == null) {
            previouses = new ArrayList<Extension>();
        }
        return this.previouses;
    }

    /**
     * Gets the value of the nexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getNexts() {
        if (nexts == null) {
            nexts = new ArrayList<Extension>();
        }
        return this.nexts;
    }

    /**
     * Gets the value of the lasts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lasts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLasts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getLasts() {
        if (lasts == null) {
            lasts = new ArrayList<Extension>();
        }
        return this.lasts;
    }

    /**
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getReferences() {
        if (references == null) {
            references = new ArrayList<ResourceReference>();
        }
        return this.references;
    }

    public QueryResponse withIdentifier(Uri value) {
        setIdentifier(value);
        return this;
    }

    public QueryResponse withOutcome(QueryOutcome value) {
        setOutcome(value);
        return this;
    }

    public QueryResponse withTotal(Integer value) {
        setTotal(value);
        return this;
    }

    public QueryResponse withParameters(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getParameters().add(value);
            }
        }
        return this;
    }

    public QueryResponse withParameters(Collection<Extension> values) {
        if (values!= null) {
            getParameters().addAll(values);
        }
        return this;
    }

    public QueryResponse withFirsts(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getFirsts().add(value);
            }
        }
        return this;
    }

    public QueryResponse withFirsts(Collection<Extension> values) {
        if (values!= null) {
            getFirsts().addAll(values);
        }
        return this;
    }

    public QueryResponse withPreviouses(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getPreviouses().add(value);
            }
        }
        return this;
    }

    public QueryResponse withPreviouses(Collection<Extension> values) {
        if (values!= null) {
            getPreviouses().addAll(values);
        }
        return this;
    }

    public QueryResponse withNexts(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getNexts().add(value);
            }
        }
        return this;
    }

    public QueryResponse withNexts(Collection<Extension> values) {
        if (values!= null) {
            getNexts().addAll(values);
        }
        return this;
    }

    public QueryResponse withLasts(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getLasts().add(value);
            }
        }
        return this;
    }

    public QueryResponse withLasts(Collection<Extension> values) {
        if (values!= null) {
            getLasts().addAll(values);
        }
        return this;
    }

    public QueryResponse withReferences(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getReferences().add(value);
            }
        }
        return this;
    }

    public QueryResponse withReferences(Collection<ResourceReference> values) {
        if (values!= null) {
            getReferences().addAll(values);
        }
        return this;
    }

    @Override
    public QueryResponse withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public QueryResponse withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public QueryResponse withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public QueryResponse withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public QueryResponse withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
