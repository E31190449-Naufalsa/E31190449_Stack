/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31190449_Stack;

/**
 *
 * @author naufalsa
 */
public class Stack {
    //membuat variabel yang bertipe boolean
    private boolean kosong,penuh;//mengecek true atau false atau bisa di sebut kosong atau penuh
    private int pos;//gunanya untuk menentukan posisi int array
    private int max_data=3;//untuk mengetahui maksimal data yang ada di dalam array
    private int item[]=new int[max_data];//mendeklarsikan variabel posisi
    public void Stack(){//untuk menentukan mainya 
       //membuat kontraktor utuk mengetahui nilai awal dari stack
        penuh=false;
        kosong=true;
        pos=0;
    }
    //membuat method gunanya untuk mengetahui atau mengecek apakah nilainya penuh
    public boolean isPenuh (){
        return (penuh);
    }
    //membuat method gunanya untuk mengetahui atau mengecek apakah nilainya kosong
    public boolean isKosong (){
        return (kosong);
    }
    //berikutnya membuat method untuk di tambahkan di stack
    public void push (int data){
        System.out.print("Hasil : ");//di cek apakah sudah terpenuhi,dan jika sudah
        //maka tambahkan item pada posisi
        if(!isPenuh()){
            item[pos++]=data;
            kosong=false;
            if(pos==max_data){
                penuh=true;
            }
            System.out.println("Data Sudah Ditambahkan");
        }else{
            System.out.println("Stack Sudah Penuh");
        }
        System.out.println("==================================================");
        return; 
    }
    
    public int pop(){//membuat methodyang bernama pop
        int x=0;
        System.out.println("Hasil : ");//mendeklarasikan variabel adari item untuk menampung array
       //mengecek apakah array masih kosong
        if (!isKosong()) {
            x=item[--pos];
            penuh=false;
            //untuk menampilkan data pada pos
            //dan item tersebut pada index ke berapa
            System.out.println("Data yang di Pop adalah "+item[pos]);
            System.out.println("Keterangan : ");
            item[pos]=0;
            if(pos==0){//jika pos sama dengan 0
                kosong=true;//maka kosong sama dengan true
                //menampilkan data 
                System.out.println("Stack Kosong");
            }else{
                System.out.println("Data sudah di ambil");//menampilkan jika datanya sudah diambil
            }
        }else{
            //menampilkan jika datanya masih kosong
            System.out.println("Stack Masih Kosong : \n");
        }
        System.out.println("==================================================");
        return(x); 
    }
    
    public void display(){//membuat variabel display
        //menampilkan data dari stuck
        System.out.println("Isi stuck adalah");
        //selanjutnya membuat perulangan
        for (int i = 0; i < pos; i++) {
            //menampilkan data dari perulagan 
            System.out.println("Node"+(1+i)+" : "+item[i]+"");
        }
        //menampilkan data
        System.out.println("==================================================");
        System.out.println("\n");     
    }
}
// jika progam ini semua sudah selesai langkah selanjutnya yaitu dengan membuat class baru yang bernama main agar progam ini
//nantinya dapat berjalan dengan baik

