import javax.swing.*;
import java.awt.*;

public class MusicGenre {
    //constructor creation
    public MusicGenre(){

        //JFrame creation
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(new BorderLayout());

        //JLabel creation
        JLabel titleLabel = new JLabel("My Music Genre",SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial",Font.BOLD,25));
        frame.add(titleLabel, BorderLayout.NORTH);

        //Rap Music Button creation
        JButton rapMusic = new JButton("Rap Music");
        frame.add(rapMusic, BorderLayout.SOUTH);

        //Gospel Music Creation
        JButton gospelMusic = new JButton("Gospel Music");
        frame.add(gospelMusic, BorderLayout.WEST);

        //Ballads Music Button Creation
        JButton balladsMusic = new JButton("Ballads Music");
        frame.add(balladsMusic,BorderLayout.EAST);

        //setting the visible to true
        frame.setVisible(true);
    }
}
