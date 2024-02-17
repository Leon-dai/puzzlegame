package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //跟注册相关的代码都写在这个界面中
    public RegisterJFrame(){
        this.setSize(488, 500);

        //设置界面的标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        this.setVisible(true);
    }
}
