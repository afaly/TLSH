
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

/*
 * SPDXVersion: SPDX-1.1
 * Creator: Person: Vasiliy Vadimov
 * Creator: Person: Nuno Brito
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-01-08T01:26:56Z
 * LicenseName: Apache-2.0
 * FileName: Test.java  
 * FileCopyrightText: <text> Copyright 2014 Vasiliy Vadimov, Nuno Brito </text>
 * FileComment: <text> Testing the algorithm </text> 
 */

/**
 *
 * @author Nuno Brito, 8th of January 2015 in Darmstadt, Germany
 */
public class Test {

    public static void main(String [] args) throws IOException {
        
        TLSH ti1 = new TLSH();
        File file = new File("favicon.ico");
	FileInputStream fis = new FileInputStream(file);
 
        System.out.println("Total file size to read (in bytes) : "
                        + fis.available());

        int content;
        while ((content = fis.read()) != -1) {
                // convert to char and display it
                //System.out.print((char) content);
            //ti1.update((content);
        }		
        
    }
	
    
}
