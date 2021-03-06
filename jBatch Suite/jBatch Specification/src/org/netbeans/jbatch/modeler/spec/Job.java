//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.05.19 at 12:02:26 AM IST
//
package org.netbeans.jbatch.modeler.spec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jbatch.modeler.spec.core.BaseElement;
import org.netbeans.jbatch.modeler.spec.core.Converge;
import org.netbeans.jbatch.modeler.spec.core.Diverge;
import org.netbeans.jbatch.modeler.spec.core.FlowNode;
import org.netbeans.jbatch.modeler.spec.core.SequenceFlow;
import org.netbeans.jbatch.modeler.spec.core.SplitterInputConnection;
import org.netbeans.jbatch.modeler.spec.core.SplitterOutputConnection;
import org.netbeans.jbatch.modeler.spec.core.Start;
import org.netbeans.modeler.specification.model.document.IRootElement;
import org.netbeans.modeler.specification.model.document.core.IBaseElement;

/**
 * The type of a job definition, whether concrete or
 *
 * abstract. This is the type of the root element of any JSL document.
 *
 * <p>
 * Java class for Job complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{http://xmlns.jcp.org/xml/ns/javaee}Properties" minOccurs="0"/>
 *         &lt;element name="listeners" type="{http://xmlns.jcp.org/xml/ns/javaee}Listeners" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="decision" type="{http://xmlns.jcp.org/xml/ns/javaee}Decision"/>
 *           &lt;element name="flow" type="{http://xmlns.jcp.org/xml/ns/javaee}Flow"/>
 *           &lt;element name="split" type="{http://xmlns.jcp.org/xml/ns/javaee}Split"/>
 *           &lt;element name="step" type="{http://xmlns.jcp.org/xml/ns/javaee}Step"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="restartable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name = "job"/*, namespace = "http://xmlns.jcp.org/xml/ns/javaee"*/)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "properties",
    "listeners",
    "flowNodes",//decisionOrFlowOrSplit
    "sequenceFlow"
})
public class Job extends BaseElement implements IRootElement {

    protected Properties properties;
    protected Listeners listeners;
    @XmlElements({
        @XmlElement(name = "decision", type = Decision.class),
        @XmlElement(name = "flow", type = Flow.class),
        @XmlElement(name = "split", type = Split.class),
        @XmlElement(name = "step", type = Step.class),
        @XmlElement(name = "start", type = Start.class),//custom added for *.job as a widget not for JSL as a transition
        @XmlElement(name = "fail", type = Fail.class),//custom added for *.job as a widget not for JSL as a transition
        @XmlElement(name = "stop", type = Stop.class),//custom added for *.job as a widget not for JSL as a transition
        @XmlElement(name = "end", type = End.class),//custom added for *.job as a widget not for JSL as a transition
        @XmlElement(name = "converge", type = Converge.class),//custom added for *.job as a widget not for JSL as a transition
        @XmlElement(name = "diverge", type = Diverge.class)//custom added for *.job as a widget not for JSL as a transition
    })
    protected List<FlowNode> flowNodes = new ArrayList<FlowNode>(); //decisionOrFlowOrSplit
    @XmlElements({
        @XmlElement(name = "sequenceFlow", type = SequenceFlow.class),
        @XmlElement(name = "splitter-in", type = SplitterInputConnection.class),
        @XmlElement(name = "splitter-out", type = SplitterOutputConnection.class)
    })
    private List<SequenceFlow> sequenceFlow = new ArrayList<SequenceFlow>(); //Custom Added

    @XmlAttribute(name = "version", required = true)
    protected String version = "1.0";
//    @XmlAttribute(name = "id", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlID
//    @XmlSchemaType(name = "ID")
//    protected String id;
    @XmlAttribute(name = "restartable")
    protected Boolean restartable = false;
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
     * Gets the value of the decisionOrFlowOrSplit property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the decisionOrFlowOrSplit property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowNode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list null null null
     * null null null null null null null null null null null null null null
     * null null null null null null null     {@link Decision }
     * {@link Flow }
     * {@link Split }
     * {@link Step }
     *
     *
     */
    public List<FlowNode> getFlowNode() {
        if (flowNodes == null) {
            flowNodes = new ArrayList<FlowNode>();
        }
        return this.flowNodes;
    }

    public List<Flow> getFlow() {
        List<Flow> flows = new ArrayList<Flow>();
        if (flowNodes == null) {
            flowNodes = new ArrayList<FlowNode>();
        }
        for (FlowNode flowNode : flowNodes) {
            if (flowNode instanceof Flow) {
                flows.add((Flow) flowNode);
            }
        }
        return flows;
    }

    public void addFlow(Flow flow_In) {
        if (flowNodes == null) {
            flowNodes = new ArrayList<FlowNode>();
        }
        this.flowNodes.add(flow_In);
    }

    public void removeFlow(Flow flow_In) {
        if (flowNodes == null) {
            flowNodes = new ArrayList<FlowNode>();
        }
        this.flowNodes.remove(flow_In);
    }

    public List<Decision> getDecision() {
        List<Decision> decisions = new ArrayList<Decision>();
        if (flowNodes == null) {
            flowNodes = new ArrayList<FlowNode>();
        }
        for (FlowNode flowNode : flowNodes) {
            if (flowNode instanceof Split) {
                decisions.add((Decision) flowNode);
            }
        }
        return decisions;
    }

    public List<Split> getSplit() {
        List<Split> splits = new ArrayList<Split>();
        if (flowNodes == null) {
            flowNodes = new ArrayList<FlowNode>();
        }
        for (FlowNode flowNode : flowNodes) {
            if (flowNode instanceof Split) {
                splits.add((Split) flowNode);
            }
        }
        return splits;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
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
     * Gets the value of the restartable property.
     *
     * @return possible object is {@link String }
     *
     */
    public Boolean getRestartable() {
        return restartable;
    }

    /**
     * Sets the value of the restartable property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRestartable(Boolean value) {
        this.restartable = value;
    }

//       @Override
//    public void removeBaseElement(IBaseElement baseElement_In) {
//        if (baseElement_In instanceof TFlowElement) {
//            this.removeFlowElement((TFlowElement) baseElement_In);
//        } else if (baseElement_In instanceof TArtifact) {
//            this.removeArtifact((TArtifact) baseElement_In);
//        }
//    }
//
//    @Override
//    public void addBaseElement(IBaseElement baseElement_In) {
//        if (baseElement_In instanceof TFlowElement) {
//            this.addFlowElement((TFlowElement) baseElement_In);
//        } else if (baseElement_In instanceof TArtifact) {
//            this.addArtifact((TArtifact) baseElement_In);
//        }
//    }
    @Override
    public void removeBaseElement(IBaseElement baseElement_In) {
        if (baseElement_In instanceof FlowNode) {
            flowNodes.remove((FlowNode) baseElement_In);
        } else if (baseElement_In instanceof SequenceFlow) {
            getSequenceFlow().remove((SequenceFlow) baseElement_In);
        }
    }

    @Override
    public void addBaseElement(IBaseElement baseElement_In) {
        if (baseElement_In instanceof FlowNode) {
            flowNodes.add((FlowNode) baseElement_In);
        } else if (baseElement_In instanceof SequenceFlow) {
            getSequenceFlow().add((SequenceFlow) baseElement_In);
        }
    }

    public FlowNode findFlowNode(String id) {
        for (FlowNode flowNode : flowNodes) {
            if (flowNode.getId().equals(id)) {
                return flowNode;
            }
        }
        return null;
    }

    public SequenceFlow findSequenceFlow(String id) {
        for (SequenceFlow sequenceFlow_TMP : sequenceFlow) {
            if (sequenceFlow_TMP.getId().equals(id)) {
                return sequenceFlow_TMP;
            }
        }
        return null;
    }

    /**
     * @return the sequenceFlow
     */
    public List<SequenceFlow> getSequenceFlow() {
        return sequenceFlow;
    }

    /**
     * @param sequenceFlow the sequenceFlow to set
     */
    public void setSequenceFlow(List<SequenceFlow> sequenceFlow) {
        this.sequenceFlow = sequenceFlow;
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

    public Map<FlowNode, SequenceFlow> getTargets(FlowNode source) {
        Map<FlowNode, SequenceFlow> targets = new HashMap<FlowNode, SequenceFlow>();
        for (String id : source.getOutgoing()) {
            SequenceFlow sequenceFlow = findSequenceFlow(id);
            FlowNode flowNode = findFlowNode(sequenceFlow.getTargetRef());
            if (flowNode != null) {
                targets.put(flowNode, sequenceFlow);
            }
        }
        return targets;
    }

    public Map<FlowNode, SequenceFlow> getTargets(String sourceFlowNodeId) {
        return getTargets(findFlowNode(sourceFlowNodeId));
    }

    public Map<FlowNode, SequenceFlow> getSources(FlowNode source) {
        Map<FlowNode, SequenceFlow> sources = new HashMap<FlowNode, SequenceFlow>();
        for (String id : source.getIncoming()) {
            SequenceFlow sequenceFlow = findSequenceFlow(id);
            FlowNode flowNode = findFlowNode(sequenceFlow.getSourceRef());
            if (flowNode != null) {
                sources.put(flowNode, sequenceFlow);
            }
        }
        return sources;
    }

    public Map<FlowNode, SequenceFlow> getSources(String sourceFlowNodeId) {
        return getSources(findFlowNode(sourceFlowNodeId));
    }
}
