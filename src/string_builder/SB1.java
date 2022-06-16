package string_builder;

import java.util.Scanner;

public class SB1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Bishkek");
        System.out.println(sb2.capacity());// 16+7 пустой плюс 7 букв Бишкеке

        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb3.capacity());// capacity это вместимость пустого стрингБилдера
                                //             123456789012345678901234567890123456789012345678901234567890
        StringBuilder sb4 = new StringBuilder("KyrgyzstanBishkek312KyrgyzstanBishkek312KyrgyzstanBishkek312");
        System.out.println(sb4.capacity()); // olddcapacity +1)*2

        StringBuilder sb5 = new StringBuilder("12345");
        System.out.println(sb5.capacity());
        sb5.append("00000000000000000"); // соединят
        System.out.println(sb5);
        System.out.println(sb5.capacity());
        sb5.append("11111111111111111111111111111"); // 22 --> 44
        System.out.println(sb5.capacity());

        StringBuilder sb10 = new StringBuilder("hi");
        System.out.println(sb10.capacity());
        sb10.append("salam");
        sb10.append("paplam");
        System.out.println(sb10.capacity());








    }
}
