import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    static int flag=0;
    static int asd(){
        System.out.println("Выбор класса");
        Scanner in1 = new Scanner(System.in);
        flag = in1.nextInt();
        flag --;
        return flag;
    }

    public static void main(String[] args) {
        List<Pupil> pupil = new ArrayList<>();
        pupil.add(new Student("Smirnov",1,1));
        pupil.add(new Schoolboy("Golyachenkov",1,1));

       /* var st = new Schoolboy("Smirnov", 1, 1);*/
        Scanner in = new Scanner(System.in);
        String s = "";

        while(!"11".equals(s)) {
            System.out.println("0 - Вывод класса");
            System.out.println("1 - Вывод Фамилии");
            System.out.println("2 - Изменение Фамилии");
            System.out.println("3 - Изменение значения элемента массива Оценок");
            System.out.println("4 - Вывод массива Оценок");
            System.out.println("5 - Изменение значения элемента массива Предметов");
            System.out.println("6 - Вывод массива Предметов");
            System.out.println("7 - добавления предмета и оценки в соответствующие массивы");
            System.out.println("8 - получение размера массивов");
            System.out.println("11 - EXIT");
            System.out.print("=> ");
            s = in.nextLine();

            var x = Integer.parseInt(s);
            switch(x) {
                case 0:
                    pupil.get(0).FalenameOut();
                    pupil.get(1).FalenameOut();
                    asd();
                case 1:
                    pupil.get(flag).FalenameOut();
                    break;
                case 2:
                    pupil.get(flag).FilenameMod();
                    break;
                case 3:
                    pupil.get(flag).MarksMod();
                    break;
                case 4:
                    pupil.get(flag).MarksOut();
                    break;
                case 5:
                    pupil.get(flag).SubjectsMod();
                    break;
                case 6:
                    pupil.get(flag).SubjectsOut();
                    break;
                case 7:
                    pupil.get(flag).MarksSubjectsAdd();
                    break;
                case 8:
                    pupil.get(flag).ArrLength();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("No such menu");
            }
        }

    }
}
