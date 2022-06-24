package employewagecomputation;

public class empWageComputation {
    
    public static final int maxHoursInMonth = 100;
    public static final int numberOfDays = 20;
    public static final int wagePerHour = 20;
    public static final int isFullTime = 0;
    public static final int isPartTime = 1;
    
    public static void main(String args[]) {
      System.out.println("Welcome to the Employee Wage Computation");
      
      int isPresent = 1, totalWorkingDays = 0, totalWorkingHours = 0, totalEmployeeWage = 0, workingHours = 0;
      
        while(totalWorkingHours < maxHoursInMonth && totalWorkingDays <= numberOfDays){
          
            int value = (int) Math.floor(Math.random()*10) % 2;
            
            if(value == isPresent){
                totalWorkingDays++;
                
                int empcheck = (int) Math.floor(Math.random()*10) % 2;
                
                switch (empcheck){

                    case isFullTime:
                        workingHours = 8;
                        System.out.println("isFullTime: ");
                        break;
                      
                    case isPartTime:
                        workingHours = 4;
                        System.out.println("isPartTime: ");
                        break;
                    
                }
                totalWorkingHours += workingHours;
                System.out.println("Working Hours: " + totalWorkingHours);
                int employeeWage = totalWorkingHours * wagePerHour;
                totalEmployeeWage += employeeWage;
                System.out.println("Employee Wage: " + employeeWage);
            }
            else{
               System.out.println("Employee is Absent: ");
            }
        System.out.println("Total Employee Wage: " + totalEmployeeWage);
        }
    }
      
}