package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Logic {
    public int fnumber = 0, snumber = 0, result = 0;

    public boolean first = true, second = false, real;
    public JLabel Label = new JLabel();
    public String operator;

    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }

    public class ExitProgram implements ActionListener {
        private JFrame frame = new JFrame();

        public ExitProgram(JFrame frame) {
            this.frame = frame;
        }

        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            frame.dispose();
        }
    }

    public class HideWindow implements ActionListener {
        private JFrame frame = new JFrame();

        public HideWindow(JFrame frame) {
            this.frame = frame;
        }

        public void actionPerformed(ActionEvent e) {
            frame.setState(JFrame.ICONIFIED);
        }
    }

    public class MaximizeWindow implements ActionListener {

        private JFrame frame = new JFrame();

        public MaximizeWindow(JFrame frame) {
            this.frame = frame;
        }

        public void actionPerformed(ActionEvent e) {
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        }
    }

    public class RestoreWindow implements ActionListener {

        private JFrame frame = new JFrame();

        public RestoreWindow(JFrame frame) {
            this.frame = frame;
        }

        public void actionPerformed(ActionEvent e) {
            frame.setExtendedState(JFrame.NORMAL);
        }
    }

    public class CreateNumber implements ActionListener {

        private int digit;
        private JTextPane text;
        private JLayeredPane pane;
        private JButton button, second;
        private ImageIcon image;

        public CreateNumber(int digit, JTextPane text, JLayeredPane pane, JButton button, JButton second, ImageIcon image) {
            this.digit = digit;
            this.text = text;
            this.pane = pane;
            this.button = button;
            this.second = second;
            this.image = image;
        }

        public void actionPerformed(ActionEvent e) {
            if (first)
            {
                fnumber = fnumber * 10 + digit;
                text.setText("");
                text.setText(Integer.toString(fnumber));
            }
            else
            {
                snumber = snumber * 10 + digit;
                text.setText(Integer.toString(snumber));
                Label.setVisible(false);
            }

            pane.remove(second);
            button.setIcon(image);
            pane.add(button, JLayeredPane.MODAL_LAYER, 3);
        }
    }

    /*public class ShowAnswer implements ActionListener {

        JTextPane text;

        public ShowAnswer(JTextPane text) {
            this.text = text;
        }

        public void actionPerformed(ActionEvent e) {
            text.setText("");
            text.setText(Integer.toString(fnumber));
        }
    }*/

    public class ClearAll implements ActionListener {
        private JTextPane text;

        public ClearAll(JTextPane text) {
            this.text = text;
        }

        public void actionPerformed(ActionEvent e) {
            text.setText("0");
            fnumber = 0;
            snumber = 0;
            result = 0;
            first = true;
            second = false;
            Label.setVisible(false);
        }
    }

    public class Clear implements ActionListener {
        private JTextPane text;
        private JLayeredPane pane;
        private JButton button, delete;

        public Clear(JTextPane text, JLayeredPane pane, JButton button,  JButton delete) {
            this.text = text;
            this.pane = pane;
            this.button = button;
            this.delete = delete;
        }

        public void actionPerformed(ActionEvent e) {
            text.setText("0");
            if (first)
                fnumber = 0;
            else {
                snumber = 0;
                result = fnumber;
            }
            pane.remove(delete);
            pane.add(button, JLayeredPane.MODAL_LAYER, 3);
        }
    }

    public class Plus implements ActionListener {
        private ImageIcon image;
        private JLayeredPane pane;

        public Plus( ImageIcon image, JLayeredPane pane)
        {
            this.image = image;
            this.pane = pane;
        }

        public void actionPerformed(ActionEvent e)
        {
            first = false;
            second = true;
            Label.setIcon(image);
            Label.setBounds(226, 364, 63, 63);
            Label.setVisible(true);
            pane.add(Label, JLayeredPane.POPUP_LAYER, 4);
            operator = "plus";
        }
    }

    public class Inverse implements ActionListener
    {
        private JTextPane text;

        public Inverse(JTextPane text)
        {
            this.text = text;
        }

        public void actionPerformed(ActionEvent e)
        {
            Label.setIcon(null);
            fnumber *= -1;
            text.setText(Integer.toString(fnumber));
        }
    }

    public class Minus implements ActionListener
    {
        private ImageIcon image;
        private JLayeredPane pane;

        public Minus( ImageIcon image, JLayeredPane pane)
        {
            this.image = image;
            this.pane = pane;
        }

        public void actionPerformed(ActionEvent e)
        {
            first = false;
            second = true;
            Label.setIcon(image);
            Label.setBounds(226, 292, 63, 63);
            Label.setVisible(true);
            pane.add(Label, JLayeredPane.POPUP_LAYER, 4);
            operator = "minus";
        }
    }

    public class Prod implements ActionListener
    {
        private ImageIcon image;
        private JLayeredPane pane;

        public Prod( ImageIcon image, JLayeredPane pane)
        {
            this.image = image;
            this.pane = pane;
        }

        public void actionPerformed(ActionEvent e)
        {
            first = false;
            second = true;
            Label.setIcon(image);
            Label.setBounds(226, 220, 63, 63);
            Label.setVisible(true);
            pane.add(Label, JLayeredPane.POPUP_LAYER, 4);
            operator = "prod";
        }
    }

    public class Mod implements ActionListener
    {
        private ImageIcon image;
        private JLayeredPane pane;

        public Mod( ImageIcon image, JLayeredPane pane)
        {
            this.image = image;
            this.pane = pane;
        }

        public void actionPerformed(ActionEvent e)
        {
            first = false;
            second = true;
            Label.setIcon(image);
            Label.setBounds(154, 148, 63, 63);
            Label.setVisible(true);
            pane.add(Label, JLayeredPane.POPUP_LAYER, 4);
            operator = "mod";
        }
    }

    public class Div implements ActionListener
    {
        private ImageIcon image;
        private JLayeredPane pane;

        public Div( ImageIcon image, JLayeredPane pane)
        {
            this.image = image;
            this.pane = pane;
        }

        public void actionPerformed(ActionEvent e)
        {
            first = false;
            second = true;
            Label.setIcon(image);
            Label.setBounds(226, 148, 63, 63);
            Label.setVisible(true);
            pane.add(Label, JLayeredPane.POPUP_LAYER, 4);
            operator = "div";
        }
    }
    public class Equals implements ActionListener{

        private JTextPane text;

        public Equals(JTextPane text)
        {
            this.text = text;
        }

        public void actionPerformed(ActionEvent e)
        {
            switch (operator) {
                case "plus" ->
                {
                    result = fnumber + snumber;
                    text.setText(Integer.toString(result));
                }
                case "minus" ->
                {
                    result = fnumber - snumber;
                    text.setText(Integer.toString(result));
                }
                case "prod" ->
                {
                    result = fnumber * snumber;
                    text.setText(Integer.toString(result));
                }
                case "mod" ->
                {
                    result = ((fnumber % snumber)+ snumber) % snumber;
                    text.setText(Integer.toString(result));
                }
                case "div" ->
                {
                    result = fnumber / snumber;
                    text.setText(Integer.toString(result));
                }
                default -> text.setText("ERROR");
            }
            fnumber = result;
            snumber = 0;
            first = true;
            second = false;
        }
    }

}
