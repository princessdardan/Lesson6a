public class PayrollInterface {
    
    public static void main(String[] args){
        KeyboardReader r = new KeyboardReader();
        Employee emp;
        String name;
        int type;
        double rate;
        int hours;
        String prompt;
        emp = new Employee;
        while (true){
            System.out.println("Enter Employee Data");
            name= r.readLine(" Name (or <enter> to quit): ");
            if(!(emp.setName(name)))break;
            
            while(true){
                prompt = " Type (" + emp.getTypeRules() + "): ";
                type = r.readInt(prompt);
                if (emp.setType(type))break;
            }
            while(true){
                prompt = " Hourly rate (" + emp.getRateRules()+"): ";
                rate = r.readDouble(prompt);
                if (emp.setRate(rate))break;
            }
            while(true){
                prompt = " Hours ("+ emp.getHourRules()+ "): ";
                hours = r.readInt(prompt);
                if (emp.setHours(hours))break;
            }
            System.out.println(" The weekly pay for ");
            System.out.println(emp.getName());
            System.out.println(" is $"+ emp.getPay());
            
        }
    }
    
}
