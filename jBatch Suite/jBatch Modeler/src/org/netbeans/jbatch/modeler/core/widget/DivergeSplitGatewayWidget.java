/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jbatch.modeler.core.widget;

import java.awt.Color;
import java.awt.Point;
import org.netbeans.api.visual.widget.ConnectionWidget;
import org.netbeans.jbatch.modeler.spec.core.Converge;
import org.netbeans.jbatch.modeler.spec.core.Diverge;
import org.netbeans.modeler.config.document.IModelerDocument;
import org.netbeans.modeler.config.document.ModelerDocumentFactory;
import org.netbeans.modeler.config.palette.SubCategoryNodeConfig;
import org.netbeans.modeler.core.NBModelerUtil;
import org.netbeans.modeler.core.engine.ModelerDiagramEngine;
import org.netbeans.modeler.core.exception.ModelerException;
import org.netbeans.modeler.specification.model.document.IModelerScene;
import org.netbeans.modeler.widget.node.info.NodeWidgetInfo;
import org.openide.util.Exceptions;

/**
 *
 *
 *
 *
 */
public class DivergeSplitGatewayWidget extends SplitGatewayWidget {

    private ConvergeSplitGatewayWidget convergeSplitGatewayWidget;

    public DivergeSplitGatewayWidget(IModelerScene scene, NodeWidgetInfo node) {
        super(scene, node);
    }

    @Override
    public void init() {
        super.init();
        Diverge diverge = (Diverge) this.getBaseElementSpec();
        if (diverge.getConvergeRef() == null) {
            createConvergeWidget();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
        if (convergeSplitGatewayWidget != null) {
            convergeSplitGatewayWidget.setDivergeSplitGatewayWidget(null);
            convergeSplitGatewayWidget.remove();
            convergeSplitGatewayWidget = null;
        }
    }

    ConnectionWidget lineWidget;

    public void showConnector() {
        lineWidget = new ConnectionWidget(this.getScene());
        lineWidget.setStroke(ModelerDiagramEngine.ALIGN_STROKE);
        lineWidget.setForeground(Color.LIGHT_GRAY);
        lineWidget.setSourceAnchor(this.getModelerScene().getModelerFile().getModelerUtil().getAnchor(this));
        lineWidget.setTargetAnchor(this.getModelerScene().getModelerFile().getModelerUtil().getAnchor(this.getConvergeSplitGatewayWidget()));
        this.getParentWidget().addChild(lineWidget);
    }

    public void hideConnector() {
        if (lineWidget != null) {
            lineWidget.removeFromParent();
            lineWidget = null;
        }
    }

//    public void addOutgoingSequenceFlow(SequenceFlowWidget outgoingSequenceFlow) {
//        super.addOutgoingSequenceFlow(outgoingSequenceFlow);
//        if (this.getOutgoingSequenceFlows().size() == 1) {
//            createConvergeWidget();
//        }
//
//        FlowNodeWidget nodeWidget = outgoingSequenceFlow.getTargetNode();
//        SceneConnectProvider connectProvider = new SceneConnectProvider(null);// ModelerUtil.getEdgeType() will decide EdgeType
//        connectProvider.createConnection(nodeWidget.getModelerScene(), nodeWidget, this.getConvergeSplitGatewayWidget());
//    }
    private void createConvergeWidget() {
        try {
            Converge flowElement = new Converge();
            flowElement.setId(NBModelerUtil.getAutoGeneratedStringId());
            ModelerDocumentFactory modelerDocumentFactory = this.getModelerScene().getModelerFile().getVendorSpecification().getModelerDocumentFactory();

            IModelerDocument document = modelerDocumentFactory.getModelerDocument(flowElement);
            SubCategoryNodeConfig subCategoryNodeConfig = this.getModelerScene().getModelerFile().getVendorSpecification().getPaletteConfig().findSubCategoryNodeConfig(document);
            ConvergeSplitGatewayWidget convergeWidget = (ConvergeSplitGatewayWidget) this.addSiblingWidget(new NodeWidgetInfo("_" + NBModelerUtil.getAutoGeneratedId().toString(), subCategoryNodeConfig, new Point(0, 0)), 200, 0, false, true);

            this.setConvergeSplitGatewayWidget(convergeWidget);
            convergeWidget.setDivergeSplitGatewayWidget(this);

        } catch (ModelerException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

//    public void removeOutgoingSequenceFlow(SequenceFlowWidget outgoingSequenceFlow) {
//        super.removeOutgoingSequenceFlow(outgoingSequenceFlow);
//        if (this.getOutgoingSequenceFlows().size() == 0) {
//            convergeSplitGatewayWidget.remove();
//        }
//    }
    /**
     * @return the convergeSplitGatewayWidget
     */
    public ConvergeSplitGatewayWidget getConvergeSplitGatewayWidget() {
        return convergeSplitGatewayWidget;
    }

    /**
     * @param convergeSplitGatewayWidget the convergeSplitGatewayWidget to set
     */
    public void setConvergeSplitGatewayWidget(ConvergeSplitGatewayWidget convergeSplitGatewayWidget) {
        this.convergeSplitGatewayWidget = convergeSplitGatewayWidget;
        Diverge diverge = (Diverge) this.getBaseElementSpec();
        if (convergeSplitGatewayWidget != null) {
            Converge converge = (Converge) convergeSplitGatewayWidget.getBaseElementSpec();
            diverge.setConvergeRef(converge.getId());
        } else {
            diverge.setConvergeRef(null);
        }
    }

}
