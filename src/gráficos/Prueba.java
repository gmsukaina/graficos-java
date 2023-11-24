package gráficos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prueba extends JPanel {
    private Image image;

    public Prueba() {
        // Carga la imagen desde un archivo
        ImageIcon icon = new ImageIcon("icono.gif");
        image = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("SUKAINA ES LA MEJOR");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Prueba());
            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }
}

