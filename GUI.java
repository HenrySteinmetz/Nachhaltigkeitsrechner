import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI extends Frame {
    //Farben für light / dark mode von https://github.com/catppuccin/catppuccin
    //Dark Theme
    public static Color bg_dark = Color.decode("#1e1e2e");
    public static Color text_dark = Color.decode("#cdd6f4");
    public static Color accent_dark = Color.decode("#89b4fa");

    //Light Theme
    public static Color bg_light = Color.decode("#eff1f5");
    public static Color text_light = Color.decode("#4c4f69");
    public static Color accent_light = Color.decode("1e66f5");

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        setBackground(bg_dark);
    }

    public static void main(){
        //Frame erstellen und einstellen

        JFrame frame = new JFrame();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setTitle("Nachhaltigkeitsrechner");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        frame.setLayout(null);

    }


}
