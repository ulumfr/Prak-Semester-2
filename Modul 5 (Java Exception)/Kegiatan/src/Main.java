import java.io.*;
import java.util.InputMismatchException;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {
    
    static dinasPertanahan dP = new dinasPertanahan();
    static Scanner input = new Scanner(System.in);

    static boolean Status = true;

    public static void main(String[] args) throws IOException{
        Menu();
    }

    //Menu 
    public static void Menu() throws IOException {
        System.out.println("\n========= Dinas Pertanahan UMM =========");
        System.out.println("\n1. Create\n2. Read\n3. Exit\n");
        System.out.print("Pilih Menu Anda : ");

        int menu = input.nextInt();
        
        switch (menu){
            case 1 : input(); Menu();
                break;
            case 2 : display(); Menu();
                break;
            case 3 : System.exit(0); 
                break;
            default : System.out.println("\n\nMohon Maaf Pilihan Anda Salah!\n"); Menu();
        }
        
    }

    //Input Data
    public static void input() throws IOException {
        File file = new File("Tanah.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        String alamat_tanah;
        int panjang_tanah, luas_tanah;

        System.out.println("\n========================================");
        System.out.printf("\nMasukan Alamat\t\t: ");
        dP.setalamat(input.next());
        alamat_tanah = dP.getalamat();

        do {
            Status = false;
            try {
                System.out.printf("Masukan Panjang Tanah\t: ");
                dP.setpanjangTanah(input.nextInt());
                panjang_tanah = dP.getpanjangTanah();

                System.out.printf("Masukan Luas Tanah\t: ");
                dP.setluasTanah(input.nextInt());
                luas_tanah = dP.getluasTanah();

                //File Repository
                String tulis = String.format("%s, %s, %s\n", alamat_tanah, panjang_tanah, luas_tanah);
                    
                bw.write(tulis); bw.close();
            } catch (InputMismatchException a) {
                System.err.print("\n\nInputan Harus Integer");
                Status = true;
                input.nextLine();
            } finally {
                System.out.println("\nProgram Mengulang");
            }
        } while (Status);
    }

    //Show Data
    public static void display() throws IOException {
        try{
            File file = new File("Tanah.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String baca = br.readLine();

            int No = 1;

            System.out.println("\n========================================");
            System.out.printf("%-2s %-10s %-15s %-15s\n", "No", "Alamat", "Panjang Tanah", "Luas Tanah"); //table
            
            //Show Data
            while (baca != null) {
                StringTokenizer st = new StringTokenizer(baca, ","); //delimiter 

                String alamat, panjang_tanah, luas_tanah;

                alamat = st.nextToken();
                panjang_tanah = st.nextToken();
                luas_tanah = st.nextToken();

                //Output 
                System.out.printf("%2d %-10s %-15s %-15s\n", No++, alamat, panjang_tanah, luas_tanah);
                baca = br.readLine();
            }
            br.close(); fr.close();
            System.out.println("========================================");
        } catch (FileNotFoundException b) {
            System.err.print("\n\nFile Tidak Ditemukan\n");
        } finally {
            System.out.println("\nProgram Mengulang");
        }
    }
}
