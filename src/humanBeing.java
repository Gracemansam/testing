
public class humanBeing {
    private String firstName;
    private String lastName;
    private int age;
    private float height;
     public String getFirstName(){
         return firstName;
     }
     public void setFirstName(String name){
         firstName = name;
     }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lName) {
        lastName = lName;
    }
    public int getAge(){
         return age;
    }
    public void setAge(int newAge){
         age = newAge;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public String getFullName(){
         return getFirstName() + " " + getLastName();
    }


}





