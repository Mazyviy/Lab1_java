import java.util.Arrays;
import java.util.Scanner;

public class Student implements Pupil {
    private String Falename;
    private int[] Marks;
    private String[] Subjects;

    Student(String f, int m, int s) {
        this.Falename = f;
        this.Marks = new int[m];
        this.Subjects = new String[s];
    }

    public void FalenameOut() {
        System.out.println(this.Falename);
    }

    public void FilenameMod() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод Фамилии: ");
        this.Falename = in.next();
    }

    public void MarksMod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод [num] elements modification: ");
        int num = in.nextInt();
        System.out.println("Ввод element modification: ");
        int elem = in.nextInt();

        for(int i = 0; i < this.Marks.length; ++i) {
            if (i == num - 1) {
                this.Marks[i] = elem;
            }
        }
    }

    public void MarksOut() {
        int[] var1 = this.Marks;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int i = var1[var3];
            System.out.println(i);
        }

    }

    public void SubjectsMod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод [num] elements modification: ");
        int num = in.nextInt();
        System.out.println("Ввод element modification: ");
        String elem = in.next();

        for(int i = 0; i < this.Subjects.length; ++i) {
            if (i == num - 1) {
                this.Subjects[i] = elem;
            }
        }
    }

    public void SubjectsOut() {
        String[] var1 = this.Subjects;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String i = var1[var3];
            System.out.println(i);
        }
    }

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

        int[] new_arrMarks = new int[arrMarks.length + this.Marks.length];
        System.arraycopy(arrMarks, 0, new_arrMarks, 0, arrMarks.length);
        System.arraycopy(this.Marks, 0, new_arrMarks, arrMarks.length, this.Marks.length);
        this.Marks = Arrays.copyOf(new_arrMarks, new_arrMarks.length);
        String[] new_arrSubjects = new String[arrSubjects.length + this.Subjects.length];
        System.arraycopy(arrSubjects, 0, new_arrSubjects, 0, arrSubjects.length);
        System.arraycopy(this.Subjects, 0, new_arrSubjects, arrSubjects.length, this.Subjects.length);
        this.Subjects = (String[])Arrays.copyOf(new_arrSubjects, new_arrSubjects.length);
    }

    public void ArrLength() {
        System.out.print("Marks length: ");
        System.out.println(this.Marks.length);
        System.out.print("Subjects length: ");
        System.out.println(this.Subjects.length);
    }
}
