import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Submit implements ActionListener {
    JFrame frame = new JFrame("Homemade Duolingo");

    JButton mulaibutton = new JButton("Mulai");

    JLabel output = new JLabel();
    JLabel namae = new JLabel();

    Font font1 = new Font("Arial Black",Font.BOLD,24);
    Font font2 = new Font("Arial Black",Font.BOLD,22);
    
    JLabel duo = new JLabel();

    Submit (String nama) {

        output.setText("Selamat Mengerjakan !!");
        output.setVerticalAlignment(SwingConstants.CENTER);
        output.setVerticalTextPosition(SwingConstants.CENTER);
        output.setHorizontalAlignment(SwingConstants.LEADING);
        output.setHorizontalTextPosition(SwingConstants.TRAILING);
        output.setBounds(100,280,516,70);
        output.setForeground(new Color(98,187,14));
        output.setFont(font1);

        namae.setText (" " + nama );
        namae.setVerticalAlignment(SwingConstants.CENTER);
        namae.setVerticalTextPosition(SwingConstants.CENTER);
        namae.setHorizontalAlignment(SwingConstants.LEADING);
        namae.setHorizontalTextPosition(SwingConstants.TRAILING);
        namae.setBounds(205,320,516,70);
        namae.setForeground(new Color(98,187,14));
        namae.setFont(font1);


        duo.setVerticalAlignment(SwingConstants.CENTER);
        duo.setVerticalTextPosition(SwingConstants.CENTER);
        duo.setHorizontalAlignment(SwingConstants.LEADING);
        duo.setHorizontalTextPosition(SwingConstants.TRAILING);
        duo.setBounds(145,80,212,212);
        duo.setIcon(new javax.swing.ImageIcon(getClass().getResource("hebat.png")));


        mulaibutton.setHorizontalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalTextPosition(SwingConstants.CENTER);
        mulaibutton.addActionListener(this);
        mulaibutton.setFocusable(false);
        mulaibutton.setBounds(180,400,150,40);
        mulaibutton.setBackground(Color.white);
        mulaibutton.setForeground(new Color(98,187,14));
        mulaibutton.setFont(font2);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setIconImage(new ImageIcon(getClass().getResource("Gambar3.png")).getImage());
        frame.setSize(513,732);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.add(output);
        frame.add(duo);
        frame.add(namae);
        frame.add(mulaibutton);
        frame.setLayout(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mulaibutton) {
            frame.dispose();
            soal1 Soal1 = new soal1();
        }

    }
}
