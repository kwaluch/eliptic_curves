import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by k.waluch on 2016-05-04.
 */
public class parametersScreen extends javax.swing.JPanel{
    private JList list1;
    private JScrollBar scrollBar1;
    private JTextArea aTextArea;
    private JTextArea pTextArea;
    private JTextArea bTextArea;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton OBLICZButton;
    private JPanel mainWindow;
    private JPanel listWindow;
    private JPanel menuWindow;

    public parametersScreen() {
        OBLICZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
