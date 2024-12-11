/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocolux;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;

public class IconUtil {
    
    /**
     * Phương thức resize ảnh và trả về ImageIcon
     * @param path Đường dẫn đến ảnh
     * @param width Chiều rộng mong muốn
     * @param height Chiều cao mong muốn
     * @return ImageIcon đã resize
     */
    public static ImageIcon resizeIcon(String relativePath, int width, int height) {
        String basePath = System.getProperty("user.dir"); // Thư mục gốc dự án
        String fullPath = basePath + "/" + relativePath;
        ImageIcon originalIcon = new ImageIcon(fullPath);
        if (originalIcon.getImage() == null) {
            System.err.println("Image not found at: " + fullPath);
            return null;
        }
        Image resizedImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }


    /**
     * Gán icon cho JMenu
     * @param menu JMenu cần gán icon
     * @param path Đường dẫn đến ảnh
     * @param width Chiều rộng icon
     * @param height Chiều cao icon
     */
    public static void setMenuIcon(JMenu menu, String path, int width, int height) {
        menu.setIcon(resizeIcon(path, width, height));
    }

    /**
     * Gán icon cho JMenuItem
     * @param menuItem JMenuItem cần gán icon
     * @param path Đường dẫn đến ảnh
     * @param width Chiều rộng icon
     * @param height Chiều cao icon
     */
    public static void setMenuItemIcon(JMenuItem menuItem, String path, int width, int height) {
        menuItem.setIcon(resizeIcon(path, width, height));
    }
}