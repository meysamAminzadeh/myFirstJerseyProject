package DAO;

//import com.opencsv.CSVReader;
import model.PersonTO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 6/12/2020.
 */
public class Database {

    private Map<Integer, String> farbeData = new HashMap();


    public Database() {

        makeData();
    }

    private Map<Integer, String> makeData() {

        farbeData.put(1, "blau");
        farbeData.put(2, "grün");
        farbeData.put(3, "violett");
        farbeData.put(4, "rot");
        farbeData.put(5, "gelb");
        farbeData.put(6, "türkis");
        farbeData.put(7, "weiß");


        return farbeData;

    }

    public List<PersonTO> select() {

        List<PersonTO> ls = new ArrayList<PersonTO>();

        String fileName = "test.csv";

        Reader fr =null;
     /*   CSVReader reader  = null;
        try {
            fr = new FileReader(fileName);
            reader = new CSVReader(fr);
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                PersonTO psn = new PersonTO();

                psn.setFamily(nextLine[0]);
                psn.setName(nextLine[1]);
                psn.setZipcode(Long.parseLong(nextLine[2].substring(0, nextLine[2].lastIndexOf(" "))));
                psn.setCityName(nextLine[2].substring(nextLine[2].lastIndexOf(" ")));
                psn.setId(Integer.parseInt(nextLine[3]));
                psn.setFarbe(farbeData.get(Integer.parseInt(nextLine[3])));

                ls.add(psn);
            }
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return ls;
    }
}