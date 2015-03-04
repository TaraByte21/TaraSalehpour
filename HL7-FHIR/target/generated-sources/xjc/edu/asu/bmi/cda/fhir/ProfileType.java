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
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code"/&gt;
 *         &lt;element name="profile" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="aggregation" type="{http://hl7.org/fhir}AggregationMode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Type", propOrder = {
    "code",
    "profile",
    "aggregations"
})
public class ProfileType
    extends BackboneElement
    implements Serializable
{

    @XmlElement(required = true)
    protected Code code;
    protected Uri profile;
    @XmlElement(name = "aggregation")
    protected List<AggregationMode> aggregations;

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
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setProfile(Uri value) {
        this.profile = value;
    }

    /**
     * Gets the value of the aggregations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregationMode }
     * 
     * 
     */
    public List<AggregationMode> getAggregations() {
        if (aggregations == null) {
            aggregations = new ArrayList<AggregationMode>();
        }
        return this.aggregations;
    }

    public ProfileType withCode(Code value) {
        setCode(value);
        return this;
    }

    public ProfileType withProfile(Uri value) {
        setProfile(value);
        return this;
    }

    public ProfileType withAggregations(AggregationMode... values) {
        if (values!= null) {
            for (AggregationMode value: values) {
                getAggregations().add(value);
            }
        }
        return this;
    }

    public ProfileType withAggregations(Collection<AggregationMode> values) {
        if (values!= null) {
            getAggregations().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileType withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileType withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileType withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProfileType withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProfileType withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
