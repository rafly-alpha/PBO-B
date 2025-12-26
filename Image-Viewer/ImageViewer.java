import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ImageViewer extends JFrame {

    private JLabel imageLabel;
    private JButton openButton;

    public ImageViewer() {
        setTitle("Image Viewer");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel("No Image Selected", JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        openButton = new JButton("Open Image");
        add(openButton, BorderLayout.SOUTH);

        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openImage();
            }
        });
    }

    private void openImage() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
            imageLabel.setIcon(icon);
            imageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new ImageViewer().setVisible(true);
    }
}
