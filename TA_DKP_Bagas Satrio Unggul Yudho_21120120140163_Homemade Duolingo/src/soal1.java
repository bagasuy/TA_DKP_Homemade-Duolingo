import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class soal1 implements ActionListener {


    String[] Pertanyaan = {
            "1. Angka 4 dalam Bahasa Jepang",
            "2. い Bagaimana cara membacanya ?",
            "3. さ Bagaimana cara membacanya ?",
            "4. Angka 1 dalam Bahasa Jepang",
            "5. Angka 8 dalam Bahasa Jepang"
    };

    String[][] options = {
            {"A.いち", "B.さん", "C.ろく", "D.よん "},
            {"A.ha", "B.chi", "C.na", "D.i"},
            {"A.ki", "B.hi", "C.u", "D.wa"},
            {"A.なな", "B.ろく", "C.いち", "D.はち"},
            {"A.ご", "B.はち", "C.いち", "D.なな"}
    };
    char[] kunci = {
            'D',
            'D',
            'A',
            'C',
            'B'
    };
    char jawaban;

    int index;

    int benar = 0;

    int total_Pertanyaan = Pertanyaan.length;

    int nilai;

    JFrame frame = new JFrame("Homemade Duolingo");

    JTextArea quiz1 = new JTextArea();

    JButton jawaban1button = new JButton("");
    JButton jawaban2button = new JButton("");
    JButton jawaban3button = new JButton("");
    JButton jawaban4button = new JButton("");

    JLabel jawaban1label = new JLabel();
    JLabel jawaban2label = new JLabel();
    JLabel jawaban3label = new JLabel();
    JLabel jawaban4label = new JLabel();

    JButton submitbutton = new JButton("Home");

    JLabel ucapanskor = new JLabel();

    JLabel sekor = new JLabel();

    JLabel benarsalah = new JLabel();

    JLabel congrats = new JLabel();

    Font font1 = new Font("", Font.BOLD, 26);


    soal1() {

        quiz1.setText("");
        quiz1.setLineWrap(true);
        quiz1.setWrapStyleWord(true);
        quiz1.setBackground(Color.white);
        quiz1.setEditable(false);
        quiz1.setBounds(35, 30, 516, 70);
        quiz1.setForeground(Color.black);
        quiz1.setFont(font1);


        ucapanskor.setText("Skor");
        ucapanskor.setBackground(Color.white);
        ucapanskor.setBounds(225, 290, 516, 70);
        ucapanskor.setForeground(new Color(98,187,14));
        ucapanskor.setFont(font1);

        benarsalah.setText("");
        benarsalah.setBackground(Color.white);
        benarsalah.setBounds(240, 310, 516, 70);
        benarsalah.setForeground(new Color(98,187,14));
        benarsalah.setFont(new Font("Arial Black",Font.BOLD,18));


        sekor.setBounds(160,370,200,100);
        sekor.setForeground(new Color(98,187,14));
        sekor.setBackground(Color.white);
        sekor.setFont(new Font("Arial Black",Font.BOLD,50));
        sekor.setHorizontalAlignment(JTextField.CENTER);
        sekor.setFocusable(false);

        congrats.setVerticalAlignment(SwingConstants.CENTER);
        congrats.setVerticalTextPosition(SwingConstants.CENTER);
        congrats.setHorizontalAlignment(SwingConstants.LEADING);
        congrats.setHorizontalTextPosition(SwingConstants.TRAILING);
        congrats.setBounds(160,100,212,212);
        congrats.setIcon(new javax.swing.ImageIcon(getClass().getResource("congrats.png")));



        //Button pilihan ganda


        jawaban1button.setBounds(71, 300, 150, 150);
        jawaban1button.setFocusable(false);
        jawaban1button.addActionListener(this);
        jawaban1button.setBackground(Color.white);
        jawaban1button.setForeground(Color.BLACK);
        jawaban1button.setText("A");
        jawaban1button.setFont(new Font("Arial Black", Font.BOLD, 38));


        jawaban2button.addActionListener(this);
        jawaban2button.setFocusable(false);
        jawaban2button.setBounds(292, 300, 150, 150);
        jawaban2button.setBackground(Color.white);
        jawaban2button.setForeground(Color.BLACK);
        jawaban2button.setFont(new Font("Arial Black", Font.BOLD, 38));
        jawaban2button.setText("B");

        jawaban3button.addActionListener(this);
        jawaban3button.setFocusable(false);
        jawaban3button.setBounds(71, 500, 150, 150);
        jawaban3button.setBackground(Color.white);
        jawaban3button.setForeground(Color.BLACK);
        jawaban3button.setFont(new Font("Arial Black", Font.BOLD, 38));
        jawaban3button.setText("C");

        jawaban4button.addActionListener(this);
        jawaban4button.setFocusable(false);
        jawaban4button.setBounds(292, 500, 150, 150);
        jawaban4button.setBackground(Color.white);
        jawaban4button.setForeground(Color.BLACK);
        jawaban4button.setFont(new Font("Arial Black", Font.BOLD, 38));
        jawaban4button.setText("D");

        submitbutton.addActionListener(this);
        submitbutton.setFocusable(false);
        submitbutton.setBounds(180, 500, 150, 40);
        submitbutton.setBackground(Color.white);
        submitbutton.setForeground(new Color(98,187,14));
        submitbutton.setFont(new Font("Arial Black", Font.BOLD, 22));

        //jawaban dalam pilihan ganda
        jawaban1label.setBounds(132, 70, 75, 75);
        jawaban1label.setVerticalAlignment(SwingConstants.CENTER);
        jawaban1label.setVerticalTextPosition(SwingConstants.CENTER);
        jawaban1label.setHorizontalAlignment(SwingConstants.LEADING);
        jawaban1label.setHorizontalTextPosition(SwingConstants.TRAILING);
        jawaban1label.setForeground(Color.green);
        jawaban1label.setFont(new Font("", Font.BOLD, 20));
        jawaban1label.setText("");


        jawaban2label.setBounds(352, 70, 75, 75);
        jawaban2label.setVerticalAlignment(SwingConstants.CENTER);
        jawaban2label.setVerticalTextPosition(SwingConstants.CENTER);
        jawaban2label.setHorizontalAlignment(SwingConstants.LEADING);
        jawaban2label.setFont(new Font("", Font.BOLD, 20));
        jawaban2label.setForeground(Color.green);
        jawaban2label.setText("");


        jawaban3label.setBounds(132, 100, 75, 75);
        jawaban3label.setVerticalAlignment(SwingConstants.CENTER);
        jawaban3label.setVerticalTextPosition(SwingConstants.CENTER);
        jawaban3label.setHorizontalAlignment(SwingConstants.LEADING);
        jawaban3label.setHorizontalTextPosition(SwingConstants.TRAILING);
        jawaban3label.setFont(new Font("", Font.BOLD, 20));
        jawaban3label.setForeground(Color.green);
        jawaban3label.setText("");


        jawaban4label.setBounds(352, 100, 75, 75);
        jawaban4label.setVerticalAlignment(SwingConstants.CENTER);
        jawaban4label.setVerticalTextPosition(SwingConstants.CENTER);
        jawaban4label.setHorizontalAlignment(SwingConstants.LEADING);
        jawaban4label.setHorizontalTextPosition(SwingConstants.TRAILING);
        jawaban4label.setFont(new Font("", Font.BOLD, 20));
        jawaban4label.setForeground(Color.green);
        jawaban4label.setText("");


        //membuat pengaturan frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setIconImage(new ImageIcon(getClass().getResource("Gambar3.png")).getImage());
        frame.setLayout(null);
        frame.setSize(513, 732);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);


        frame.add(quiz1);
        frame.add(jawaban1label);
        frame.add(jawaban2label);
        frame.add(jawaban3label);
        frame.add(jawaban4label);
        frame.add(jawaban1button);
        frame.add(jawaban2button);
        frame.add(jawaban3button);
        frame.add(jawaban4button);
        frame.setVisible(true);

        Pertanyaanselanjutnya();
    }

    public void Pertanyaanselanjutnya() {

        if (index >= total_Pertanyaan) {
            skor();
        } else {
            quiz1.setText(Pertanyaan[index]);
            jawaban1label.setText(options[index][0]);
            jawaban2label.setText(options[index][1]);
            jawaban3label.setText(options[index][2]);
            jawaban4label.setText(options[index][3]);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        jawaban1button.setEnabled(false);
        jawaban2button.setEnabled(false);
        jawaban3button.setEnabled(false);
        jawaban4button.setEnabled(false);

        submitbutton.setEnabled(false);
        submitbutton.setVisible(false);

        sekor.setVisible(false);

        ucapanskor.setVisible(false);

        benarsalah.setVisible(false);

        congrats.setVisible(false);

        if (e.getSource() == jawaban1button) {
            jawaban = 'A';
            if (jawaban == kunci[index]) {
                benar++;
            }
        }
        if (e.getSource() == jawaban2button) {
            jawaban = 'B';
            if (jawaban == kunci[index]) {
                benar++;
            }
        }
        if (e.getSource() == jawaban3button) {
            jawaban = 'C';
            if (jawaban == kunci[index]) {
                benar++;
            }
        }
        if (e.getSource() == jawaban4button) {
            jawaban = 'D';
            if (jawaban == kunci[index]) {
                benar++;
            }
        }
        if (e.getSource() == submitbutton) {
            frame.dispose();
            Home home = new Home();
        }

            kunjaw();
    }

    public void kunjaw() {

        jawaban1button.setEnabled(false);
        jawaban2button.setEnabled(false);
        jawaban3button.setEnabled(false);
        jawaban4button.setEnabled(false);

        submitbutton.setEnabled(false);
        submitbutton.setVisible(false);

        sekor.setVisible(false);

        ucapanskor.setVisible(false);

        benarsalah.setVisible(false);

        congrats.setVisible(false);

        if (kunci[index] != 'A')
            jawaban1label.setForeground(new Color(255, 0, 0));
        if (kunci[index] != 'B')
            jawaban2label.setForeground(new Color(255, 0, 0));
        if (kunci[index] != 'C')
            jawaban3label.setForeground(new Color(255, 0, 0));
        if (kunci[index] != 'D')
            jawaban4label.setForeground(new Color(255, 0, 0));

        Timer pause = new Timer(2500, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                jawaban1label.setForeground(new Color(98,187,14));
                jawaban2label.setForeground(new Color(98,187,14));
                jawaban3label.setForeground(new Color(98,187,14));
                jawaban4label.setForeground(new Color(98,187,14));

                jawaban = ' ';
                jawaban1button.setEnabled(true);
                jawaban2button.setEnabled(true);
                jawaban3button.setEnabled(true);
                jawaban4button.setEnabled(true);

                submitbutton.setEnabled(false);
                submitbutton.setVisible(false);

                benarsalah.setVisible(false);

                sekor.setVisible(false);

                ucapanskor.setVisible(false);

                congrats.setVisible(false);
                index++;
                Pertanyaanselanjutnya();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }


    public void skor() {

        jawaban1button.setEnabled(false);
        jawaban1button.setVisible(false);

        jawaban2button.setEnabled(false);
        jawaban2button.setVisible(false);

        jawaban3button.setEnabled(false);
        jawaban3button.setVisible(false);

        jawaban4button.setEnabled(false);
        jawaban4button.setVisible(false);

        quiz1.setVisible(false);

        submitbutton.setVisible(true);
        submitbutton.setEnabled(true);

        sekor.setVisible(true);

        ucapanskor.setVisible(true);
        
        benarsalah.setVisible(true);

        congrats.setVisible(true);

        nilai = (int) ((benar / (double) total_Pertanyaan) * 100);

        benarsalah.setText("("+benar+"/"+total_Pertanyaan+")");

        sekor.setText(nilai+"%");

        ucapanskor.setText("SKOR");



        frame.add(submitbutton);
        frame.add(sekor);
        frame.add(ucapanskor);
        frame.add(benarsalah);
        frame.add(congrats);

        jawaban1label.setText("");
        jawaban2label.setText("");
        jawaban3label.setText("");
        jawaban4label.setText("");

    }
}

























































