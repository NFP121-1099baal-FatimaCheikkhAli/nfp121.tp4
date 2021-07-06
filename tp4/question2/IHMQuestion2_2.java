package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        
        setLocation(70,80);
        pack();show();
        
          ActionListener jbo1 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                contenu.append("observateur jbo1: clic sur button " + ((JButton) e.getSource()).getLabel() + "\n");
            }};
        
        ActionListener jbo2 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                contenu.append("observateur jbo2: clic sur button " + ((JButton) e.getSource()).getLabel() + "\n");
            } };
        
        ActionListener jbo3 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                contenu.append("observateur jbo3: clic sur button " + ((JButton) e.getSource()).getLabel() + "\n");
            }};
        boutonA.addActionListener(jbo1);
        boutonA.addActionListener(jbo2);
        boutonA.addActionListener(jbo3);
        boutonB.addActionListener(jbo1);
        boutonB.addActionListener(jbo2);
        boutonC.addActionListener(jbo1);
      
        
      
    }

     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}
