/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31190449_Stack;
import java.util.Scanner;
/**
 *
 * @author naufalsa
 */
public class Main {
    public static void main(String[] args) {
        //memasukkan variabel pilihan dan data
        int pilihan;
        int data;
        Stack result = new Stack();//mendeklarasikan agar bisa memmanggil dari kelas lain
        //membuat perulangan
        do{
            //isinya yaitu tampilan untuk memilih menu
            System.out.println("1.PUSH");
            System.out.println("2.POP ITEM");
            System.out.println("3.LIHAT ISI DATA");
            System.out.println("0.KELUAR");
            System.out.println("Masukkan Pilihan : ");
            //mengambil inputan dari keyboard
            Scanner input=new Scanner(System.in);
            pilihan=input.nextInt();
            //selanjutnya dengan membuat kondisi
            if (pilihan==1) {
                //menampilkan data yang akan di tambahkan
                System.out.println("Data yang ditambahkan : ");
                data=input.nextInt();//data yang akan di masukkan di stack
                result.push(data);
            }else if(pilihan==2){//deklarasikan
                result.pop();
            }else if (pilihan==3) {//deklarasikan
                result.display();
            }else if (pilihan==0) {//deklarasikan
                System.exit(0);
            }else{
                //menampilkan data dari pilihan tidak ada
                System.out.println("Pilihan Tidak Ada");
            }
        }while(pilihan !=0);//mengulang progam tersebut pilihan sampai dengan nol
    }
    
}
//dan langkah yang terakhir yaitu dengan klik run untuk menjalankan progam ini
    

