//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 02:48:31 AM MST 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Specimen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specimen">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Specimen.Source" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="accessionIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="receivedTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="collection" type="{http://hl7.org/fhir}Specimen.Collection"/>
 *         &lt;element name="treatment" type="{http://hl7.org/fhir}Specimen.Treatment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="container" type="{http://hl7.org/fhir}Specimen.Container" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen", propOrder = {
    "identifier",
    "type",
    "source",
    "subject",
    "accessionIdentifier",
    "receivedTime",
    "collection",
    "treatment",
    "container"
})
@Entity(name = "Specimen")
@Table(name = "SPECIMEN")
public class Specimen
    extends Resource
    implements Equals, HashCode
{

    protected List<Identifier> identifier;
    protected CodeableConcept type;
    protected List<SpecimenSource> source;
    @XmlElement(required = true)
    protected ResourceReference subject;
    protected Identifier accessionIdentifier;
    protected DateTime receivedTime;
    @XmlElement(required = true)
    protected SpecimenCollection collection;
    protected List<SpecimenTreatment> treatment;
    protected List<SpecimenContainer> container;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_SPECIMEN_HJID")
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * 
     * 
     */
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__SPECIMEN_HJID")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenSource }
     * 
     * 
     */
    @OneToMany(targetEntity = SpecimenSource.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__SPECIMEN_HJID")
    public List<SpecimenSource> getSource() {
        if (source == null) {
            source = new ArrayList<SpecimenSource>();
        }
        return this.source;
    }

    /**
     * 
     * 
     */
    public void setSource(List<SpecimenSource> source) {
        this.source = source;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBJECT_SPECIMEN_HJID")
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the accessionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ACCESSIONIDENTIFIER_SPECIMEN_0")
    public Identifier getAccessionIdentifier() {
        return accessionIdentifier;
    }

    /**
     * Sets the value of the accessionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setAccessionIdentifier(Identifier value) {
        this.accessionIdentifier = value;
    }

    /**
     * Gets the value of the receivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RECEIVEDTIME_SPECIMEN_HJID")
    public DateTime getReceivedTime() {
        return receivedTime;
    }

    /**
     * Sets the value of the receivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setReceivedTime(DateTime value) {
        this.receivedTime = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link SpecimenCollection }
     *     
     */
    @ManyToOne(targetEntity = SpecimenCollection.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COLLECTION_SPECIMEN_HJID")
    public SpecimenCollection getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecimenCollection }
     *     
     */
    public void setCollection(SpecimenCollection value) {
        this.collection = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treatment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreatment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenTreatment }
     * 
     * 
     */
    @OneToMany(targetEntity = SpecimenTreatment.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TREATMENT_SPECIMEN_HJID")
    public List<SpecimenTreatment> getTreatment() {
        if (treatment == null) {
            treatment = new ArrayList<SpecimenTreatment>();
        }
        return this.treatment;
    }

    /**
     * 
     * 
     */
    public void setTreatment(List<SpecimenTreatment> treatment) {
        this.treatment = treatment;
    }

    /**
     * Gets the value of the container property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the container property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenContainer }
     * 
     * 
     */
    @OneToMany(targetEntity = SpecimenContainer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTAINER_SPECIMEN_HJID")
    public List<SpecimenContainer> getContainer() {
        if (container == null) {
            container = new ArrayList<SpecimenContainer>();
        }
        return this.container;
    }

    /**
     * 
     * 
     */
    public void setContainer(List<SpecimenContainer> container) {
        this.container = container;
    }

    public Specimen withIdentifier(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifier().add(value);
            }
        }
        return this;
    }

    public Specimen withIdentifier(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifier().addAll(values);
        }
        return this;
    }

    public Specimen withIdentifier(List<Identifier> identifier) {
        setIdentifier(identifier);
        return this;
    }

    public Specimen withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public Specimen withSource(SpecimenSource... values) {
        if (values!= null) {
            for (SpecimenSource value: values) {
                getSource().add(value);
            }
        }
        return this;
    }

    public Specimen withSource(Collection<SpecimenSource> values) {
        if (values!= null) {
            getSource().addAll(values);
        }
        return this;
    }

    public Specimen withSource(List<SpecimenSource> source) {
        setSource(source);
        return this;
    }

    public Specimen withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public Specimen withAccessionIdentifier(Identifier value) {
        setAccessionIdentifier(value);
        return this;
    }

    public Specimen withReceivedTime(DateTime value) {
        setReceivedTime(value);
        return this;
    }

    public Specimen withCollection(SpecimenCollection value) {
        setCollection(value);
        return this;
    }

    public Specimen withTreatment(SpecimenTreatment... values) {
        if (values!= null) {
            for (SpecimenTreatment value: values) {
                getTreatment().add(value);
            }
        }
        return this;
    }

    public Specimen withTreatment(Collection<SpecimenTreatment> values) {
        if (values!= null) {
            getTreatment().addAll(values);
        }
        return this;
    }

    public Specimen withTreatment(List<SpecimenTreatment> treatment) {
        setTreatment(treatment);
        return this;
    }

    public Specimen withContainer(SpecimenContainer... values) {
        if (values!= null) {
            for (SpecimenContainer value: values) {
                getContainer().add(value);
            }
        }
        return this;
    }

    public Specimen withContainer(Collection<SpecimenContainer> values) {
        if (values!= null) {
            getContainer().addAll(values);
        }
        return this;
    }

    public Specimen withContainer(List<SpecimenContainer> container) {
        setContainer(container);
        return this;
    }

    @Override
    public Specimen withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Specimen withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Specimen withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public Specimen withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public Specimen withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public Specimen withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public Specimen withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public Specimen withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public Specimen withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public Specimen withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public Specimen withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public Specimen withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Specimen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Specimen that = ((Specimen) object);
        {
            List<Identifier> lhsIdentifier;
            lhsIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            List<Identifier> rhsIdentifier;
            rhsIdentifier = (((that.identifier!= null)&&(!that.identifier.isEmpty()))?that.getIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            CodeableConcept lhsType;
            lhsType = this.getType();
            CodeableConcept rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            List<SpecimenSource> lhsSource;
            lhsSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            List<SpecimenSource> rhsSource;
            rhsSource = (((that.source!= null)&&(!that.source.isEmpty()))?that.getSource():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            ResourceReference lhsSubject;
            lhsSubject = this.getSubject();
            ResourceReference rhsSubject;
            rhsSubject = that.getSubject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subject", lhsSubject), LocatorUtils.property(thatLocator, "subject", rhsSubject), lhsSubject, rhsSubject)) {
                return false;
            }
        }
        {
            Identifier lhsAccessionIdentifier;
            lhsAccessionIdentifier = this.getAccessionIdentifier();
            Identifier rhsAccessionIdentifier;
            rhsAccessionIdentifier = that.getAccessionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessionIdentifier", lhsAccessionIdentifier), LocatorUtils.property(thatLocator, "accessionIdentifier", rhsAccessionIdentifier), lhsAccessionIdentifier, rhsAccessionIdentifier)) {
                return false;
            }
        }
        {
            DateTime lhsReceivedTime;
            lhsReceivedTime = this.getReceivedTime();
            DateTime rhsReceivedTime;
            rhsReceivedTime = that.getReceivedTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedTime", lhsReceivedTime), LocatorUtils.property(thatLocator, "receivedTime", rhsReceivedTime), lhsReceivedTime, rhsReceivedTime)) {
                return false;
            }
        }
        {
            SpecimenCollection lhsCollection;
            lhsCollection = this.getCollection();
            SpecimenCollection rhsCollection;
            rhsCollection = that.getCollection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collection", lhsCollection), LocatorUtils.property(thatLocator, "collection", rhsCollection), lhsCollection, rhsCollection)) {
                return false;
            }
        }
        {
            List<SpecimenTreatment> lhsTreatment;
            lhsTreatment = (((this.treatment!= null)&&(!this.treatment.isEmpty()))?this.getTreatment():null);
            List<SpecimenTreatment> rhsTreatment;
            rhsTreatment = (((that.treatment!= null)&&(!that.treatment.isEmpty()))?that.getTreatment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "treatment", lhsTreatment), LocatorUtils.property(thatLocator, "treatment", rhsTreatment), lhsTreatment, rhsTreatment)) {
                return false;
            }
        }
        {
            List<SpecimenContainer> lhsContainer;
            lhsContainer = (((this.container!= null)&&(!this.container.isEmpty()))?this.getContainer():null);
            List<SpecimenContainer> rhsContainer;
            rhsContainer = (((that.container!= null)&&(!that.container.isEmpty()))?that.getContainer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "container", lhsContainer), LocatorUtils.property(thatLocator, "container", rhsContainer), lhsContainer, rhsContainer)) {
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
            List<Identifier> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<SpecimenSource> theSource;
            theSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            Identifier theAccessionIdentifier;
            theAccessionIdentifier = this.getAccessionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessionIdentifier", theAccessionIdentifier), currentHashCode, theAccessionIdentifier);
        }
        {
            DateTime theReceivedTime;
            theReceivedTime = this.getReceivedTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedTime", theReceivedTime), currentHashCode, theReceivedTime);
        }
        {
            SpecimenCollection theCollection;
            theCollection = this.getCollection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collection", theCollection), currentHashCode, theCollection);
        }
        {
            List<SpecimenTreatment> theTreatment;
            theTreatment = (((this.treatment!= null)&&(!this.treatment.isEmpty()))?this.getTreatment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "treatment", theTreatment), currentHashCode, theTreatment);
        }
        {
            List<SpecimenContainer> theContainer;
            theContainer = (((this.container!= null)&&(!this.container.isEmpty()))?this.getContainer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "container", theContainer), currentHashCode, theContainer);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
