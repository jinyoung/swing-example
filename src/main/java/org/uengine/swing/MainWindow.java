package org.uengine.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        final java.util.List<Fruit> fruitList = new ArrayList<Fruit>();

        Fruit fruit = new Fruit();
        fruit = new Fruit();
        fruit.setName("딸기");
        fruit.setPrice(100);

        fruitList.add(fruit);

        fruitTableModel.setFruitList(fruitList);


        getContentPane().add(new JScrollPane(new JTable(fruitTableModel)), BorderLayout.CENTER);

        JButton clickButton = new JButton("과일 추가");
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Fruit fruit = new Fruit();
                fruit = new Fruit();
                fruit.setName("새과일");
                fruit.setQty(1);

                fruitList.add(fruit);
            }
        });

        getContentPane().add(clickButton, BorderLayout.SOUTH);
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
