
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.File;

/*
 * SPDXVersion: SPDX-1.1
  Creator: Person: Nuno Brito
 * Creator: Organization: TripleCheck (contact@triplecheck.de)
 * Created: 2015-01-08T01:26:56Z
 * LicenseName: Apache-2.0
 * FileName: Test.java  
 * FileCopyrightText: <text> Copyright 2015 Nuno Brito </text>
 * FileComment: <text> Testing the TLSH algorithm </text> 
 */

/**
 *
 * @author Nuno Brito, 8th of January 2015 in Darmstadt, Germany
 */
public class Test {

    
    public static TLSH getData(File file) throws Exception{
        byte[] tlshData = new byte[(int)file.length()];
        DataInputStream dataIs = new DataInputStream(new FileInputStream(file));
        dataIs.readFully(tlshData);
        TLSH tlsh = new TLSH();
        tlsh.update(tlshData);
        tlsh.finale();
        System.out.println(file.getName() + ": " + tlsh.hash());
        return tlsh;
    }
    
    public static void main(String [] args) throws Exception {
        
        TLSH t051 = getData(new File("test", "mysql-4051.cc"));
        TLSH t052 = getData(new File("test", "mysql-4052.cc"));
        TLSH t059 = getData(new File("test", "mysql-4059.cc"));
        TLSH t308 = getData(new File("test", "mysql-4308.cc"));
        
        System.out.println("059 vs Vuln. code: "  + t059.totalDiff(t051, false));
        System.out.println("059 vs Fixed code: "  + t059.totalDiff(t052, false));
        System.out.println("308 vs Vuln. code: "  + t308.totalDiff(t051, false));
        System.out.println("308 vs Fixed code: "  + t308.totalDiff(t052, false));
        
        System.exit(0);
    }
	
    
}
