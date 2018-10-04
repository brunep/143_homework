import java.util.Scanner;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileReader;




public class Fractionsv1 {
    private static final String FILENAME = "fractions.txt";

    public static void main(String[] args) {

        //array to hold in all lines aka fractions
        String[] fractions;

        //count number of times the fraction is shown
        int count = 0;

        //set array size to 50
        fractions = new String[50];

        //read in file
        BufferedReader br = null;
        FileReader fr = null;



        /*try {
            String line;

            //while there are more lines in the file
            while (br.hasNextLine()) {
                if (fractions[i] == br.nextLine()) {
                    //if the starting line is the same as the next line then the count goes up
                    count++;
                }
            }
            //print the current fraction and
            System.out.println(fractions[i] + " has a count of " + count);

        } finally {
            //once all the other stuff is done close the programm
            br.close();

        }*/




        // read in file aka FILENAME
        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            System.out.println("I have hit exception 1");
            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }
}


