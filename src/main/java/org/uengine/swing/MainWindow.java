package org.uengine.swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by uengine on 2018. 1. 31..
 */
public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Sample Swing Application");


        getContentPane().setLayout(new BorderLayout());
        //getContentPane().add(new JMenu("Sample"), BorderLayout.NORTH);
        getContentPane().add(new JLabel("Sample"), BorderLayout.NORTH);

        FruitTableModel fruitTableModel = new FruitTableModel();
        java.util.List<Fruit> fruitList = new ArrayList<Fruit>();

        Fruit fruit = new Fruit();
        fruit = new Fruit();
        fruit.setName("딸기");
        fruit.setPrice(100);

        fruitList.add(fruit);

        fruitTableModel.setFruitList(fruitList);


        getContentPane().add(new JScrollPane(new JTable(fruitTableModel)), BorderLayout.CENTER);
        getContentPane().add(new JButton("Click"), BorderLayout.SOUTH);
    }

    public static void main(String args[]){

//        JFrame frame = new JFrame();
//        frame.setTitle("Sample 2");

        MainWindow mainWindow = new MainWindow();
        mainWindow.pack();
        mainWindow.setSize(1024, 800);
        mainWindow.setVisible(true);
    }
}
