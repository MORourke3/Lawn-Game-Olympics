
public class OlympianManager {

    // creates the string array for olympian manager allowing olympian names to be called in the array form
    public String[] name;
    // creates the int array for olympian manager allowing olympian ages to be called in the array form
    public int[] age;

    // creates the string array for olympian manager allowing olympian sexes to be called in the array form
    public enum Sex{Male, Female}
    public Sex[] sex;

    // the constructor for the previous variables
    public OlympianManager(String[] name, int[] age, Sex[] sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }



}
