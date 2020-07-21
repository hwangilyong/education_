package com.company.day13;

import javax.swing.*;

public class test1 extends JFrame {
    public void main(){
        setVisible(true);
        setSize(500,600);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel idLabel = new JLabel("ID  ");
        JLabel pwLabel = new JLabel("Password ");
        JTextField idText = new JTextField(10);
        JPasswordField pwText = new JPasswordField(10);
        JButton logBtn = new JButton("LOGIN");

        panel.add(idLabel);
        panel.add(pwLabel);
        panel.add(idText);
        panel.add(pwText);
        panel.add(logBtn);

        add(panel);
    }
}
