package edu.caldas.ingenieria.poo.employeesDemo;

public class BaseComissionEmployee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber; 
	private double grossSales; // ganacias semanalas brutas 
	private double commissionRate; //porcentaje de comision
	
	//cinco argumentos constructores
	public BaseComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public BaseComissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
