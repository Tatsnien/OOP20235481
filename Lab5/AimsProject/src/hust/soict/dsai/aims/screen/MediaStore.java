package hust.soict.dsai.aims.screen;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.cart.*;

public class MediaStore extends JPanel{
	private Media media;
	private Cart cart;
	
	public MediaStore(JFrame frame, Media media, Cart cart) {
		this.media = media;
		this.cart = cart;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + "$");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		container.add(setAddToCart(frame));
		if (media instanceof Playable) 
			container.add(setPlayButton(frame));
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private JButton setPlayButton(JFrame frame) {
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PlayDialog(frame, media);
			}
		});
		return playButton;
	}
	
	private JButton setAddToCart(JFrame frame) {
		JButton addToCartButton = new JButton("Add to cart");
		addToCartButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddToCartDialog(frame, media);
				cart.addMedia(media);
			}
		});
		return addToCartButton;
	}
}
