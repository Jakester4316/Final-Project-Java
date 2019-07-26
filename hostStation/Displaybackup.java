package hostStation;
import hostStation.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Display implements ActionListener {

  JLabel jlab;

  Display() {

    JFrame jfrm = new JFrame("Host Station V0.1");
    jfrm.setLayout(new FlowLayout());
    jfrm.setSize(400, 200);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jlab = new JLabel();

    JButton jbtnO = new JButton("Open Tables"); // outputs open tables prompt
    JButton jbtnA = new JButton("Close Tables"); // outputs close tables prompt

    jbtnO.addActionListener(this);
    jbtnA.addActionListener(this);

    jfrm.add(jbtnO);
    jfrm.add(jbtnA);

    jfrm.add(jlab);
    jfrm.setVisible(true);
  }


  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Open Tables")) {
                String ot = JOptionPane.showInputDialog(
                        "Choose Table.");
  }
    else {String ct = JOptionPane.showInputDialog(
                        "Close which table?");}
}
  public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Display();
      }
    });
  }
}
