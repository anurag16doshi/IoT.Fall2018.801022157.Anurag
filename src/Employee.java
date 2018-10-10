import java.util.ArrayList;
import java.util.Comparator;

public class Employee {
 String name;
 double base_pay;
 double hours;
 double wage=0;
 private static Employee Least = null;
 Employee Next;
 
double wage_calc(String name, double base_pay, double hours){
		
		if (base_pay>=8) {
		if(hours<=40)
			wage = hours*base_pay;
		else if(hours>40 && hours<=60)
		{
			double extra_hours = hours-40;
			wage=extra_hours*1.5*base_pay + 40*base_pay;
		}
		else {wage=0.0;}
		
		
 
}
		return wage;
}


public String print_it_out(double salary) {
	String sentence;
	if(base_pay >= 8.0 && salary>0.0)
	sentence = "The wage of "+ name + " with base pay "+ base_pay+ " is :" + salary;	


else if(base_pay<8.0) sentence = "Pay rate is less than 8$";
	
else sentence = "worked more than 60 hours";
	return sentence;

}
/*public class Sortbysalary implements Comparator{

	public int compare(Employee A, Employee B) {
		// TODO Auto-generated method stub
		return (int) (A.wage - B.wage);
	}
}*/


}
 

