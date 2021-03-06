
package nmsvrscreenshotfix;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Handles visual aspects of the main window as well as all program popups.
 * @author Noah Ortega
 */
public class ProgramUI extends javax.swing.JFrame {

    LogicController controller = LogicController.getInstance();
    
    String[] fileErrorOptions = {"Okay","Okay, Skip Remaining Errors","Cancel Execution"};
    
    public ProgramUI() {
        initComponents();
        resultFolderField.setText(controller.resultPath);
        sourceFolderField.setText(controller.sourcePath);
        behaviorTextArea.setText(controller.getCurrentBehaviorString());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sourceFolderField = new javax.swing.JTextField();
        sourceFolderButton = new javax.swing.JButton();
        resultFolderField = new javax.swing.JTextField();
        resultFolderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        behaviorTextArea = new javax.swing.JTextArea();
        settingsButton = new javax.swing.JButton();
        executeButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NMS VR Screenshot Fix");
        setResizable(false);

        jLabel2.setText("Source Folder:");

        jLabel1.setText("Behavior:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setText("Result Folder:");

        sourceFolderField.setText("err");
        sourceFolderField.setMaximumSize(new java.awt.Dimension(2147483647, 32));
        sourceFolderField.setMinimumSize(new java.awt.Dimension(14, 32));
        sourceFolderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceFolderFieldActionPerformed(evt);
            }
        });

        sourceFolderButton.setText("...");
        sourceFolderButton.setMaximumSize(new java.awt.Dimension(22, 22));
        sourceFolderButton.setMinimumSize(new java.awt.Dimension(22, 22));
        sourceFolderButton.setPreferredSize(new java.awt.Dimension(32, 32));
        sourceFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceFolderButtonActionPerformed(evt);
            }
        });

        resultFolderField.setText("err");
        resultFolderField.setMaximumSize(new java.awt.Dimension(2147483647, 32));
        resultFolderField.setMinimumSize(new java.awt.Dimension(14, 32));
        resultFolderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFolderFieldActionPerformed(evt);
            }
        });

        resultFolderButton.setText("...");
        resultFolderButton.setMaximumSize(new java.awt.Dimension(22, 22));
        resultFolderButton.setMinimumSize(new java.awt.Dimension(22, 22));
        resultFolderButton.setPreferredSize(new java.awt.Dimension(32, 32));
        resultFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFolderButtonActionPerformed(evt);
            }
        });

        behaviorTextArea.setEditable(false);
        behaviorTextArea.setColumns(20);
        behaviorTextArea.setLineWrap(true);
        behaviorTextArea.setRows(5);
        behaviorTextArea.setText("• Make copies of converted screenshots\n• Add prefix \" new_\" to the new image\n• Ex: \"image.png\" -> \"new_image.png\"\n");
        jScrollPane2.setViewportView(behaviorTextArea);

        settingsButton.setText("Behavior Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        executeButton.setText("Execute");
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(executeButton)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(settingsButton))
                    .addComponent(resultFolderField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(sourceFolderField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sourceFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultFolderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(256, 256, 256))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sourceFolderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sourceFolderField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(resultFolderField, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resultFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(executeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        if(controller.getIsExecuting()) {
            controller.cancelExecution();
        }
        else {
            controller.sourcePath = sourceFolderField.getText();
            controller.resultPath = resultFolderField.getText();
            if (controller.hasValidDirectoryPaths()) {
                controller.execute();
            }
            else {
                errorInvalidPath();
            }
        }
    }//GEN-LAST:event_executeButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        new SettingsUI(this,true).setVisible(true);
        behaviorTextArea.setText(controller.getCurrentBehaviorString());
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void resultFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFolderButtonActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int optionCode = jfc.showSaveDialog(null);

        if (optionCode == JFileChooser.APPROVE_OPTION) {
            controller.resultPath = jfc.getSelectedFile().getAbsolutePath();
            resultFolderField.setText(controller.resultPath);
            behaviorTextArea.setText(controller.getCurrentBehaviorString());
        }
    }//GEN-LAST:event_resultFolderButtonActionPerformed

    private void resultFolderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFolderFieldActionPerformed
        controller.resultPath = resultFolderField.getText();
        behaviorTextArea.setText(controller.getCurrentBehaviorString());
    }//GEN-LAST:event_resultFolderFieldActionPerformed

    private void sourceFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceFolderButtonActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int optionCode = jfc.showSaveDialog(null);

        if (optionCode == JFileChooser.APPROVE_OPTION) {
            controller.sourcePath = jfc.getSelectedFile().getAbsolutePath();
            sourceFolderField.setText(controller.sourcePath);
            behaviorTextArea.setText(controller.getCurrentBehaviorString());
        }
    }//GEN-LAST:event_sourceFolderButtonActionPerformed

    private void sourceFolderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceFolderFieldActionPerformed
        controller.sourcePath = sourceFolderField.getText();
        behaviorTextArea.setText(controller.getCurrentBehaviorString());
    }//GEN-LAST:event_sourceFolderFieldActionPerformed
    
    /**
     * enables or disables all interactive UI elements except for the execute/cancel button
     * depending on if the program is executing. prevents editing settings while executing.
     */
    public void toggleUI() {
        boolean shouldEnable = !controller.getIsExecuting();
        settingsButton.setEnabled(shouldEnable);
        sourceFolderField.setEnabled(shouldEnable);
        sourceFolderButton.setEnabled(shouldEnable);
        resultFolderField.setEnabled(shouldEnable);
        resultFolderButton.setEnabled(shouldEnable);
        
        if(controller.getIsExecuting()) {
            executeButton.setText("cancel");
        } else {
            executeButton.setText("execute");
        }
    }
    
    /**
     * Allows the logic controller to change the value of the progress bar
     * @param value percentage the progress bar should be filled. (max 100)
     */
    public void updateProgressBar(int value) {
        progressBar.setValue(value);
    }
    
    /**
     * Popup triggered when execution is completed. If no files were converted the
     * user is given a warning popup instead of a success popup.
     * @param converted number of converted files during execution
     */
    public void completePopup(int converted) {
        if(converted != 0) {
            JOptionPane.showMessageDialog(this,
            ("" + converted + " images were converted successfully."),
            "Complete", JOptionPane.INFORMATION_MESSAGE);
            progressBar.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this,
            ("No images were able to be converted from in the source folder."),
            "Error: No images found", JOptionPane.WARNING_MESSAGE);
            progressBar.setValue(0);
        }
    }
    
    /**
     * Popup triggered if execution is canceled before completion. 
     * Tells the user how many files were converted before cancellation.
     * @param converted number of files converted before cancellation
     */
    public void cancelPopup(int converted) {
        JOptionPane.showMessageDialog(this,
            "Converted " + converted + " files before canceling.",
            "Canceled", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * If the user chooses a settings combination which will result in replacing
     * their original screenshots this warning will give them one last chance to
     * change their mind by canceling execution.
     */
    public void warningReplacingFiles(){
        int choice = JOptionPane.showOptionDialog(this,
            "By continuing you will be replacing your original screenshots. This cannot be undone.\n"
                + "Please press Cancel and change the behavior settings if this was not intended.",
            "Replacing Files",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
            null,null,null);
        if(choice != 0) {
            controller.cancelExecution();
        }
    }
    
    /**
     * Popup triggers on attempted execution when the source or destination 
     * folder path is invalid.
     */
    public void errorInvalidPath() {
        JOptionPane.showMessageDialog(this,
            "One or both of the folder paths do not lead to a valid folder.\n"
                + "Make sure the source and destination folders you choose exist.",
            "Error: invalid folder path", JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Popup triggers during execution when an image cannot be read due to corruption.
     * Gives user the option to skip remaining errors or cancel the operation.
     * @param fileName the name of the corrupt image file
     */
    public void errorCorruptImage(String fileName) {
        int choice = JOptionPane.showOptionDialog(this,
            "The image file '" + fileName + "' cannot be read and may be corrupt.",
            "Corrupt File Error: Cancel Execution?",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,
            null,fileErrorOptions,fileErrorOptions[0]);
        controller.userErrorResponse(choice);
    }
    
    /**
     * Popup triggers if an image cannot be read from the source folder.
     * Gives user the option to skip remaining errors or cancel the operation.
     */
    public void errorReading(String fileName) {
        int choice = JOptionPane.showOptionDialog(this,
            "There was a problem reading the file, '"+fileName+"' from the source folder.",
            "Read Error: Cancel Execution?",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,
            null,fileErrorOptions,fileErrorOptions[0]);
        controller.userErrorResponse(choice);
    }
    
    /**
     * Popup triggers if an image cannot be written to the destination folder
     * Gives user the option to skip remaining errors or cancel the operation.
     */
    public void errorWriting(String fileName) {
        int choice = JOptionPane.showOptionDialog(this,
            "There was a problem writing the file '"+fileName+"' to the destination folder.",
            "Write Error: Cancel Execution?",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,
            null,fileErrorOptions,fileErrorOptions[0]);
        controller.userErrorResponse(choice);
    }
    
    
    
    //////////////////////////////////////////////////////////////////////
    // Settings Menu: text addition issue warning popups
    /////////////////////////////////////////////////////////////////////
    
    public void warningEmptyText() {
        JOptionPane.showMessageDialog(this,
            "The 'Text to be added' field cannot be left empty.",
            "Text left empty", JOptionPane.WARNING_MESSAGE);
    }
    
    public void warningExceededTextLimit() {
        JOptionPane.showMessageDialog(this,
            "Added text cannot exceed "+controller.MAX_ADD_TEXT_LENGTH+" characters.",
            "Text too long", JOptionPane.WARNING_MESSAGE);
    }
    
    public void warningInvalidText(char invalidChar) {
        JOptionPane.showMessageDialog(this,
            "Text must contain only alphanumeric characters, '_', and '-'.\nInvalid character: '"+invalidChar+"'.",
            "Invalid character in the text", JOptionPane.WARNING_MESSAGE);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea behaviorTextArea;
    private javax.swing.JButton executeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton resultFolderButton;
    private javax.swing.JTextField resultFolderField;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton sourceFolderButton;
    private javax.swing.JTextField sourceFolderField;
    // End of variables declaration//GEN-END:variables
}
