import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cake extends JFrame implements ActionListener {
    int egg, wheat, milk;
    JTextField txt1, txt2, txt3;
    JLabel l1, l2, l3;
    JButton b1;

  void  real(){
        l1 = new JLabel();
        l1.setBounds(10,20 ,50, 20);
        l1.setText("Egg(pcs)");
        add(l1);
        txt1 = new JTextField("0");
        txt1.setBounds(80, 20, 50,20);
        add(txt1);
        l2 = new JLabel();
        l2.setBounds(10,40 ,70, 20);
        l2.setText("Wheat(cup)");
      txt2 = new JTextField("0");
        txt2.setBounds(80, 40, 50,20);
        add(txt2);
        add(l2);
        l3 = new JLabel();
        l3.setBounds(10,60 ,70, 20);
        l3.setText("Milk(cup)");
        txt3 = new JTextField("0");
        txt3.setBounds(80, 60, 50,20);
        add(txt3);
        add(l3);

        b1 =new JButton("calculate");
        b1.setBounds(35,80,100,20);
        b1.addActionListener(this);
        add(b1);
        setLayout(null);
        setVisible(true);
        setSize(300,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        cake ck = new cake();
        ck.real();
    }

    @Override

        public void actionPerformed(ActionEvent e) {
            egg = Integer.parseInt(txt1.getText());
            wheat = Integer.parseInt(txt2.getText());
            milk = Integer.parseInt(txt3.getText());
        try { if(((milk<1)||egg<1)||(wheat<3)){
            JOptionPane.showMessageDialog(this,"Not enough Ingredients");
        } else {
            int temp = wheat/3;
            if (temp<=egg && temp<=milk){
                JOptionPane.showMessageDialog(this, temp +" pound cake can be made");
            } else if (egg<=milk){
                JOptionPane.showMessageDialog(this, egg +" pound cake can be made");
            } else
                JOptionPane.showMessageDialog(this, milk +" pound cake can be made");
            }
        }

        catch (Exception e1){
                    JOptionPane.showMessageDialog(this,e1.toString());
                }

        }
    }