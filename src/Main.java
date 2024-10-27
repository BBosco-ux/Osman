//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoftwareEngineer John = new SoftwareEngineer(500,"10:00", "7:00", "He is a programmer");
TaxiDriver Samuel = new TaxiDriver(1000,"5:00", "12:00", "Taxi driver");
John.salary();
Samuel.printJobDescription();
    }
}