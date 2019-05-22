public class Family {

    private String name;
    private int age;
    private int salary;
    private boolean english_speaking;

    public Family(String name, int age, int salary, boolean english_speaking){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.english_speaking = english_speaking;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getEnglish_speaking(){
        return  english_speaking;
    }
}
