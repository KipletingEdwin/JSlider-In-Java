import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;


    SliderDemo(){
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider();

    }


    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
