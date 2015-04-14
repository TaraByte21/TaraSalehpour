//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 09:54:21 PM MST 
//


package w3._1999.xhtml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;choice maxOccurs="unbounded"&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}p"/&gt;
 *               &lt;choice&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h1"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h2"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h3"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h4"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h5"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h6"/&gt;
 *               &lt;/choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}div"/&gt;
 *               &lt;choice&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}ul"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}ol"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}dl"/&gt;
 *               &lt;/choice&gt;
 *               &lt;choice&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}pre"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}hr"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}blockquote"/&gt;
 *               &lt;/choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}table"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}area" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}i18n"/&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/1999/xhtml}StyleSheet" /&gt;
 *       &lt;attribute name="title" type="{http://www.w3.org/1999/xhtml}Text" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "areas",
    "psAndH1SAndH2S"
})
@XmlRootElement(name = "map")
public class Map implements Serializable
{

    @XmlElement(name = "area")
    protected List<Area> areas;
    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "h1", type = H1 .class),
        @XmlElement(name = "h2", type = H2 .class),
        @XmlElement(name = "h3", type = H3 .class),
        @XmlElement(name = "h4", type = H4 .class),
        @XmlElement(name = "h5", type = H5 .class),
        @XmlElement(name = "h6", type = H6 .class),
        @XmlElement(name = "div", type = Div.class),
        @XmlElement(name = "ul", type = Ul.class),
        @XmlElement(name = "ol", type = Ol.class),
        @XmlElement(name = "dl", type = Dl.class),
        @XmlElement(name = "pre", type = Pre.class),
        @XmlElement(name = "hr", type = Hr.class),
        @XmlElement(name = "blockquote", type = Blockquote.class),
        @XmlElement(name = "table", type = Table.class)
    })
    protected List<Serializable> psAndH1SAndH2S;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;

    /**
     * Gets the value of the areas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Area }
     * 
     * 
     */
    public List<Area> getAreas() {
        if (areas == null) {
            areas = new ArrayList<Area>();
        }
        return this.areas;
    }

    /**
     * Gets the value of the psAndH1SAndH2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psAndH1SAndH2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSAndH1SAndH2S().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link H1 }
     * {@link H2 }
     * {@link H3 }
     * {@link H4 }
     * {@link H5 }
     * {@link H6 }
     * {@link Div }
     * {@link Ul }
     * {@link Ol }
     * {@link Dl }
     * {@link Pre }
     * {@link Hr }
     * {@link Blockquote }
     * {@link Table }
     * 
     * 
     */
    public List<Serializable> getPSAndH1SAndH2S() {
        if (psAndH1SAndH2S == null) {
            psAndH1SAndH2S = new ArrayList<Serializable>();
        }
        return this.psAndH1SAndH2S;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    public Map withAreas(Area... values) {
        if (values!= null) {
            for (Area value: values) {
                getAreas().add(value);
            }
        }
        return this;
    }

    public Map withAreas(Collection<Area> values) {
        if (values!= null) {
            getAreas().addAll(values);
        }
        return this;
    }

    public Map withPSAndH1SAndH2S(Serializable... values) {
        if (values!= null) {
            for (Serializable value: values) {
                getPSAndH1SAndH2S().add(value);
            }
        }
        return this;
    }

    public Map withPSAndH1SAndH2S(Collection<Serializable> values) {
        if (values!= null) {
            getPSAndH1SAndH2S().addAll(values);
        }
        return this;
    }

    public Map withId(String value) {
        setId(value);
        return this;
    }

    public Map withClazz(String value) {
        setClazz(value);
        return this;
    }

    public Map withStyle(String value) {
        setStyle(value);
        return this;
    }

    public Map withTitle(String value) {
        setTitle(value);
        return this;
    }

    public Map withName(String value) {
        setName(value);
        return this;
    }

    public Map withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public Map withLang(String value) {
        setLang(value);
        return this;
    }

    public Map withDir(String value) {
        setDir(value);
        return this;
    }

}
