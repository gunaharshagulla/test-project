import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

class colour extends JFrame implements ActionListener { 
	// textfield to enter RGBA value 
	JTextField H, S, B; 

	// panel 
	JPanel p; 

	// constructor 
	colour() 
	{ 
		super("colour"); 

		// create textfield 
		H = new JTextField(3); 
		S = new JTextField(3); 
		B = new JTextField(3); 

		// create labels 
		JLabel l = new JLabel("Hue= "); 
		JLabel l1 = new JLabel("Saturation= "); 
		JLabel l2 = new JLabel("Brightness= "); 

		// create a panel 
		p = new JPanel(); 

		// create button 
		JButton b = new JButton("ok"); 
		JButton b1 = new JButton("brighter"); 
		JButton b2 = new JButton("Darker"); 

		// add ActionListener 
		b.addActionListener(this); 
		b2.addActionListener(this); 
		b1.addActionListener(this); 

		// add components to panel 
		p.add(l); 
		p.add(H); 
		p.add(l1); 
		p.add(S); 
		p.add(l2); 
		p.add(B); 
		p.add(b); 
		p.add(b1); 
		p.add(b2); 

		setSize(200, 200); 
		add(p); 
		show(); 
	} 

	// if button is pressed 
	public void actionPerformed(ActionEvent evt) 
	{ 
		String st = evt.getActionCommand(); 
		if (st.equals("ok")) { 
			float h, s, b; 

			// get rgba velue 
			h = Float.parseFloat(H.getText()); 
			s = Float.parseFloat(S.getText()); 
			b = Float.parseFloat(B.getText()); 

			// create a new Color 
			Color c = Color.getHSBColor(h, s, b); 

			// set the color as background of panel 
			p.setBackground(c); 
		} 
		else if (st.equals("brighter")) { 

			// getBackgroundColor 
			Color c = p.getBackground(); 

			// make the color brighter 
			c = c.brighter(); 

			// set the color as background of panel 
			p.setBackground(c); 
		} 
		else { 

			// getBackgroundColor 
			Color c = p.getBackground(); 

			// make the color brighter 
			c = c.darker(); 

			// set the color as background of panel 
			p.setBackground(c); 
		} 
	} 

	// Main Method 
	public static void main(String args[]) 
	{ 
		colour c = new colour(); 
	} 
} 
