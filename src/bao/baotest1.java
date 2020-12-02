package bao;

import java.awt.*;
import  java.awt.event.FocusEvent;
import  java.awt.event.FocusListener;
import  java.awt.event.KeyEvent;
import  java.awt.event.KeyListener;

public class baotest1{

    Frame app=new Frame("TestField组件");
    Label lblName= new Label("UserName");
    static TextField txtName=new TextField();
    Label lblPass= new Label("Password");
    static TextField txtPass=new TextField();
    public  baotest1(){
        app.setSize(300,150);
        app.setLayout(null);
        lblName.setBounds(60, 50, 70, 20);
        txtName.setBounds(135, 50, 100, 20);
        txtName. addKeyListener(new keyHandler());
        txtName.addFocusListener(new focusHandler());
        /*设置密码栏对应的标签与文本域的位置与大小*/
        lblPass.setBounds(60, 90, 70, 20);
        txtPass.setBounds(135, 90, 100,20);
        txtPass.setEchoChar('*');//设置密码框文本域的回显字符//为密码框添加事件侦听器
        txtPass.addKeyListener(new keyHandler());
        txtPass.addFocusListener(new focusHandler());
        /*将组件添加到窗体容器内*/
        app.add(lblName);
        app.add(txtName);
        app.add(lblPass);
        app.add(txtPass);
        /*设置窗体的位置与可见性*/
        app.setLocation(200, 100);
        app.setVisible(true);
    }
        public static void main(String[] args) {
            baotest1 tft = new baotest1();
        }
}
class keyHandler implements KeyListener {
    public void keyPressed(KeyEvent e){
        Object ob = e.getSource();
        if ((ob == baotest1.txtName) && (e.getKeyCode()==10)) {
            System.out.println(baotest1.txtName. getText());
        }
        else if ((ob == baotest1.txtPass) && (e.getKeyCode()==10)){
            System.out.println(baotest1.txtPass. getText());
        }
    }
    public  void keyReleased(KeyEvent e){
    }
    public  void keyTyped(KeyEvent e){
    }
}
class focusHandler implements FocusListener {
    //获取键盘焦点
    public void focusGained(FocusEvent e){
    }
    //失去键盘焦点
    public void focusLost(FocusEvent e) {
        //获取事件对象
        Object ob = e.getSource();
        if (ob == baotest1.txtName) {
            System.out.println(baotest1.txtName.getText());
        } else if (ob == baotest1.txtPass) {
            System.out.println (baotest1.txtPass.getText());
        }
    }
}
