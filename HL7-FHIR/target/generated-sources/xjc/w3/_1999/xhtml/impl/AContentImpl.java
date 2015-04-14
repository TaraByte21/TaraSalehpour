//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.05 at 10:59:53 PM MST 
//


package w3._1999.xhtml.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import w3._1999.xhtml.AContent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a.content", propOrder = {
    "content"
})
@XmlSeeAlso({
    AImpl.class
})
public class AContentImpl implements Serializable, ToString, AContent
{

    @XmlElementRefs({
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = AbbrImpl.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = SpanImpl.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = BdoImpl.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = CodeImpl.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = SubImpl.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = DfnImpl.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = SmallImpl.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = ImgImpl.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = StrongImpl.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = TtImpl.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = SupImpl.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = AcronymImpl.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = BrImpl.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = MapImpl.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = VarImpl.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = CiteImpl.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = SampImpl.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = KbdImpl.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = QImpl.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = IImpl.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = BigImpl.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = BImpl.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = EmImpl.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
            List<Object> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        return buffer;
    }

    public AContentImpl withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public AContentImpl withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

}
