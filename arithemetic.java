import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class arithemetic implements ActionListener  {
    static JFrame f;
    static JButton sum,diff,prod,quo,clr;
    static JTextField t1,t2,t3;
    static JLabel l1,l2,l;
    public static void main(String[] args){
        sum=new JButton("sum");
        diff=new JButton("difference");
        prod=new JButton("product");
        quo=new JButton("quotient");
        clr=new JButton("clear");

        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(50);
        t3.setEditable(false);
        l=new JLabel(" ");
        l1=new JLabel("number 1:");
        l2=new JLabel("number 2: ");

        f=new JFrame("arithemetic");
        f.setDefaultCloseOperation(3);
        f.setSize(550,300);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(sum);
        f.add(diff);
        f.add(prod);
        f.add(quo);
        f.add(clr);
        f.add(t3);
        f.show();

        arithemetic a=new arithemetic();
        sum.addActionListener(a);
        diff.addActionListener(a);
        prod.addActionListener(a);
        quo.addActionListener(a);
        clr.addActionListener(a);


        
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand(); 
       
        String n,m;
        if (s=="sum") {
            n=t1.getText();
            m=t2.getText(); 
            Float a=Float.parseFloat(n);
            Float b=Float.parseFloat(m);
            t3.setText("result="+(a+b)); 
        } 
        else if (s=="product") {
            n=t1.getText();
            m=t2.getText(); 
            Float a=Float.parseFloat(n);
            Float b=Float.parseFloat(m);
            t3.setText("result="+(a*b)); 
        }
        else if (s=="difference"){
            n=t1.getText();
            m=t2.getText(); 
            Float a=Float.parseFloat(n);
            Float b=Float.parseFloat(m);
            t3.setText("result="+(a-b)); 
        }
        else if (s=="quotient") {
            n=t1.getText();
            m=t2.getText(); 
            Float a=Float.parseFloat(n);
            Float b=Float.parseFloat(m);
            t3.setText("result="+(a/b)); 
        }
        else{
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
        }
    
    
    }
}
