//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.05 at 10:59:53 PM MST 
//


package w3._1999.xhtml.impl;

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
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import w3._1999.xhtml.Caption;
import w3._1999.xhtml.Col;
import w3._1999.xhtml.Colgroup;
import w3._1999.xhtml.TFrame;
import w3._1999.xhtml.TRules;
import w3._1999.xhtml.Table;
import w3._1999.xhtml.Tbody;
import w3._1999.xhtml.Tfoot;
import w3._1999.xhtml.Thead;
import w3._1999.xhtml.Tr;

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
public class TableImpl implements Serializable, ToString, Table
{

    @XmlElement(type = CaptionImpl.class)
    protected CaptionImpl caption;
    @XmlElement(name = "colgroup", type = ColgroupImpl.class)
    protected List<Colgroup> colgroups;
    @XmlElement(name = "col", type = ColImpl.class)
    protected List<Col> cols;
    @XmlElement(type = TheadImpl.class)
    protected TheadImpl thead;
    @XmlElement(type = TfootImpl.class)
    protected TfootImpl tfoot;
    @XmlElement(name = "tr", type = TrImpl.class)
    protected List<Tr> trs;
    @XmlElement(name = "tbody", type = TbodyImpl.class)
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
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
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

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption value) {
        this.caption = ((CaptionImpl) value);
    }

    public List<Colgroup> getColgroups() {
        if (colgroups == null) {
            colgroups = new ArrayList<Colgroup>();
        }
        return this.colgroups;
    }

    public List<Col> getCols() {
        if (cols == null) {
            cols = new ArrayList<Col>();
        }
        return this.cols;
    }

    public Thead getThead() {
        return thead;
    }

    public void setThead(Thead value) {
        this.thead = ((TheadImpl) value);
    }

    public Tfoot getTfoot() {
        return tfoot;
    }

    public void setTfoot(Tfoot value) {
        this.tfoot = ((TfootImpl) value);
    }

    public List<Tr> getTrs() {
        if (trs == null) {
            trs = new ArrayList<Tr>();
        }
        return this.trs;
    }

    public List<Tbody> getTbodies() {
        if (tbodies == null) {
            tbodies = new ArrayList<Tbody>();
        }
        return this.tbodies;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String value) {
        this.summary = value;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String value) {
        this.width = value;
    }

    public BigInteger getBorder() {
        return border;
    }

    public void setBorder(BigInteger value) {
        this.border = value;
    }

    public TFrame getFrame() {
        return frame;
    }

    public void setFrame(TFrame value) {
        this.frame = value;
    }

    public TRules getRules() {
        return rules;
    }

    public void setRules(TRules value) {
        this.rules = value;
    }

    public String getCellspacing() {
        return cellspacing;
    }

    public void setCellspacing(String value) {
        this.cellspacing = value;
    }

    public String getCellpadding() {
        return cellpadding;
    }

    public void setCellpadding(String value) {
        this.cellpadding = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String value) {
        this.dir = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public List<String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<String>();
        }
        return this.clazzs;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String value) {
        this.style = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Caption theCaption;
            theCaption = this.getCaption();
            strategy.appendField(locator, this, "caption", buffer, theCaption);
        }
        {
            List<Colgroup> theColgroups;
            theColgroups = (((this.colgroups!= null)&&(!this.colgroups.isEmpty()))?this.getColgroups():null);
            strategy.appendField(locator, this, "colgroups", buffer, theColgroups);
        }
        {
            List<Col> theCols;
            theCols = (((this.cols!= null)&&(!this.cols.isEmpty()))?this.getCols():null);
            strategy.appendField(locator, this, "cols", buffer, theCols);
        }
        {
            Thead theThead;
            theThead = this.getThead();
            strategy.appendField(locator, this, "thead", buffer, theThead);
        }
        {
            Tfoot theTfoot;
            theTfoot = this.getTfoot();
            strategy.appendField(locator, this, "tfoot", buffer, theTfoot);
        }
        {
            List<Tr> theTrs;
            theTrs = (((this.trs!= null)&&(!this.trs.isEmpty()))?this.getTrs():null);
            strategy.appendField(locator, this, "trs", buffer, theTrs);
        }
        {
            List<Tbody> theTbodies;
            theTbodies = (((this.tbodies!= null)&&(!this.tbodies.isEmpty()))?this.getTbodies():null);
            strategy.appendField(locator, this, "tbodies", buffer, theTbodies);
        }
        {
            String theSummary;
            theSummary = this.getSummary();
            strategy.appendField(locator, this, "summary", buffer, theSummary);
        }
        {
            String theWidth;
            theWidth = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theWidth);
        }
        {
            BigInteger theBorder;
            theBorder = this.getBorder();
            strategy.appendField(locator, this, "border", buffer, theBorder);
        }
        {
            TFrame theFrame;
            theFrame = this.getFrame();
            strategy.appendField(locator, this, "frame", buffer, theFrame);
        }
        {
            TRules theRules;
            theRules = this.getRules();
            strategy.appendField(locator, this, "rules", buffer, theRules);
        }
        {
            String theCellspacing;
            theCellspacing = this.getCellspacing();
            strategy.appendField(locator, this, "cellspacing", buffer, theCellspacing);
        }
        {
            String theCellpadding;
            theCellpadding = this.getCellpadding();
            strategy.appendField(locator, this, "cellpadding", buffer, theCellpadding);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage);
        }
        {
            String theLang;
            theLang = this.getLang();
            strategy.appendField(locator, this, "lang", buffer, theLang);
        }
        {
            String theDir;
            theDir = this.getDir();
            strategy.appendField(locator, this, "dir", buffer, theDir);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            List<String> theClazzs;
            theClazzs = (((this.clazzs!= null)&&(!this.clazzs.isEmpty()))?this.getClazzs():null);
            strategy.appendField(locator, this, "clazzs", buffer, theClazzs);
        }
        {
            String theStyle;
            theStyle = this.getStyle();
            strategy.appendField(locator, this, "style", buffer, theStyle);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        return buffer;
    }

    public TableImpl withCaption(Caption value) {
        setCaption(value);
        return this;
    }

    public TableImpl withColgroups(Colgroup... values) {
        if (values!= null) {
            for (Colgroup value: values) {
                getColgroups().add(value);
            }
        }
        return this;
    }

    public TableImpl withColgroups(Collection<Colgroup> values) {
        if (values!= null) {
            getColgroups().addAll(values);
        }
        return this;
    }

    public TableImpl withCols(Col... values) {
        if (values!= null) {
            for (Col value: values) {
                getCols().add(value);
            }
        }
        return this;
    }

    public TableImpl withCols(Collection<Col> values) {
        if (values!= null) {
            getCols().addAll(values);
        }
        return this;
    }

    public TableImpl withThead(Thead value) {
        setThead(value);
        return this;
    }

    public TableImpl withTfoot(Tfoot value) {
        setTfoot(value);
        return this;
    }

    public TableImpl withTrs(Tr... values) {
        if (values!= null) {
            for (Tr value: values) {
                getTrs().add(value);
            }
        }
        return this;
    }

    public TableImpl withTrs(Collection<Tr> values) {
        if (values!= null) {
            getTrs().addAll(values);
        }
        return this;
    }

    public TableImpl withTbodies(Tbody... values) {
        if (values!= null) {
            for (Tbody value: values) {
                getTbodies().add(value);
            }
        }
        return this;
    }

    public TableImpl withTbodies(Collection<Tbody> values) {
        if (values!= null) {
            getTbodies().addAll(values);
        }
        return this;
    }

    public TableImpl withSummary(String value) {
        setSummary(value);
        return this;
    }

    public TableImpl withWidth(String value) {
        setWidth(value);
        return this;
    }

    public TableImpl withBorder(BigInteger value) {
        setBorder(value);
        return this;
    }

    public TableImpl withFrame(TFrame value) {
        setFrame(value);
        return this;
    }

    public TableImpl withRules(TRules value) {
        setRules(value);
        return this;
    }

    public TableImpl withCellspacing(String value) {
        setCellspacing(value);
        return this;
    }

    public TableImpl withCellpadding(String value) {
        setCellpadding(value);
        return this;
    }

    public TableImpl withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public TableImpl withLang(String value) {
        setLang(value);
        return this;
    }

    public TableImpl withDir(String value) {
        setDir(value);
        return this;
    }

    public TableImpl withId(String value) {
        setId(value);
        return this;
    }

    public TableImpl withClazzs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getClazzs().add(value);
            }
        }
        return this;
    }

    public TableImpl withClazzs(Collection<String> values) {
        if (values!= null) {
            getClazzs().addAll(values);
        }
        return this;
    }

    public TableImpl withStyle(String value) {
        setStyle(value);
        return this;
    }

    public TableImpl withTitle(String value) {
        setTitle(value);
        return this;
    }

}