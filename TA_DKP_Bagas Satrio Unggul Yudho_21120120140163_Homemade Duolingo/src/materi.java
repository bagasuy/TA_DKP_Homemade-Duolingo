import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class materi implements ActionListener {
    JFrame frame = new JFrame("Homemade Duolingo");
    JLabel hurufhiragana = new JLabel();
    JButton nextbutton = new JButton("Next");
    JButton mulaibutton = new JButton("Mulai");
    Font font2 = new Font("Arial Black",Font.BOLD,22);
    Font font1 = new Font("Arial Black",Font.BOLD,36);
    JLabel Angka = new JLabel();

    materi() {

        //Label Homemade Duolingo paling atas
        hurufhiragana.setText("Huruf Hiragana");
        hurufhiragana.setVerticalAlignment(SwingConstants.CENTER);
        hurufhiragana.setVerticalTextPosition(SwingConstants.CENTER);
        hurufhiragana.setHorizontalAlignment(SwingConstants.LEADING);
        hurufhiragana.setHorizontalTextPosition(SwingConstants.TRAILING);
        hurufhiragana.setBounds(83,10,516,70);
        hurufhiragana.setForeground(new Color(98,187,14));
        hurufhiragana.setFont(font1);

        //Logo Duolingo
        Angka.setVerticalAlignment(SwingConstants.CENTER);
        Angka.setVerticalTextPosition(SwingConstants.CENTER);
        Angka.setHorizontalAlignment(SwingConstants.LEADING);
        Angka.setHorizontalTextPosition(SwingConstants.TRAILING);
        Angka.setBounds(55,50,516,516);
        Angka.setIcon(new javax.swing.ImageIcon(getClass().getResource("Gambar2.jpg")));

        //Button untuk Mulai Duolingo
        nextbutton.setHorizontalAlignment(SwingConstants.CENTER);
        nextbutton.setVerticalAlignment(SwingConstants.CENTER);
        nextbutton.setVerticalTextPosition(SwingConstants.CENTER);
        nextbutton.addActionListener(this);
        nextbutton.setFocusable(false);
        nextbutton.setBounds(180,550,150,40);
        nextbutton.setBackground(Color.white);
        nextbutton.setForeground(new Color(98,187,14));
        nextbutton.setFont(font2);

        //Button untuk materi
        mulaibutton.setHorizontalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalTextPosition(SwingConstants.CENTER);
        mulaibutton.addActionListener(this);
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
        frame.add(hurufhiragana);
        frame.add(mulaibutton);
        frame.add(nextbutton);
        frame.add(Angka);
        frame.setIconImage(new ImageIcon(getClass().getResource("Gambar3.png")).getImage());
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==nextbutton) {
            frame.dispose();
            materi2 Materi2 = new materi2();
        }
        else if (e.getSource()==mulaibutton) {
            frame.dispose();
            Input input = new Input();
        }
    }
}
