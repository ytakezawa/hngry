package HNGRY;
//FIRST JAVA GUI AHHHHHHHHHH
//yoshika takezawa
//used https://www.tutorialspoint.com/swing/swing_event_handling.htm as a guide
//9/23/18 

import java.awt.*;		//for gridLayout
import java.awt.event.*; // for closing the windows

import javax.swing.*;

public class Grumblw {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JPanel controlPanel;
	
	public Grumblw() {
		//constructor
		prepareGUI();
	}
	
	public static void main(String args[]) {
		Grumblw grumble = new Grumblw();
		grumble.showEvent();
	}
	
	private void prepareGUI() {
		// creates the window to have our UI
		mainFrame = new JFrame("HNGRY");
		mainFrame.setSize(300, 400);
		mainFrame.setLayout(new GridLayout(2,1));
		
		headerLabel = new JLabel("", JLabel.CENTER);
		
		//closes window
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.setVisible(true);
	}
	
	private void showEvent() {
		headerLabel.setText("Are you hungry?");
		JButton noButton = new JButton("No");
		JButton yesButton = new JButton("Yes");
		
		//creates the listening functions
		noButton.addActionListener(new NoButtonClickListener());
		yesButton.addActionListener(new YesButtonClickListener());
		
		controlPanel.add(noButton);
		controlPanel.add(yesButton);
		
		mainFrame.setVisible(true);
	}
	
	/*
	 * --------------------------LEVEL 1 of INTEROGATION-----------------------------------
	 * user pressed the NO button.
	 */
	private class NoButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("Go away.");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll(); // these three lines are to prevent the past from showing up
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
			mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user pressed the YES button.
	 */
	private class YesButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("How hungry are you?");
			JButton snackButton = new JButton("Snack");
			JButton mealButton = new JButton("Meal");
			JButton eleButton = new JButton("Elephant");
			JButton coffeeButton = new JButton("Coffee");
			
			snackButton.addActionListener(new SnackButtonClickListener());
			mealButton.addActionListener(new MealButtonClickListener());
			eleButton.addActionListener(new EleButtonClickListener());
			coffeeButton.addActionListener(new CoffeeButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			controlPanel.add(snackButton);
			controlPanel.add(mealButton);
			controlPanel.add(eleButton);
			controlPanel.add(coffeeButton);
			
			mainFrame.setVisible(true);
		}
	}
	
	/*
	 * --------------------------------LEVEL 2 of INTEROGATION-----------------------------------------
	 * user clicks  ELEPHANT
	 */
	private class EleButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("We don't eat elephants here.");
			
			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			controlPanel.add(okButton);
			
			mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user clicks COFFEE
	 */
	private class CoffeeButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("<html><ul>Here you go, ya tired gal:"
					+ "<li>America's Cup</li>"
					+ "<li>Starbucks</li>"
					+ "<li>Dunkin Donuts</li>"
					+ "<li>McDonalds</li></ul></html>");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
		    mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user clicks SNACK
	 */
	private class SnackButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("What're you feeling today?");
			
			JButton sweetButton = new JButton("Sweets");
			JButton savoryButton = new JButton("Savory");
			sweetButton.addActionListener(new SweetButtonClickListener());
			savoryButton.addActionListener(new SavoryButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(sweetButton);
			controlPanel.add(savoryButton);
			
			mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user clicks MEAL
	 */
	private class MealButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("What're you feeling today?");
			
			JButton bowlButton = new JButton("Bowl");
			JButton oneHandButton = new JButton("Burrito/Sandwich");
			JButton saladButton = new JButton("Salad");
			JButton otherButton = new JButton("Other");
			bowlButton.addActionListener(new BowlButtonClickListener());
			oneHandButton.addActionListener(new OneHandButtonClickListener());
			saladButton.addActionListener(new SaladButtonClickListener());
			otherButton.addActionListener(new OtherButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(bowlButton);
			controlPanel.add(oneHandButton);
			controlPanel.add(saladButton);
			controlPanel.add(otherButton);
			
			mainFrame.setVisible(true);
		}
	}
	
	/*
	 * ------------------------LEVEL 3 of INTEROGATION---------------------
	 * user clicks sweet button from snack
	 */
	private class SweetButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("<html><ul>As per usual, at ACup:"
					+ "<li>Donut</li>"
					+ "<li>Cinnamon Roll</li>"
					+ "<li>Fruit cup</li>"
					+ "<li>Yogurt</li></ul></html>");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
		    mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user clicks savory button from snack
	 */
	private class SavoryButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("<html><ul>Odd, but here ya go:"
					+ "<li>Doritos</li>"
					+ "<li>Hummus</li>"
					+ "<li>Potato Chips</li>"
					+ "<li>Protein Bar</li></ul></html>");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
		    mainFrame.setVisible(true);
		}
	}
	
	
	/*
	 * user clicked bowl from meal
	 */
	private class BowlButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("<html><ul>A man of culture, I see:"
					+ "<li>Chipotle</li>"
					+ "<li>Aspen Market</li>"
					+ "<li>FlatBread Grill</li></ul></html>");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
		    mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user clicked burito/sandwich from meal
	 */
	private class OneHandButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("<html><ul>Driving? Here ya go:"
					+ "<li>America's Cup</li>"
					+ "<li>Makai Poke</li>"
					+ "<li>Panera Bread</li>"
					+ "<li>Pita Pit</li>"
					+ "<li>Prato Bakery</li></ul></html>");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
		    mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user clicked salad from meal, hMMMMMM
	 */
	private class SaladButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("<html><ul>Healthy or dying? HMMMMM:"
					+ "<li>America's Cup</li>"
					+ "<li>Panera Bread</li>"
					+ "<li>Aspen Market</li></ul></html>");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
		    mainFrame.setVisible(true);
		}
	}
	
	/*
	 * user clicked other from meal
	 */
	private class OtherButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			headerLabel.setText("<html><ul>These aren't good altogether:"
					+ "<li>Pizza Republic</li>"
					+ "<li>Vivi's</li>"
					+ "<li>South Street</li>"
					+ "<li>Empanadas</li>"
					+ "<li>McDonalds</li></ul></html>");

			JButton okButton = new JButton("OK");
			okButton.addActionListener(new OKButtonClickListener());
			
			controlPanel.removeAll();
			mainFrame.validate();
			mainFrame.repaint();
			
			controlPanel.add(okButton);
			
		    mainFrame.setVisible(true);
		}
	}
	
	/*
	 * ------------------TERMINATING OK BUTTON---------------------
	 */
	private class OKButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
