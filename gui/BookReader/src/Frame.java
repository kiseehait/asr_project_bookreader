import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	
	// GUI
	// window
	private JFrame window;
	private JPanel panel;
	private final String title = "Book Reader";
	
	
	// file operation panel
	private JPanel fileOpPanel;
	private JLabel fileOpLabel;
	private JTextField fileDirField;
	private JButton openFileButton;
	private JButton closeFileButton;
	
	
	// text display panel
	private JPanel textDisplayPanel;
	private JTextArea textDisplay;
	private JScrollPane textDisplayAreaScrollPane;
	
	
	// status panel
	private JPanel statusPanel;
	private JLabel statusText;
	private JLabel locationText;
	
	
	// variables
	private String fileDir;
	
	
	// constructor
	public Frame() {
		initWindow();
	}
	
	
	// setup
	private void initWindow() {
		window = new JFrame(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		initPanel();
		
		window.add(panel);
		window.pack();
		window.setVisible(true);
		
	}
	
	private void initPanel() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setPreferredSize(new Dimension(800, 800));
		
		initFileOpPanel();
		panel.add(fileOpPanel, BorderLayout.NORTH);
		
		initTextDisplayPanel();
		panel.add(textDisplayPanel, BorderLayout.CENTER);
		
		initStatusPanel();
		panel.add(statusPanel, BorderLayout.SOUTH);
	}
	
	private void initFileOpPanel() {
		fileOpPanel = new JPanel();
		fileOpPanel.setBorder(BorderFactory.createTitledBorder("File"));
		fileOpPanel.setLayout(new FlowLayout());
		
		initFileOpGUI();
		fileOpPanel.add(fileOpLabel);
		fileOpPanel.add(fileDirField);
		fileOpPanel.add(openFileButton);
		fileOpPanel.add(closeFileButton);
	}
	
	private void initFileOpGUI() {
		fileOpLabel = new JLabel(" File directory:");
		
		fileDirField = new JTextField();
		fileDirField.setPreferredSize(new Dimension(500, 20));
		fileDirField.addActionListener(new ActionListener() {
			
			// when user pressed enter
			@Override
			public void actionPerformed(ActionEvent e) {
				fileDir = fileDirField.getText();
				
				// call openFile method
				
				// debug
				System.out.println("Open file at \"" + fileDir + "\".");
			}
		});
		
		// lock file
		fileDirField.setEditable(false);
		fileDirField.setText("./testfile.book");
		
		openFileButton = new JButton("Open");
		openFileButton.addActionListener(new ActionListener() {
			
			// when user pressed open button
			@Override
			public void actionPerformed(ActionEvent e) {
				fileDir = fileDirField.getText();
				
				// call openFile method
				
				// debug
				System.out.println("Open file at \"" + fileDir + "\".");
			}
		});
		
		closeFileButton = new JButton("Close");
		closeFileButton.addActionListener(new ActionListener() {
			
			// when user pressed close button
			@Override
			public void actionPerformed(ActionEvent e) {
				fileDir = fileDirField.getText();
				
				// call closeFile method
				
				// debug
				System.out.println("Close file.");
			}
		});
	}
	
	private void initTextDisplayPanel() {
		textDisplayPanel = new JPanel();
		textDisplayPanel.setLayout(new FlowLayout());
		textDisplayPanel.setBorder(BorderFactory.createTitledBorder("Content"));
		
		initTextDisplayGUI();
		textDisplayPanel.add(textDisplay);
	}
	
	private void initTextDisplayGUI() {
		textDisplay = new JTextArea();
		textDisplay.setEditable(false);
		
		textDisplayAreaScrollPane = new JScrollPane(textDisplay);
		textDisplayAreaScrollPane.setPreferredSize(new Dimension(380, 270));
		textDisplayAreaScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
	        public void adjustmentValueChanged(AdjustmentEvent e) {  
	            e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
	        }
	    });
		
		textDisplay.setMinimumSize(new Dimension(760, 640));
		textDisplay.setPreferredSize(new Dimension(760, 640));
		textDisplay.setMaximumSize(new Dimension(760, 640));
	}
	
	private void initStatusPanel() {
		statusPanel = new JPanel();
		statusPanel.setLayout(new FlowLayout());
		statusPanel.setBorder(BorderFactory.createTitledBorder("Status"));
		
		initStatusGUI();
		statusPanel.add(statusText);
		statusPanel.add(locationText);
	}
	
	private void initStatusGUI() {
		statusText = new JLabel("file is opened");
		
		locationText = new JLabel("| chapter 0, page 0");
	}
	
	
	// setters
	public void changeContent(String text) {
		textDisplay.setText(text);
	}
	
	public void setReading() {
		statusText.setText("reading");
	}
	
	public void setNotReading() {
		statusText.setText("not reading");
	}
	
	public void setRepeating() {
		statusText.setText("repeating");
	}
	
	public void updateLocation(int chapter, int page) {
		locationText.setText("| chapter " + chapter + ", page " + page);
	}

}
