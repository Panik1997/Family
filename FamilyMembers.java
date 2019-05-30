import java.util.ArrayList;
import java.util.List;

public abstract class FamilyMembers implements CheckEnglish{

    private static void checkEng(List<Family> members, CheckEnglish check){
        System.out.println("Family members that speak English:\n");
        for(Family memb : members){
            if(check.ifEnglish(memb)){
                System.out.println(memb.getName() + " Age:" + memb.getAge() + " Salary:" + memb.getSalary() + "\n");
            }
        }
    }
    public static void main(String[] args){
        List<Family> members = new ArrayList<>();
        members.add(new Family("Pawel", 24, 3800, true));
        members.add(new Family("Jakub", 32, 3200, true));
        members.add(new Family("Karolina", 56, 5200, false));
        members.add(new Family("Ewelina", 26, 18000, true));
        members.add(new Family("Lukasz", 60, 6000, false));

        System.out.println("Family members: ");
        for(Family fam: members){
            System.out.println("Name: " + fam.getName() + " Age: " + fam.getAge()+ " Salary: "
                    + fam.getSalary() + " English: " + fam.getEnglish_speaking());
        }
        System.out.println();

        checkEng(members, eng -> eng.getEnglish_speaking());
        int tmp = 0;
        Family tmp1 = new Family("", 0, 0, false);

        for(Family memb: members){
            if(tmp < memb.getSalary()){
                tmp = memb.getSalary();
                tmp1 = memb;
            }
        }
        System.out.println("Max salary in family has: "+ tmp1.getName() + "\nValue:" + tmp);

        int tmp2 = 0;
        for(Family membr: members){
            if(membr.getAge() > tmp2){
                tmp2 = membr.getAge();
                tmp1 = membr;
                for(Family fa: members) {
                    if (fa.getName() == membr.getName()) {
                        continue;
                    }else{
                        System.out.println(fa.getName() + " to " + membr.getName());
                        System.out.println(fa.getName().compareTo(membr.getName()));
                    }
                }
            }
        }
        System.out.println();
        System.out.println("The oldest person in family is: " + tmp1.getName() + " and he/she is " + tmp2);
    }
}
