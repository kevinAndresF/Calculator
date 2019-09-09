import java.util.Scanner;

public class Calculator {
	double result= 0;
	double pI= Math.PI;
	double array[] = new double[10];
	
	public static void main(String [] args){
		Scanner readaer = new Scanner(System.in);
		double num1, num2;
		int electionMode, electionContinue, electionOperation, electionModeR;
		electionModeR=0;
		electionContinue=0;
		while(electionModeR==0){
			System.out.println("please select the mode in which the calculator will be");
		    System.out.println("1. modo operacion por operacion");
		    System.out.println("2. sequence of operations mode, the sequence will be addition, subtraction, multiplication, division and finally the module, although you can decide if you will continue doing the operations");
		    electionMode = readaer.nextInt();
			while(electionMode==1){
				System.out.println("1.sum");
				System.out.println("2.subtraction");
				System.out.println("3.multiplication");
				System.out.println("4.division");
				System.out.println("5.module");
				System.out.println("6.square root");
				System.out.println("7.empowerment");
				System.out.println("8.the factorial");
				System.out.println("9.binary to decimal conversion");
				System.out.println("10.decimal to hexadecimal conversion");
				System.out.println("11.hexadecimal to decimal conversion");
				System.out.println("12.decimal to binary conversion");
				System.out.println("13.hexadecimal to binary conversion");
				System.out.println("14.binary to hexadecimal conversion");
				System.out.println("15.scientific notation");
				System.out.println("16.radians to degrees conversion");
				System.out.println("17.degrees to radians conversion");
				System.out.println("18.sine function");
				System.out.println("19.cosine function");
				System.out.println("20.tangent function");
				System.out.println("21.base 10 logarithm");
				System.out.println("22.base logarithm n");
				System.out.println("23.nth root");
				electionOperation=readaer.nextInt();
				switch (electionOperation){
				case 1:
				{
				num1=readaer.nextDouble();
				System.out.println("+");
				num2=readaer.nextDouble();
				System.out.println("||");
				System.out.println(sum(num1, num2));
				break;
				}
				case 2:
				{
				num1=readaer.nextDouble();
				System.out.println("-");
				num2=readaer.nextDouble();
				System.out.println("||");
				System.out.println(subtra(num1, num2));
				break;
				}
				case 3:
				{
				num1=readaer.nextDouble();
				System.out.println("*");
				num2=readaer.nextDouble();
				System.out.println("||");
				System.out.println(multiplication(num1, num2));
				break;
				}
				case 4:
				{
				num1=readaer.nextDouble();
				System.out.println("/");
				num2=readaer.nextDouble();
				System.out.println("||");
				System.out.println(division(num1, num2));
				break;
				}
				case 5:
				{
				num1=readaer.nextDouble();
				System.out.println("%");
				num2=readaer.nextDouble();
				System.out.println("||");
				System.out.println(module(num1, num2));
				break;
				}
				case 6:
				{
				System.out.println("√");
				num1=readaer.nextDouble();
				System.out.println("||");
				System.out.println(squareRoot(num1));
				break;
				}
				case 7:
				{
				System.out.println("enter the base");
				num1=readaer.nextDouble();
				System.out.println("enter the exponent");
				num2=readaer.nextDouble();
				System.out.println("||");
				System.out.println(empowerment(num1, num2));
				break;
				}
				case 8:
				{
				num1=readaer.nextDouble();
				System.out.println("!");
				System.out.println("||");
				System.out.println(factorial(num1));
				break;
				}
				case 9:
				{
				System.out.println("enter the binary number");
				num1=readaer.nextDouble();
				System.out.println("Enter the number of digits you have is binary, for example 1001 has 4 digits");
				num2=readaer.nextDouble();
				System.out.println(num1);
				System.out.println("||");
				System.out.println(conversionBToD(num1, num2));
				break;
				}
				case 10:
				{
				int num3;
				num1=readaer.nextInt();
				System.out.println("||");
				System.out.println(conversionDToH(num3));
				break;
				}
				case 11:
				{
				String numHC;
				System.out.println("enter the hexadecimal number, but each digit separated by - so that the program can work, example: 2-7-E, only letters of the alphabet from A to F will be recognized in uppercase");
				numHC=readaer.nextLine();
				System.out.println("Enter the number of digits you have is hexdecimal, for example 2-7-E has 3 digits");
				num2=readaer.nextDouble();
				System.out.println(numHC);
				System.out.println("||");
				System.out.println(conversionHToD(numHC, num2));
				break;
				}
				case 12:
				{
				System.out.println(num1);
				System.out.println("||");
				System.out.println(conversionDToB(num1));
				break;
				}
				case 13:
				{
				String numHC;
				System.out.println("enter the hexadecimal number, but each digit separated by - so that the program can work, example: 2-7-E, only letters of the alphabet from A to F will be recognized in uppercase");
				numHC=readaer.nextLine();
				System.out.println("Enter the number of digits you have is hexdecimal, for example 2-7-E has 3 digits");
				num2=readaer.nextDouble();
				System.out.println(numHC);
				System.out.println("||");
				System.out.println(conversionHToB(numHC, num2));
				break;
				}
				case 14:
				{
				System.out.println("enter the binary number");
				num1=readaer.nextDouble();
				System.out.println("Enter the number of digits you have is binary, for example 1001 has 4 digits");
				num2=readaer.nextDouble();
				System.out.println(num1);
				System.out.println("||");
				System.out.println(conversionBToH(num1, num2));
				break;
				}
				case 15:
				{
				System.out.println("enter the coeffcient");
				num1=readaer.nextDouble();
				System.out.println("enter the exponent");
				num2=readaer.nextDouble();
				System.out.println(num1+"*10^("+num2+")");
				System.out.println("||");
				System.out.println(scientificNotation(num1, num2));
				break;
				}
				case 16:
				{
				System.out.println("enter the numerator");
				num1=readaer.nextDouble();
				System.out.println("enter the denominator");
				num2=readaer.nextDouble();
				System.out.println(num1+"*Pi/"+num2+"in degrees is");
				System.out.println("||");
				System.out.println(conversionRToG(num1, num2));
				break;
				}
				case 17:
				{
				System.out.println("enter the degrees example: 0...360");
				num1=readaer.nextDouble();
				System.out.println("||");
				System.out.println(conversionGToR(num1));
				break;
				}
				case 18:				
				{
				num1=readaer.nextDouble();
				System.out.println("Sin("+num1+")");
				System.out.println("||");
				System.out.println(sinus(num1));
				break;
				}
				case 19:
				{
				num1=readaer.nextDouble();
				System.out.println("Cos("+num1+")");
				System.out.println("||");
				System.out.println(cosine(num1));
				break;
				}
				case 20:
				{
				num1=readaer.nextDouble();
				System.out.println("tan("+num1+")");
				System.out.println("||");
				System.out.println(tangent(num1));
				break;
				}
				case 21:
				{
				num1=readaer.nextDouble();
				System.out.println("log10("+num1+")");
				System.out.println("||");
				System.out.println(logarithmTen(num1));
				break;
				}
				case 22:
				{
				System.out.println("enter number");
				num1=readaer.nextDouble();
				System.out.println("||");
				System.out.println(logarithm(num1));
				break;
				}
				case 23:
				{
				System.out.println("enter number");
				num1=readaer.nextDouble();
				System.out.println("enter root index");
				num2=readaer.nextDouble();
				System.out.println(num2+"√"+num1);
				System.out.println("||");
				System.out.println(root(num2, num1));
				break;
				}
				}
			}
				System.out.println("to exit this way type 0, or any number other than 1 and 2");
				electionMode= readaer.nextInt();
			}
			while(electionMode==2){
				
				if (electionContinue==0){
					num1=readaer.nextDouble();
				    System.out.println("+");
				    num2=readaer.nextDouble();
				    System.out.println("||");
				    System.out.println(sum(num1, num2));
				    num1=sum(num1, num2);
				    System.out.println("if you want to continue doing the next operation that is the subtraction enter 0, otherwise enter another any number");
				    electionContinue=readaer.nextInt();
				}
				else if(electionContinue==0){
					System.out.println(num1);
				    System.out.println("-");
				    num2=readaer.nextDouble();
				    System.out.println("||");
				    System.out.println(subtra(num1, num2));
					num1=subtra(num1, num2);
					System.out.println("if you want to continue doing the next operation that is the multiplication enter 0, otherwise enter another any number");
					electionContinue=readaer.nextInt();
				}
				else if(electionContinue==0){
					System.out.println(num1);
				    System.out.println("*");
				    num2=readaer.nextDouble();
				    System.out.println("||");
				    System.out.println(multiplication(num1, num2));
					num1=multiplication(num1, num2);
					System.out.println("if you want to continue doing the next operation that is the division enter 0, otherwise enter another any number");
					electionContinue=readaer.nextInt();
				}
				else if(electionContinue==0){
					System.out.println(num1);
				    System.out.println("/");
				    num2=readaer.nextDouble();
				    System.out.println("||");
				    System.out.println(division(num1, num2));
					num1=division(num1, num2);
					System.out.println("if you want to continue doing the next operation that is the module enter 0, otherwise enter another any number");
					electionContinue=readaer.nextInt();
				}
				else if(electionContinue==0){
					System.out.println(num1);
				    System.out.println("%");
				    num2=readaer.nextDouble();
				    System.out.println("||");
				    System.out.println(module(num1, num2));
				}
				
				System.out.println("to exit this way type 0, or any number other than 1 and 2");
				electionMode= readaer.nextInt();
			}
			
			
			System.out.println("to exit the calculator write any number other than 0, but if you want to choose the mode again enter 0");
		    electionMode = readaer.nextInt();
			System.out.println("If the calculator has a fault or you do not understand something, contact the creator by whatsapp +57 3173815902");
		}
	public static double sum(double num1, double num2){
		double result;
		result = num1 + num2;
		return result;
	}
	public static double subtra(double num1, double num2){
		double result;
		result = num1 - num2;
		return result;
	}
	public static double multiplication(double num1, double num2){
		double result;
		result= num1*num2;
		return result;
	}
	public static double division(double num1, double num2){
		double result;
		result = num1 / num2;
		return result;
	}
	public static double module(double num1, double num2){
		double result;
		result = num1 % num2;
		return result;
	}
	public static double squareRoot(double num1){
		double result;
		double hel=0;
		hel=num1/20;
		for(int cont=0;cont==10;cont++){
			result=(hel/2)+(num1/2*(hel));
			hel=result;
		}
		return result;
	}
	public static double empowerment(double num1, double num2){
		double result=1;
		if (num2==0){
			result=1;
		}
		else if(num2>0){
			for (int cont=0;cont<num2;cont++){
			result=(num1*result);
			}
		}
		else if(num2<0){
			num2=num2*(-1);
			num1=(1/num1);
			for (int cont=0;cont<num2;cont++){
			result=(num1*result);
			}
		}
		
		return result;
	}
	public static double factorial(double num1){
		double result =1;
		if(num1>0){
			while (num1!= 0){
			    result = result*num1;
			    num1--;
		    }
		}
		else if (num1==0){
			result=1;
		}
		return result;
	}
	public static double base10Exponential(int num1){
		double result;
		result= Math.pow(10, num1);	
		return result;
	}
	public static double conversionRToG(double num1, double num2){
		double pI= Math.PI;
		double result;
		num1=(pI*num1)/num2;
		result = Math.toDegrees(num1);
		return result;
	}
	public static double conversionGToR(double num1){
		double result;
		result = Math.toRadians(num1);
		return result;
	}
	public static double sinus(double num1){
		double result;
		result= Math.sin(num1);
		return result;
	}
	public static double cosine(double num1){
		double result;
		result = Math.cos(num1);			
		return result;
	}
	public static double tangent(double num1){
		double result;
		result = Math.tan(num1);
		return result;
	}
	public static double logarithm(double num1){
		double result;
		result = Math.log(num1);
		return result;
	}
	public static double logarithmTen(double num1){
		double result;
		result = Math.log10(num1);
		return result;
	}
	public static double root(double num1, double num2){
		double result;
		result = Math.pow(num2, 1/num1);
		return result;
	}
	public static String decToHex(int decimal){
			String hexadecimal= "";
			if (decimal < 0){
				hexadecimal="0";
			}
			else if (decimal >=0 && decimal <=9){
				hexadecimal=""+decimal;
			}
			else if (decimal>=10 && decimal<=15){
				switch (decimal){
					case 10:
					hexadecimal="A";
					break;
					case 11:
					hexadecimal="B";
					break;
					case 12:
					hexadecimal="C";
					break;
					case 13:
					hexadecimal="D";
					break;
					case 14:
					hexadecimal="E";
					break;
					case 15:
					hexadecimal="F";
					break;
				}
			}
			return hexadecimal;
	}
	public static String conversionDToH(int decimal){
			String hexadecimal = "";
			int division, residue;
			if (decimal < 16 ) {
				hexadecimal = decToHex(decimal);
			}
			else {
				do {
					division = decimal/16;
					residue  = decimal%16;
					hexadecimal = decToHex(residue) + hexadecimal;
					decimal = division;
				}while (decimal >=16);
			}
			hexadecimal = decToHex(decimal)+hexadecimal;
		return hexadecimal;
	}
    public static double conversionBToD(double num1, double num2){
		double result;
		int exp=0;
		double checker;
		for(int cont=0;cont<num2;cont++){
			checker=num1%10;
			num1=num1/10;
			if(checker==1){
				result=result+(empowerment(2, exp));
			}
			else if(checker==0){
				result=0;
			}
			exp++;
		}
		return result;
	}
	public static String conversionBToH(double num1, double num2){
		String hexadecimal;
		int decimal = Integer.parseInt(conversionBToD(num1, num2));
		hexadecimal = conversionDToH(decimal);
		return hexadecimal;
	}
	public static String conversionDToB(double num1){
		double module;
		String numB= "";
		if(num1==0){
			numB=""+0;
		}
		else if(num1>0){
			while(num1>0){
			    module= num1%2;
			    numB=module+numB;
			    num1=num1/2;
		    }
		}
		return numB;
	}
	public static double conversionHToD(String hex, double num1){
		double result;
		String numH="";
		double numD;
		num1--;
		int numDhdk = Integer.parseInt(num1);
		while (num1>=0){
			numH= hex.split("-")[numDhdk];
			numD=hexToDec(numH);
			result=result+(multiplication(numD, empowerment(16, numDhdk)));
			num1--;
		}
		return result;
	}
	public static double hexToDec(String numH){
	double numD;
	int numP = Integer.parseInt(numH);
		if (numP >= 0 && numP <= 9){
				int numDh = Integer.parseInt(numH);
				numD=numDh;
		}
		else if (10<11){
			switch (numH){
				case "A":
				numD=10;
				break;
				case "B":
				numD=11;
				break;
				case "C":
				numD=12;
				break;
				case "D":
				numD=13;
				break;
				case "E":
				numD=14;
				break;
				case "F":
				numD=15;
				break;
			}
		}
		return numD;
	}
	public static double conversionHToB(String hex, double num1){
		String numB;
		double numD;
		int numDh = Integer.parseInt(conversionHToD(hex, num1));
		numD=numDh;
		int numDhd = Integer.parseInt(conversionDToB(numD));
		numB=numDhd;
		return numB;
	}
	public static double scientificNotation(double num1, double num2){
		double result;
		result=(multiplication(num1, empowerment(10, num2)));
		return result;
	}
}