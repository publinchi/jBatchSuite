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
package org.netbeans.jbatch.modeler.widget.properties.user_interface.listener;

import javax.swing.JOptionPane;
import org.netbeans.jbatch.modeler.spec.Listener;
import org.netbeans.jbatch.modeler.spec.Property;
import org.netbeans.modeler.core.ModelerFile;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.Entity;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.RowValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.internal.EntityComponent;

public class ListenerPanel extends EntityComponent<Property> {

    private ModelerFile modelerFile;
    private Listener listener;
    private Boolean isNew;

    /**
     * Creates new form CreateMessagePanel
     */
    public ListenerPanel(ModelerFile modelerFile) {
        super("", true);
        this.modelerFile = modelerFile;
        initComponents();
    }

    @Override
    public void init() {
    }

    @Override
    public void createEntity(Class<? extends Entity> entityWrapperType) {
        this.setTitle("Create new Listener");
        isNew = true;
        if (entityWrapperType == RowValue.class) {
            this.setEntity(new RowValue(new Object[4]));
        }
        reference_TextField.setText("");
//        value_TextField.setText("");
    }

    @Override
    public void updateEntity(Entity<Property> entityValue) {
        this.setTitle("Update Listener");
        isNew = false;
        if (entityValue.getClass() == RowValue.class) {
            this.setEntity(entityValue);
            Object[] row = ((RowValue) entityValue).getRow();
            listener = (Listener) row[0];
            reference_TextField.setText(listener.getRef());
//            value_TextField.setText(property.getValue());
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        name_LayeredPane = new javax.swing.JLayeredPane();
        reference_Label = new javax.swing.JLabel();
        reference_TextField = new javax.swing.JTextField();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        save_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(reference_Label, org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.reference_Label.text_1")); // NOI18N
        name_LayeredPane.add(reference_Label);
        reference_Label.setBounds(0, 0, 90, 14);

        reference_TextField.setText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.reference_TextField.text_1")); // NOI18N
        reference_TextField.setToolTipText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.reference_TextField.toolTipText_1")); // NOI18N
        name_LayeredPane.add(reference_TextField);
        reference_TextField.setBounds(92, 0, 300, 20);

        org.openide.awt.Mnemonics.setLocalizedText(save_Button, org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.save_Button.text_1")); // NOI18N
        save_Button.setToolTipText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.save_Button.toolTipText_1")); // NOI18N
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });
        jLayeredPane8.add(save_Button);
        save_Button.setBounds(20, 0, 57, 23);

        org.openide.awt.Mnemonics.setLocalizedText(cancel_Button, org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.cancel_Button.text_1")); // NOI18N
        cancel_Button.setToolTipText(org.openide.util.NbBundle.getMessage(ListenerPanel.class, "ListenerPanel.cancel_Button.toolTipText_1")); // NOI18N
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });
        jLayeredPane8.add(cancel_Button);
        cancel_Button.setBounds(90, 0, 73, 23);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(name_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(name_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(name_LayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private boolean validateField() {
        if (this.reference_TextField.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
            JOptionPane.showMessageDialog(this, "Reference can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }//I18n
        return true;
    }

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        if (!validateField()) {
            return;
        }
        RowValue rowValue = (RowValue) this.getEntity();
        Object[] row = rowValue.getRow();
        if (isNew) {
            listener = new Listener();
//            property.setId(NBModelerUtil.getAutoGeneratedStringId());
        }
        row[0] = listener;
        listener.setRef(reference_TextField.getText().trim());
        row[1] = reference_TextField.getText().trim();

//        if (!value_TextField.getText().trim().isEmpty()) { //BUG : Id change on every update
//            listener.setValue(value_TextField.getText().trim());
//        }
//        row[2] = listener.getValue();
        saveActionPerformed(evt);
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        cancelActionPerformed(evt);
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane name_LayeredPane;
    private javax.swing.JLabel reference_Label;
    private javax.swing.JTextField reference_TextField;
    private javax.swing.JButton save_Button;
    // End of variables declaration//GEN-END:variables
}
