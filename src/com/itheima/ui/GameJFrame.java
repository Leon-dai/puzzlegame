package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //JFrame 界面，窗体
    //子类呢？也表示界面，窗体
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中
    public GameJFrame(){
        //设置界面的宽高
        this.setSize(603, 680);

        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);



        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }
}
