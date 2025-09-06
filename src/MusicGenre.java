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
    }
}
