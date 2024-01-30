import java.util.Scanner;

public class Zadanie1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // делаем каждую переменную
        System.out.print("введите ваше ФИО");
        String NameSurMiddle = in.nextLine();
        System.out.print("введите сколько вам полных лет");
        int Age = in.nextInt();
        System.out.print("введите ваш рост в см");
        double Length = in.nextDouble();
        System.out.print("являетесь ли вы студентом на бюджетной основе или нет");
        String Free = in.next();
        System.out.print("Являетесь ли особью женского или мужского года");
        String Gender = in.next();
        //выводим все эти переменные
        System.out.printf("ФИО: %s \n",NameSurMiddle);
        System.out.printf("Возраст: %d \n",Age);
        System.out.printf("Рост %.2f \n",Length);
        System.out.printf("Является ли студентом на бюджетной основе: %s \n ",Free);
        System.out.printf("Является особью %s \n",Gender,"пола");
        in.close();
    }
}