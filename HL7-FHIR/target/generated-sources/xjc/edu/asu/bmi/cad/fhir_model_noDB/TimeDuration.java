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
 * <p>Java class for Duration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Duration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://hl7.org/fhir}Quantity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://hl7.org/fhir}decimal" minOccurs="0"/&gt;
 *         &lt;element name="comparator" type="{http://hl7.org/fhir}QuantityCompararator" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duration")
public class TimeDuration
    extends Quantity
    implements Serializable
{


    @Override
    public TimeDuration withValue(Decimal value) {
        setValue(value);
        return this;
    }

    @Override
    public TimeDuration withComparator(QuantityCompararator value) {
        setComparator(value);
        return this;
    }

    @Override
    public TimeDuration withUnits(edu.asu.bmi.cad.fhir_model_noDB.String value) {
        setUnits(value);
        return this;
    }

    @Override
    public TimeDuration withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    @Override
    public TimeDuration withCode(Code value) {
        setCode(value);
        return this;
    }

    @Override
    public TimeDuration withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public TimeDuration withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public TimeDuration withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
