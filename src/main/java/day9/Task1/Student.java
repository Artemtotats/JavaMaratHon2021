package day9.Task1;

public class Student extends Human {
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String groupName,String name) {
        super(name);
        this.groupName = groupName;

    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Это студент с именем: " + getName() );
   }


}
