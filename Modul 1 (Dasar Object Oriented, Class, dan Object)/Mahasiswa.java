import java.util.Scanner; 

public class Mahasiswa { 

    private String nama; 
    private String nim;
    private String password;

    public void setNama(String nama){ 
        this.nama = nama; 
    }
    public String getNama(){
        return nama;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    public String getNIM(){
        return nim;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    Scanner input = new Scanner(System.in); 

    public void Daftar() { 
        String input_nama, input_nim, input_password; 
        int i = 0, k = 0;
    
        System.out.println("=== Daftar ===\n");
        System.out.print("Nama : "); 
        input_nama = input.nextLine(); 
        setNama(input_nama);

        while (i == 0){ 
            System.out.print("NIM : ");
            input_nim = input.nextLine();
            if (input_nim.length() == 15){ 
                setNIM(input_nim);
                break;
            }else{
                System.out.println("NIM harus berjumlah 15 angka");
            }
        }
        
        while (k == 0){
            System.out.print("Password : ");
            input_password = input.nextLine();
            if (input_password.length() >= 8){
                setPassword(input_password);
                break;
            }
            else{
                System.out.println("Password minimal 8 karakter");
            }
        }

        input.close(); 
    }
    
    public static void main(String[] args) {
        Mahasiswa ex = new Mahasiswa(); 
        ex.Daftar();
        System.out.println("\nSelamat " + ex.getNama() + " Anda berhasil daftar");
        System.out.println("\nBerikut Username dan Password anda :");
        System.out.println("Username : " + ex.getNIM());
        System.out.println("Password : " + ex.getPassword());
    }
}
