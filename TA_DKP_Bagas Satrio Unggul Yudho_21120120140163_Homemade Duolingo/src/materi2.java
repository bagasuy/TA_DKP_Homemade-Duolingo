import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class materi2 implements ActionListener {
    JFrame frame = new JFrame("Homemade Duolingo");

    JLabel Angkahiragana = new JLabel();

    JButton kembalibutton = new JButton("Kembali");
    JButton mulaibutton = new JButton("Mulai");

    Font font2 = new Font("Arial Black",Font.BOLD,22);
    Font font3 = new Font("Arial Black",Font.BOLD,24);

    JLabel Angka = new JLabel();

    materi2() {

        //Label Homemade Duolingo paling atas
        Angkahiragana.setText("Angka dalam Bahasa Jepang");
        Angkahiragana.setVerticalAlignment(SwingConstants.CENTER);
        Angkahiragana.setVerticalTextPosition(SwingConstants.CENTER);
        Angkahiragana.setHorizontalAlignment(SwingConstants.LEADING);
        Angkahiragana.setHorizontalTextPosition(SwingConstants.TRAILING);
        Angkahiragana.setBounds(46,10,516,70);
        Angkahiragana.setForeground(new Color(98,187,14));
        Angkahiragana.setFont(font3);

        //Logo Duolingo
        Angka.setVerticalAlignment(SwingConstants.CENTER);
        Angka.setVerticalTextPosition(SwingConstants.CENTER);
        Angka.setHorizontalAlignment(SwingConstants.LEADING);
        Angka.setHorizontalTextPosition(SwingConstants.TRAILING);
        Angka.setBounds(22,70,460,400);
        Angka.setIcon(new javax.swing.ImageIcon(getClass().getResource("Angkaa.png")));

        //Button untuk Mulai Duolingo
        kembalibutton.setHorizontalAlignment(SwingConstants.CENTER);
        kembalibutton.setVerticalAlignment(SwingConstants.CENTER);
        kembalibutton.setVerticalTextPosition(SwingConstants.CENTER);
        kembalibutton.addActionListener( this);
        kembalibutton.setFocusable(false);
        kembalibutton.setBounds(180,550,150,40);
        kembalibutton.setBackground(Color.white);
        kembalibutton.setForeground(new Color(98,187,14));
        kembalibutton.setFont(font2);

        //Button untuk materi
        mulaibutton.setHorizontalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalTextPosition(SwingConstants.CENTER);
        mulaibutton.addActionListener( this);
        mulaibutton.setFocusable(false);
        mulaibutton.setBounds(180,600,150,40);
        mulaibutton.setBackground(Color.white);
        mulaibutton.setForeground(new Color(98,187,14));
        mulaibutton.setFont(font2);


        //membuat pengaturan frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(513,732);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.add(Angkahiragana);
        frame.add(mulaibutton);
        frame.add(kembalibutton);
        frame.add(Angka);
        frame.setIconImage(new ImageIcon(getClass().getResource("Gambar3.png")).getImage());
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==kembalibutton) {
            frame.dispose();
            materi Materi1 = new materi();
        }
        else if (e.getSource()==mulaibutton) {
            frame.dispose();
            Input input = new Input();
        }
    }
}
