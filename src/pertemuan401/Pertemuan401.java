package pertemuan401;

/**
 *
 * @author 2201010618_hendrawan
 * TGL 2024-04-23
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bukuteman Bteman = new bukuteman();
//        Bteman.Storedata();
        String ul = "ya";
        do{
            System.out.println("A. View Data");
            System.out.println("B. Add Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Delete Data");
            System.out.println("E. Exit");
            System.out.println("Choose option (A/B/C/D/E)");
            String mPIL = Bteman.dtIN.nextLine();
            switch (mPIL){
            case "A":
                Bteman.viewdata();
            
                break;
            case "B":
                Bteman.Storedata();
            
                break;
            case "C":
                Bteman.Update(0);
            
                break;
            case "D":
                Bteman.Destroy(0);
            
                break;
            case "E":
                ul = "tidak";
            
                break;
            default:
                System.out.println("type A/B/C/D/E");
                break;
                
            }
        }while( ul.equals("ya") );    
    }
    
}
