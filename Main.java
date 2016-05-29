import java.util.LinkedList;

/**
 * Created by k.waluch on 2016-05-04.
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main {

    public static void main(String[] args) {

        elipticCurve test = new elipticCurve(2, 2, 17);
        LinkedList<Point> tescik;

        tescik = test.countPoints();
        for(Point p: tescik){
            p.display();
            if(p.y!=0) {
            System.out.println(" ");
            test.countOrder(p);
                System.out.println(" ");
            }
        }

//        test.countOrder(new Point(1,6));

        String[] labels = { "Podaj a:", "Podaj b:", "Podaj p"};
        char[] mnemonics = { 'F', 'M', 'L'};
        int[] widths = { 15, 15, 15 };
        String[] descs = { "a", "b", "p"};

        final Entry_Window form = new Entry_Window(labels, mnemonics, widths, descs);

        JButton submit = new JButton("Submit Form");

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(form.getText(0) + " " + form.getText(1) + ". " + form.getText(2)
                        + ", age " + form.getText(3));
            }
        });

        JFrame f = new JFrame("Text Form Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(form, BorderLayout.NORTH);
        JPanel p = new JPanel();
        p.add(submit);
        f.getContentPane().add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
       //Entry_Window window = new Entry_Window();
    }

