import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OlympianManager {

    // enumerator for sexes
    public enum Sex{Male, Female}

    public Olympian[] olympians;

    // the constructor
    public OlympianManager() {

        // file location
        String[] file = {"C:\\Users\\Mjo95_000\\Documents\\GitHub\\Lawn-Game-Olympics\\Software Dev Project\\Olympians.LGOO.txt"};

        try {

            // creates the length of the array
            this.olympians = new Olympian[16];

            // allows input from the file
            BufferedReader argInput = new BufferedReader(new FileReader(file[0]));

            String fileLine;

            do {

                fileLine = argInput.readLine();
                if (fileLine != null) {

                    // checks if the file has the first line LGOO
                    if (fileLine.equals("LGOO")) {

                        for (int i = 0; i < this.olympians.length; i++) {

                            // divides each person based on where the comma is placed and assigns their parameters based on this
                            fileLine = argInput.readLine();
                            String comma = (",");
                            String[] parameters = fileLine.split(comma);
                            Sex sex;

                            // the third variable assignment
                            if (parameters[2].equals("Male")) {
                                sex = Sex.Male;

                            } else {
                                sex = Sex.Female;

                            }

                            // the first and second variable assignment
                            this.olympians[i] = new Olympian(parameters[0], Integer.parseInt(parameters[1]), sex);

                        } break;
                    }
                }
            }
            while (fileLine != null);
        }

        // a catch in case the file does not read
        catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("File was unable to be read");
        }
    }

    // gets the length of the array
    public int getLength(){

        return olympians.length;
    }

    // gets the olympian array
    public Olympian[] getOlympians(){

        return olympians;

    }


}
