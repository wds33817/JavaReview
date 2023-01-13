import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
/*
import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.*;

import java.io.InputStream;
import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.*;

import java.io.*;

/** Tutorial 7 - selecting the VCARD resources
 */

/*
public class Main extends Object {

    static final String inputFileName = "vc-db-1.rdf";

    public static void main (String args[]) {
        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        // use the FileManager to find the input file
        InputStream in = FileManager.get().open(inputFileName);
        if (in == null) {
            throw new IllegalArgumentException( "File: " + inputFileName + " not found");
        }

        // read the RDF/XML file
        model.read( in, "");

        // select all the resources with a VCARD.FN property
        ResIterator iter = model.listResourcesWithProperty(VCARD.FN);
        if (iter.hasNext()) {
            System.out.println("The database contains vcards for:");
            while (iter.hasNext()) {
                System.out.println("  " + iter.nextResource()
                        .getRequiredProperty(VCARD.FN)
                        .getString() );
            }
        } else {
            System.out.println("No vcards were found in the database");
        }
    }
}
*/


public class Main{
    public static void main(String[] args) throws IOException {

        //read("country.csv");
        //String url = "https://laendercode.net/img/flag-icon-css/flags/4x3/af.svg";

        //downloadUsingStream(url, "one.svg");

        //String url = "https://laendercode.net/img/flag-icon-css/flags/4x3/";
        StringBuilder sb = new StringBuilder("https://laendercode.net/img/flag-icon-css/flags/4x3/");
        try {
            File file = new File("country.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            //Integer i = new Integer(0);
            //String[] tempArr;
            while((line = br.readLine()) != null) {
                //System.out.println(line.toLowerCase());

                String res = sb + line.toLowerCase() + ".svg";

                //sb.append(line.toLowerCase()+".svg");
                //System.out.println(sb.toString());
                downloadUsingStream(res, line.toLowerCase()+".svg");
                //i++;
                //sb.delete(52, 59);
                //System.out.println();



            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }


    }

    public static void read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            while((line = br.readLine()) != null) {
                System.out.print(line + " ");

            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }


    private static void downloadUsingStream(String urlStr, String file) throws IOException{


        URL url = new URL(urlStr);
        String result = java.net.URLDecoder.decode(url.toString(), StandardCharsets.UTF_8.name());

        byte[] bytes = result.getBytes(StandardCharsets.UTF_8);
        if (bytes.length == 61) {
            System.out.println(bytes.length);
            byte[] first = new byte[52];
            byte[] second = new byte[6];
            System.arraycopy(bytes, 0, first, 0, 52);
            System.arraycopy(bytes, 55, second, 0, 6);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            os.write(first);
            os.write(second);
            byte[] byteArray = os.toByteArray();
            //String finalres = byteArray.toString();
            String finalres = new String(byteArray, StandardCharsets.UTF_8);
            System.out.println(finalres);
            URL urlres = new URL(finalres);
            BufferedInputStream bis = new BufferedInputStream(urlres.openStream());
            FileOutputStream fis = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int count=0;
            while((count = bis.read(buffer,0,1024)) != -1)
            {
                fis.write(buffer, 0, count);
            }
            fis.close();
            bis.close();
        } else if (bytes.length == 58) {
            //URL urlres = new URL(finalres);
            BufferedInputStream bis = new BufferedInputStream(url.openStream());
            FileOutputStream fis = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int count = 0;
            while ((count = bis.read(buffer, 0, 1024)) != -1) {
                fis.write(buffer, 0, count);
            }
            fis.close();
            bis.close();
        }


        //String res = result.replace("%EF%BB%BF", "");
        //URL urlres = new URL(res);
        //System.out.println(url);
        //URL res = java.net.URLEncoder.encode(result);




    }

}
