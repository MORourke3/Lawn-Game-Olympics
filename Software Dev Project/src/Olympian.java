
public class Olympian {

    // initializes the names for the array
    static String[] array = {
        "Steve",
        "Sam",
        "Jeb",
        "John",
        "Geoff",
        "Kevin",
        "Chris",
        "Tyler",
        "Omar",
        "Samantha",
        "Arlene",
        "Shannon",
        "Miranda",
        "Cathrine",
        "Laura",
        "Jillian",
    };

    // initializes the ages for the array
    static int[] array2 = {
            22,
            25,
            40,
            20,
            32,
            18,
            14,
            16,
            54,
            24,
            19,
            13,
            45,
            25,
            29,
            30,

    };

    // initializes the array for Sexes drawing from the Sex enumeration
    static OlympianManager.Sex[] array3 = {
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Male,
            OlympianManager.Sex.Female,
            OlympianManager.Sex.Female,
            OlympianManager.Sex.Female,
            OlympianManager.Sex.Female,
            OlympianManager.Sex.Female,
            OlympianManager.Sex.Female,
            OlympianManager.Sex.Female,
            OlympianManager.Sex.Female,
    };


    // creates a new instance of Olympian manager "B" calling upon the string, int, and OlympianManager.Sex to fill it with "array, array2, array3" respectively
    static OlympianManager B = new OlympianManager(array, array2, array3){
    };
};

