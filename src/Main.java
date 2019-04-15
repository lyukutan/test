import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        double osnovnoi = 1800000.00;
        double stavka = 0.093;
        double platezh = 25000;
        double procent;
        int count = 0;
        double pereplata = 0.00;
        double strahovka = 0.00;
        while (osnovnoi > 0.00){
            if (count % 12 == 0){
                System.out.println("Страховка за "+count / 12+" год: "+osnovnoi * 0.005);
                strahovka += osnovnoi * 0.005;
            }

            procent = (osnovnoi * stavka) / 12;
            double sdacha = platezh - procent;
            osnovnoi -= sdacha;
            count++;
            pereplata += procent;
        }
        System.out.println("В месяцах: "+count);
        System.out.println(count/12+" Лет "+count%12+" месяцев");
        System.out.println("Переплата: "+pereplata);
        System.out.println("Страховка: "+strahovka);

    }
}
