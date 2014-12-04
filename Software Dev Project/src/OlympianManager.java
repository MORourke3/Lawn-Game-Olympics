import java.io.*;
//was not able to get File reader to grab a file via "edit configurations"
//closing in on something that may work, needs fixing.

public class OlympianManager {

    // enumerator for sexes
    public enum Sex{Male, Female}
    public Olympian[] olympians;
    private String file;

    // the constructor
    public OlympianManager(String file) {

        this.file = file;
        int olympianCount = 0;
        BufferedReader read;

        try {

            // allows input from the file
            read = new BufferedReader(new FileReader(file));
            String fileLine = read.readLine();

                if (fileLine != null) {
                    System.out.println("File is blank");
                } else {

                        // checks if the file has the first line LGOO
                    } if (fileLine.equals("LGOO")) {

                            olympians = new Olympian[getLength()];

                            while (read.ready()) {

                                // divides each person based on where the comma is placed and assigns their parameters based on this
                                String comma = (",");
                                String X[] = fileLine.split(comma);

                                // initializes instances to be used within OlympianManager
                                String name;
                                int age;
                                Sex sex;

                                // the first variable assignment
                                name = X[0];

                                // the second variable assignment
                                age = Integer.parseInt(X[2]);

                                // the third variable assignment
                                if (X[1].equals("Male")) {
                                    sex = Sex.Male;

                                } else {
                                    sex = Sex.Female;

                                }

                                olympians[olympianCount] = new Olympian(name, age, sex);
                                olympianCount++;

                            }
                        }
            read.close();
        }

        // a catch in case the file does not read
        catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("File was unable to be read");
        }
    }

    // gets the length of the array
    public int getLength(){

        LineNumberReader Y;
        int length = 0;

        try {
            Y = new LineNumberReader(new FileReader(new File(file)));
            Y.skip(Long.MAX_VALUE);

            length = Y.getLineNumber();
            Y.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
                System.out.println("File was unable to be read");
            }

            return length;

    }

    // gets the olympian array
    public Olympian[] getOlympians(){

        return olympians;

    }


}
