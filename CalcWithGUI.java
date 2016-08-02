//*****************
//  Kevin Reilly  *
//    H period    *
//  Calc Runner   *
//*****************


import javax.swing.*;

public class CalcWithGUI
{
	public static void main(String[]args)
	{
		GUIWindow theGUI = new GUIWindow();
		theGUI.setTitle("CalculatorAlt");
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGUI.pack();
		theGUI.setVisible(true);
	}
}