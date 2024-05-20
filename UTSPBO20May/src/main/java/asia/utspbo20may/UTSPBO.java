/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.utspbo20may;
import java.util.Scanner;

/**
 *
 * @author A-15
 */
public class UTSPBO {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String pembatas = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
            System.out.println(pembatas);
            System.out.println("\t \t UTS 20 Mei oleh \n \t  ANANTA DEVA - NIM 23201254");
            System.out.println(pembatas);
            
            // Meminta pengguna memasukkan nama
            System.out.println("Masukkan nama: ");
            String nama = scanner.nextLine();
            
            // Meminta pengguna memilih jenis kelamin
            System.out.println("Pilih jenis kelamin:");
            System.out.println("1. Laki-laki");
            System.out.println("2. Perempuan");
            System.out.println("Masukkan pilihan (1 atau 2): ");
            int pilihanKelamin = scanner.nextInt();
            scanner.nextLine();
            
            String panggilan = "";
            switch (pilihanKelamin) {
                case 1:
                    panggilan = "Mas";
                    break;
                case 2:
                    panggilan = "Mbak";
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    return;
            }
            
            // Menampilkan sapaan
            System.out.println("Selamat Datang " + panggilan + " " + nama);
            
            // Memulai kalkulator
            System.out.println("Kalkulator:");
            
            boolean lanjutkan = true;
            while (lanjutkan) {
                double bilangan1 = 0;
                double bilangan2 = 0;
                
                // Meminta input bilangan 1 dengan validasi
                boolean validInput = false;
                while (!validInput) {
                    System.out.println("Masukkan bilangan 1: ");
                    if (scanner.hasNextDouble()) {
                        bilangan1 = scanner.nextDouble();
                        validInput = true;
                    } else {
                        System.out.println("Input tidak valid. Masukkan bilangan sesuai tipe data yang telah diinisialisasi (double).");
                        scanner.next(); 
                    }
                }
                
                // Meminta input bilangan 2 dengan validasi
                validInput = false;
                while (!validInput) {
                    System.out.println("Masukkan bilangan 2: ");
                    if (scanner.hasNextDouble()) {
                        bilangan2 = scanner.nextDouble();
                        validInput = true;
                    } else {
                        System.out.println("Input tidak valid. Masukkan bilangan sesuai tipe data yang telah diinisialisasi (double).");
                        scanner.next(); 
                    }
                }
                
                // Meminta input operator matematika
                System.out.println("Pilih operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);
                
                double hasil = 0;
                boolean validOperator = true;
                
                switch (operator) {
                    case '+':
                        hasil = bilangan1 + bilangan2;
                        break;
                    case '-':
                        hasil = bilangan1 - bilangan2;
                        break;
                    case '*':
                        hasil = bilangan1 * bilangan2;
                        break;
                    case '/':
                        if (bilangan2 != 0) {
                            hasil = bilangan1 / bilangan2;
                        } else {
                            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                            validOperator = false;
                        }
                        break;
                    default:
                        System.out.println("Operator tidak valid. Pilih operator yang valid.");
                        validOperator = false;
                }
                
                // Jika operator valid, tampilkan hasil
                if (validOperator) {
                    System.out.println("Hasil: " + hasil);
                }
                
                // Meminta pengguna apakah ingin melanjutkan
                validInput = false;
                while (!validInput) {
                    System.out.println("Apakah anda ingin melanjutkan (y/n)? ");
                    String pilihan = scanner.next().toLowerCase();
                    scanner.nextLine(); 
                    switch (pilihan) {
                        case "y":
                            validInput = true;
                            break;
                        case "n":
                            validInput = true;
                            lanjutkan = false;
                            break;
                        default:
                            System.out.println("Masukkan pilihan yang benar!");
                            break;
                    }
                }
            }
            // Mengakhiri program
            System.out.println("Thank you for using the calculator. Goodbye!");
        }
    }
  }

