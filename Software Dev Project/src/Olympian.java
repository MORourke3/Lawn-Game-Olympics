
public class Olympian {

    // creates a function to get olympian names
    private String Olympianname;
    public String getName(){
        return this.Olympianname;

    }

    // creates a function to get olympian ages
    private int Olympianage;
    public int getAge(){
        return this.Olympianage;

    }

    // creates a function to get olympian sexes
    private OlympianManager.Sex Olympiansex;
    public OlympianManager.Sex getSex(){
        return this.Olympiansex;

    }

    // allocated the variables to name, age, and sex
    public Olympian(String name, int age, OlympianManager.Sex sex) {
        this.Olympianname = name;
        this.Olympianage = age;
        this.Olympiansex = sex;

    }

}

