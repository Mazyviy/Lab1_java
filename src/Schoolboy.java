import java.util.Arrays;
import java.util.Scanner;

public class Schoolboy implements Pupil{

    static class Register{
        public static String Falename;
        public static int[] Marks;
        public static String[] Subjects;
    }

    public Schoolboy(String f, int m, int s) {
        Register.Falename = f;
        Register.Marks = new int[m];
        Register.Subjects = new String[s];
    }

    @Override
    public void FalenameOut() {
        System.out.println(Register.Falename);
    }

    @Override
    public void FilenameMod() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод Фамилии: ");
        Register.Falename = in.next();
    }

    @Override
    public void MarksMod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод [num] elements modification: ");
        int num = in.nextInt();
        System.out.println("Ввод element modification: ");
        int elem = in.nextInt();

        for(int i = 0; i < Register.Marks.length; ++i) {
            if (i == num - 1) {
                Register.Marks[i] = elem;
            }
        }
    }

    @Override
    public void MarksOut() {
        int[] var1 = Register.Marks;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int i = var1[var3];
            System.out.println(i);
        }
    }

    @Override
    public void SubjectsMod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод [num] elements modification: ");
        int num = in.nextInt();
        System.out.println("Ввод element modification: ");
        String elem = in.next();

        for(int i = 0; i < Register.Subjects.length; ++i) {
            if (i == num - 1) {
                Register.Subjects[i] = elem;
            }
        }
    }

    @Override
    public void SubjectsOut() {
        String[] var1 = Register.Subjects;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String i = var1[var3];
            System.out.println(i);
        }
    }

    @Override
    public void MarksSubjectsAdd() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько добавить элементов? : ");
        int koll = in.nextInt();
        int[] arrMarks = new int[koll];
        String[] arrSubjects = new String[koll];
        System.out.printf("%s %d %s", "Ввод", koll, "Оценок: \n");

        int i;
        for(i = 0; i < arrMarks.length; ++i) {
            arrMarks[i] = in.nextInt();
        }

        System.out.printf("%s %d %s", "Ввод", koll, "предметов: \n");

        for(i = 0; i < arrSubjects.length; ++i) {
            arrSubjects[i] = in.next();
        }

        int[] new_arrMarks = new int[arrMarks.length + Register.Marks.length];
        System.arraycopy(arrMarks, 0, new_arrMarks, 0, arrMarks.length);
        System.arraycopy(Register.Marks, 0, new_arrMarks, arrMarks.length, Register.Marks.length);
        Register.Marks = Arrays.copyOf(new_arrMarks, new_arrMarks.length);
        String[] new_arrSubjects = new String[arrSubjects.length + Register.Subjects.length];
        System.arraycopy(arrSubjects, 0, new_arrSubjects, 0, arrSubjects.length);
        System.arraycopy(Register.Subjects, 0, new_arrSubjects, arrSubjects.length, Register.Subjects.length);
        Register.Subjects = (String[])Arrays.copyOf(new_arrSubjects, new_arrSubjects.length);
    }

    @Override
    public void ArrLength() {
        System.out.print("Marks length: ");
        System.out.println(Register.Marks.length);
        System.out.print("Subjects length: ");
        System.out.println(Register.Subjects.length);
    }




}
