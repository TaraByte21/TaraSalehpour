//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Schedule.Repeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule.Repeat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="when" type="{http://hl7.org/fhir}EventTiming" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://hl7.org/fhir}decimal"/>
 *         &lt;element name="units" type="{http://hl7.org/fhir}UnitsOfTime"/>
 *         &lt;element name="count" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
@Entity(name = "ScheduleRepeat")
@Table(name = "SCHEDULEREPEAT")
public class ScheduleRepeat
    extends Element
    implements Equals, HashCode
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
    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FREQUENCY_SCHEDULEREPEAT_HJID")
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
    @ManyToOne(targetEntity = EventTiming.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WHEN__SCHEDULEREPEAT_HJID")
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
    @ManyToOne(targetEntity = Decimal.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DURATION_SCHEDULEREPEAT_HJID")
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
    @ManyToOne(targetEntity = UnitsOfTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "UNITS_SCHEDULEREPEAT_HJID")
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
    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COUNT__SCHEDULEREPEAT_HJID")
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
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "END__SCHEDULEREPEAT_HJID")
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
    public ScheduleRepeat withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ScheduleRepeat withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ScheduleRepeat withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public ScheduleRepeat withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ScheduleRepeat)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ScheduleRepeat that = ((ScheduleRepeat) object);
        {
            Integer lhsFrequency;
            lhsFrequency = this.getFrequency();
            Integer rhsFrequency;
            rhsFrequency = that.getFrequency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequency", lhsFrequency), LocatorUtils.property(thatLocator, "frequency", rhsFrequency), lhsFrequency, rhsFrequency)) {
                return false;
            }
        }
        {
            EventTiming lhsWhen;
            lhsWhen = this.getWhen();
            EventTiming rhsWhen;
            rhsWhen = that.getWhen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "when", lhsWhen), LocatorUtils.property(thatLocator, "when", rhsWhen), lhsWhen, rhsWhen)) {
                return false;
            }
        }
        {
            Decimal lhsDuration;
            lhsDuration = this.getDuration();
            Decimal rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration)) {
                return false;
            }
        }
        {
            UnitsOfTime lhsUnits;
            lhsUnits = this.getUnits();
            UnitsOfTime rhsUnits;
            rhsUnits = that.getUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "units", lhsUnits), LocatorUtils.property(thatLocator, "units", rhsUnits), lhsUnits, rhsUnits)) {
                return false;
            }
        }
        {
            Integer lhsCount;
            lhsCount = this.getCount();
            Integer rhsCount;
            rhsCount = that.getCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "count", lhsCount), LocatorUtils.property(thatLocator, "count", rhsCount), lhsCount, rhsCount)) {
                return false;
            }
        }
        {
            DateTime lhsEnd;
            lhsEnd = this.getEnd();
            DateTime rhsEnd;
            rhsEnd = that.getEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "end", lhsEnd), LocatorUtils.property(thatLocator, "end", rhsEnd), lhsEnd, rhsEnd)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Integer theFrequency;
            theFrequency = this.getFrequency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequency", theFrequency), currentHashCode, theFrequency);
        }
        {
            EventTiming theWhen;
            theWhen = this.getWhen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "when", theWhen), currentHashCode, theWhen);
        }
        {
            Decimal theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration);
        }
        {
            UnitsOfTime theUnits;
            theUnits = this.getUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "units", theUnits), currentHashCode, theUnits);
        }
        {
            Integer theCount;
            theCount = this.getCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "count", theCount), currentHashCode, theCount);
        }
        {
            DateTime theEnd;
            theEnd = this.getEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "end", theEnd), currentHashCode, theEnd);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
