import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.awt.event.ActionListener;
class f extends Frame{
    int o=0;
    f()
    {
        Choice c=new Choice();
        c.add("+");
        c.add("-");
        c.add("*");
        c.add("/");
        Button b1=new Button("=");
        Label l1 =new Label();
        Label l2 =new Label();
        Label l3=new Label("ANSWER");
        TextField t1=new TextField("0");
        TextField t2=new TextField("0");
        TextField t3=new TextField(" ");
        setTitle("CALCULATOR");
        l1.setText("ENTER THE NUMBER:");
        l2.setText("ENTER THE NUMBER:");
        b1.setBounds(400,300,40,20);
        l1.setBounds(400,150,150,40);
        l2.setBounds(400,200,150,40);
        l3.setBounds(400,250,150,40);
        t2.setBounds(530,210,150,20);
        t3.setBounds(530,260,150,20);
        t1.setBounds(530,160,150,20);
        c.setBounds(590,100,50,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c.getSelectedItem()=="+") {
                BigInteger bb=new BigInteger(t1.getText());
                BigInteger bb1=new BigInteger(t1.getText());
                BigInteger bb2=bb.add(bb1);    
                
                    t3.setText(String.valueOf(bb2));
                }
               else if(c.getSelectedItem()=="-") {
                    BigInteger bb=new BigInteger(t1.getText());
                BigInteger bb1=new BigInteger(t1.getText());
                BigInteger bb2=bb.subtract(bb1);    
                    t3.setText(String.valueOf(bb2));
                }
                else if(c.getSelectedItem()=="*") {
                    
               BigInteger bb=new BigInteger(t1.getText());
                BigInteger bb1=new BigInteger(t1.getText());
                BigInteger bb2=bb.multiply(bb1);    
                    t3.setText(String.valueOf(bb2));
                }
                else if(c.getSelectedItem()=="/") {
                    int n = Integer.parseInt(t1.getText());
                    int n1 = Integer.parseInt(t2.getText());
                    int n2=0;
                    try {
                        n2 = n / n1;
                    }
                    catch(Exception hh)
                    {


                        System.out.println(hh);
                    }

                     if(n1==0)
                    {
                        t3.setText("MATH ERROR");
                    }
                    else {
                       // System.out.println(n+"   "+n1);
                        t3.setText(String.valueOf(n2));
                    }
                }

            }
        });
        add(c);
        add(t3);
        add(l3);
        add(b1);
        add(t1);
        add(t2);
        add(l1);
        add(l2);
        setLayout(null);
        setVisible(true);

    }
}
public class calculator{
    public static void main(String[] args)
    {
        new f();
    }
    }
