import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by abhishek.ar on 18/03/17.
 */
public class FileDiff {
    private static final String SFS_FILENAME_1 = "/Users/abhishek.ar/Desktop/a.csv";
    private static final String SFS_FILENAME_2 = "/Users/abhishek.ar/Desktop/b.csv";
    private static final String SFS_FILENAME_3 = "/Users/abhishek.ar/Desktop/c.csv";
    private static final String SFS_FILENAME_4 = "/Users/abhishek.ar/Desktop/d.csv";
    private static final String SFS_FILENAME_5 = "/Users/abhishek.ar/Desktop/e.csv";
    private static final String SFS_FILENAME_6 = "/Users/abhishek.ar/Desktop/15_21_cartman_diff.csv";
    private static final String SFS_FILENAME_7 = "/Users/abhishek.ar/Desktop/26_cartman_leftover.csv";
//    private static final String SFS_FILENAME_8 = "/Users/abhishek.ar/Desktop/all_impacted_diff";
//    private static final String SFS_FILENAME_9 = "/Users/abhishek.ar/Desktop/all_impacted_diff";
//    private static final String SFS_FILENAME_10 = "/Users/abhishek.ar/cartmanFinal/pending_sfs_cartman.csv";

    private static final String SHIPPING_FILENAME_1 = "/Users/abhishek.ar/cartmanFinal/a_result.csv";
    private static final String SHIPPING_FILENAME_2 = "/Users/abhishek.ar/cartmanFinal/b_result.csv";
    private static final String SHIPPING_FILENAME_3 = "/Users/abhishek.ar/cartmanFinal/c_result.csv";
    private static final String SHIPPING_FILENAME_4 = "/Users/abhishek.ar/cartmanFinal/d_result.csv";
    private static final String SHIPPING_FILENAME_5 = "/Users/abhishek.ar/cartmanFinal/e_result.csv";
    private static final String SHIPPING_FILENAME_6 = "/Users/abhishek.ar/cartmanFinal/15_21_cartman_diff_result.csv";
    private static final String SHIPPING_FILENAME_7 = "/Users/abhishek.ar/cartmanFinal/26_cartman_leftover_result.csv";
    private static final String SHIPPING_FILENAME_8 = "/Users/abhishek.ar/cartmanFinal/all_impacted_diff_result.csv";
    private static final String SHIPPING_FILENAME_9 = "/Users/abhishek.ar/cartmanFinal/pending_sfs_cartman_result.csv";
    private static final String SHIPPING_FILENAME_10 = "/Users/abhishek.ar/cartmanFinal/last_result.csv";

    public static void main(String[] args) {

        BufferedReader br1 = null, br2 = null, br3 = null, br4 = null, br5= null, br6 = null,
                br7 = null, br8 = null, br9 = null, br10=null,
                br11 = null, br12 = null, br13 = null, br14=null, br15=null, br16=null, br17= null, br18 = null;
        String cvsSplitBy = ",";
//        FileReader fr1, fr2, fr3, fr4 = null;

        Set<String> sfs_shipments = new HashSet<String>();
        Set<String> shipping_shipments = new HashSet<String>();
        Set<String> diff = new HashSet<String>();
        try {

            String sCurrentLine;
            br1 = new BufferedReader(new FileReader(SFS_FILENAME_1));
            br2 = new BufferedReader(new FileReader(SFS_FILENAME_2));
            br3 = new BufferedReader(new FileReader(SFS_FILENAME_3));
            br4 = new BufferedReader(new FileReader(SFS_FILENAME_4));
            br5 = new BufferedReader(new FileReader(SFS_FILENAME_5));
            br6 = new BufferedReader(new FileReader(SFS_FILENAME_6));
            br7 = new BufferedReader(new FileReader(SFS_FILENAME_7));
//            br8 = new BufferedReader(new FileReader(SFS_FILENAME_8));


            br9 = new BufferedReader(new FileReader(SHIPPING_FILENAME_1));
            br10 = new BufferedReader(new FileReader(SHIPPING_FILENAME_2));
            br11 = new BufferedReader(new FileReader(SHIPPING_FILENAME_3));
            br12 = new BufferedReader(new FileReader(SHIPPING_FILENAME_4));
            br13 = new BufferedReader(new FileReader(SHIPPING_FILENAME_5));
            br14 = new BufferedReader(new FileReader(SHIPPING_FILENAME_6));
            br15 = new BufferedReader(new FileReader(SHIPPING_FILENAME_7));
            br16 = new BufferedReader(new FileReader(SHIPPING_FILENAME_8));
            br17 = new BufferedReader(new FileReader(SHIPPING_FILENAME_9));
            br18 = new BufferedReader(new FileReader(SHIPPING_FILENAME_10));
            while ((sCurrentLine = br1.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                sfs_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br2.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                sfs_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br3.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                sfs_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br4.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                sfs_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br5.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                sfs_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br6.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                sfs_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br7.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                sfs_shipments.add(csv[0]);
            }
//            while ((sCurrentLine = br8.readLine()) != null) {
//                String[] csv = sCurrentLine.split(cvsSplitBy);
//                sfs_shipments.add(csv[0]);
//            }



            while ((sCurrentLine = br9.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br10.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br11.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br12.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br13.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br14.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br15.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br16.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br17.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }
            while ((sCurrentLine = br18.readLine()) != null) {
                String[] csv = sCurrentLine.split(cvsSplitBy);
                shipping_shipments.add(csv[0]);
            }

            System.out.println("SFS shipments " + sfs_shipments.size());
            sfs_shipments.removeAll(shipping_shipments);
            System.out.println("Shipping shipments " + shipping_shipments.size());
            System.out.println("SFS shipments " + sfs_shipments.size());
//            for(String s : sfs_shipments){
//                System.out.println(s);
//            }

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
                if (br5 != null)
                    br5.close();
                if (br6 != null)
                    br6.close();
                if (br7 != null)
                    br7.close();
                if (br8 != null)
                    br8.close();
                if (br9 != null)
                    br9.close();
                if (br10 != null)
                    br10.close();


            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
