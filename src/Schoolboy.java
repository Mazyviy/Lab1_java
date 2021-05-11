import java.util.Arrays;
import java.util.Scanner;

public class Schoolboy implements Pupil{

    static class Register{
        public static String Falename;
        public static int[][] Marks;
        public static String[] Subjects;
    }

    public Schoolboy(String f, int[][] m, String[] s) {
        Register.Falename = f;
        Register.Marks = m;
        Register.Subjects = s;
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
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Ввод [num] elements modification: ");
            int num = in.nextInt();
            int bez=0;
            for (int i=0;i<Register.Marks[num].length;++i){
                if (Register.Marks[num][i]!=0){
                    bez++;
                }
            }
            System.out.println("Ввод element modification: ");
            for (int i=0;i<bez;++i){
                int elem = in.nextInt();
                Register.Marks[num][i] = elem;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за границы массива оценок, в массиве " +Register.Marks.length +" элемент(ов)");
        }
    }

    @Override
    public void MarksOut() {
        int[][] var1 = Register.Marks;
        for (int i = 0; i < var1.length; i++) {
            for (int j = 0; j < var1[i].length; j++) {
                if(var1[i][j]!=0)
                    System.out.print(var1[i][j] + " ");
            }
            System.out.println();
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
        for(int i = 0; i < Register.Subjects.length; ++i) {
            System.out.println(var1[i]);
        }
    }

    @Override
    public void MarksSubjectsAdd() {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько добавить элементов? : ");
        int koll = in.nextInt();
        int[][] arrMarks = new int[koll][20];
        String[] arrSubjects = new String[koll];
        System.out.printf("%s %d %s", "Ввод", koll, "предметов: \n");
        for(int i = 0; i < arrSubjects.length; ++i) {
            arrSubjects[i] = in.next();
        }

        System.out.printf("%s %d %s", "Ввод", koll, "Оценок: \n");
        for(int i = 0; i < arrMarks.length; ++i) {
            System.out.printf("%s %d %s", "Ввод оценок к ", i, "предмету: ");
            int qwe= in.nextInt();
            for(int j = 0; j < qwe; ++j) {
                arrMarks[i][j] = in.nextInt();
            }
        }
        int[][] new_arrMarks = new int[arrMarks.length + Register.Marks.length][];
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
        System.out.print("Subjects length: ");
        System.out.println(Register.Subjects.length);

        for(int i = 0; i < Register.Marks.length; ++i) {
            System.out.print(" Marks length " + i + " : ");
            int sum=0;
            for (int j = 0; j < Register.Marks[i].length; ++j) {
                if(Register.Marks[i][j]!=0){sum++;}
            }
            System.out.println(sum);
        }
    }
}