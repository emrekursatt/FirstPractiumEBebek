public class Employee {

    String fullName;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String fullName, double salary, double workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return this.salary;
        } else {
            double tax = (this.salary * 0.03);
            return tax;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            double bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public double raiseSalary() {

        int yearCalculation = 2021 - this.hireYear;

        if (yearCalculation < 10) {

            double raiseSalary = this.salary * 0.05;
            return raiseSalary;
        }else if (yearCalculation > 10 && yearCalculation < 20) {

            double raiseSalary = this.salary * 0.10;
            return raiseSalary;
        }else if (yearCalculation > 19){

            double raiseSalary = this.salary * 0.15;
            return raiseSalary;
        } else {
            return 0;
        }




    }

    @Override
    public String toString() {

        double taxAndBonus=this.salary + bonus() - tax();
        double totalSalary=raiseSalary()+taxAndBonus;
        System.out.println("Çalışanın Adı ve Soyadı: " + this.fullName);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("İşe Başlama Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaş: " + taxAndBonus);
        System.out.println("Toplam Maaş: " + totalSalary);

        return null;


    }
}
