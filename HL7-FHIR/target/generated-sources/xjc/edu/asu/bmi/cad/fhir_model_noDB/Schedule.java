//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 10:25:06 PM MST 
//


package edu.asu.bmi.cad.fhir_model_noDB;

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
 * <p>Java class for Schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="event" type="{http://hl7.org/fhir}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="repeat" type="{http://hl7.org/fhir}Schedule.Repeat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule", propOrder = {
    "events",
    "repeat"
})
public class Schedule
    extends Element
    implements Serializable
{

    @XmlElement(name = "event")
    protected List<Period> events;
    protected ScheduleRepeat repeat;

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getEvents() {
        if (events == null) {
            events = new ArrayList<Period>();
        }
        return this.events;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleRepeat }
     *     
     */
    public ScheduleRepeat getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleRepeat }
     *     
     */
    public void setRepeat(ScheduleRepeat value) {
        this.repeat = value;
    }

    public Schedule withEvents(Period... values) {
        if (values!= null) {
            for (Period value: values) {
                getEvents().add(value);
            }
        }
        return this;
    }

    public Schedule withEvents(Collection<Period> values) {
        if (values!= null) {
            getEvents().addAll(values);
        }
        return this;
    }

    public Schedule withRepeat(ScheduleRepeat value) {
        setRepeat(value);
        return this;
    }

    @Override
    public Schedule withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Schedule withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Schedule withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
