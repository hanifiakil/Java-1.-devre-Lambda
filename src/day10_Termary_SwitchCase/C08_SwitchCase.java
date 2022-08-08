package day10_Termary_SwitchCase;

import java.util.Scanner;

public class C08_SwitchCase {
    public static void main(String[] args) {
        //gün numarasına göre hafta içi yada hafta sonu yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen gün sayısını giriniz");

        int günsayısı=scan.nextInt();

        switch (günsayısı) {
            case 1:
                case 2:
                    case 3:
                        case 4:
                            case 5:
                                System.out.println("hafta içi");
                                break;
            case 6: case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("baba yapma hafta yedi gün");




        }
    }
}
