package exchange; /**
 * Created by Karthik on 10/10/2014.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class cReader
{
    BufferedReader readFile;
    StringTokenizer token;

     public void fileInput() throws Exception {
         String line, delimiter = ",";


         readFile = new BufferedReader(new FileReader("dat.txt.txt"));
         while ((line = readFile.readLine()) != null) {
             token = new StringTokenizer(line, delimiter);
         }

     }
    public mktick NextTick() throws Exception
    {
        mktick _mktick = new mktick();
        int ctr =0;
        if (token.hasMoreElements())
            {
                ctr++;

                if(ctr==1)
                { _mktick._symbol = token.nextElement().toString(); }

                else if(ctr==2){
                    _mktick._size = Integer.valueOf(token.nextElement().toString());
                }

                else if(ctr==3){
                    _mktick._price = Integer.valueOf(token.nextElement().toString());
                }
                else if(ctr==4){
                    _mktick._side = Integer.valueOf(token.nextElement().toString());
                }
                else {
                    _mktick._type = Integer.valueOf(token.nextElement().toString());
                }

                return _mktick;
            }

            else
                return null;

    }
}


