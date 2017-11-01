package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.form.CalculatorForm;

public class CalculatorValidator {
	List<String> errors = new ArrayList<String>();
	public List<String> validate(CalculatorForm calculatorForm){
		try {
			Double.parseDouble(calculatorForm.getNum1().trim());
			Double.parseDouble(calculatorForm.getNum2().trim());
			Double.parseDouble(calculatorForm.getNum3().trim());
			Double.parseDouble(calculatorForm.getNum4().trim());
		}catch(NumberFormatException nfe) {
			errors.add("please enter the correct format int the text box");
		}
		return errors;
	}
}
