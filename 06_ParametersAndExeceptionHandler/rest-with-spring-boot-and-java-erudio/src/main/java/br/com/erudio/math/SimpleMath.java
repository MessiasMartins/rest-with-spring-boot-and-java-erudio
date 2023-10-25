package br.com.erudio.math;

public class SimpleMath {
	
	public double sum ( Double numberOne, Double numberTwo){		
		return numberOne + numberTwo;
	}

	public double subtraction (Double numberOne, Double numberTwo){
		return numberOne - numberTwo;
	}

	public double multiplication (Double numberOne, Double numberTwo){

		return numberOne * numberTwo;
	}

	public double division(Double numberOne, Double numberTwo){	
		return numberOne / numberTwo;
	}

	public double average (Double numberOne, Double numberTwo){

		return (numberOne) * (numberTwo) /2;
	}

	public double squareRoot (Double number){

		return Math.sqrt(number);
	}
}
