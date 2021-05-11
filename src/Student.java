import java.util.*;

public class Student implements Pupil {
    private String Falename;
    private int[][] Marks;
    private String[] Subjects;

    Student(String f, String[] m, int[][] s) {
        this.Falename = f;
        this.Marks = s;
        this.Subjects = m;
    }

    public void FalenameOut() {
        System.out.println(this.Falename);
    }

    public void FilenameMod() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод Фамилии: ");
        this.Falename = in.next();
    }

    public void MarksMod(){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Ввод [num] elements modification: ");
            int num = in.nextInt();
            int bez=0;
            for (int i=0;i<this.Marks[num].length;++i){
                if (this.Marks[num][i]!=0){
                    bez++;
                }
            }
            System.out.println("Ввод element modification: ");
            for (int i=0;i<bez;++i){
                int elem = in.nextInt();
                this.Marks[num][i] = elem;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за границы массива оценок, в массиве " +this.Marks.length +" элемент(ов)");
        }
    }

    public void MarksOut() {
        int[][] var1 = this.Marks;
        for (int i = 0; i < var1.length; i++) {
            for (int j = 0; j < var1[i].length; j++) {
                if(var1[i][j]!=0)
                System.out.print(var1[i][j] + " ");
            }
            System.out.println();
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
        for(int i = 0; i < this.Subjects.length; ++i) {
            System.out.println(var1[i]);
        }
    }

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
        int[][] new_arrMarks = new int[arrMarks.length + this.Marks.length][];
        System.arraycopy(arrMarks, 0, new_arrMarks, 0, arrMarks.length);
        System.arraycopy(this.Marks, 0, new_arrMarks, arrMarks.length, this.Marks.length);
        this.Marks = Arrays.copyOf(new_arrMarks, new_arrMarks.length);
        String[] new_arrSubjects = new String[arrSubjects.length + this.Subjects.length];
        System.arraycopy(arrSubjects, 0, new_arrSubjects, 0, arrSubjects.length);
        System.arraycopy(this.Subjects, 0, new_arrSubjects, arrSubjects.length, this.Subjects.length);
        this.Subjects = (String[])Arrays.copyOf(new_arrSubjects, new_arrSubjects.length);
    }

    public void ArrLength() {
        System.out.print("Subjects length: ");
        System.out.println(this.Subjects.length);

        for(int i = 0; i < Marks.length; ++i) {
            System.out.print(" Marks length " + i + " : ");
            int sum=0;
            for (int j = 0; j < Marks[i].length; ++j) {
                if(Marks[i][j]!=0){sum++;}
            }
                System.out.println(sum);
        }
    }
}