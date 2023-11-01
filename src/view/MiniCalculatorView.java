package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jtext1;
	private JTextField jtext2;
	private JTextField jtext3;

	public MiniCalculatorView() throws HeadlessException {
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mini Calculator");
		this.setSize(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		Font font = new Font("Arial", Font.BOLD, 50);
		JLabel jLabel1 = new JLabel("First Value");
		jLabel1.setFont(font);
		JLabel jLabel2 = new JLabel("Second Value");
		jLabel2.setFont(font);
		JLabel jLabel3 = new JLabel("Answer");
		jLabel3.setFont(font);

		jtext1 = new JTextField(50);
		jtext1.setFont(font);
		jtext2 = new JTextField(50);
		jtext2.setFont(font);
		jtext3 = new JTextField(50);
		jtext3.setFont(font);

		JPanel jpanelIO = new JPanel();
		jpanelIO.setLayout(new GridLayout(3, 2, 10, 10));
		jpanelIO.add(jLabel1);
		jpanelIO.add(jtext1);
		jpanelIO.add(jLabel2);
		jpanelIO.add(jtext2);
		jpanelIO.add(jLabel3);
		jpanelIO.add(jtext3);
		
		MiniCalculatorListener listener = new MiniCalculatorListener(this);
		JButton jbAdd = new JButton("+");
		jbAdd.setFont(font);
		jbAdd.addActionListener(listener);
		JButton jbSub = new JButton("-");
		jbSub.setFont(font);
		jbSub.addActionListener(listener);
		JButton jbDiv= new JButton("X");
		jbDiv.setFont(font);
		jbDiv.addActionListener(listener);
		JButton jbMulti =new JButton("/");
		jbMulti.setFont(font);
		jbMulti.addActionListener(listener);
		JButton jbPow=new JButton("^");
		jbPow.setFont(font);
		jbPow.addActionListener(listener);
		JButton jbMob=new JButton("Mob");
		jbMob.setFont(font);
		jbMob.addActionListener(listener);
		
		JPanel jPanelbutton = new JPanel();
		jPanelbutton.setLayout(new GridLayout(2,3));
		jPanelbutton.add(jbAdd);
		jPanelbutton.add(jbSub);
		jPanelbutton.add(jbDiv);
		jPanelbutton.add(jbMulti);
		jPanelbutton.add(jbPow);
		jPanelbutton.add(jbMob);
		
		this.setLayout(new BorderLayout());
		this.add(jpanelIO, BorderLayout.CENTER);
		this.add(jPanelbutton, BorderLayout.SOUTH);
		this.setVisible(true);

	}
	public void plus() {
		double fValue = Double.valueOf(jtext1.getText());
		double sValue = Double.valueOf(jtext2.getText());
		this.miniCalculatorModel.setFirstValue(fValue);
		this.miniCalculatorModel.setSecondValue(sValue);
		this.miniCalculatorModel.sum();
		this.jtext3.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void minus() {
		double fValue = Double.valueOf(jtext1.getText());
		double sValue = Double.valueOf(jtext2.getText());
		this.miniCalculatorModel.setFirstValue(fValue);
		this.miniCalculatorModel.setSecondValue(sValue);
		this.miniCalculatorModel.sub();
		this.jtext3.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void divide() {
		double fValue = Double.valueOf(jtext1.getText());
		double sValue = Double.valueOf(jtext2.getText());
		this.miniCalculatorModel.setFirstValue(fValue);
		this.miniCalculatorModel.setSecondValue(sValue);
		this.miniCalculatorModel.divide();
		this.jtext3.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void multi() {
		double fValue = Double.valueOf(jtext1.getText());
		double sValue = Double.valueOf(jtext2.getText());
		this.miniCalculatorModel.setFirstValue(fValue);
		this.miniCalculatorModel.setSecondValue(sValue);
		this.miniCalculatorModel.multi();
		this.jtext3.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void power() {
		double fValue = Double.valueOf(jtext1.getText());
		double sValue = Double.valueOf(jtext2.getText());
		this.miniCalculatorModel.setFirstValue(fValue);
		this.miniCalculatorModel.setSecondValue(sValue);
		this.miniCalculatorModel.power();
		this.jtext3.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void mod() {
		double fValue = Double.valueOf(jtext1.getText());
		double sValue = Double.valueOf(jtext2.getText());
		this.miniCalculatorModel.setFirstValue(fValue);
		this.miniCalculatorModel.setSecondValue(sValue);
		this.miniCalculatorModel.mod();
		this.jtext3.setText(this.miniCalculatorModel.getAnswer()+"");
	}
}
