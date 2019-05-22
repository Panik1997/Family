import java.util.ArrayList;
import java.util.List;

public abstract class FamilyMembers implements CheckEnglish{

    private static void checkEnglish(List<Family> members, CheckEnglish check){
    
        System.out.println("Family members that speak English:\n");
        
        for(Family memb : members){
            if(check.ifEnglish(memb)){
                System.out.println(memb.getName() + " Age:" + memb.getAge() + " Salary:" + memb.getSalary() + "\n");
            }
        }
    }
    
    public static void main(String[] args){
    
        List<Family> members = new ArrayList<Family>();
        
        members.add(new Family("Pawel", 24, 3800, true));
        members.add(new Family("Jakub", 32, 3200, true));
        members.add(new Family("Karolina", 56, 5200, false));
        members.add(new Family("Ewelina", 26, 18000, true));
        members.add(new Family("Lukasz", 60, 6000, false));
        
        checkEnglish(members, eng -> eng.getEnglish_speaking());
        
    }
}
