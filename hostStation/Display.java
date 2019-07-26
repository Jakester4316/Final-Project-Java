package hostStation;
import hostStation.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Display {

  JLabel jlab;

  Display() {

    JFrame jfrm = new JFrame("Host Station V0.1");
    jfrm.setLayout(new GridLayout(1,0));
    jfrm.setSize(400, 200);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setVisible(true);
 

    jlab = new JLabel();

    JTable table = new JTable() {
    String[] columnNames = {"Table Number", "# of Guests", "Open/Seated"};

    Object[][] data = {
        {"1", "0", "Open"},
        {"2", "3","Seated"},
        {"3", "2", "Seated"},
        {"4", "0", "Open"},
        {"5", "4", "Seated"}
    };

	JTable table = new JTable(data, columnNames);
    }; 

        jfrm.setLayout(new BorderLayout());
        jfrm.add(table.getTableHeader(), BorderLayout.PAGE_START);
	jfrm.add(table, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               new Display();
      }
    });
  }
}

