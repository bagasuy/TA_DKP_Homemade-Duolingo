import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Home implements ActionListener {

    JFrame frame = new JFrame("Homemade Duolingo");

    JLabel homemadelabel = new JLabel();

    JButton mulaibutton = new JButton("Mulai");
    JButton mateributton = new JButton("Materi");

    Font font2 = new Font("Arial Black",Font.BOLD,22);
    Font font1 = new Font("Arial Black",Font.BOLD,36);

    JLabel logo = new JLabel();


    Home() {

        //Label Homemade Duolingo paling atas
        homemadelabel.setText("Homemade Duolingo");
        homemadelabel.setVerticalAlignment(SwingConstants.CENTER);
        homemadelabel.setVerticalTextPosition(SwingConstants.CENTER);
        homemadelabel.setHorizontalAlignment(SwingConstants.LEADING);
        homemadelabel.setHorizontalTextPosition(SwingConstants.TRAILING);
        homemadelabel.setBounds(35,10,516,70);
        homemadelabel.setForeground(new Color(98,187,14));
        homemadelabel.setFont(font1);



        //Logo Duolingo
        logo.setVerticalAlignment(SwingConstants.CENTER);
        logo.setVerticalTextPosition(SwingConstants.CENTER);
        logo.setHorizontalAlignment(SwingConstants.LEADING);
        logo.setHorizontalTextPosition(SwingConstants.TRAILING);
        logo.setBounds(10,50,513,513);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Gambar1.png")));

        //Button untuk Mulai Duolingo
        mulaibutton.setHorizontalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalAlignment(SwingConstants.CENTER);
        mulaibutton.setVerticalTextPosition(SwingConstants.CENTER);
        mulaibutton.addActionListener( this);
        mulaibutton.setFocusable(false);
        mulaibutton.setBounds(180,550,150,40);
        mulaibutton.setBackground(Color.white);
        mulaibutton.setForeground(new Color(98,187,14));
        mulaibutton.setFont(font2);

        //Button untuk materi
        mateributton.setHorizontalAlignment(SwingConstants.CENTER);
        mateributton.setVerticalAlignment(SwingConstants.CENTER);
        mateributton.setVerticalTextPosition(SwingConstants.CENTER);
        mateributton.addActionListener( this);
        mateributton.setFocusable(false);
        mateributton.setBounds(180,600,150,40);
        mateributton.setBackground(Color.white);
        mateributton.setForeground(new Color(98,187,14));
        mateributton.setFont(font2);


        //membuat pengaturan frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(513,732);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.add(homemadelabel);
        frame.add(mulaibutton);
        frame.add(mateributton);
        frame.add(logo);
        frame.setIconImage(new ImageIcon(getClass().getResource("Gambar3.png")).getImage());
        frame.setLayout(null);
        frame.setVisible(true);


    }

    //agar button bisa bekerja
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mulaibutton) {
            frame.dispose();
            Input input = new Input();
        }
        else if (e.getSource()==mateributton) {
            frame.dispose();
            materi Materi = new materi();
        }
    }
}
