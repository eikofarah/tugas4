package merchant;
import java.util.Scanner;

import java.util.Scanner;

public class Data {
    static Scanner in = new Scanner(System.in);
    static Merchant[] dag = new Merchant[0];

    public static void tampilData(){
        for (Merchant mch1 : dag){
            System.out.println("---Dagangan UBFood---");
            System.out.println("Nama Merchant   : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHarga());
        }
    }
     public static Merchant[] updateMerchant(Merchant merchant){
        Merchant temp[]=new Merchant[Data.dag.length+1];
        for (int i = 0; i < Data.dag.length; i++){
            temp[i]=Data.dag[i];
        }
        temp[Data.dag.length] = merchant;
        return temp;
    }
     public static Merchant cariMerchant (String nama){
        for (int i = 0; i < Data.dag.length; i++){
            if (nama.equalsIgnoreCase(Data.dag[i].getNamaMerchant())){
                return Data.dag[i];
            }
        }
        return null;
    }
}