

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}


class Student extends Person {
    private String idNum;    // Student Id Number
    private double gpa;      // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.idNum = idNum;
        this.gpa = gpa;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", idNum: " + idNum + ", GPA: " + gpa;
    }
}


class Teacher extends Person {
    private String subject; // Subject that the teacher teaches
    private double salary;  // The teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getter and setter methods for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter and setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
}


class CollegeStudent extends Student {
    private String major; // Major that the student is studying
    private int year;     // Year of study

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    // Getter and setter methods for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Getter and setter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return super.toString() + ", Major: " + major + ", Year: " + year;
    }
}




