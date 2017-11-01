/**
 * This is a test project.
 */
package com.peimaida.calculator;
import javax.swing.*;
import java.awt.*;

/**
 * @author sh2328
 * 初始化计算器
 */
public class Calculator extends JFrame {
    //定义面板，并设置为网格布局，4行4列，组件水平和垂直间距均为3
    JPanel panel = new JPanel(new GridLayout(4,4,3,3));
    //定义文本框
    JTextArea area = new JTextArea(2,2);
    //定义字符串数组，为按钮的显示文本赋值，注意字符元素的顺序与循环添加按钮保持一致
    String str[]={"7","8","9","÷","4","5","6","×","1","2","3","-","0",".","=","+"};
    
    public Calculator(String s){
    	//为窗体名称赋值
    	super(s);
    	//定义窗体布局为边界布局
        setLayout(new BorderLayout());
        //声明按钮数组
        JButton btn[];
        //创建按钮数组
        btn=new JButton[str.length];
        //循环定义按钮，并添加到面板中
        for(int i=0;i<str.length;i++){
            btn[i]=new JButton(str[i]);
            panel.add(btn[i]);
        }
        //初始化清除按钮
        JButton clear_btn = new JButton("清除");
        //将文本框放置在窗体NORTH位置
        getContentPane().add(area,BorderLayout.NORTH);    
        //将面板放置在窗体CENTER位置
        getContentPane().add(panel,BorderLayout.CENTER);
        //将清除按钮放在窗体SOUTH位置
        getContentPane().add(clear_btn,BorderLayout.SOUTH);
        setVisible(true);
        setSize(200,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //让窗体居中显示
        setLocationRelativeTo(null);    
    }
	
	public static void main(String  []args){
		new Calculator("计算器");
	}
}