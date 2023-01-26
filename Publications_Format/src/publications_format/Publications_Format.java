/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package publications_format;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi
 */
public class Publications_Format {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String input_file = "C:\\Users\\thorp\\OneDrive - London School of Hygiene and Tropical Medicine\\library.bib";
        File file = new File("C:\\Users\\thorp\\gitthesis\\LSHTMPathogenSeqLab.github.io\\_data\\publications.csv");
        FileWriter outputfile = new FileWriter(file);
        CSVWriter writer = new CSVWriter(outputfile);
        String[] header = {"Author", "doi", "issn", "journal", "title", "year", "PMID"};
        writer.writeNext(header);
        BufferedReader br = new BufferedReader(new FileReader(input_file)); //read the file
        String data;
        String tempvar = "";
        List<String> line = new ArrayList<String>();
        int counters = 0;
        while ((data = br.readLine()) != null) {
            if (!data.contains("@")) {
                if (data.contains("author") & !data.contains("abstract")) {
                    if (data.contains("Prapaporn Srilohasin")) {
                        System.out.println(counters);

                    }
                    data = data.replaceAll("[{}]", "");
                    data = data.replaceAll(" and ", ",");
                    data = data.replaceAll("[.]", "");
                    data = data.replaceAll("author = ", "");
                    data = data.substring(0, data.length() - 1);

                    line.add(data);

                } else if (data.contains("doi") & !data.contains("abstract")) {
                    data = data.replaceAll("[{}]", "");
                    data = data.replaceAll("doi = ", "");
                    data = data.substring(0, data.length() - 1);
                    line.add(data);

                } else if (data.contains("issn") & !data.contains("abstract")) {
                    data = data.replaceAll("[{}]", "");
                    data = data.replaceAll("issn = ", "");
                    data = data.substring(0, data.length() - 1);
                    line.add(data);
                } else if (data.contains("journal") & !data.contains("abstract")) {
                    data = data.replaceAll("[{}]", "");
                    data = data.replaceAll("journal = ", "");
                    data = data.substring(0, data.length() - 1);
                    line.add(data);
                } else if (data.contains("title") & !data.contains("abstract")) {
                    data = data.replaceAll("[{}]", "");
                    data = data.replaceAll("title = ", "");
                    data = data.substring(0, data.length() - 1);
                    line.add(data);

                } else if (data.contains("year") & !data.contains("abstract")) {
                    data = data.replaceAll("[{}]", "");
                    data = data.replaceAll("year = ", "");
                    data = data.substring(0, data.length() - 1);
                    if (!tempvar.equals("")) {
                        line.add(data);
                        line.add(tempvar);
                        tempvar = "";
                    } else {
                        line.add(data);

                    }

                } else if (data.contains("pmid") & !data.contains("abstract")) {
                    data = data.replaceAll("[{}]", "");
                    data = data.replaceAll("pmid = ", "");
                    data = data.substring(0, data.length() - 1);
                    tempvar = data;

                } else if (data.equals("}")) {
                    counters++;
                    String[] simpleArray = new String[line.size()];
                    line.toArray(simpleArray);
                    writer.writeNext(simpleArray);
                    line.clear();
                }

            }

        }
        writer.close();

    }

}
