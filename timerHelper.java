import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;


public class timerHelper extends TimerTask implements ActionListener {

    JFrame frame; 

    @Override
    public void run(){
        JButton button = new JButton("am done");
        button.addActionListener(this);

        JLabel label = new JLabel("look away for 20 seconds 20 feet away");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button);

        // if we want can figure out how to delay button for 20 seconds... 

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
       eyeTimer.timer.schedule(new timerHelper(),eyeTimer.length);
    }
 
}