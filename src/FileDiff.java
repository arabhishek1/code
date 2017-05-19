import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by abhishek.ar on 18/03/17.
 */
public class FileDiff {
    private static final String SFS_FILENAME_1 = "/Users/abhishek.ar/Downloads/total_sfs_1.txt";
    private static final String SFS_FILENAME_2 = "/Users/abhishek.ar/Downloads/total_sfs_2.txt";
    private static final String SHIPPING_FILENAME_1 = "/Users/abhishek.ar/Downloads/in_shipping_1.txt";
    private static final String SHIPPING_FILENAME_2 = "/Users/abhishek.ar/Downloads/in_shipping_2.txt";
    public static void main(String[] args) {

        BufferedReader br1 = null, br2 = null, br3 = null, br4 = null;
//        FileReader fr1, fr2, fr3, fr4 = null;

        Set<String> sfs_shipments = new HashSet<String>();
        Set<String> shipping_shipments = new HashSet<String>();
        Set<String> diff = new HashSet<String>();
        try {

            String sCurrentLine;
            br1 = new BufferedReader(new FileReader(SFS_FILENAME_1));
            br2 = new BufferedReader(new FileReader(SFS_FILENAME_2));
            br3 = new BufferedReader(new FileReader(SHIPPING_FILENAME_1));
            br4 = new BufferedReader(new FileReader(SHIPPING_FILENAME_2));
            while ((sCurrentLine = br1.readLine()) != null) {
                sfs_shipments.add(sCurrentLine);
            }
            while ((sCurrentLine = br2.readLine()) != null) {
                sfs_shipments.add(sCurrentLine);
            }
            while ((sCurrentLine = br3.readLine()) != null) {
                shipping_shipments.add(sCurrentLine);
            }
            while ((sCurrentLine = br4.readLine()) != null) {
                shipping_shipments.add(sCurrentLine);
            }
//            System.out.println("SFS shipments " + sfs_shipments.size());
            sfs_shipments.removeAll(shipping_shipments);
//            System.out.println("Shipping shipments " + shipping_shipments.size());
//            System.out.println("SFS shipments " + sfs_shipments.size());
            for(String s : sfs_shipments){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br1 != null)
                    br1.close();
                if (br2 != null)
                    br2.close();
                if (br3 != null)
                    br3.close();
                if (br4 != null)
                    br4.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
