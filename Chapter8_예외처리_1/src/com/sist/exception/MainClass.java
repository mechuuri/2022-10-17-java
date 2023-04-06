package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass extends JFrame implements ActionListener {
	//				   -------------- 클래스 		 --------------- 인터페이스 (다중상속)
	private JTextArea ta; // 포함 클래스: 클래스 안에 다른 클래스를 포함해서 쓰는 것
	private JTextField tf;
	private JButton b1,b2;
	private int[] com=new int[3];
	private int[] user=new int[3];
	private int s,b;
	
	// 시작과 동시에 배치
	public MainClass()
	{
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(10);
		b1=new JButton("Start");
		b2=new JButton("Exit");
		add("Center",js);
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add("South",p);
		
		//크기
		setSize(450,420);
		setVisible(true);
		
		//이벤트 등록
		b1.addActionListener(this); // 클릭 ==> 시스템에 의해 자동 호출(Callback);버튼 누르면 가지고 있는 메소드를 호출해줭~
		tf.addActionListener(this); // 텍스트필드에서 엔터치면 
		
		
		}
	public void getRand()
	{
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
		}
		else if(e.getSource()==tf)
		{
			// 입력한 값을 읽어 온다
			String input=tf.getText();
			// 정수형으로 변경
			try
			{
				int m=Integer.parseInt(input);
			}catch(Exception ex) {
				// 복구
				JOptionPane.showMessageDialog(this, "세자리 정수 입력");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			
		}
	}

}
