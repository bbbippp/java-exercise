/**
 * @author Ian Gumilang
 */
public class CodingExercisePerson {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age<0 || age>100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public boolean isTeen(){
        boolean isPersonTeen = false;

        if(age>12 && age <20){
            isPersonTeen = true;
        }

        return isPersonTeen;
    }

    public String getFullName(){
        String fullName;

        if(firstName.isEmpty() && lastName.isEmpty()){
            fullName = "";
        }else if(lastName.isEmpty()){
            fullName = firstName;
        }else if(firstName.isEmpty()){
            fullName = lastName;
        }else{
            fullName = firstName + " " + lastName;
        }

        return fullName;
    }
}