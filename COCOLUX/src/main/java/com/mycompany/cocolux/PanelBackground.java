/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocolux;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ASUS
 */
public class PanelBackground extends JPanel{
    private Image backgroundImage;

    public PanelBackground(String imagePath) {
        // Load ảnh từ đường dẫn
        backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Vẽ ảnh nền
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
