package org.comstudy21.graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ex01 extends MyFrame {
	
	public Ex01() {
		
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		//System.out.println("paint 메소드 호출!");
		
		//g.drawRect(50, 50, 100, 100);
		g.setColor(Color.YELLOW);
		g.fillRect(50, 50, 100, 100);

		g.setColor(Color.BLUE);
		Font font = new Font("Arial",Font.BOLD,18);
		g.setFont(font);
		g.drawString("Hello world",50, 80);
		
		File imageSrc = new File("capture.png");
		BufferedImage img = null;
		try {
			img = ImageIO.read(imageSrc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(img, 180, 50, 200, 150, null);
	}
	
	@Override
	public void repaint() {
		System.out.println("repaint 메소드 호출!");
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
