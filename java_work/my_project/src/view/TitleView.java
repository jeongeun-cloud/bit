package view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TitleView extends View{
	
	public TitleView() {
		init();
	}

	@Override
	public void init() {
		JLabel title = new JLabel("::::: ȸ�� ��� ���α׷� ::::: \n");
		title.setFont(new Font("�������", Font.BOLD, 30));
		this.add(title);
		
		ImageIcon icon = new ImageIcon("calc.jpg"); 
		Image img = icon.getImage(); 
		Image img2 = img.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(img2);
		JLabel labelImg = new JLabel(icon2);
		this.add(labelImg);
	
	}

	@Override
	public void start() {
		
	}
	
	
}
