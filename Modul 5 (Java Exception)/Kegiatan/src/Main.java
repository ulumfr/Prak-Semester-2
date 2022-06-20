package Kegiatan.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dinasPertanahan dP = new dinasPertanahan();

        boolean status = true; 
        int a = 0;
        try {
            String alamat[] = new String[3];
            int panjang_tanah[] = new int[3];
            int luas_tanah[] = new int[3];

            System.out.println("======== Dinas Pertanahan UMM ========");
            while(status){
                int urutan = a + 1;
                
                System.out.println("\nData ke- " + urutan);
                System.out.printf("Masukan Alamat\t\t: ");
                dP.setalamat(input.next());
                alamat[a] = dP.getalamat();

                System.out.printf("Masukan Panjang Tanah\t: ");
                dP.setpanjangTanah(input.nextInt());
                panjang_tanah[a] = dP.getpanjangTanah();

                System.out.printf("Masukan Luas Tanah\t: ");
                dP.setluasTanah(input.nextInt());
                luas_tanah[a] = dP.getluasTanah();

                a++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Thrown : " + e);
            status = false;
        }finally{
            System.out.println("Program STOP (Melebihi Inputan Data)");
        }
        input.close();
    }
}