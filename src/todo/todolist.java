package todo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

public class todolist {
    private JButton calcButton;
    private JTextArea textArea1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton printButton;
    private JPanel panel;
    double chg,gramt;
    int conu;
    String cid;
    public todolist() {
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cid = textField1.getText();
                conu = Integer.parseInt(textField3.getText());

                if(conu < 500)
                {
                    chg = 1.00;
                }
                else if(conu < 500 && conu< 600)
                {
                    chg = 1.80;
                }
                else if(conu < 600 && conu< 800)
                {
                    chg = 2.80;
                }
                else
                {
                    chg = 3.00;
                }

                gramt = conu * chg;


                print();
            }
        });
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.print();
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public void print()
    {
        String billid = textField1.getText();
        String customer = textField2.getText();
        conu = Integer.parseInt(textField3.getText());

        textArea1.setText(textArea1.getText() + "\n");
        textArea1.setText( textArea1.getText() + "Electricity Billing System" + "\n");
        textArea1.setText(textArea1.getText() + "\n");
        textArea1.setText( textArea1.getText() + "Bill No : - "  + billid + "\n");
        textArea1.setText( textArea1.getText() + "Customer : - " + customer + "\n");
        textArea1.setText( textArea1.getText() + "Unit  : - " + conu + "\n");
        textArea1.setText( textArea1.getText() + "Amount  : - " + gramt + "\n");
        textArea1.setText(textArea1.getText() + "Thank you Come Again \n");
    }


 public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            new todolist().setVisible(true);
                                        }
                                    }

    );
}

    private void setVisible(boolean b) {
    }

}




