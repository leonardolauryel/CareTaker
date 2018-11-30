/*
 * Created by JFormDesigner on Fri Nov 30 05:52:17 BRST 2018
 */

package trab.caretaker.view;

import trab.caretaker.control.SmartPhone;
import trab.caretaker.control.Watch;

import java.awt.*;
import java.awt.event.*;
import java.util.Map;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author CareTaker team
 */
public class Window extends JFrame {
    Watch watch;
    SmartPhone smartPhone;
    Boolean onArm;

    public Window() {
        super("CareTaker");
        initComponents();
        setContentPane(mainPanel);
        setSize(1120,815);
        setVisible(true);
        onArm = false;
        watch = new Watch();
        smartPhone = new SmartPhone();

    }

    private void btnFallActionPerformed(ActionEvent e) {
        watch.updateMotionSensorStatus(true, onArm);
    }

    private void cboxOnFistActionPerformed(ActionEvent e) {
        onArm = !onArm;
    }

    private void btnAddContactActionPerformed(ActionEvent e) {
        smartPhone.addContact(contactName.getText(), contactNumber.getText());
        phoneText.append("Contato adicionado\n");
    }

    private void btnAddEmergencyContactActionPerformed(ActionEvent e) {
        smartPhone.setEmergencyNumber(emergencyNumber.getText());
        phoneText.append("Contato de emergência definido\n");
    }

    private void btnShowContactListActionPerformed(ActionEvent e) {
        Map<String, String> contacts= smartPhone.getContacts();
        phoneText.append("Lista de contatos:\n");
        contacts.forEach((k,v) -> phoneText.append(k + ": " + v + "\n"));

    }

    private void btnShowEmergencyContactActionPerformed(ActionEvent e) {
        phoneText.append((smartPhone.getEmergencyNumber() != null ? "Telefone de emergência: " + smartPhone.getEmergencyNumber() : "Nenhum número de emergência foi cadastrado") + "\n");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pedro
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        smartphonePanel = new JPanel();
        label5 = new JLabel();
        panel9 = new JPanel();
        panel5 = new JPanel();
        panel10 = new JPanel();
        scrollPane1 = new JScrollPane();
        phoneText = new JTextArea();
        btnShowContactList = new JButton();
        btnShowEmergencyContact = new JButton();
        label9 = new JLabel();
        label10 = new JLabel();
        contactNumber = new JFormattedTextField();
        btnAddContact = new JButton();
        btnAddEmergencyContact = new JButton();
        label11 = new JLabel();
        emergencyNumber = new JFormattedTextField();
        contactName = new JTextField();
        fallSimulatorPanel = new JPanel();
        cboxOnFist = new JCheckBox();
        btnFall = new JButton();
        label4 = new JLabel();
        label3 = new JLabel();
        smartWatchPanel = new JPanel();
        label7 = new JLabel();
        careTakerTitlePanel = new JPanel();
        label1 = new JLabel();
        computerPanel = new JPanel();
        label2 = new JLabel();
        panel7 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        panel8 = new JPanel();
        label6 = new JLabel();

        //======== mainFrame ========
        {
            mainFrame.setResizable(false);
            Container mainFrameContentPane = mainFrame.getContentPane();

            //======== mainPanel ========
            {

                // JFormDesigner evaluation mark
                mainPanel.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), mainPanel.getBorder())); mainPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //======== smartphonePanel ========
                {
                    smartphonePanel.setForeground(new Color(135, 13, 16));
                    smartphonePanel.setBackground(Color.white);

                    //---- label5 ----
                    label5.setText("Smartphone");
                    label5.setHorizontalAlignment(SwingConstants.CENTER);
                    label5.setForeground(Color.black);
                    label5.setFont(new Font("URW Palladio L", Font.BOLD, 26));

                    //======== panel9 ========
                    {
                        panel9.setBackground(new Color(131, 8, 6));

                        //======== panel5 ========
                        {
                            panel5.setBackground(Color.black);

                            GroupLayout panel5Layout = new GroupLayout(panel5);
                            panel5.setLayout(panel5Layout);
                            panel5Layout.setHorizontalGroup(
                                panel5Layout.createParallelGroup()
                                    .addGap(0, 44, Short.MAX_VALUE)
                            );
                            panel5Layout.setVerticalGroup(
                                panel5Layout.createParallelGroup()
                                    .addGap(0, 46, Short.MAX_VALUE)
                            );
                        }

                        //======== panel10 ========
                        {
                            panel10.setBackground(Color.black);

                            //======== scrollPane1 ========
                            {

                                //---- phoneText ----
                                phoneText.setEditable(false);
                                phoneText.setSelectedTextColor(new Color(51, 51, 51));
                                scrollPane1.setViewportView(phoneText);
                            }

                            //---- btnShowContactList ----
                            btnShowContactList.setText("Ver lista de contatos");
                            btnShowContactList.addActionListener(e -> btnShowContactListActionPerformed(e));

                            //---- btnShowEmergencyContact ----
                            btnShowEmergencyContact.setText("Ver telefone de emerg\u00eancia");
                            btnShowEmergencyContact.setFont(new Font("Ubuntu", Font.PLAIN, 12));
                            btnShowEmergencyContact.addActionListener(e -> btnShowEmergencyContactActionPerformed(e));

                            GroupLayout panel10Layout = new GroupLayout(panel10);
                            panel10.setLayout(panel10Layout);
                            panel10Layout.setHorizontalGroup(
                                panel10Layout.createParallelGroup()
                                    .addGroup(panel10Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel10Layout.createParallelGroup()
                                            .addComponent(scrollPane1)
                                            .addComponent(btnShowEmergencyContact, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                            .addGroup(panel10Layout.createSequentialGroup()
                                                .addComponent(btnShowContactList, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addContainerGap())
                            );
                            panel10Layout.setVerticalGroup(
                                panel10Layout.createParallelGroup()
                                    .addGroup(panel10Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                        .addComponent(btnShowContactList)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnShowEmergencyContact)
                                        .addContainerGap())
                            );
                        }

                        GroupLayout panel9Layout = new GroupLayout(panel9);
                        panel9.setLayout(panel9Layout);
                        panel9Layout.setHorizontalGroup(
                            panel9Layout.createParallelGroup()
                                .addGroup(panel9Layout.createSequentialGroup()
                                    .addGroup(panel9Layout.createParallelGroup()
                                        .addGroup(panel9Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(panel10, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel9Layout.createSequentialGroup()
                                            .addGap(89, 89, 89)
                                            .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(28, Short.MAX_VALUE))
                        );
                        panel9Layout.setVerticalGroup(
                            panel9Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(panel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(12, 12, 12)
                                    .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                        );
                    }

                    //---- label9 ----
                    label9.setText("Nome");
                    label9.setForeground(Color.black);

                    //---- label10 ----
                    label10.setText("Telefone");
                    label10.setForeground(Color.black);

                    //---- btnAddContact ----
                    btnAddContact.setText("Adicionar Contato");
                    btnAddContact.addActionListener(e -> btnAddContactActionPerformed(e));

                    //---- btnAddEmergencyContact ----
                    btnAddEmergencyContact.setText("Adicionar telefone de emerg\u00eancia");
                    btnAddEmergencyContact.setFont(new Font("Ubuntu", Font.PLAIN, 12));
                    btnAddEmergencyContact.addActionListener(e -> btnAddEmergencyContactActionPerformed(e));

                    //---- label11 ----
                    label11.setText("Telefone de emerg\u00eancia");
                    label11.setForeground(Color.black);
                    label11.setFont(new Font("Ubuntu", Font.PLAIN, 10));

                    GroupLayout smartphonePanelLayout = new GroupLayout(smartphonePanel);
                    smartphonePanel.setLayout(smartphonePanelLayout);
                    smartphonePanelLayout.setHorizontalGroup(
                        smartphonePanelLayout.createParallelGroup()
                            .addGroup(smartphonePanelLayout.createSequentialGroup()
                                .addGroup(smartphonePanelLayout.createParallelGroup()
                                    .addGroup(smartphonePanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(smartphonePanelLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(panel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(smartphonePanelLayout.createSequentialGroup()
                                .addGroup(smartphonePanelLayout.createParallelGroup()
                                    .addGroup(smartphonePanelLayout.createSequentialGroup()
                                        .addGroup(smartphonePanelLayout.createParallelGroup()
                                            .addGroup(smartphonePanelLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(label9)
                                                .addGap(16, 16, 16))
                                            .addGroup(GroupLayout.Alignment.TRAILING, smartphonePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label10)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(smartphonePanelLayout.createParallelGroup()
                                            .addComponent(contactName, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(smartphonePanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(contactNumber, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddContact, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                                    .addGroup(smartphonePanelLayout.createSequentialGroup()
                                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emergencyNumber, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(smartphonePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAddEmergencyContact, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    smartphonePanelLayout.setVerticalGroup(
                        smartphonePanelLayout.createParallelGroup()
                            .addGroup(smartphonePanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(smartphonePanelLayout.createParallelGroup()
                                    .addComponent(btnAddContact)
                                    .addGroup(smartphonePanelLayout.createSequentialGroup()
                                        .addGroup(smartphonePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(contactName, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label9))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(smartphonePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(contactNumber, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label10))
                                        .addGap(18, 18, 18)
                                        .addGroup(smartphonePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label11)
                                            .addComponent(emergencyNumber, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddEmergencyContact)
                                .addContainerGap())
                    );
                }

                //======== fallSimulatorPanel ========
                {
                    fallSimulatorPanel.setBackground(new Color(60, 121, 35));

                    //---- cboxOnFist ----
                    cboxOnFist.setText("Est\u00e1 no pulso");
                    cboxOnFist.setBackground(new Color(60, 121, 35));
                    cboxOnFist.setForeground(Color.white);
                    cboxOnFist.setFont(new Font("Ubuntu", Font.BOLD, 20));
                    cboxOnFist.addActionListener(e -> cboxOnFistActionPerformed(e));

                    //---- btnFall ----
                    btnFall.setText("Queda");
                    btnFall.setFont(new Font("Ubuntu", Font.BOLD, 20));
                    btnFall.setForeground(Color.white);
                    btnFall.setBackground(new Color(60, 121, 35));
                    btnFall.addActionListener(e -> btnFallActionPerformed(e));

                    //---- label4 ----
                    label4.setText("text");
                    label4.setIcon(new ImageIcon("/home/pedro/Documentos/CareTaker/src/img/menino-ney_burned.png"));

                    //---- label3 ----
                    label3.setText("Simulador de quedas");
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    label3.setForeground(Color.white);
                    label3.setFont(new Font("URW Palladio L", Font.BOLD, 26));

                    GroupLayout fallSimulatorPanelLayout = new GroupLayout(fallSimulatorPanel);
                    fallSimulatorPanel.setLayout(fallSimulatorPanelLayout);
                    fallSimulatorPanelLayout.setHorizontalGroup(
                        fallSimulatorPanelLayout.createParallelGroup()
                            .addGroup(fallSimulatorPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(fallSimulatorPanelLayout.createParallelGroup()
                                    .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(fallSimulatorPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cboxOnFist, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFall, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    fallSimulatorPanelLayout.setVerticalGroup(
                        fallSimulatorPanelLayout.createParallelGroup()
                            .addGroup(fallSimulatorPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fallSimulatorPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboxOnFist, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFall))
                                .addContainerGap(11, Short.MAX_VALUE))
                    );
                }

                //======== smartWatchPanel ========
                {
                    smartWatchPanel.setBackground(new Color(105, 16, 19));

                    //---- label7 ----
                    label7.setText("SmartWatch");
                    label7.setHorizontalAlignment(SwingConstants.CENTER);
                    label7.setFont(new Font("URW Palladio L", Font.BOLD, 26));
                    label7.setForeground(Color.white);

                    GroupLayout smartWatchPanelLayout = new GroupLayout(smartWatchPanel);
                    smartWatchPanel.setLayout(smartWatchPanelLayout);
                    smartWatchPanelLayout.setHorizontalGroup(
                        smartWatchPanelLayout.createParallelGroup()
                            .addGroup(smartWatchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label7, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    smartWatchPanelLayout.setVerticalGroup(
                        smartWatchPanelLayout.createParallelGroup()
                            .addGroup(smartWatchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(247, Short.MAX_VALUE))
                    );
                }

                //======== careTakerTitlePanel ========
                {
                    careTakerTitlePanel.setBackground(new Color(60, 215, 231));

                    //---- label1 ----
                    label1.setText("Care Taker");
                    label1.setForeground(Color.white);
                    label1.setFont(new Font("Noto Sans Mono CJK KR Bold", Font.BOLD, 48));
                    label1.setHorizontalAlignment(SwingConstants.CENTER);

                    GroupLayout careTakerTitlePanelLayout = new GroupLayout(careTakerTitlePanel);
                    careTakerTitlePanel.setLayout(careTakerTitlePanelLayout);
                    careTakerTitlePanelLayout.setHorizontalGroup(
                        careTakerTitlePanelLayout.createParallelGroup()
                            .addGroup(careTakerTitlePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    careTakerTitlePanelLayout.setVerticalGroup(
                        careTakerTitlePanelLayout.createParallelGroup()
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    );
                }

                //======== computerPanel ========
                {
                    computerPanel.setBackground(Color.black);

                    //---- label2 ----
                    label2.setText("Computer");
                    label2.setForeground(Color.white);
                    label2.setHorizontalAlignment(SwingConstants.CENTER);
                    label2.setFont(new Font("URW Palladio L", Font.BOLD, 26));

                    //======== panel7 ========
                    {

                        //======== scrollPane2 ========
                        {

                            //---- textArea2 ----
                            textArea2.setEditable(false);
                            scrollPane2.setViewportView(textArea2);
                        }

                        GroupLayout panel7Layout = new GroupLayout(panel7);
                        panel7.setLayout(panel7Layout);
                        panel7Layout.setHorizontalGroup(
                            panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        panel7Layout.setVerticalGroup(
                            panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel8 ========
                    {

                        GroupLayout panel8Layout = new GroupLayout(panel8);
                        panel8.setLayout(panel8Layout);
                        panel8Layout.setHorizontalGroup(
                            panel8Layout.createParallelGroup()
                                .addGap(0, 54, Short.MAX_VALUE)
                        );
                        panel8Layout.setVerticalGroup(
                            panel8Layout.createParallelGroup()
                                .addGap(0, 36, Short.MAX_VALUE)
                        );
                    }

                    //---- label6 ----
                    label6.setIcon(new ImageIcon("/home/pedro/Documentos/CareTaker/src/img/mk220_1_1.png"));

                    GroupLayout computerPanelLayout = new GroupLayout(computerPanel);
                    computerPanel.setLayout(computerPanelLayout);
                    computerPanelLayout.setHorizontalGroup(
                        computerPanelLayout.createParallelGroup()
                            .addGroup(computerPanelLayout.createSequentialGroup()
                                .addGroup(computerPanelLayout.createParallelGroup()
                                    .addGroup(computerPanelLayout.createSequentialGroup()
                                        .addGap(476, 476, 476)
                                        .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(computerPanelLayout.createSequentialGroup()
                                        .addGap(283, 283, 283)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(computerPanelLayout.createSequentialGroup()
                                        .addGap(212, 212, 212)
                                        .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(computerPanelLayout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(label6)))
                                .addContainerGap(66, Short.MAX_VALUE))
                    );
                    computerPanelLayout.setVerticalGroup(
                        computerPanelLayout.createParallelGroup()
                            .addGroup(computerPanelLayout.createSequentialGroup()
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                    mainPanelLayout.createParallelGroup()
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup()
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(smartphonePanel, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(mainPanelLayout.createParallelGroup()
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(smartWatchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fallSimulatorPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(computerPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(careTakerTitlePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                );
                mainPanelLayout.setVerticalGroup(
                    mainPanelLayout.createParallelGroup()
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(careTakerTitlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(mainPanelLayout.createParallelGroup()
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(smartWatchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fallSimulatorPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(computerPanel, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(smartphonePanel, GroupLayout.PREFERRED_SIZE, 613, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
            }

            GroupLayout mainFrameContentPaneLayout = new GroupLayout(mainFrameContentPane);
            mainFrameContentPane.setLayout(mainFrameContentPaneLayout);
            mainFrameContentPaneLayout.setHorizontalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            mainFrameContentPaneLayout.setVerticalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, mainFrameContentPaneLayout.createSequentialGroup()
                        .addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 762, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
            );
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(mainFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pedro
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JPanel smartphonePanel;
    private JLabel label5;
    private JPanel panel9;
    private JPanel panel5;
    private JPanel panel10;
    private JScrollPane scrollPane1;
    private JTextArea phoneText;
    private JButton btnShowContactList;
    private JButton btnShowEmergencyContact;
    private JLabel label9;
    private JLabel label10;
    private JFormattedTextField contactNumber;
    private JButton btnAddContact;
    private JButton btnAddEmergencyContact;
    private JLabel label11;
    private JFormattedTextField emergencyNumber;
    private JTextField contactName;
    private JPanel fallSimulatorPanel;
    private JCheckBox cboxOnFist;
    private JButton btnFall;
    private JLabel label4;
    private JLabel label3;
    private JPanel smartWatchPanel;
    private JLabel label7;
    private JPanel careTakerTitlePanel;
    private JLabel label1;
    private JPanel computerPanel;
    private JLabel label2;
    private JPanel panel7;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JPanel panel8;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
