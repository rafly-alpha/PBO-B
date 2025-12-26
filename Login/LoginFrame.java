import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginFrame() {
        setTitle("Form Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 30, 80, 25);
        add(lblUser);

        txtUsername = new JTextField();
        txtUsername.setBounds(120, 30, 120, 25);
        add(txtUsername);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 70, 80, 25);
        add(lblPass);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 70, 120, 25);
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(90, 110, 100, 30);
        add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginAction();
            }
        });
    }

    private void loginAction() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login Berhasil!");
        } else {
            JOptionPane.showMessageDialog(this, "Username atau Password salah!");
        }
    }

    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}
