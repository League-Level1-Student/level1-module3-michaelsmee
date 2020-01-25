
package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;
	MediaPalace poop= new MediaPalace();

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.addMouseListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_04_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	System.out.println("x is"+e.getX());
	System.out.println("y is"+e.getY());
		if(e.getY()>100 && e.getY()<200 && e.getX()>100 && e.getX()<200) {
			poop.speak("tyler");
		
		}
		else if(e.getY()>500 && e.getY()<550 && e.getX()>160 && e.getX()<220) {
		poop.speak("Hi, my name is Tyler Wiltz, I come from a massive house called the apartment complex");	
	}
	
		else if(e.getY()>850 && e.getY()<900 && e.getX()>180 && e.getX()<200) {
			poop.speak("I am someone who knows Tyler, he is a very big memer with an old ford not to mention his love of shoes, 30 pairs, isn't that a lot. I know, it is, as a hint, try clicking some other areas");
		}
		else if(e.getY()>350 && e.getY()<600 && e.getX()>450 && e.getX()<600 ){
			poop.speak("this is tyler's dorm area, fyi, the architecture sucks, it can't even hold his big old chevy truck or shoes, just an old laptop");
		}
		else if(e.getY()>250 && e.getY()<400 && e.getX()>240 && e.getX()<500	) {
		poop.speak("this is lord Wiltz's water source of infinite chipotle water");	
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


