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
import javax.xml.bind.annotation.XmlType;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Compose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Compose"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="import" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="include" type="{http://hl7.org/fhir}ValueSet.Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exclude" type="{http://hl7.org/fhir}ValueSet.Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Compose", propOrder = {
    "imports",
    "includes",
    "excludes"
})
public class ValueSetCompose
    extends BackboneElement
    implements Serializable
{

    @XmlElement(name = "import")
    protected List<Uri> imports;
    @XmlElement(name = "include")
    protected List<ValueSetInclude> includes;
    @XmlElement(name = "exclude")
    protected List<ValueSetInclude> excludes;

    /**
     * Gets the value of the imports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getImports() {
        if (imports == null) {
            imports = new ArrayList<Uri>();
        }
        return this.imports;
    }

    /**
     * Gets the value of the includes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetInclude }
     * 
     * 
     */
    public List<ValueSetInclude> getIncludes() {
        if (includes == null) {
            includes = new ArrayList<ValueSetInclude>();
        }
        return this.includes;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetInclude }
     * 
     * 
     */
    public List<ValueSetInclude> getExcludes() {
        if (excludes == null) {
            excludes = new ArrayList<ValueSetInclude>();
        }
        return this.excludes;
    }

    public ValueSetCompose withImports(Uri... values) {
        if (values!= null) {
            for (Uri value: values) {
                getImports().add(value);
            }
        }
        return this;
    }

    public ValueSetCompose withImports(Collection<Uri> values) {
        if (values!= null) {
            getImports().addAll(values);
        }
        return this;
    }

    public ValueSetCompose withIncludes(ValueSetInclude... values) {
        if (values!= null) {
            for (ValueSetInclude value: values) {
                getIncludes().add(value);
            }
        }
        return this;
    }

    public ValueSetCompose withIncludes(Collection<ValueSetInclude> values) {
        if (values!= null) {
            getIncludes().addAll(values);
        }
        return this;
    }

    public ValueSetCompose withExcludes(ValueSetInclude... values) {
        if (values!= null) {
            for (ValueSetInclude value: values) {
                getExcludes().add(value);
            }
        }
        return this;
    }

    public ValueSetCompose withExcludes(Collection<ValueSetInclude> values) {
        if (values!= null) {
            getExcludes().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetCompose withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetCompose withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetCompose withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ValueSetCompose withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ValueSetCompose withId(java.lang.String value) {
        setId(value);
        return this;
    }

}