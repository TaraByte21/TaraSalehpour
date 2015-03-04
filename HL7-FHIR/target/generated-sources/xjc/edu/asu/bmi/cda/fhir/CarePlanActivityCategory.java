//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/CarePlanActivityCategory.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/CarePlanActivityCategory.java
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
 * <p>Java class for CarePlanActivityCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlanActivityCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;attribute name="value" type="{http://hl7.org/fhir}CarePlanActivityCategory-list" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlanActivityCategory")
public class CarePlanActivityCategory
    extends Element
    implements Serializable
{

    @XmlAttribute(name = "value")
    protected CarePlanActivityCategoryList value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanActivityCategoryList }
     *     
     */
    public CarePlanActivityCategoryList getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanActivityCategoryList }
     *     
     */
    public void setValue(CarePlanActivityCategoryList value) {
        this.value = value;
    }

    public CarePlanActivityCategory withValue(CarePlanActivityCategoryList value) {
        setValue(value);
        return this;
    }

    @Override
    public CarePlanActivityCategory withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CarePlanActivityCategory withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CarePlanActivityCategory withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
