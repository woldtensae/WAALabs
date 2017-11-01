package mum.edu.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mum.edu.domain.Calculator;
import mum.edu.form.CalculatorForm;
import mum.edu.validator.CalculatorValidator;

public class ResultController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		
		
		CalculatorForm calculatorForm = new CalculatorForm();
       
		calculatorForm.setNum1((request.getParameter("num1")));
		calculatorForm.setNum2((request.getParameter("num2")));
		calculatorForm.setNum3((request.getParameter("num3")));
		calculatorForm.setNum4((request.getParameter("num4")));
        
        CalculatorValidator calculatorValidator = new CalculatorValidator();
        List<String> errors = calculatorValidator.validate(calculatorForm);
        if (errors.isEmpty()) {
            
            Calculator calculator = new Calculator();
            calculator.setNum1(calculatorForm.getNum1());
            calculator.setNum2(calculatorForm.getNum2());
            calculator.setNum3(calculatorForm.getNum3());
            calculator.setNum4(calculatorForm.getNum4());
            String result1 = "" + (Double.parseDouble(calculatorForm.getNum1()) +  
            		Double.parseDouble(calculatorForm.getNum2()));
            String result2 = "" + (Double.parseDouble(calculatorForm.getNum3()) *  
            		Double.parseDouble(calculatorForm.getNum4()));
          
            
            calculator.setResult1(result1);
            calculator.setResult2(result2);
            // no validation error, execute action method
            // insert code to save product to the database

            // store product in a scope variable for the view
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/result.jsp";
        } else {
            // store errors and form in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", calculatorForm);
            return "/WEB-INF/calculatorForm.jsp";
        }
		
		
		
		
	}

}
