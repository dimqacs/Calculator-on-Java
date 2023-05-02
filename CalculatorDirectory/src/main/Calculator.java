package main;

/* import java.awt.*;
 import java.awt.event.*;*/
import javax.swing.*;

public class Calculator extends GUI{
    // Window and background
    private JFrame Window = new JFrame("Calculator");
    private JLabel Label = new JLabel();
    private ImageIcon Background = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\background.png");
    private JLayeredPane Pane = new JLayeredPane();

    // Buttons
    JButton Zero = new JButton();
    JButton One = new JButton();
    JButton Two = new JButton();
    JButton Three = new JButton();
    JButton Four = new JButton();
    JButton Five = new JButton();
    JButton Six = new JButton();
    JButton Seven = new JButton();
    JButton Eight = new JButton();
    JButton Nine = new JButton();
    JButton Inverse = new JButton();
    JButton Div = new JButton();
    JButton Mod = new JButton();
    JButton Prod = new JButton();
    JButton Minus = new JButton();
    JButton Plus = new JButton();
    JButton Equals = new JButton();
    JButton Comma = new JButton();
    JButton Clear = new JButton();
    JButton ClearAll = new JButton();

    // Default Buttons
    JButton Close = new JButton();
    JButton Maximize = new JButton();
    JButton Minimize = new JButton();
    JButton Restore = new JButton();

    // Icons for buttons
    ImageIcon ZeroIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ZeroIcon.png");
    ImageIcon OneIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\OneIcon.png");
    ImageIcon TwoIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\TwoIcon.png");
    ImageIcon ThreeIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ThreeIcon.png");
    ImageIcon FourIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\FourIcon.png");
    ImageIcon FiveIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\FiveIcon.png");
    ImageIcon SixIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\SixIcon.png");
    ImageIcon SevenIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\SevenIcon.png");
    ImageIcon EightIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\EightIcon.png");
    ImageIcon NineIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\NineIcon.png");
    ImageIcon InverseIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\InverseIcon.png");
    ImageIcon DivIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\DivIcon.png");
    ImageIcon ModIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ModIcon.png");
    ImageIcon ProdIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ProdIcon.png");
    ImageIcon MinusIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\MinusIcon.png");
    ImageIcon PlusIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\PlusIcon.png");
    ImageIcon EqualsIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\EqualsIcon.png");
    ImageIcon CommaIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\CommaIcon.png");
    ImageIcon BackIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\BackIcon.png");
    ImageIcon ClearAllIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ClearAllIcon.png");
    ImageIcon DefBackIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\DefBackIcon.png");
    ImageIcon ZeroClear = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ZeroClear.png");
    ImageIcon AllClear = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\AllClear.png");
    ImageIcon PlusHold = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\PlusHold.png");
    ImageIcon MinusHold = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\MinusHold.png");
    ImageIcon ProdHold = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ProdHold.png");
    ImageIcon ModHold = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\ModHold.png");
    ImageIcon DivHold = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\DivHold.png");




    // Icons for default buttons
    ImageIcon CloseIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\CloseIcon.png");
    ImageIcon CloseIconHover = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\CloseIconHover.png");
    ImageIcon MaximizeIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\MaximizeIcon.png");
    ImageIcon MaximizeIconHover = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\MaximizeIconHover.png");
    ImageIcon MinimizeIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\MinimizeIcon.png");
    ImageIcon MinimizeIconHover = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\MinimizeIconHover.png");
    ImageIcon RestoreIcon = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\RestoreIcon.png");
    ImageIcon RestoreIconHover = new ImageIcon("E:\\CalculatorDirectory\\res\\images\\RestoreIconHover.png");

    // Text Filed
    private JTextPane text = new JTextPane();

    public Calculator() {
        // JFrame settings
        Window.setBounds(855, 300, 300, 517);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setWindowBorder(Window);
        setWindowMovable(Window);
        setBackgroundImage(Window, Label, Pane, Background);

        // Default JButtons Settings
        ButtonSettings(Close, CloseIcon, CloseIconHover, 252, 0, 47, 32);
        ButtonSettings(Maximize, MaximizeIcon, MaximizeIconHover, 206, 0, 47, 32);
        ButtonSettings(Minimize, MinimizeIcon, MinimizeIconHover, 160, 0, 47, 32);

        Close.addActionListener(new ExitProgram(Window));
        Maximize.addActionListener(new MaximizeWindow(Window));
        Minimize.addActionListener(new HideWindow(Window));

        Pane.add(Close, JLayeredPane.PALETTE_LAYER, 2);
        Pane.add(Maximize, JLayeredPane.PALETTE_LAYER, 2);
        Pane.add(Minimize, JLayeredPane.PALETTE_LAYER, 2);

        // Number Buttons Settings
        ButtonSettings(Zero, ZeroClear, ZeroIcon, 10, 437, 136, 63);
        ButtonSettings(One, AllClear, OneIcon, 10, 364, 63, 63);
        ButtonSettings(Two, AllClear, TwoIcon, 82, 364, 63, 63);
        ButtonSettings(Three, AllClear, ThreeIcon, 154, 364, 63, 63);
        ButtonSettings(Four, AllClear, FourIcon, 10, 292, 63, 63);
        ButtonSettings(Five, AllClear, FiveIcon, 82, 292, 63, 63);
        ButtonSettings(Six, AllClear, SixIcon, 154, 292, 63, 63);
        ButtonSettings(Seven, AllClear, SevenIcon, 10, 220, 63, 63);
        ButtonSettings(Eight, AllClear, EightIcon, 82, 220, 63, 63);
        ButtonSettings(Nine, AllClear, NineIcon, 154, 220, 63, 63);
        ButtonSettings(Comma, AllClear, CommaIcon, 154, 437, 63, 63);
        ButtonSettings(Div, AllClear, DivIcon, 226, 148, 63, 63);
        ButtonSettings(Prod, AllClear, ProdIcon, 226, 220, 63, 63);
        ButtonSettings(Minus, AllClear, MinusIcon, 226, 292, 63, 63);
        ButtonSettings(Plus, AllClear, PlusIcon, 226, 364, 63, 63);
        ButtonSettings(Equals, AllClear, EqualsIcon, 226, 437, 63, 63);
        ButtonSettings(Mod, AllClear, ModIcon, 154, 148, 63, 63);
        ButtonSettings(Inverse, AllClear, InverseIcon, 82, 148, 63, 63);
        ButtonSettings(ClearAll, AllClear, ClearAllIcon, 10, 148, 63, 63);
        ButtonSettings(Clear, DefBackIcon, BackIcon, 10, 148, 63, 63);

        Zero.addActionListener(new CreateNumber(0, text, Pane, Clear, ClearAll, DefBackIcon));
        One.addActionListener(new CreateNumber(1, text, Pane, Clear, ClearAll, DefBackIcon));
        Two.addActionListener(new CreateNumber(2, text, Pane, Clear, ClearAll, DefBackIcon));
        Three.addActionListener(new CreateNumber(3, text, Pane, Clear, ClearAll, DefBackIcon));
        Four.addActionListener(new CreateNumber(4, text, Pane, Clear, ClearAll, DefBackIcon));
        Five.addActionListener(new CreateNumber(5, text, Pane, Clear, ClearAll, DefBackIcon));
        Six.addActionListener(new CreateNumber(6, text, Pane, Clear, ClearAll, DefBackIcon));
        Seven.addActionListener(new CreateNumber(7, text, Pane, Clear, ClearAll, DefBackIcon));
        Eight.addActionListener(new CreateNumber(8, text, Pane, Clear, ClearAll, DefBackIcon));
        Nine.addActionListener(new CreateNumber(9, text, Pane, Clear, ClearAll, DefBackIcon));
        Clear.addActionListener(new Clear(text, Pane, ClearAll, Clear));
        ClearAll.addActionListener(new ClearAll(text));
        Plus.addActionListener(new Plus(PlusHold, Pane));
        Equals.addActionListener(new Equals(text));
        Inverse.addActionListener(new Inverse(text));
        Minus.addActionListener(new Minus(MinusHold,Pane));
        Prod.addActionListener(new Prod(ProdHold, Pane));
        Mod.addActionListener(new Mod(ModHold, Pane));
        Div.addActionListener(new Div(DivHold, Pane));

        Pane.add(Zero, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(One, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Two, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Three, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Four, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Five, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Six, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Seven, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Eight, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Nine, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Comma, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Div, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Prod, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Minus, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Plus, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Equals, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Mod, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(Inverse, JLayeredPane.MODAL_LAYER, 3);
        Pane.add(ClearAll, JLayeredPane.MODAL_LAYER, 3);

        // JTextField Settings
        TextSettings(text);
        Pane.add(text, JLayeredPane.MODAL_LAYER, 3);

        Window.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
