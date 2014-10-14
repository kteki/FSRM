/**
 * Created by Karthik on 10/10/2014.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class cReader
{
     mktick _mktick;

    public static String fileInput() throws Exception
    {
        //File file = new File("orders.txt");
        //csvReader.fileInput();
        String line, tok, delimiter = ",";
        StringTokenizer token;
        ArrayList<String> data = new ArrayList<String>();

        BufferedReader readFile = new BufferedReader(new FileReader("dat.txt.txt"));

        int ctr =0;
        while((line = readFile.readLine()) != null) {
            token = new StringTokenizer(line,delimiter);
            while(token.hasMoreElements())
            {
                ctr++;
                /*if(ctr==1){ mktick }
                else if(ctr==2){}
                else if(ctr==3){}
                else if(ctr==4){}
                else {}
                */

                tok = token.nextToken();
                data.add(tok);
            }

            // data.add(line);
            System.out.print(data);
        }
        return "";
    }
}


