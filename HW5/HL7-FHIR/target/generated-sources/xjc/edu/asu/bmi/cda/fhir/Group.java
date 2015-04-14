//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
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
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}GroupType"/&gt;
 *         &lt;element name="actual" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="characteristic" type="{http://hl7.org/fhir}Group.Characteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="member" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "identifier",
    "type",
    "actual",
    "code",
    "name",
    "quantity",
    "characteristics",
    "members"
})
@XmlRootElement(name = "Group")
public class Group
    extends Resource
    implements Serializable
{

    protected Identifier identifier;
    @XmlElement(required = true)
    protected GroupType type;
    @XmlElement(required = true)
    protected Boolean actual;
    protected CodeableConcept code;
    protected edu.asu.bmi.cda.fhir.String name;
    protected Integer quantity;
    @XmlElement(name = "characteristic")
    protected List<GroupCharacteristic> characteristics;
    @XmlElement(name = "member")
    protected List<ResourceReference> members;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setType(GroupType value) {
        this.type = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActual(Boolean value) {
        this.actual = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public edu.asu.bmi.cda.fhir.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.asu.bmi.cda.fhir.String }
     *     
     */
    public void setName(edu.asu.bmi.cda.fhir.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupCharacteristic }
     * 
     * 
     */
    public List<GroupCharacteristic> getCharacteristics() {
        if (characteristics == null) {
            characteristics = new ArrayList<GroupCharacteristic>();
        }
        return this.characteristics;
    }

    /**
     * Gets the value of the members property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the members property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getMembers() {
        if (members == null) {
            members = new ArrayList<ResourceReference>();
        }
        return this.members;
    }

    public Group withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public Group withType(GroupType value) {
        setType(value);
        return this;
    }

    public Group withActual(Boolean value) {
        setActual(value);
        return this;
    }

    public Group withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public Group withName(edu.asu.bmi.cda.fhir.String value) {
        setName(value);
        return this;
    }

    public Group withQuantity(Integer value) {
        setQuantity(value);
        return this;
    }

    public Group withCharacteristics(GroupCharacteristic... values) {
        if (values!= null) {
            for (GroupCharacteristic value: values) {
                getCharacteristics().add(value);
            }
        }
        return this;
    }

    public Group withCharacteristics(Collection<GroupCharacteristic> values) {
        if (values!= null) {
            getCharacteristics().addAll(values);
        }
        return this;
    }

    public Group withMembers(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getMembers().add(value);
            }
        }
        return this;
    }

    public Group withMembers(Collection<ResourceReference> values) {
        if (values!= null) {
            getMembers().addAll(values);
        }
        return this;
    }

    @Override
    public Group withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Group withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Group withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Group withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Group withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Group withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Group withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Group withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Group withId(java.lang.String value) {
        setId(value);
        return this;
    }

}