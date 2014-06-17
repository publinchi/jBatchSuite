//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.05.19 at 12:02:26 AM IST
//
package org.netbeans.jbatch.modeler.spec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jbatch.modeler.spec.core.Activity;
import org.netbeans.jbatch.modeler.spec.core.KeyManager;

/**
 * <p>
 * Java class for Step complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Step">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{http://xmlns.jcp.org/xml/ns/javaee}Properties" minOccurs="0"/>
 *         &lt;element name="listeners" type="{http://xmlns.jcp.org/xml/ns/javaee}Listeners" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="batchlet" type="{http://xmlns.jcp.org/xml/ns/javaee}Batchlet"/>
 *           &lt;element name="chunk" type="{http://xmlns.jcp.org/xml/ns/javaee}Chunk"/>
 *         &lt;/choice>
 *         &lt;element name="partition" type="{http://xmlns.jcp.org/xml/ns/javaee}Partition" minOccurs="0"/>
 *         &lt;group ref="{http://xmlns.jcp.org/xml/ns/javaee}TransitionElements" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="start-limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allow-start-if-complete" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Step", propOrder = {
    "properties",
    "listeners",
    "batchlet",
    "chunk",
    "partition",
    "transitionElements"
})
public class Step extends Activity implements KeyManager {

    protected Properties properties;
    protected Listeners listeners;
    protected Batchlet batchlet;
    protected Chunk chunk;
    protected Partition partition;
    @XmlElements({
        @XmlElement(name = "end", type = End.class),
        @XmlElement(name = "fail", type = Fail.class),
        @XmlElement(name = "next", type = Next.class),
        @XmlElement(name = "stop", type = Stop.class)
    })
    protected List<Object> transitionElements;
//    @XmlAttribute(name = "id", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlID
//    @XmlSchemaType(name = "ID")
//    protected String id;
    @XmlAttribute(name = "start-limit")
    protected String startLimit;
    @XmlAttribute(name = "allow-start-if-complete")
    protected String allowStartIfComplete;
    @XmlAttribute(name = "next")
    protected String next;
    @XmlAttribute(name = "key")
    private String key;//custom added

    /**
     * Gets the value of the properties property.
     *
     * @return possible object is {@link Properties }
     *
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value allowed object is {@link Properties }
     *
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the listeners property.
     *
     * @return possible object is {@link Listeners }
     *
     */
    public Listeners getListeners() {
        return listeners;
    }

    /**
     * Sets the value of the listeners property.
     *
     * @param value allowed object is {@link Listeners }
     *
     */
    public void setListeners(Listeners value) {
        this.listeners = value;
    }

    /**
     * Gets the value of the batchlet property.
     *
     * @return possible object is {@link Batchlet }
     *
     */
    public Batchlet getBatchlet() {
        return batchlet;
    }

    /**
     * Sets the value of the batchlet property.
     *
     * @param value allowed object is {@link Batchlet }
     *
     */
    public void setBatchlet(Batchlet value) {
        this.batchlet = value;
    }

    /**
     * Gets the value of the chunk property.
     *
     * @return possible object is {@link Chunk }
     *
     */
    public Chunk getChunk() {
        return chunk;
    }

    /**
     * Sets the value of the chunk property.
     *
     * @param value allowed object is {@link Chunk }
     *
     */
    public void setChunk(Chunk value) {
        this.chunk = value;
    }

    /**
     * Gets the value of the partition property.
     *
     * @return possible object is {@link Partition }
     *
     */
    public Partition getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     *
     * @param value allowed object is {@link Partition }
     *
     */
    public void setPartition(Partition value) {
        this.partition = value;
    }

    /**
     * Gets the value of the transitionElements property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the transitionElements property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitionElements().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list null null null
     * null null     {@link End }
     * {@link Fail }
     * {@link Next }
     * {@link Stop }
     *
     *
     */
    public List<Object> getTransitionElements() {
        if (transitionElements == null) {
            transitionElements = new ArrayList<Object>();
        }
        return this.transitionElements;
    }

//    /**
//     * Gets the value of the id property.
//     *
//     * @return possible object is {@link String }
//     *
//     */
//    public String getId() {
//        return id;
//    }
//
//    /**
//     * Sets the value of the id property.
//     *
//     * @param value allowed object is {@link String }
//     *
//     */
//    public void setId(String value) {
//        this.id = value;
//    }
    /**
     * Gets the value of the startLimit property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStartLimit() {
        return startLimit;
    }

    /**
     * Sets the value of the startLimit property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStartLimit(String value) {
        this.startLimit = value;
    }

    /**
     * Gets the value of the allowStartIfComplete property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAllowStartIfComplete() {
        return allowStartIfComplete;
    }

    /**
     * Sets the value of the allowStartIfComplete property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAllowStartIfComplete(String value) {
        this.allowStartIfComplete = value;
    }

    /**
     * Gets the value of the next property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNext(String value) {
        this.next = value;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

}
