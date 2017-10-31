package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.domain.CalculatorForm;

public class CalculatorValidator {
	List<String> errors = new ArrayList<String>();
	public List<String> validate(CalculatorForm calculatorForm){
		try {
			Double.parseDouble(calculatorForm.getNum1());
		}catch(NumberFormatException nfe) {
			errors.add("please enter the correct format int the text box");
		}
		
		try {
			Double.parseDouble(calculatorForm.getNum1());
		}catch(NumberFormatException nfe) {
			errors.add("please enter the correct format int the text box");
		}
		return errors;
	}
}
