import java.util.Scanner;

public class artikYilOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        boolean artik = false;

        System.out.println("Yıl giriniz :");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            } else
                artik = true;
        } else
            artik = false;

        if (artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");
    }
}


