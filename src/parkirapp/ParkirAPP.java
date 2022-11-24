 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkirapp;

import parkirapp.*;
import java.util.Scanner;

public class ParkirAPP {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        LinkedQueue lq = new LinkedQueue();

        System.out.println("Selamat Datang Di Aplikasi ParkirKu\n");
        char ch;
        System.out.println("Opsi :");
        System.out.println("1. Kendaraan masuk");
        System.out.println("2. Kendaraan keluar");
        System.out.println("3. Cek parkir");
        System.out.println("4. Jumlah parkir terisi");
        do
        {
            System.out.print("Inputkan pilihan  : ");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                        int i,j;
                        String kendaraan[][] = new String[20][5];

                        for(i = 0; i < 1; i++)
                        {
                            System.out.println("");
                            System.out.println("Inputkan data parkir");
                            for(j = 0;j < 5;j++) {      
                                switch (j) {
                                    case 0 :
                                        System.out.print("No tempat parkir : ");
                                        break;
                                    case 1 :
                                        System.out.print("Tipe kendaraan   : ");
                                        break;
                                    case 2 :
                                        System.out.print("Plat (xx-xxxx-xx): ");
                                        break;
                                    case 3 :
                                        System.out.print("Jam masuk parkir : ");
                                        break;
                                    case 4 :
                                        System.out.print("Biaya parkir     : ");
                                        break;
                                }
                                System.out.print("");
                                kendaraan[i][j] = scan.next();
                            }
                        }
                    System.out.println("");
                    String park = kendaraan[0][0]+"\t\t"+kendaraan[0][1]+"\t\t"+kendaraan[0][2]+"\t"+kendaraan[0][3]+"\t\t"+kendaraan[0][4];
                    lq.insert(park);
                    i = 0;
                    j = 0;
                    break;
                case 2:
                    try
                    {
                        System.out.println("Data kendaraan yang baru saja keluar");
                        lq.remove();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Status parkir kosong? " + lq.isEmpty());
                    break;

                case 4:
                    System.out.println("Jumlah kendaraan yang parkir = " + lq.getSize());
                    break;

                default:
                    System.out.println("Inputan salah \n ");
                    break;
            }
            // display queue     
            lq.display();

            System.out.print("\nApakah ingin lanjut? (Input y atau n) : ");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
    }
}
