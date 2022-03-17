package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3 {

    public static void main(String[] args) {
        String csillagok = "********************";
        String duplaVonal = "====================";
        String szaggatottVonal = "--------------------";
        String rovidVonal = "_______";
        String rovidVonalValaszto = "      ";
        String kiiratas = "%10s: %5d %s\n";
        
        System.out.println(csillagok);
        System.out.printf("%14s\n", "Nyugta 3");
        System.out.println(csillagok);
        
        final String HUF = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        System.out.printf(kiiratas, "Tétel 1", tetel1, HUF);
        System.out.printf(kiiratas, "Tétel 2", tetel2, HUF);
        System.out.printf(kiiratas, "Tétel 3", tetel3, HUF);

        System.out.println(duplaVonal);
        
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf(kiiratas, "Összesen", osszesen, HUF);
        
        System.out.println(szaggatottVonal);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf(kiiratas, "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        System.out.println(duplaVonal);
        
        int fizetendo = osszesen + szervizDij;
        System.out.printf(kiiratas, "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";

        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        System.out.println(szaggatottVonal);
        
        System.out.println("");
        System.out.print(rovidVonal);
        
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        System.out.println(csillagok);    
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }
}