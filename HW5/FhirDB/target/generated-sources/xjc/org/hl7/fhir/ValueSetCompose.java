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
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Compose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Compose">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="import" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="include" type="{http://hl7.org/fhir}ValueSet.Include" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exclude" type="{http://hl7.org/fhir}ValueSet.Include" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Compose", propOrder = {
    "_import",
    "include",
    "exclude"
})
@Entity(name = "ValueSetCompose")
@Table(name = "VALUESETCOMPOSE")
public class ValueSetCompose
    extends BackboneElement
    implements Equals, HashCode
{

    @XmlElement(name = "import")
    protected List<Uri> _import;
    protected List<ValueSetInclude> include;
    protected List<ValueSetInclude> exclude;

    /**
     * Gets the value of the import property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the import property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    @OneToMany(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IMPORT_VALUESETCOMPOSE_HJID")
    public List<Uri> getImport() {
        if (_import == null) {
            _import = new ArrayList<Uri>();
        }
        return this._import;
    }

    /**
     * 
     * 
     */
    public void setImport(List<Uri> _import) {
        this._import = _import;
    }

    /**
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetInclude }
     * 
     * 
     */
    @OneToMany(targetEntity = ValueSetInclude.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INCLUDE_VALUESETCOMPOSE_HJID")
    public List<ValueSetInclude> getInclude() {
        if (include == null) {
            include = new ArrayList<ValueSetInclude>();
        }
        return this.include;
    }

    /**
     * 
     * 
     */
    public void setInclude(List<ValueSetInclude> include) {
        this.include = include;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetInclude }
     * 
     * 
     */
    @OneToMany(targetEntity = ValueSetInclude.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXCLUDE_VALUESETCOMPOSE_HJID")
    public List<ValueSetInclude> getExclude() {
        if (exclude == null) {
            exclude = new ArrayList<ValueSetInclude>();
        }
        return this.exclude;
    }

    /**
     * 
     * 
     */
    public void setExclude(List<ValueSetInclude> exclude) {
        this.exclude = exclude;
    }

    public ValueSetCompose withImport(Uri... values) {
        if (values!= null) {
            for (Uri value: values) {
                getImport().add(value);
            }
        }
        return this;
    }

    public ValueSetCompose withImport(Collection<Uri> values) {
        if (values!= null) {
            getImport().addAll(values);
        }
        return this;
    }

    public ValueSetCompose withImport(List<Uri> _import) {
        setImport(_import);
        return this;
    }

    public ValueSetCompose withInclude(ValueSetInclude... values) {
        if (values!= null) {
            for (ValueSetInclude value: values) {
                getInclude().add(value);
            }
        }
        return this;
    }

    public ValueSetCompose withInclude(Collection<ValueSetInclude> values) {
        if (values!= null) {
            getInclude().addAll(values);
        }
        return this;
    }

    public ValueSetCompose withInclude(List<ValueSetInclude> include) {
        setInclude(include);
        return this;
    }

    public ValueSetCompose withExclude(ValueSetInclude... values) {
        if (values!= null) {
            for (ValueSetInclude value: values) {
                getExclude().add(value);
            }
        }
        return this;
    }

    public ValueSetCompose withExclude(Collection<ValueSetInclude> values) {
        if (values!= null) {
            getExclude().addAll(values);
        }
        return this;
    }

    public ValueSetCompose withExclude(List<ValueSetInclude> exclude) {
        setExclude(exclude);
        return this;
    }

    @Override
    public ValueSetCompose withModifierExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetCompose withModifierExtension(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetCompose withModifierExtension(List<Extension> modifierExtension) {
        setModifierExtension(modifierExtension);
        return this;
    }

    @Override
    public ValueSetCompose withExtension(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtension().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetCompose withExtension(Collection<Extension> values) {
        if (values!= null) {
            getExtension().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetCompose withExtension(List<Extension> extension) {
        setExtension(extension);
        return this;
    }

    @Override
    public ValueSetCompose withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValueSetCompose)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ValueSetCompose that = ((ValueSetCompose) object);
        {
            List<Uri> lhsImport;
            lhsImport = (((this._import!= null)&&(!this._import.isEmpty()))?this.getImport():null);
            List<Uri> rhsImport;
            rhsImport = (((that._import!= null)&&(!that._import.isEmpty()))?that.getImport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_import", lhsImport), LocatorUtils.property(thatLocator, "_import", rhsImport), lhsImport, rhsImport)) {
                return false;
            }
        }
        {
            List<ValueSetInclude> lhsInclude;
            lhsInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            List<ValueSetInclude> rhsInclude;
            rhsInclude = (((that.include!= null)&&(!that.include.isEmpty()))?that.getInclude():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "include", lhsInclude), LocatorUtils.property(thatLocator, "include", rhsInclude), lhsInclude, rhsInclude)) {
                return false;
            }
        }
        {
            List<ValueSetInclude> lhsExclude;
            lhsExclude = (((this.exclude!= null)&&(!this.exclude.isEmpty()))?this.getExclude():null);
            List<ValueSetInclude> rhsExclude;
            rhsExclude = (((that.exclude!= null)&&(!that.exclude.isEmpty()))?that.getExclude():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exclude", lhsExclude), LocatorUtils.property(thatLocator, "exclude", rhsExclude), lhsExclude, rhsExclude)) {
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
            List<Uri> theImport;
            theImport = (((this._import!= null)&&(!this._import.isEmpty()))?this.getImport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_import", theImport), currentHashCode, theImport);
        }
        {
            List<ValueSetInclude> theInclude;
            theInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "include", theInclude), currentHashCode, theInclude);
        }
        {
            List<ValueSetInclude> theExclude;
            theExclude = (((this.exclude!= null)&&(!this.exclude.isEmpty()))?this.getExclude():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exclude", theExclude), currentHashCode, theExclude);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
