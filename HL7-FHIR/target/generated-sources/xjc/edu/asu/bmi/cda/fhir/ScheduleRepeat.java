//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/ScheduleRepeat.java
// Generated on: 2015.03.03 at 01:43:53 PM MST 
=======
// Generated on: 2015.03.01 at 11:08:02 PM MST 
>>>>>>> a3028c6592c87e58f7d16b2817f47aa4bc494a67:HL7-FHIR/target/generated-sources/xjc/edu/asu/bmi/cda/fhir/ScheduleRepeat.java
//


package edu.asu.bmi.cda.fhir;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Schedule.Repeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule.Repeat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequency" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="when" type="{http://hl7.org/fhir}EventTiming" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://hl7.org/fhir}decimal"/&gt;
 *         &lt;element name="units" type="{http://hl7.org/fhir}UnitsOfTime"/&gt;
 *         &lt;element name="count" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule.Repeat", propOrder = {
    "frequency",
    "when",
    "duration",
    "units",
    "count",
    "end"
})
public class ScheduleRepeat
    extends Element
    implements Serializable
{

    protected Integer frequency;
    protected EventTiming when;
    @XmlElement(required = true)
    protected Decimal duration;
    @XmlElement(required = true)
    protected UnitsOfTime units;
    protected Integer count;
    protected DateTime end;

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequency(Integer value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link EventTiming }
     *     
     */
    public EventTiming getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTiming }
     *     
     */
    public void setWhen(EventTiming value) {
        this.when = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setDuration(Decimal value) {
        this.duration = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOfTime }
     *     
     */
    public UnitsOfTime getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOfTime }
     *     
     */
    public void setUnits(UnitsOfTime value) {
        this.units = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEnd(DateTime value) {
        this.end = value;
    }

    public ScheduleRepeat withFrequency(Integer value) {
        setFrequency(value);
        return this;
    }

    public ScheduleRepeat withWhen(EventTiming value) {
        setWhen(value);
        return this;
    }

    public ScheduleRepeat withDuration(Decimal value) {
        setDuration(value);
        return this;
    }

    public ScheduleRepeat withUnits(UnitsOfTime value) {
        setUnits(value);
        return this;
    }

    public ScheduleRepeat withCount(Integer value) {
        setCount(value);
        return this;
    }

    public ScheduleRepeat withEnd(DateTime value) {
        setEnd(value);
        return this;
    }

    @Override
    public ScheduleRepeat withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ScheduleRepeat withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ScheduleRepeat withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
