//*****************
//  Kevin Reilly  *
//    H period    *
//    Calc GUI    *
//*****************


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIWindow extends JFrame
{
	private CalculatorAlt calc = new CalculatorAlt();

	private JTextField numberField = new JTextField("0.");
	private JTextField angleField = new JTextField("Radians");
	private JButton oneButton = new JButton("1");
	private JButton twoButton = new JButton("2");
	private JButton threeButton = new JButton("3");
	private JButton fourButton = new JButton("4");
	private JButton fiveButton = new JButton("5");
	private JButton sixButton = new JButton("6");
	private JButton sevenButton = new JButton("7");
	private JButton eightButton = new JButton("8");
	private JButton nineButton = new JButton("9");
	private JButton zeroButton = new JButton("0");
	private JButton signButton = new JButton("+/-");
	private JButton decimalButton = new JButton(".");
	private JButton addButton = new JButton("+");
	private JButton subButton = new JButton("-");
	private JButton multiButton = new JButton("*");
	private JButton divideButton = new JButton("/");
	private JButton evalButton = new JButton("=");
	private JButton clearButton = new JButton("C");
	private JButton bsButton = new JButton("BS");
	private JButton ceButton = new JButton("CE");
	private JButton sqrtButton = new JButton(this.getSqrtSymbol());
	private JButton powButton = new JButton("^");
	private JButton lnButton = new JButton("ln(x)");
	private JButton ooxButton = new JButton("1/x");
	private JButton epowxButton = new JButton("e^x");
	private JButton degreesButton = new JButton("Deg");
	private JButton radiansButton = new JButton("Rad");
	private JButton sinButton = new JButton("sin");
	private JButton cosButton = new JButton("cos");
	private JButton tanButton = new JButton("tan");
	private JButton avagButton = new JButton("<html>N<sub>A</sub></html>");
	private JButton piButton = new JButton(this.getPiSymbol());
	private JButton hbarButton = new JButton(this.getHBarSymbol());
	private JButton cButton = new JButton("c");
	private JButton GButton = new JButton("G");
	private JButton phiButton = new JButton(this.getPhiSymbol());

	public GUIWindow()
	{
		JPanel dataPanel = new JPanel(new GridLayout(1, 2, 12, 6));
		dataPanel.add(numberField);
		dataPanel.add(angleField);
		JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 6, 6));
		buttonPanel.add(piButton);
		buttonPanel.add(phiButton);
		buttonPanel.add(hbarButton);
		buttonPanel.add(cButton);
		buttonPanel.add(GButton);
		buttonPanel.add(avagButton);
		buttonPanel.add(ceButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(bsButton);
		buttonPanel.add(degreesButton);
		buttonPanel.add(sqrtButton);
		buttonPanel.add(powButton);
		buttonPanel.add(oneButton);
		buttonPanel.add(twoButton);
		buttonPanel.add(threeButton);
		buttonPanel.add(radiansButton);
		buttonPanel.add(addButton);
		buttonPanel.add(epowxButton);
		buttonPanel.add(fourButton);
		buttonPanel.add(fiveButton);
		buttonPanel.add(sixButton);
		buttonPanel.add(sinButton);
		buttonPanel.add(subButton);
		buttonPanel.add(lnButton);
		buttonPanel.add(sevenButton);
		buttonPanel.add(eightButton);
		buttonPanel.add(nineButton);
		buttonPanel.add(cosButton);
		buttonPanel.add(multiButton);
		buttonPanel.add(ooxButton);
		buttonPanel.add(decimalButton);
		buttonPanel.add(zeroButton);
		buttonPanel.add(signButton);
		buttonPanel.add(tanButton);
		buttonPanel.add(divideButton);
		buttonPanel.add(evalButton);
		Container container = getContentPane();
		container.add(dataPanel, BorderLayout.NORTH);
		container.add(buttonPanel, BorderLayout.CENTER);
		oneButton.addActionListener(new oneListener());
		twoButton.addActionListener(new twoListener());
		threeButton.addActionListener(new threeListener());
		fourButton.addActionListener(new fourListener());
		fiveButton.addActionListener(new fiveListener());
		sixButton.addActionListener(new sixListener());
		sevenButton.addActionListener(new sevenListener());
		eightButton.addActionListener(new eightListener());
		nineButton.addActionListener(new nineListener());
		zeroButton.addActionListener(new zeroListener());
		signButton.addActionListener(new signListener());
		decimalButton.addActionListener(new decimalListener());
		addButton.addActionListener(new addListener());
		subButton.addActionListener(new subListener());
		multiButton.addActionListener(new multiListener());
		divideButton.addActionListener(new divideListener());
		evalButton.addActionListener(new evalListener());
		clearButton.addActionListener(new clearListener());
		bsButton.addActionListener(new bsListener());
		ceButton.addActionListener(new ceListener());
		sqrtButton.addActionListener(new sqrtListener());
		powButton.addActionListener(new powListener());
		lnButton.addActionListener(new lnListener());
		ooxButton.addActionListener(new ooxListener());
		epowxButton.addActionListener(new epowxListener());
		degreesButton.addActionListener(new degreesListener());
		radiansButton.addActionListener(new radiansListener());
		sinButton.addActionListener(new sinListener());
		cosButton.addActionListener(new cosListener());
		tanButton.addActionListener(new tanListener());
		piButton.addActionListener(new piListener());
		phiButton.addActionListener(new phiListener());
		hbarButton.addActionListener(new hbarListener());
		cButton.addActionListener(new cListener());
		GButton.addActionListener(new GListener());
		avagButton.addActionListener(new avagListener());

	}

	public String getSqrtSymbol()
	{
		char c = 0x221A;
		return String.valueOf(c);
	}

	public String getPiSymbol()
	{
		char c = 0x03C0;
		return String.valueOf(c);
	}

	public String getPhiSymbol()
	{
		char c = 0x03C6;
		return String.valueOf(c);
	}

	public String getHBarSymbol()
	{
		char c = 0x0127;
		return String.valueOf(c);
	}

	private class oneListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('1');
			numberField.setText("" + calc.getNum());
			System.out.println(e.getActionCommand());
		}
	}

	private class twoListener implements ActionListener
	{
			public void actionPerformed(ActionEvent e)
		{
			calc.setNum('2');
			numberField.setText("" + calc.getNum());
		}
	}
	private class threeListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('3');
			numberField.setText("" + calc.getNum());
		}
	}

	private class fourListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('4');
			numberField.setText("" + calc.getNum());
		}
	}

	private class fiveListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('5');
			numberField.setText("" + calc.getNum());
		}
	}

	private class sixListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('6');
			numberField.setText("" + calc.getNum());
		}
	}

	private class sevenListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('7');
			numberField.setText("" + calc.getNum());
		}
	}

	private class eightListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('8');
			numberField.setText("" + calc.getNum());
		}
	}

	private class nineListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('9');
			numberField.setText("" + calc.getNum());
		}
	}

	private class zeroListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('0');
			numberField.setText("" + calc.getNum());
		}
	}

	private class signListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('s');
			numberField.setText("" + calc.getNum());
		}
	}

	private class decimalListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setNum('.');
			numberField.setText("" + calc.getNum());
		}
	}

	private class addListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setOperand('+');
		}
	}

	private class subListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setOperand('-');
		}
	}

	private class multiListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setOperand('*');
		}
	}

	private class divideListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setOperand('/');
		}
	}

	private class evalListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.getAnswer());
		}
	}

	private class clearListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.clear();
			numberField.setText("" + "0.");
		}
	}

	private class bsListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.bs();
			numberField.setText("" + calc.getNum());
		}
	}

	private class ceListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.ce();
			numberField.setText("" + calc.getNum());
		}
	}

	private class epowxListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.eToTheX());
		}
	}

	private class sqrtListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.sqrt());
		}
	}

	private class powListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setOperand('^');
		}
	}

	private class lnListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.ln());
		}
	}

	private class ooxListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.oneOverX());
		}
	}

	private class degreesListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setAngleMeasure(false);
			angleField.setText("Degrees");
		}
	}

	private class radiansListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			calc.setAngleMeasure(true);
			angleField.setText("Radians");
		}
	}

	private class sinListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.evalTrig('s'));
		}
	}

	private class cosListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.evalTrig('c'));
		}
	}

	private class tanListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.evalTrig('t'));
		}
	}

	private class piListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.setConstant("pi"));
		}
	}

	private class phiListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.setConstant("phi"));
		}
	}

	private class hbarListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.setConstant("hbar"));
		}
	}

	private class cListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.setConstant("c"));
		}
	}

	private class GListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.setConstant("G"));
		}
	}

	private class avagListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			numberField.setText("" + calc.setConstant("avag"));
		}
	}
}