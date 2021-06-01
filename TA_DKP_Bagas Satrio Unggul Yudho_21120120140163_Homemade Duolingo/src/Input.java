import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Input implements ActionListener {
    JFrame frame = new JFrame("Homemade Duolingo");

    JButton Submitbutton = new JButton("Submit");

    JLabel inputan = new JLabel();

    JTextField nama = new JTextField();

    Font font1 = new Font("Arial Black",Font.BOLD,24);
    Font font2 = new Font("Arial Black",Font.BOLD,22);
    Font font3 = new Font("Arial Black",Font.BOLD,28);
    
    JLabel DUO = new JLabel();
    
    Input () {

        inputan.setText("Masukkan Nama Anda");
        inputan.setVerticalAlignment(SwingConstants.CENTER);
        inputan.setVerticalTextPosition(SwingConstants.CENTER);
        inputan.setHorizontalAlignment(SwingConstants.LEADING);
        inputan.setHorizontalTextPosition(SwingConstants.TRAILING);
        inputan.setBounds(100,280,516,70);
        inputan.setForeground(new Color(98,187,14));
        inputan.setFont(font1);
        
        DUO.setVerticalAlignment(SwingConstants.CENTER);
        DUO.setVerticalTextPosition(SwingConstants.CENTER);
        DUO.setHorizontalAlignment(SwingConstants.LEADING);
        DUO.setHorizontalTextPosition(SwingConstants.TRAILING);
        DUO.setBounds(145,80,212,212);
        DUO.setIcon(new javax.swing.ImageIcon(getClass().getResource("kerja.png")));


        nama.setHorizontalAlignment(SwingConstants.LEADING);
        nama.setBounds(100,340,310,50);
        nama.setBackground(Color.white);
        nama.setFont(font3);
        nama.setForeground(new Color(98,187,14));


        Submitbutton.setHorizontalAlignment(SwingConstants.CENTER);
        Submitbutton.setVerticalAlignment(SwingConstants.CENTER);
        Submitbutton.setVerticalTextPosition(SwingConstants.CENTER);
        Submitbutton.addActionListener(this);
        Submitbutton.setFocusable(false);
        Submitbutton.setBounds(180,400,150,40);
        Submitbutton.setBackground(Color.white);
        Submitbutton.setForeground(new Color(98,187,14));
        Submitbutton.setFont(font2);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setIconImage(new ImageIcon(getClass().getResource("Gambar3.png")).getImage());
        frame.setSize(513,732);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.add(inputan);
        frame.add(nama);
        frame.add(DUO);
        frame.add(Submitbutton);
        frame.setLayout(null);
    }


        @Override
        public void actionPerformed(ActionEvent ae) {
           if (ae.getSource()==Submitbutton) {
               String name = nama.getText();
                frame.dispose();
                Submit submit = new Submit(name);
            }

    }
}
