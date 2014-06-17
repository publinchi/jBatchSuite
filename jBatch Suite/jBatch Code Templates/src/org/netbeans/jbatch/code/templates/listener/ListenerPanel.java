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
package org.netbeans.jbatch.code.templates.listener;

import java.util.HashSet;
import java.util.Set;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.netbeans.jbatch.code.templates.wizard.ConstraintIterator;
import org.netbeans.jbatch.code.templates.wizard.WizardPanel;
import org.openide.loaders.TemplateWizard;
import org.openide.util.NbBundle;

public class ListenerPanel extends WizardPanel implements DocumentListener {

    /**
     * Creates new form ListenerPanelVisual
     */
    public ListenerPanel(TemplateWizard wizard) {
        super(wizard);
        initComponents();
        injectedName_TextField.getDocument().addDocumentListener(this);
        listener_ComboBoxActionPerformed(null);
    }
    private final Set<ChangeListener> listeners = new HashSet<ChangeListener>(1);

    public final void addChangeListener(ChangeListener l) {
        synchronized (listeners) {
            listeners.add(l);
        }
    }

    public final void removeChangeListener(ChangeListener l) {
        synchronized (listeners) {
            listeners.remove(l);
        }
    }

    private void fireChangeEvent() {
        ChangeEvent e = new ChangeEvent(this);
        for (ChangeListener l : listeners) {
            l.stateChanged(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        injectedName_Label = new javax.swing.JLabel();
        injectedName_TextField = new javax.swing.JTextField();
        controlType_LayeredPane = new javax.swing.JLayeredPane();
        readListenerType_CheckBox = new javax.swing.JCheckBox();
        processListenerType_CheckBox = new javax.swing.JCheckBox();
        writeListenerType_CheckBox = new javax.swing.JCheckBox();
        listener_Label = new javax.swing.JLabel();
        listener_ComboBox = new javax.swing.JComboBox();

        injectedName_Label.setText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.injectedName_Label.text")); // NOI18N

        injectedName_TextField.setColumns(20);

        controlType_LayeredPane.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.controlType_LayeredPane.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        controlType_LayeredPane.setLayout(new java.awt.GridLayout(3, 1));

        readListenerType_CheckBox.setText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.readListenerType_CheckBox.text")); // NOI18N
        readListenerType_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readListenerType_CheckBoxActionPerformed(evt);
            }
        });
        controlType_LayeredPane.add(readListenerType_CheckBox);

        processListenerType_CheckBox.setText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.processListenerType_CheckBox.text")); // NOI18N
        processListenerType_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processListenerType_CheckBoxActionPerformed(evt);
            }
        });
        controlType_LayeredPane.add(processListenerType_CheckBox);

        writeListenerType_CheckBox.setText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.writeListenerType_CheckBox.text")); // NOI18N
        writeListenerType_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeListenerType_CheckBoxActionPerformed(evt);
            }
        });
        controlType_LayeredPane.add(writeListenerType_CheckBox);

        listener_Label.setText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.listener_Label.text")); // NOI18N

        listener_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Job", "Step", "Chunk", "Item", "Skip", "Retry" }));
        listener_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listener_ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(injectedName_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(injectedName_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listener_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controlType_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(listener_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(injectedName_Label)
                    .addComponent(injectedName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listener_Label)
                    .addComponent(listener_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controlType_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void readListenerType_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readListenerType_CheckBoxActionPerformed
        fireChangeEvent();
    }//GEN-LAST:event_readListenerType_CheckBoxActionPerformed

    private void processListenerType_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processListenerType_CheckBoxActionPerformed
        fireChangeEvent();
    }//GEN-LAST:event_processListenerType_CheckBoxActionPerformed

    private void writeListenerType_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeListenerType_CheckBoxActionPerformed
        fireChangeEvent();
    }//GEN-LAST:event_writeListenerType_CheckBoxActionPerformed

    private void listener_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listener_ComboBoxActionPerformed
        if(listener_ComboBox.getSelectedItem().equals("Item") || 
                listener_ComboBox.getSelectedItem().equals("Skip") || 
                listener_ComboBox.getSelectedItem().equals("Retry")){
            controlType_LayeredPane.setVisible(true);
        } else {
            controlType_LayeredPane.setVisible(false);
        }
        fireChangeEvent();
    }//GEN-LAST:event_listener_ComboBoxActionPerformed

    public boolean validateTemplate(TemplateWizard wizard) {
        this.setWizard(wizard);
        wizard.putProperty(TemplateWizard.PROP_ERROR_MESSAGE, null);
//        if ("".equals(injectedName_TextField.getText().trim())) {
//            wizard.putProperty(TemplateWizard.PROP_ERROR_MESSAGE, NbBundle.getMessage(ConstraintPanelVisual.class, "ERR_Empty_validator_class"));
//            return false;
//        }
        if (listener_ComboBox.getSelectedItem().equals("Item")
                || listener_ComboBox.getSelectedItem().equals("Skip")
                || listener_ComboBox.getSelectedItem().equals("Retry")) {
            if (!readListenerType_CheckBox.isSelected() && !processListenerType_CheckBox.isSelected() && !writeListenerType_CheckBox.isSelected()) {
                wizard.putProperty(TemplateWizard.PROP_ERROR_MESSAGE, NbBundle.getMessage(ListenerPanel.class, "ERR_No_Listener_Type"));
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane controlType_LayeredPane;
    private javax.swing.JLabel injectedName_Label;
    private javax.swing.JTextField injectedName_TextField;
    private javax.swing.JComboBox listener_ComboBox;
    private javax.swing.JLabel listener_Label;
    private javax.swing.JCheckBox processListenerType_CheckBox;
    private javax.swing.JCheckBox readListenerType_CheckBox;
    private javax.swing.JCheckBox writeListenerType_CheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertUpdate(DocumentEvent e) {
        fireChangeEvent();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        fireChangeEvent();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        fireChangeEvent();
    }

    public void store(TemplateWizard settings) {
        settings.putProperty(ConstraintIterator.WizardProperties.NAMED, injectedName_TextField.getText().trim());
        settings.putProperty(ConstraintIterator.WizardProperties.READ, readListenerType_CheckBox.isSelected());
        settings.putProperty(ConstraintIterator.WizardProperties.PROCESS, processListenerType_CheckBox.isSelected());
        settings.putProperty(ConstraintIterator.WizardProperties.WRITE, writeListenerType_CheckBox.isSelected());
        settings.putProperty(ConstraintIterator.WizardProperties.LISTENER, listener_ComboBox.getSelectedItem());
    }
}