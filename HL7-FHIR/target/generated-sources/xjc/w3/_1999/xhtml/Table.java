//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:21:42 PM MST 
//


package w3._1999.xhtml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}caption" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}col" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}colgroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}thead" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}tfoot" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}tbody" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}tr" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}attrs"/&gt;
 *       &lt;attribute name="summary" type="{http://www.w3.org/1999/xhtml}Text" /&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/1999/xhtml}Length" /&gt;
 *       &lt;attribute name="border" type="{http://www.w3.org/1999/xhtml}Pixels" /&gt;
 *       &lt;attribute name="frame" type="{http://www.w3.org/1999/xhtml}TFrame" /&gt;
 *       &lt;attribute name="rules" type="{http://www.w3.org/1999/xhtml}TRules" /&gt;
 *       &lt;attribute name="cellspacing" type="{http://www.w3.org/1999/xhtml}Length" /&gt;
 *       &lt;attribute name="cellpadding" type="{http://www.w3.org/1999/xhtml}Length" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "colgroups",
    "cols",
    "thead",
    "tfoot",
    "trs",
    "tbodies"
})
@XmlRootElement(name = "table")
public class Table implements Serializable
{

    protected Caption caption;
    @XmlElement(name = "colgroup")
    protected List<Colgroup> colgroups;
    @XmlElement(name = "col")
    protected List<Col> cols;
    protected Thead thead;
    protected Tfoot tfoot;
    @XmlElement(name = "tr")
    protected List<Tr> trs;
    @XmlElement(name = "tbody")
    protected List<Tbody> tbodies;
    @XmlAttribute(name = "summary")
    protected String summary;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "border")
    protected BigInteger border;
    @XmlAttribute(name = "frame")
    protected TFrame frame;
    @XmlAttribute(name = "rules")
    protected TRules rules;
    @XmlAttribute(name = "cellspacing")
    protected String cellspacing;
    @XmlAttribute(name = "cellpadding")
    protected String cellpadding;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> clazzs;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the colgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Colgroup }
     * 
     * 
     */
    public List<Colgroup> getColgroups() {
        if (colgroups == null) {
            colgroups = new ArrayList<Colgroup>();
        }
        return this.colgroups;
    }

    /**
     * Gets the value of the cols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Col }
     * 
     * 
     */
    public List<Col> getCols() {
        if (cols == null) {
            cols = new ArrayList<Col>();
        }
        return this.cols;
    }

    /**
     * Gets the value of the thead property.
     * 
     * @return
     *     possible object is
     *     {@link Thead }
     *     
     */
    public Thead getThead() {
        return thead;
    }

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thead }
     *     
     */
    public void setThead(Thead value) {
        this.thead = value;
    }

    /**
     * Gets the value of the tfoot property.
     * 
     * @return
     *     possible object is
     *     {@link Tfoot }
     *     
     */
    public Tfoot getTfoot() {
        return tfoot;
    }

    /**
     * Sets the value of the tfoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tfoot }
     *     
     */
    public void setTfoot(Tfoot value) {
        this.tfoot = value;
    }

    /**
     * Gets the value of the trs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tr }
     * 
     * 
     */
    public List<Tr> getTrs() {
        if (trs == null) {
            trs = new ArrayList<Tr>();
        }
        return this.trs;
    }

    /**
     * Gets the value of the tbodies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbodies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbodies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tbody }
     * 
     * 
     */
    public List<Tbody> getTbodies() {
        if (tbodies == null) {
            tbodies = new ArrayList<Tbody>();
        }
        return this.tbodies;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBorder(BigInteger value) {
        this.border = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link TFrame }
     *     
     */
    public TFrame getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFrame }
     *     
     */
    public void setFrame(TFrame value) {
        this.frame = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link TRules }
     *     
     */
    public TRules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRules }
     *     
     */
    public void setRules(TRules value) {
        this.rules = value;
    }

    /**
     * Gets the value of the cellspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellspacing() {
        return cellspacing;
    }

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellspacing(String value) {
        this.cellspacing = value;
    }

    /**
     * Gets the value of the cellpadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellpadding() {
        return cellpadding;
    }

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellpadding(String value) {
        this.cellpadding = value;
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
     * Gets the value of the clazzs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazzs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<String>();
        }
        return this.clazzs;
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

    public Table withCaption(Caption value) {
        setCaption(value);
        return this;
    }

    public Table withColgroups(Colgroup... values) {
        if (values!= null) {
            for (Colgroup value: values) {
                getColgroups().add(value);
            }
        }
        return this;
    }

    public Table withColgroups(Collection<Colgroup> values) {
        if (values!= null) {
            getColgroups().addAll(values);
        }
        return this;
    }

    public Table withCols(Col... values) {
        if (values!= null) {
            for (Col value: values) {
                getCols().add(value);
            }
        }
        return this;
    }

    public Table withCols(Collection<Col> values) {
        if (values!= null) {
            getCols().addAll(values);
        }
        return this;
    }

    public Table withThead(Thead value) {
        setThead(value);
        return this;
    }

    public Table withTfoot(Tfoot value) {
        setTfoot(value);
        return this;
    }

    public Table withTrs(Tr... values) {
        if (values!= null) {
            for (Tr value: values) {
                getTrs().add(value);
            }
        }
        return this;
    }

    public Table withTrs(Collection<Tr> values) {
        if (values!= null) {
            getTrs().addAll(values);
        }
        return this;
    }

    public Table withTbodies(Tbody... values) {
        if (values!= null) {
            for (Tbody value: values) {
                getTbodies().add(value);
            }
        }
        return this;
    }

    public Table withTbodies(Collection<Tbody> values) {
        if (values!= null) {
            getTbodies().addAll(values);
        }
        return this;
    }

    public Table withSummary(String value) {
        setSummary(value);
        return this;
    }

    public Table withWidth(String value) {
        setWidth(value);
        return this;
    }

    public Table withBorder(BigInteger value) {
        setBorder(value);
        return this;
    }

    public Table withFrame(TFrame value) {
        setFrame(value);
        return this;
    }

    public Table withRules(TRules value) {
        setRules(value);
        return this;
    }

    public Table withCellspacing(String value) {
        setCellspacing(value);
        return this;
    }

    public Table withCellpadding(String value) {
        setCellpadding(value);
        return this;
    }

    public Table withId(String value) {
        setId(value);
        return this;
    }

    public Table withClazzs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getClazzs().add(value);
            }
        }
        return this;
    }

    public Table withClazzs(Collection<String> values) {
        if (values!= null) {
            getClazzs().addAll(values);
        }
        return this;
    }

    public Table withStyle(String value) {
        setStyle(value);
        return this;
    }

    public Table withTitle(String value) {
        setTitle(value);
        return this;
    }

    public Table withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public Table withLang(String value) {
        setLang(value);
        return this;
    }

    public Table withDir(String value) {
        setDir(value);
        return this;
    }

}
