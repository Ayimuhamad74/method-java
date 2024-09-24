public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englsihGrade;
    private double scienceGrade;
    private double average;

    public static void main(String[] args) {

        StudentRecord student = new StudentRecord();

        student.setName("Kairi");
        student.setAddress("Philippines");
        student.setAge(20);
        student.setMathGrade(100);
        student.setEnglishGrade(95);
        student.setScienceGrade(100);

        student.print(student.getName());
        student.print(student.getEnglishGrade(), student.getMathGrade(), student.getScienceGrade(),
                student.getAverage());
    }

    public void setName(String temp) {
        name = temp;
    }

    public String getName() {
        return name;
    }

    public void setAge(int temp) {
        age = temp;
    }

    public void setAddress(String temp) {
        address = temp;
    }

    public String getAddress() {
        return address;
    }

    public void setMathGrade(double temp) {
        mathGrade = temp;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setEnglishGrade(double temp) {
        englsihGrade = temp;
    }

    public double getEnglishGrade() {
        return englsihGrade;
    }

    public void setScienceGrade(double temp) {
        scienceGrade = temp;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englsihGrade + scienceGrade) / 3;
        return result;
    }

    public void print(String temp) {
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Age : " + age);
    }

    public void print(double eGrade, double mGrade, double sGrade, double average) {
        System.out.println("Name :" + name);
        System.out.println("Math Grade :" + mGrade);
        System.out.println("English Grade :" + eGrade);
        System.out.println("Science Grade :" + sGrade);
        System.out.println("Average :" + average);
    }
}