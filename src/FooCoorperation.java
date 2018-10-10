import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//public class double wage(double hours){};
public class FooCoorperation {
	String name;
	double hours;
	double base_pay;
	double wage;
	

	/*public void wage_calc(String name, double base_pay, double hours){
		double wage=0;
		
		if(hours<=40)
			wage = hours*base_pay;
		else if(hours>40 && hours<=60)
		{
			double extra_hours = hours-40;
			wage=extra_hours*1.5*base_pay + 40*base_pay;
		}
		else if(hours>60) { 
		wage=0.0;
		System.out.println(name + "has exceeded the hours of work");
		}
		if(wage>0.0)
			System.out.println("The wage of "+ name + "with base pay"+ base_pay+ "is : " + wage);
	}*/
	public static void main(String[] args) throws Exception {
		File file = new File("employee.txt");
		Scanner br = new Scanner(file);
		List<Emp> list = new ArrayList<Emp>();
		String EBrH = null;
		Object String;
		while(br.hasNextLine())
		{EBrH = br.nextLine();
		String[] worker = EBrH.split(",");
		Employee employee = new Employee();
		employee.name = worker[0];
		employee.base_pay = Double.parseDouble(worker[1]);
		employee.hours = Double.parseDouble(worker[2]);
		double salary = employee.wage_calc(employee.name, employee.base_pay, employee.hours);		
		String value = employee.print_it_out(salary);
		//System.out.println(""+salary+value);
		/*ArrayList<Emp> ar = new ArrayList<Emp>();
		ar.add(new Emp(salary, value));
		for(Emp emp: ar) {
		System.out.println(emp.getsalary());}
		Emp empl = new Emp(salary, value);
		Collections.sort(null);*/
//		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(salary, value));
		}
		/*for(Emp emp: list) {
		System.out.println(""+emp.getsalary()+" "+emp.getvalue());	
		}*/
		Collections.sort(list, new sortbyvalue());
		for(Emp emp: list) {
			System.out.println(" "+emp.getvalue());	
			}

	}
	
	/*private static void SeparateByComma(String eBrH) {
			Employee employee = new Employee();
			String[] worker = eBrH.split(",");
			employee.name = worker[0];
			employee.base_pay = Double.parseDouble(worker[1]);
			employee.hours = Double.parseDouble(worker[2]);
			employee.wage_calc(employee.name, employee.base_pay, employee.hours);
		

		
	}*/
	

}

class sortbyvalue implements Comparator<Emp> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Emp a, Emp b) 
    { 
        return (int) (a.getsalary() - b.getsalary()); 
    } 
} 