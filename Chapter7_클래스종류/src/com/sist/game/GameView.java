package com.sist.game;

import java.awt.*;

import javax.swing.*;

public class GameView extends JPanel{
     private Image back;
     private Image avata;
     int x=150;
     int y=50;
     
	

	// 초기화
     public GameView()
     {
    	 back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.gif");
    	 avata=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\my_00.png");
     }
     public void setImage(String name)
     {
    	 avata=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\"+name+".png");
     }

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(avata, x, y, this);
	}
     
       
}