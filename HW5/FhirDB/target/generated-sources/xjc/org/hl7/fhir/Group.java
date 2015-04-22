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
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}GroupType"/>
 *         &lt;element name="actual" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="characteristic" type="{http://hl7.org/fhir}Group.Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="member" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "characteristic",
    "member"
})
@Entity(name = "Group")
@Table(name = "GROUP_")
public class Group
    extends Resource
    implements Equals, HashCode
{

    protected Identifier identifier;
    @XmlElement(required = true)
    protected GroupType type;
    @XmlElement(required = true)
    protected Boolean actual;
    protected CodeableConcept code;
    protected org.hl7.fhir.String name;
    protected Integer quantity;
    protected List<GroupCharacteristic> characteristic;
    protected List<ResourceReference> member;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_GROUP__HJID")
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
    @ManyToOne(targetEntity = GroupType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__GROUP__HJID")
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
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ACTUAL_GROUP__HJID")
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
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_GROUP__HJID")
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
     *     {@link org.hl7.fhir.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__GROUP__HJID")
    public org.hl7.fhir.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.String }
     *     
     */
    public void setName(org.hl7.fhir.String value) {
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
    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUANTITY_GROUP__HJID")
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
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupCharacteristic }
     * 
     * 
     */
    @OneToMany(targetEntity = GroupCharacteristic.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CHARACTERISTIC_GROUP__HJID")
    public List<GroupCharacteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<GroupCharacteristic>();
        }
        return this.characteristic;
    }

    /**
     * 
     * 
     */
    public void setCharacteristic(List<GroupCharacteristic> characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MEMBER_GROUP__HJID")
    public List<ResourceReference> getMember() {
        if (member == null) {
            member = new ArrayList<ResourceReference>();
        }
        return this.member;
    }

    /**
     * 
     * 
     */
    public void setMember(List<ResourceReference> member) {
        this.member = member;
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

    public Group withName(org.hl7.fhir.String value) {
        setName(value);
        return this;
    }

    public Group withQuantity(Integer value) {
        setQuantity(value);
        return this;
    }

    public Group withCharacteristic(GroupCharacteristic... values) {
        if (values!= null) {
            for (GroupCharacteristic value: values) {
                getCharacteristic().add(value);
            }
        }
        return this;
    }

    public Group withCharacteristic(Collection<GroupCharacteristic> values) {
        if (values!= null) {
            getCharacteristic().addAll(values);
        }
        return this;
    }

    public Group withCharacteristic(List<GroupCharacteristic> characteristic) {
        setCharacteristic(characteristic);
        return this;
    }

    public Group withMember(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getMember().add(value);
            }
        }
        return this;
    }

    public Group withMember(Collection<ResourceReference> values) {
        if (values!= null) {
            getMember().addAll(values);
        }
        return this;
    }

    public Group withMember(List<ResourceReference> member) {
        setMember(member);
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
    public Group withContained(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContained().add(value);
            }
        }
        return this;
    }

    @Override
    public Group withContained(Collection<ResourceInline> values) {
        if (values!= null) {
            getContained().addAll(values);
        }
        return this;
    }

    @Override
    public Group withContained(List<ResourceInline> contained) {
        setContained(contained);
        return this;
    }

    @Override
    public Group withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public Group withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public Group withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public Group withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public Group withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public Group withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public Group withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Group)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Group that = ((Group) object);
        {
            Identifier lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Identifier rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            GroupType lhsType;
            lhsType = this.getType();
            GroupType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            Boolean lhsActual;
            lhsActual = this.getActual();
            Boolean rhsActual;
            rhsActual = that.getActual();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actual", lhsActual), LocatorUtils.property(thatLocator, "actual", rhsActual), lhsActual, rhsActual)) {
                return false;
            }
        }
        {
            CodeableConcept lhsCode;
            lhsCode = this.getCode();
            CodeableConcept rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            org.hl7.fhir.String lhsName;
            lhsName = this.getName();
            org.hl7.fhir.String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Integer lhsQuantity;
            lhsQuantity = this.getQuantity();
            Integer rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            List<GroupCharacteristic> lhsCharacteristic;
            lhsCharacteristic = (((this.characteristic!= null)&&(!this.characteristic.isEmpty()))?this.getCharacteristic():null);
            List<GroupCharacteristic> rhsCharacteristic;
            rhsCharacteristic = (((that.characteristic!= null)&&(!that.characteristic.isEmpty()))?that.getCharacteristic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characteristic", lhsCharacteristic), LocatorUtils.property(thatLocator, "characteristic", rhsCharacteristic), lhsCharacteristic, rhsCharacteristic)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsMember;
            lhsMember = (((this.member!= null)&&(!this.member.isEmpty()))?this.getMember():null);
            List<ResourceReference> rhsMember;
            rhsMember = (((that.member!= null)&&(!that.member.isEmpty()))?that.getMember():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "member", lhsMember), LocatorUtils.property(thatLocator, "member", rhsMember), lhsMember, rhsMember)) {
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
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            GroupType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            Boolean theActual;
            theActual = this.getActual();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actual", theActual), currentHashCode, theActual);
        }
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            org.hl7.fhir.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Integer theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            List<GroupCharacteristic> theCharacteristic;
            theCharacteristic = (((this.characteristic!= null)&&(!this.characteristic.isEmpty()))?this.getCharacteristic():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "characteristic", theCharacteristic), currentHashCode, theCharacteristic);
        }
        {
            List<ResourceReference> theMember;
            theMember = (((this.member!= null)&&(!this.member.isEmpty()))?this.getMember():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "member", theMember), currentHashCode, theMember);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
