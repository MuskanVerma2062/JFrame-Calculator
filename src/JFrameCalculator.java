import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class JFrameCalculator extends JFrame implements ActionListener {
    private static JTextField textField;
    private static JLabel label;

    public static void main(String[] args) {
        new JFrameCalculator();
    }

    JButton key1, key2, key3, key4, key5, key6, key7, key8, key9, key10, key11, key12, key13, key14, key15, key16, key17, equal;

    JFrameCalculator() {
        super("Calculator");

        key1 = new JButton("1");
        key2 = new JButton("2");
        key3 = new JButton("3");
        key4 = new JButton("4");
        key5 = new JButton("5");
        key6 = new JButton("6");
        key7 = new JButton("7");
        key8 = new JButton("8");
        key9 = new JButton("9");
        key10 = new JButton("*");
        key11 = new JButton("/");
        key12 = new JButton("-");
        key13 = new JButton(".");
        key14 = new JButton("0");
        key15 = new JButton("+");
        key16 = new JButton("c");
        key17 = new JButton("<");
        equal = new JButton(" = ");

        key1.setBounds(50, 150, 40, 30);
        key2.setBounds(100, 150, 40, 30);
        key3.setBounds(150, 150, 40, 30);
        key10.setBounds(200, 150, 40, 30);
        key4.setBounds(50, 190, 40, 30);
        key5.setBounds(100, 190, 40, 30);
        key6.setBounds(150, 190, 40, 30);
        key11.setBounds(200, 190, 40, 30);
        key7.setBounds(50, 230, 40, 30);
        key8.setBounds(100, 230, 40, 30);
        key9.setBounds(150, 230, 40, 30);
        key12.setBounds(200, 230, 40, 30);
        key13.setBounds(50, 270, 40, 30);
        key14.setBounds(100, 270, 40, 30);
        key15.setBounds(150, 110, 90, 30);
        key16.setBounds(100, 110, 40, 30);
        key17.setBounds(50, 110, 40, 30);
        equal.setBounds(150, 270, 90, 30);

        add(key1);
        add(key2);
        add(key3);
        add(key4);
        add(key5);
        add(key6);
        add(key7);
        add(key8);
        add(key9);
        add(equal);
        add(key10);
        add(key11);
        add(key12);
        add(key13);
        add(key14);
        add(key15);
        add(key16);
        add(key17);

        key1.addActionListener(this);
        key2.addActionListener(this);
        key3.addActionListener(this);
        key4.addActionListener(this);
        key5.addActionListener(this);
        key6.addActionListener(this);
        key7.addActionListener(this);
        key8.addActionListener(this);
        key9.addActionListener(this);
        key10.addActionListener(this);
        key11.addActionListener(this);
        key12.addActionListener(this);
        key13.addActionListener(this);
        key14.addActionListener(this);
        key15.addActionListener(this);
        key16.addActionListener(this);
        key17.addActionListener(this);
        equal.addActionListener(this);

        textField = new JTextField();
        textField.setBounds(50, 40, 190, 50);
        add(textField);

        label = new JLabel();
        label.setBounds(190, 20, 50, 20);
        label.setVisible(true);
        label.setForeground(Color.ORANGE);
        add(label);

        setSize(310, 380);
        key16.setForeground(Color.RED);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    double num, ans;
    int calculation;

    //creating a new method
    public void arithmatic_operation(){
        switch (calculation){
            case 1:     //addition
                ans = num + Double.parseDouble(textField.getText());
                textField.setText(Double.toString(ans));
                break;
            case 2:     //substraction
                ans = num - Double.parseDouble(textField.getText());
                textField.setText(Double.toString(ans));
                break;
            case 3:     //multiplication
                ans = num * Double.parseDouble(textField.getText());
                textField.setText(Double.toString(ans));
                break;
            case 4:     //division
                ans = num / Double.parseDouble(textField.getText());
                textField.setText(Double.toString(ans));
                break;
        }
    }

    public void actionPerformed(ActionEvent arg) {

        if (arg.getSource() == key1) {
            textField.setText(textField.getText() + "1");
        } else if (arg.getSource() == key2) {
            textField.setText(textField.getText() + "2");
        } else if (arg.getSource() == key3) {
            textField.setText(textField.getText() + "3");
        } else if (arg.getSource() == key4) {
            textField.setText(textField.getText() + "4");
        } else if (arg.getSource() == key5) {
            textField.setText(textField.getText() + "5");
        } else if (arg.getSource() == key6) {
            textField.setText(textField.getText() + "6");
        } else if (arg.getSource() == key7) {
            textField.setText(textField.getText() + "7");
        } else if (arg.getSource() == key8) {
            textField.setText(textField.getText() + "8");
        } else if (arg.getSource() == key9) {
            textField.setText(textField.getText() + "9");
        }
        else if (arg.getSource() == key10) {
            num = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(num + "*");
        }
        else if (arg.getSource() == key11) {
            num = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(num + "/");
        }
        else if (arg.getSource() == key12) {
            num = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(num + "-");
        }
        else if (arg.getSource() == key13) {
            textField.setText(textField.getText() + ".");
        }
        else if (arg.getSource() == key14) {
            textField.setText(textField.getText() + "0");
        }
        else if (arg.getSource() == key15) {
            num = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(num + "+");
        }
        else if (arg.getSource() == key16) {
            textField.setText("");
        }
        else if (arg.getSource() == key17) {
            int length = textField.getText().length();
            int number = textField.getText().length() - 1;
            String store;

            if(length > 0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                store = back.toString();
                textField.setText(store);
            }
        }
        else if (arg.getSource() == equal){
            arithmatic_operation();
            label.setText("");
        }
    }
}
