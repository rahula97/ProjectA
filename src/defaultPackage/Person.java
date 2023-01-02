package defaultPackage;
public class Person {
    String firstName, lastName;
    int age;

    public Person() {
        firstName ="Max";
        lastName = "Ver";
        age=7;
        System.out.println(firstName + " " + lastName + " " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 0;
        if(age>0&&age<100)
            this.age = age;
    }
    public boolean isTeen(){
        if(age>12&&age<20)
            return true;
        else
            return false;
    }

    public String getFullName(){
        if(this.firstName.isEmpty()&&this.lastName.isEmpty())
            return " ";
        else if(this.firstName.isEmpty())
            return this.lastName;
        else if(this.lastName.isEmpty())
            return this.firstName;
        else
            return this.firstName+" "+this.lastName;
    }
}
