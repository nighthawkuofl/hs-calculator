//*****************
//  Kevin Reilly  *
//    H period    *
//    Calc CCC    *
//*****************


public class CalculatorAlt
{
	private StringBuffer num1;
	private StringBuffer num2;
	private double answer;
	private char operand;
	private boolean firstNum;
	private boolean decimal;
	private int zeros;
	private boolean angleMeasure; //true for radians, false for degrees. Sorry "Gradiens" :P

	public CalculatorAlt()
	{
		num1 = new StringBuffer("0.");
		num2 = new StringBuffer("0.");
		answer = 0.0;
		operand = ' ';
		firstNum = true;
		decimal = true;
		zeros = 0;
		angleMeasure = true;
	}

	public double getAnswer()
	{
		double num1D = Double.parseDouble(num1.toString());
		double num2D = Double.parseDouble(num2.toString());
		if (operand == '+')
		{
			answer = num1D + num2D;
		}
		if (operand == '-')
		{
			answer = num1D - num2D;
		}
		if (operand == '*')
		{
			answer = num1D * num2D;
		}
		if (operand == '/')
		{
			answer = num1D / num2D;
		}
		if (operand == '^')
		{
			answer = Math.pow(num1D, num2D);
		}
		num1 = num1.replace(0, num1.length(), "0.");
		num2 = num2.replace(0, num2.length(), "0.");
		firstNum = true;
		decimal = true;
		zeros = 0;
		return answer;
	}

	public void setOperand(char temp)
	{
		Double n2 = new Double(num2.toString());
		if (answer == 0.0 && n2.doubleValue() != 0.0)
		{
			this.getAnswer();
			System.out.print("one");
		}
		Double n1 = new Double(num1.toString());
		if (n1.doubleValue() == 0.0)
		{
			Double d = new Double(answer);
			StringBuffer sb = new StringBuffer(d.toString());
			num1 = sb;
			System.out.print("two");
		}
		operand = temp;
		firstNum = false;
		decimal = true;
		zeros= 0;
	}

	public void setNum(char temp)
	{
		answer = 0.0;
		if (temp == '.')
		{
			decimal = false;
		}
		else if (firstNum == true)
		{
			if (temp == 's' && num1.indexOf("-") != 0)
			{
				num1 = num1.insert(0, '-');
			}
			else if ((temp == 's' && num1.indexOf("-") == 0))
			{
				num1 = num1.deleteCharAt(0);
			}
			else if (decimal == true)
			{
				if (num1.indexOf("0") == 0)
				{
					num1 = num1.deleteCharAt(0);
				}
				num1 = num1.insert(num1.indexOf("."), temp);
			}
			else
			{
				num1 = num1.append(temp);
			}
		}
		else
		{
			if (temp == 's' && num2.indexOf("-") != 0)
			{
				num2 = num2.insert(0, '-');
			}
			else if ((temp == 's' && num2.indexOf("-") == 0))
			{
				num2 = num2.deleteCharAt(0);
			}
			else if (decimal == true)
			{
				if (num2.indexOf("0") == 0)
				{
					num2 = num2.deleteCharAt(0);
				}
				num2 = num2.insert(num2.indexOf("."), temp);
			}
			else
			{
				num2 = num2.append(temp);
			}
		}
	}

	public String getNum()
	{
		if (firstNum == true)
		{
			return num1.toString();
		}
		else
		{
			return num2.toString();
		}
	}

	public void clear()
	{
		num1 = num1.replace(0, num1.length(), "0.");
		num2 = num2.replace(0, num2.length(), "0.");
		answer = 0.0;
		operand = ' ';
		firstNum = true;
		decimal = true;
	}

	public void bs()
	{
		if (firstNum == true)
		{
			if (num1.toString() == "0.")
			{

			}
			else if (decimal == true)
			{
				num1 = num1.deleteCharAt(num1.indexOf(".") - 1);
			}
			else if (decimal == false)
			{
				num1 = num1.deleteCharAt(num1.length() - 1);
			}
		}
		else
		{
			if (num1.toString() == "0.")
			{

			}
			else if (decimal == true)
			{
				num1 = num1.deleteCharAt(num1.indexOf(".") - 1);
			}
			else if (decimal == false)
			{
				num1 = num1.deleteCharAt(num1.length() - 1);
			}
		}
	}

	public void ce()
	{
		if (firstNum == true)
		{
			num1 = num1.replace(0, num1.length(), "0.");
		}
		else
		{
			num2 = num2.replace(0, num2.length(), "0.");
		}
	}

	public double sqrt()
	{
		Double n1 = new Double(num1.toString());
		if (n1.doubleValue() == 0.0)
		{
			Double d = new Double(answer);
			StringBuffer sb = new StringBuffer(d.toString());
			num1 = sb;
		}
		double num1D = Double.parseDouble(num1.toString());
		answer = Math.sqrt(num1D);
		num1 = num1.replace(0, num1.length(), "0.");
		decimal = true;
		return answer;
	}

	public double ln()
	{
		Double n1 = new Double(num1.toString());
		if (n1.doubleValue() == 0.0)
		{
			Double d = new Double(answer);
			StringBuffer sb = new StringBuffer(d.toString());
			num1 = sb;
		}
		double num1D = Double.parseDouble(num1.toString());
		answer = Math.log(num1D);
		num1 = num1.replace(0, num1.length(), "0.");
		decimal = true;
		return answer;
	}

	public double oneOverX()
	{
		Double n1 = new Double(num1.toString());
		if (n1.doubleValue() == 0.0)
		{
			Double d = new Double(answer);
			StringBuffer sb = new StringBuffer(d.toString());
			num1 = sb;
		}
		double num1D = Double.parseDouble(num1.toString());
		answer = 1.0 / num1D;
		num1 = num1.replace(0, num1.length(), "0.");
		decimal = true;
		return answer;
	}

	public double eToTheX()
	{
		Double n1 = new Double(num1.toString());
		if (n1.doubleValue() == 0.0)
		{
			Double d = new Double(answer);
			StringBuffer sb = new StringBuffer(d.toString());
			num1 = sb;
		}
		double num1D = Double.parseDouble(num1.toString());
		answer = Math.exp(num1D);
		num1 = num1.replace(0, num1.length(), "0.");
		decimal = true;
		return answer;
	}

	public void setAngleMeasure(boolean temp)
	{
		if (temp)
		{
			if (!angleMeasure)
			{
				angleMeasure = true;
			}
		}
		else
		{
			if (angleMeasure)
			{
				angleMeasure = false;
			}
		}
	}

	public double evalTrig(char fun)
	{
		Double n1 = new Double(num1.toString());
		if (n1.doubleValue() == 0.0)
		{
			Double d = new Double(answer);
			StringBuffer sb = new StringBuffer(d.toString());
			num1 = sb;
		}
		double num1D = Double.parseDouble(num1.toString());
		if (!angleMeasure)
		{
			num1D = num1D / 360.0 * 2 * Math.PI;
		}
		if (fun == 's')
		{
			answer = Math.sin(num1D);
		}
		else if (fun == 'c')
		{
			answer = Math.cos(num1D);
		}
		else
		{
			answer = Math.tan(num1D);
		}
		num1 = num1.replace(0, num1.length(), "0.");
		decimal = true;
		return answer;
	}

	public double setConstant(String temp)
	{
		Double n1 = new Double(num1.toString());
		Double num = new Double(0.0);
		if (n1.doubleValue() == 0.0)
		{
			if (temp == "pi")
			{
				num = 3.141592653589793;
			}
			else if (temp == "phi")
			{
				num = (1 + Math.sqrt(5))/2;
			}
			else if (temp == "hbar")
			{
				num = 1.054571726E-34;
			}
			else if (temp == "c")
			{
				num = 299792458.0;
			}
			else if (temp == "G")
			{
				num = 6.67384E-11;
			}
			else if (temp == "avag")
			{
				num = 6.02214179E23;
			}
			else
			{
				num = 0.0;
			}
			firstNum = false;
			num1 = num1.replace(0, num1.length(), num.toString());
			return num.doubleValue();
		}
		else
		{
			if (temp == "pi")
			{
				num = 3.141592653589793;
			}
			else if (temp == "phi")
			{
				num = (1 + Math.sqrt(5))/2;
			}
			else if (temp == "hbar")
			{
				num = 1.054571726E-34;
			}
			else if (temp == "c")
			{
				num = 299792458.0;
			}
			else if (temp == "G")
			{
				num = 6.67384E-11;
			}
			else if (temp == "avag")
			{
				num = 6.02214179E23;
			}
			else
			{
				num = 0.0;
			}
			num2 = num2.replace(0, num1.length(), num.toString());
			return num.doubleValue();
		}
	}
}