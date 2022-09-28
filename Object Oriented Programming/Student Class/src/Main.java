public class Main {
    public static void main(String[] args) {


        Subject s1[] = new Subject[3];
        s1[0] = new Subject("s101", "DS", 100);
        s1[1] = new Subject("s102", "Algorithms", 100);
        s1[2] = new Subject("s103", "Operating Systems", 100);

        for(int i=0 ; i< s1.length ; i++){
            System.out.println( s1[i].getSubName() );
            System.out.println( s1[i].getMaxMarks() );
        }
        System.out.println();

        s1[0].setMarksObtain(85);
        s1[1].setMarksObtain(85);
        s1[2].setMarksObtain(85);

//        for(Subject s:s1)
//            System.out.println(s);


        Student st1 = new Student(101,"Raj");

        int[] marks = new  int[s1.length];
        for (int i=0 ; i<marks.length ; i++){
            marks[i]=s1[i].getMarksObtain();
        }

        st1.setMarks(marks);

        System.out.println();
        System.out.println("Student Marks Report :  ");
        for (int i=0 ; i<marks.length ; i++){
            System.out.println(s1[i].getSubName() +"    =   "+marks[i]);
        }


    }

    }

