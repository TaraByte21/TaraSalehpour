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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationKind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationKind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;attribute name="value" type="{http://hl7.org/fhir}MedicationKind-list" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationKind")
public class MedicationKind
    extends Element
    implements Serializable
{

    @XmlAttribute(name = "value")
    protected MedicationKindList value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationKindList }
     *     
     */
    public MedicationKindList getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationKindList }
     *     
     */
    public void setValue(MedicationKindList value) {
        this.value = value;
    }

    public MedicationKind withValue(MedicationKindList value) {
        setValue(value);
        return this;
    }

    @Override
    public MedicationKind withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationKind withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationKind withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
