/*
 * Created by JFormDesigner on Fri Nov 30 05:52:17 BRST 2018
 */

package trab.caretaker.view;

import javax.swing.event.*;
import trab.caretaker.control.Computer;
import trab.caretaker.control.SmartPhone;
import trab.caretaker.control.Watch;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author CareTaker team
 */
public class Window extends JFrame {
    Watch watch;
    SmartPhone smartPhone;
    Computer computer;

    public Window() {
        super("CareTaker");
        initComponents();
        setContentPane(mainPanel);
        setSize(1115,810);
        setVisible(true);
        watch = new Watch();
        smartPhone = new SmartPhone();
        computer = new Computer();
    }

    private void btnFallActionPerformed(ActionEvent e) {
        watch.updateMotionSensorStatus(true, cboxOnFist.isSelected());
        if(watch.fallDetect()){
            smartPhone.sendEmergencyMessage();
            phoneText.append(smartPhone.getScreen());
            smartPhone.callToEmergencyNumber();
            phoneText.append(smartPhone.getScreen());
        }

    }

    private void btnAddContactActionPerformed(ActionEvent e) {
        Boolean itsANumber = false;
        String phone = null;
        Boolean cancel = false;
        while(!itsANumber && !cancel) {
            try {
                phone = JOptionPane.showInputDialog("Digite o telefone do novo contato");
                if(phone != null) {
                    Long.parseLong(phone);
                    itsANumber = true;
                }
                else
                    cancel = true;
            } catch (NumberFormatException exception) {
                itsANumber = false;
                JOptionPane.showMessageDialog(null, "Isso não é um número!");
            }
        }
        if(itsANumber && !cancel) {
            smartPhone.addContact(JOptionPane.showInputDialog("Digite o nome do contato"), phone);
            phoneText.append(smartPhone.getScreen());
        }

    }

    private void btnAddEmergencyContactActionPerformed(ActionEvent e) {
        Boolean itsANumber = false;
        String phone= null;
        Boolean cancel = false;
        while(!itsANumber && !cancel) {
            try {
                phone = JOptionPane.showInputDialog("Digite o telefone de emergência");
                if(phone != null) {
                    Long.parseLong(phone);
                    itsANumber = true;
                }
                else
                    cancel = true;
            } catch (NumberFormatException exception) {
                itsANumber = false;
                JOptionPane.showMessageDialog(null, "Isso não é um número!");
            }
        }
        if(itsANumber && !cancel) {
            smartPhone.setEmergencyNumber(phone);
            phoneText.append(smartPhone.getScreen());
        }
    }

    private void btnShowContactListActionPerformed(ActionEvent e) {
        smartPhone.showContactList();
        phoneText.append(smartPhone.getScreen());
    }

    private void btnShowEmergencyContactActionPerformed(ActionEvent e) {
        smartPhone.showEmergencyNumber();
        phoneText.append(smartPhone.getScreen());
    }

    private void btnNewEmergencyMessageActionPerformed(ActionEvent e) {
        smartPhone.setEmergencyMessage(JOptionPane.showInputDialog("Digite a mensagem de emergência"));
    }

    private void cboxOnFistActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnSendReportActionPerformed(ActionEvent e) {
        List<String> heartBeatsList = new ArrayList<String>();
        int i;
        for(i=0;i<4;i++){
            watch.updateHeartBeats();
            heartBeatsList.add(String.valueOf(watch.getHeartBeats()));
        }
        computer.sendReport(heartBeatsList);
        computerText.append(computer.getScreen());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pedro
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        smartphonePanel = new JPanel();
        label9 = new JLabel();
        panel9 = new JPanel();
        panel10 = new JPanel();
        scrollPane1 = new JScrollPane();
        phoneText = new JTextArea();
        btnShowContactList = new JButton();
        btnShowEmergencyContact = new JButton();
        btnAddContact = new JButton();
        btnAddEmergencyContact = new JButton();
        fallSimulatorPanel = new JPanel();
        cboxOnFist = new JCheckBox();
        btnFall = new JButton();
        label4 = new JLabel();
        label3 = new JLabel();
        smartWatchPanel = new JPanel();
        btnNewEmergencyMessage = new JButton();
        label5 = new JLabel();
        careTakerTitlePanel = new JPanel();
        label1 = new JLabel();
        computerPanel = new JPanel();
        label6 = new JLabel();
        panel7 = new JPanel();
        btnSendReport = new JButton();
        scrollPane2 = new JScrollPane();
        computerText = new JTextArea();
        panel8 = new JPanel();

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
                    smartphonePanel.setLayout(null);

                    //---- label9 ----
                    label9.setIcon(new ImageIcon(getClass().getResource("/img/Celular.png")));
                    smartphonePanel.add(label9);
                    label9.setBounds(35, 20, 265, label9.getPreferredSize().height);

                    //======== panel9 ========
                    {
                        panel9.setBackground(Color.red);
                        panel9.setLayout(null);

                        //======== panel10 ========
                        {
                            panel10.setBackground(Color.black);
                            panel10.setLayout(null);

                            //======== scrollPane1 ========
                            {

                                //---- phoneText ----
                                phoneText.setEditable(false);
                                phoneText.setSelectedTextColor(new Color(51, 51, 51));
                                phoneText.setFont(new Font("Monospaced", Font.PLAIN, 12));
                                scrollPane1.setViewportView(phoneText);
                            }
                            panel10.add(scrollPane1);
                            scrollPane1.setBounds(25, 20, 191, 159);

                            //---- btnShowContactList ----
                            btnShowContactList.setText("Ver lista de contatos");
                            btnShowContactList.setFont(new Font("Ubuntu", Font.BOLD, 14));
                            btnShowContactList.addActionListener(e -> btnShowContactListActionPerformed(e));
                            panel10.add(btnShowContactList);
                            btnShowContactList.setBounds(20, 330, 200, btnShowContactList.getPreferredSize().height);

                            //---- btnShowEmergencyContact ----
                            btnShowEmergencyContact.setText("Ver telefone de emerg\u00eancia");
                            btnShowEmergencyContact.setFont(new Font("Ubuntu", Font.BOLD, 12));
                            btnShowEmergencyContact.addActionListener(e -> btnShowEmergencyContactActionPerformed(e));
                            panel10.add(btnShowEmergencyContact);
                            btnShowEmergencyContact.setBounds(20, 370, 200, btnShowEmergencyContact.getPreferredSize().height);

                            //---- btnAddContact ----
                            btnAddContact.setText("Adicionar Contato");
                            btnAddContact.setFont(new Font("Ubuntu", Font.BOLD, 15));
                            btnAddContact.addActionListener(e -> btnAddContactActionPerformed(e));
                            panel10.add(btnAddContact);
                            btnAddContact.setBounds(20, 290, 200, btnAddContact.getPreferredSize().height);

                            //---- btnAddEmergencyContact ----
                            btnAddEmergencyContact.setText("Adicionar telefone de emerg\u00eancia");
                            btnAddEmergencyContact.setFont(new Font("Ubuntu", Font.BOLD, 10));
                            btnAddEmergencyContact.addActionListener(e -> btnAddEmergencyContactActionPerformed(e));
                            panel10.add(btnAddEmergencyContact);
                            btnAddEmergencyContact.setBounds(20, 250, 200, btnAddEmergencyContact.getPreferredSize().height);

                            { // compute preferred size
                                Dimension preferredSize = new Dimension();
                                for(int i = 0; i < panel10.getComponentCount(); i++) {
                                    Rectangle bounds = panel10.getComponent(i).getBounds();
                                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                                }
                                Insets insets = panel10.getInsets();
                                preferredSize.width += insets.right;
                                preferredSize.height += insets.bottom;
                                panel10.setMinimumSize(preferredSize);
                                panel10.setPreferredSize(preferredSize);
                            }
                        }
                        panel9.add(panel10);
                        panel10.setBounds(0, 0, 240, 425);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < panel9.getComponentCount(); i++) {
                                Rectangle bounds = panel9.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = panel9.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            panel9.setMinimumSize(preferredSize);
                            panel9.setPreferredSize(preferredSize);
                        }
                    }
                    smartphonePanel.add(panel9);
                    panel9.setBounds(40, 55, panel9.getPreferredSize().width, 425);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < smartphonePanel.getComponentCount(); i++) {
                            Rectangle bounds = smartphonePanel.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = smartphonePanel.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        smartphonePanel.setMinimumSize(preferredSize);
                        smartphonePanel.setPreferredSize(preferredSize);
                    }
                }

                //======== fallSimulatorPanel ========
                {
                    fallSimulatorPanel.setBackground(new Color(60, 121, 35));
                    fallSimulatorPanel.setLayout(null);

                    //---- cboxOnFist ----
                    cboxOnFist.setText("Est\u00e1 no pulso");
                    cboxOnFist.setBackground(new Color(60, 121, 35));
                    cboxOnFist.setForeground(Color.white);
                    cboxOnFist.setFont(new Font("Ubuntu", Font.BOLD, 20));
                    cboxOnFist.addActionListener(e -> cboxOnFistActionPerformed(e));
                    fallSimulatorPanel.add(cboxOnFist);
                    cboxOnFist.setBounds(15, 245, 163, 46);

                    //---- btnFall ----
                    btnFall.setText("Queda");
                    btnFall.setFont(new Font("Ubuntu", Font.BOLD, 20));
                    btnFall.setForeground(Color.white);
                    btnFall.setBackground(new Color(60, 121, 35));
                    btnFall.addActionListener(e -> btnFallActionPerformed(e));
                    fallSimulatorPanel.add(btnFall);
                    btnFall.setBounds(190, 250, 132, btnFall.getPreferredSize().height);

                    //---- label4 ----
                    label4.setText("text");
                    label4.setIcon(new ImageIcon(getClass().getResource("/img/menino-ney_burned.png")));
                    fallSimulatorPanel.add(label4);
                    label4.setBounds(6, 62, 319, 184);

                    //---- label3 ----
                    label3.setText("Simulador de quedas");
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    label3.setForeground(Color.white);
                    label3.setFont(new Font("URW Palladio L", Font.BOLD, 26));
                    fallSimulatorPanel.add(label3);
                    label3.setBounds(6, 6, 319, 50);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < fallSimulatorPanel.getComponentCount(); i++) {
                            Rectangle bounds = fallSimulatorPanel.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = fallSimulatorPanel.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        fallSimulatorPanel.setMinimumSize(preferredSize);
                        fallSimulatorPanel.setPreferredSize(preferredSize);
                    }
                }

                //======== smartWatchPanel ========
                {
                    smartWatchPanel.setBackground(new Color(105, 16, 19));
                    smartWatchPanel.setLayout(null);

                    //---- btnNewEmergencyMessage ----
                    btnNewEmergencyMessage.setText("Cadastrar mensagem de emerg\u00eancia");
                    btnNewEmergencyMessage.setFont(new Font("Segoe UI", Font.BOLD, 9));
                    btnNewEmergencyMessage.setBorderPainted(false);
                    btnNewEmergencyMessage.setMargin(new Insets(0, 0, 4, 0));
                    btnNewEmergencyMessage.addActionListener(e -> btnNewEmergencyMessageActionPerformed(e));
                    smartWatchPanel.add(btnNewEmergencyMessage);
                    btnNewEmergencyMessage.setBounds(120, 120, 165, 30);

                    //---- label5 ----
                    label5.setIcon(new ImageIcon(getClass().getResource("/img/Rel\u00f3gio_com_fundo.png")));
                    smartWatchPanel.add(label5);
                    label5.setBounds(new Rectangle(new Point(55, -10), label5.getPreferredSize()));

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < smartWatchPanel.getComponentCount(); i++) {
                            Rectangle bounds = smartWatchPanel.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = smartWatchPanel.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        smartWatchPanel.setMinimumSize(preferredSize);
                        smartWatchPanel.setPreferredSize(preferredSize);
                    }
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
                    computerPanel.setLayout(null);

                    //---- label6 ----
                    label6.setIcon(new ImageIcon(getClass().getResource("/img/Computador.png")));
                    computerPanel.add(label6);
                    label6.setBounds(new Rectangle(new Point(210, 0), label6.getPreferredSize()));

                    //======== panel7 ========
                    {
                        panel7.setLayout(null);

                        //---- btnSendReport ----
                        btnSendReport.setText("Enviar relat\u00f3rio ao m\u00e9dico");
                        btnSendReport.addActionListener(e -> btnSendReportActionPerformed(e));
                        panel7.add(btnSendReport);
                        btnSendReport.setBounds(new Rectangle(new Point(0, 155), btnSendReport.getPreferredSize()));

                        //======== scrollPane2 ========
                        {

                            //---- computerText ----
                            computerText.setEditable(false);
                            scrollPane2.setViewportView(computerText);
                        }
                        panel7.add(scrollPane2);
                        scrollPane2.setBounds(5, 0, 335, 150);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < panel7.getComponentCount(); i++) {
                                Rectangle bounds = panel7.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = panel7.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            panel7.setMinimumSize(preferredSize);
                            panel7.setPreferredSize(preferredSize);
                        }
                    }
                    computerPanel.add(panel7);
                    panel7.setBounds(235, 25, 345, 195);

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
                    computerPanel.add(panel8);
                    panel8.setBounds(new Rectangle(new Point(476, 617), panel8.getPreferredSize()));

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < computerPanel.getComponentCount(); i++) {
                            Rectangle bounds = computerPanel.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = computerPanel.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        computerPanel.setMinimumSize(preferredSize);
                        computerPanel.setPreferredSize(preferredSize);
                    }
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
                                            .addComponent(smartWatchPanel, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fallSimulatorPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(computerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                                    .addComponent(smartphonePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(266, Short.MAX_VALUE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(smartWatchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fallSimulatorPanel, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(computerPanel, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(183, Short.MAX_VALUE))))
                );
            }
            mainFrameContentPane.add(mainPanel);
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
    private JLabel label9;
    private JPanel panel9;
    private JPanel panel10;
    private JScrollPane scrollPane1;
    private JTextArea phoneText;
    private JButton btnShowContactList;
    private JButton btnShowEmergencyContact;
    private JButton btnAddContact;
    private JButton btnAddEmergencyContact;
    private JPanel fallSimulatorPanel;
    private JCheckBox cboxOnFist;
    private JButton btnFall;
    private JLabel label4;
    private JLabel label3;
    private JPanel smartWatchPanel;
    private JButton btnNewEmergencyMessage;
    private JLabel label5;
    private JPanel careTakerTitlePanel;
    private JLabel label1;
    private JPanel computerPanel;
    private JLabel label6;
    private JPanel panel7;
    private JButton btnSendReport;
    private JScrollPane scrollPane2;
    private JTextArea computerText;
    private JPanel panel8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
