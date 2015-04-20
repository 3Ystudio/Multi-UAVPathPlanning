/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import config.StaticInitConfig;

/**
 *
 * @author boluo
 */
public class ControlPanel extends javax.swing.JPanel {

    private float speed_times = 1;
    private float speed_delta_times = 0.5f;
    private String simulation_speed_text = "仿真速度X";
    private String show_planned_tree_text = "生成树";
    private String shown_planned_path_text = "规划路径";
    private String simulation_stop = "暂停";
    private String simulation_start = "开始";

    /**
     * Creates new form ControlPanel
     */
    public ControlPanel() {
        initComponents();
        this.jLabel1.setText(this.simulation_speed_text + StaticInitConfig.SPEED_TIMES);
    }
    
    public static void setTotalHistoryPathLen(float path_len)
    {
        ControlPanel.jLabel2.setText("总路径:"+(int)path_len);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane4 = new javax.swing.JSplitPane();
        jButton3 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jSplitPane5 = new javax.swing.JSplitPane();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSplitPane3 = new javax.swing.JSplitPane();
        jSplitPane6 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane7 = new javax.swing.JSplitPane();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSplitPane8 = new javax.swing.JSplitPane();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setDividerSize(1);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jSplitPane2.setDividerLocation(98);
        jSplitPane2.setDividerSize(1);
        jSplitPane2.setPreferredSize(new java.awt.Dimension(200, 49));

        jSplitPane4.setDividerLocation(50);
        jSplitPane4.setDividerSize(1);
        jSplitPane4.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane4.setPreferredSize(new java.awt.Dimension(95, 47));

        jButton3.setFont(new java.awt.Font("Songti SC", 0, 10)); // NOI18N
        jButton3.setText("关闭规划路径");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jSplitPane4.setRightComponent(jButton3);

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setText("00:00:00");
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jSplitPane4.setLeftComponent(jFormattedTextField1);

        jSplitPane2.setLeftComponent(jSplitPane4);

        jSplitPane5.setDividerLocation(50);
        jSplitPane5.setDividerSize(1);
        jSplitPane5.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jButton2.setFont(new java.awt.Font("宋体", 0, 10)); // NOI18N
        jButton2.setText("显示战争迷雾");
        jSplitPane5.setRightComponent(jButton2);

        jButton1.setText("暂停");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jSplitPane5.setLeftComponent(jButton1);

        jSplitPane2.setRightComponent(jSplitPane5);

        jSplitPane1.setTopComponent(jSplitPane2);

        jSplitPane3.setDividerLocation(98);
        jSplitPane3.setDividerSize(1);
        jSplitPane3.setPreferredSize(new java.awt.Dimension(200, 61));

        jSplitPane6.setDividerLocation(50);
        jSplitPane6.setDividerSize(1);
        jSplitPane6.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("仿真速度X1");
        jSplitPane6.setTopComponent(jLabel1);

        jSplitPane7.setDividerLocation(46);
        jSplitPane7.setDividerSize(1);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Slow.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jSplitPane7.setLeftComponent(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fast.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jSplitPane7.setRightComponent(jButton7);

        jSplitPane6.setRightComponent(jSplitPane7);

        jSplitPane3.setLeftComponent(jSplitPane6);

        jSplitPane8.setDividerLocation(50);
        jSplitPane8.setDividerSize(1);
        jSplitPane8.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jButton4.setText("显示生成树");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jSplitPane8.setTopComponent(jButton4);

        jLabel2.setText("总路径:");
        jSplitPane8.setRightComponent(jLabel2);

        jSplitPane3.setRightComponent(jSplitPane8);

        jSplitPane1.setRightComponent(jSplitPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * decrease the speed
     *
     * @param evt
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (this.speed_times - speed_delta_times > 0) {
            this.speed_times -= speed_delta_times;
            setSimulationDelayWithSpeed(this.speed_times);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * increase the speed
     *
     * @param evt
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.speed_times += speed_delta_times;
        setSimulationDelayWithSpeed(this.speed_times);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StaticInitConfig.SHOW_PLANNED_TREE = !StaticInitConfig.SHOW_PLANNED_TREE; //per click take non-operation
        if (StaticInitConfig.SHOW_PLANNED_TREE) {
            this.jButton4.setText("关闭" + this.show_planned_tree_text);
        } else {
            this.jButton4.setText("显示" + this.show_planned_tree_text);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StaticInitConfig.SHOW_PLANNED_PATH = !StaticInitConfig.SHOW_PLANNED_PATH; //per click take non-operation
        if (StaticInitConfig.SHOW_PLANNED_PATH) {
            this.jButton3.setText("关闭" + this.shown_planned_path_text);
        } else {
            this.jButton3.setText("显示" + this.shown_planned_path_text);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StaticInitConfig.SIMULATION_ON = !StaticInitConfig.SIMULATION_ON; //per click take non-operation
        if (StaticInitConfig.SIMULATION_ON) {
            this.jButton1.setText(simulation_stop);
        } else {
            this.jButton1.setText(simulation_start);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void setSimulationDelayWithSpeed(float speed_times) {
        StaticInitConfig.SPEED_TIMES=speed_times;
        this.jLabel1.setText(this.simulation_speed_text + speed_times);
        int delay = (int) (StaticInitConfig.INIT_SIMULATION_DELAY / speed_times); //unpdate sychronously simulation delay 
        StaticInitConfig.SIMULATION_WITH_UI_TIMER.setDelay(delay);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public static javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JSplitPane jSplitPane7;
    private javax.swing.JSplitPane jSplitPane8;
    // End of variables declaration//GEN-END:variables
}
