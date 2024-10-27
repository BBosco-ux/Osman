public abstract class OfficeJob implements Job {
    //Create variables
   int salary;
   String startShift;
   String endShift;
   String printJobDescription;
    public OfficeJob(int salary,String startShift,String endShift,String printJobDescription){   //constructor

        this.salary = salary;
        this.startShift = startShift;
        this.endShift = endShift;
        this.printJobDescription = printJobDescription;
    }
    //Overriding
    public void salary(){
        System.out.println("salary is = "+salary );
    }
    public void startShift(){
        System.out.println("startShift is = "+ startShift);
    }
    public void endShift(){
        System.out.println("endShift is = "+ endShift);
    }
    public void printJobDescription(){
        System.out.println("printJobDescription = "+ printJobDescription);
    }
    public void printWorkers() {
    }
    public void hirePerson(){

    }
    public void firePerson(){

    }

}
