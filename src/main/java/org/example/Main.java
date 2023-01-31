package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        double price=input.nextDouble();

        System.out.println("Kart No Giriniz: ");
        String cardNumber=input.next();

        System.out.println("Son kullanma tarihi giriniz: ");
        String expireDate=input.next();

        System.out.println("Cvc giriniz: ");
        String cvc=input.next();

        System.out.println("1 A bankası");
        System.out.println("2 B bankası");
        System.out.println("3 C bankası");
        System.out.println("4 D bankası");
        System.out.println("Bir banka seçin: ");
        int selectBank=input.nextInt();
        switch (selectBank){
            case 1:
                ABankasi aBankasi=new ABankasi("A Bankası","5","1234");
                aBankasi.connect();
                aBankasi.payment(price,cardNumber,expireDate,cvc);
                break;
            case 2:
                BBankasi bBankasi=new BBankasi("B Bankası","10","123456");
                bBankasi.connect();
                bBankasi.payment(price,cardNumber,expireDate,cvc);
                break;
            default:
                System.out.println("Lütfen geçerli bir banka seçimi yapın.");
        }
    }
}