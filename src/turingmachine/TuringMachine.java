package turingmachine;

import java.util.Scanner;

public class TuringMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        pertambahan plus = new pertambahan();
        pengurangan minus = new pengurangan();
        perkalian kali = new perkalian();
        pembagian bagi = new pembagian();
        factorial factor = new factorial();
        do{
            System.out.println("Turing Machine \n"+ //digakan dalam running program yang digunakan untuk memilih menu
                    "1. Pertambahan\n"
                    + "2. Pengurangan\n"
                    + "3. Perkalian\n"
                    + "4. Pembagian\n"
                    + "5. Factorial\n"
                    + "6. Keluar\n");
           
            System.out.print("Masukkan pilihan : "); //user menginputkan pilihan
            int pilihan = in.nextInt(); //disimpan di sini
            System.out.println("");
            switch (pilihan){//berisi case-case pilihan
                case 1 :{
                    System.out.print("Masukkan angka pertama : ");
                    int angka1 = in.nextInt();
                    System.out.print("Masukkan angka kedua : ");
                    int angka2 = in.nextInt();
                    plus.add(angka1, angka2);
                    break;
                }
                case 2 :{
                    System.out.print("Masukkan angka pertama : ");
                    int angka1 = in.nextInt();
                    System.out.print("Masukkan angka kedua : ");
                    int angka2 = in.nextInt();
                    minus.subt(angka1, angka2);
                    break;
                }
                case 3 :{
                    System.out.print("Masukkan angka pertama : ");
                    int angka1 = in.nextInt();
                    System.out.print("Masukkan angka kedua : ");
                    int angka2 = in.nextInt();
                    kali.multi(angka1, angka2);
                    break;
                }
                case 4 :{
                    System.out.print("Masukkan angka pertama : ");
                    int angka1 = in.nextInt();
                    System.out.print("Masukkan angka kedua : ");
                    int angka2 = in.nextInt();
                    bagi.div(angka1, angka2);
                    break;
                }
                case 5 :{
                    System.out.print("Masukkan angka : ");
                    int angka1 = in.nextInt();
                    factor.faktorial(angka1);
                    break;
                }
                case 6 :{
                    System.out.println("Terimakasih");
                    System.exit(0);
                }
                default :{ 
                    System.out.println("Pilih 1 sampai 6!\n");
                    break;
                }
            }
        }while (true);
    }
    
}
