package main;

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
public class GUI extends  Logic{
    public static void setBackgroundImage(JFrame window, JLabel label, JLayeredPane pane, ImageIcon image) {
        label.setIcon(image);
        label.setBounds(0, 0, 300, 517);
        pane.add(label, JLayeredPane.DEFAULT_LAYER, 1);
        window.setLayeredPane(pane);
    }

    public static void setWindowBorder(JFrame window) {
        window.setUndecorated(true);
        window.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 99, 177)));
    }

    public static void setWindowMovable(JFrame window) {
        FrameDragListener frameDragListener = new FrameDragListener(window);
        window.addMouseListener(frameDragListener);
        window.addMouseMotionListener(frameDragListener);
    }

    public static void ButtonSettings(JButton button, ImageIcon image, ImageIcon hover, int x, int y, int width, int height) {
        button.setBounds(x, y, width, height);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setIcon(image);
        button.setBorder(null);
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setIcon(hover);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setIcon(image);
            }
        });

    }

    public static void TextSettings(JTextPane text)
    {
        StyledDocument doc = text.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        text.setText("0");
        text.setBounds(10,62,279,73);
        text.setBackground(new Color(32,32,32));
        text.setEditable(false);
        text.setForeground(Color.white);
        text.setFont(new Font("Codec Pro News", Font.PLAIN, 75));
    }
}
