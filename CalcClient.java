
package CalcRMI;


import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{
        Scanner sc = new Scanner(System.in);

        try {
            CalcInt c = (CalcInt)Naming.lookup("rmi://localhost:1099/Calculator");
            System.out.println("Client terhubung ke server");
            System.out.println("Silahkan pilih perintah yang akan anda pilih :\n"
                    +"1. Tambah\n"
                    +"2. Kurang\n"
                    +"3. Kali\n"
                    +"4. Bagi");
            int choice = sc.nextInt();
        int x,y;
        switch (choice)
        {
            case 1:
            {
                System.out.println("Masukan x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.add(x, y));
                break;
            }
            case 2:
            {
                System.out.println("Masukan x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.sub(x, y));
                break;
            }
            case 3:
            {
                System.out.println("Masukan x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.mul(x, y));
                break;
            }
            case 4:
            {
                System.out.println("Masukan x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.div(x, y));
                break;
            }

        }

        } catch (Exception e) {
        }

    }
}
