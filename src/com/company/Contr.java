package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Contr extends JFrame implements ActionListener {

    private JTextField field = new JTextField();
    private JButton del = new JButton();
    private JButton del1 = new JButton();
    private JButton p = new JButton();
    private JButton m = new JButton();
    private JButton r = new JButton();
    private JButton y = new JButton();
    private JButton q = new JButton();
    private JButton d1 = new JButton();
    private JButton d2 = new JButton();
    private JButton d3 = new JButton();
    private JButton d4 = new JButton();
    private JButton d5 = new JButton();
    private JButton d6 = new JButton();
    private JButton d7 = new JButton();
    private JButton d8 = new JButton();
    private JButton d9 = new JButton();
    private JButton d0 = new JButton();
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private char z;


    final String[] text = {""};


    public Contr() {
        super("Simple Example");
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        field.setLocation(1, 1);
        field.setSize(500, 100);
        add(field);
        d1.setBounds(1, 101, 50, 50);
        d1.setText("7");
        add(d1);
        d1.addActionListener(this);
        d2.setBounds(51, 101, 50, 50);
        d2.setText("8");
        add(d2);
        d2.addActionListener(this);
        d3.setBounds(101, 101, 50, 50);
        d3.setText("9");
        add(d3);
        d3.addActionListener(this);
        d4.setBounds(1, 151, 50, 50);
        d4.setText("4");
        add(d4);
        d4.addActionListener(this);
        d5.setBounds(51, 151, 50, 50);
        d5.setText("5");
        add(d5);
        d5.addActionListener(this);
        d6.setBounds(101, 151, 50, 50);
        d6.setText("6");
        add(d6);
        d6.addActionListener(this);
        d7.setBounds(1, 201, 50, 50);
        d7.setText("1");
        add(d7);
        d7.addActionListener(this);
        d8.setBounds(51, 201, 50, 50);
        d8.setText("2");
        add(d8);
        d8.addActionListener(this);
        d9.setBounds(101, 201, 50, 50);
        d9.setText("3");
        add(d9);
        d9.addActionListener(this);
        d0.setBounds(51, 251, 50, 50);
        d0.setText("0");
        add(d0);
        d0.addActionListener(this);
        del.setBounds(151, 101, 50, 50);
        del.setText("C");
        add(del);
        del.addActionListener(this);
        del1.setBounds(201, 101, 50, 50);
        del1.setText("D");
        add(del1);
        del1.addActionListener(this);
        p.setBounds(151, 151, 50, 50);
        p.setText("+");
        add(p);
        p.addActionListener(this);
        m.setBounds(151, 201, 50, 50);
        m.setText("-");
        add(m);
        m.addActionListener(this);
        r.setBounds(101, 251, 150, 50);
        r.setText("=");
        add(r);
        r.addActionListener(this);
        y.setBounds(201, 151, 50, 50);
        y.setText("*");
        add(y);
        y.addActionListener(this);
        q.setBounds(201, 201, 50, 50);
        q.setText("/");
        add(q);
        q.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == d1) {
            text[0] = text[0] + d1.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d2) {
            text[0] = text[0] + d2.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d3) {
            text[0] = text[0] + d3.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d4) {
            text[0] = text[0] + d4.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d5) {
            text[0] = text[0] + d5.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d6) {
            text[0] = text[0] + d6.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d7) {
            text[0] = text[0] + d7.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d8) {
            text[0] = text[0] + d8.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d9) {
            text[0] = text[0] + d9.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == d0) {
            text[0] = text[0] + d0.getText();
            field.setText(text[0]);
        }
        if (e.getSource() == del) {
            text[0] = "";
            field.setText(text[0]);
        }
        if (e.getSource() == del1) {
            int c = Integer.parseInt(field.getText());
            c=c/10;
            field.setText(String.valueOf(c));
            text[0] =(String.valueOf(c));
            field.setText(text[0]);
        }
        if (e.getSource() == p) {
            a = Integer.parseInt(text[0]);
            field.setText(text[0] + p.getText());
            text[0] = "";
            z = '+';
        }
        if (e.getSource() == m) {
            a = Integer.parseInt(text[0]);
            field.setText(text[0] + m.getText());
            text[0] = "";
            z = '-';
        }
        if (e.getSource() == y) {
            a = Integer.parseInt(text[0]);
            field.setText(text[0] + y.getText());
            text[0] = "";
            z = '*';
        } if (e.getSource() == q)  {
            a = Integer.parseInt(text[0]);
            field.setText(text[0] + q.getText());
            text[0] = "";
            z = '/';
        }
        if (e.getSource() == r) {
            if (z == '+') {
                b = Integer.parseInt(text[0]);
                field.setText(String.valueOf(a + b));
            }
            if (z == '-') {
                b = Integer.parseInt(text[0]);
                field.setText(String.valueOf(a - b));
            }
            if (z == '*') {
                b = Integer.parseInt(text[0]);
                field.setText(String.valueOf(a * b));
            }
            if (z == '/') {
                b = Integer.parseInt(text[0]);
                field.setText(String.valueOf(a / b));
            }
        }
    }
}




