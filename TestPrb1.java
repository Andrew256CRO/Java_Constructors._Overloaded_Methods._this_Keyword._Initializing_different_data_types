public class TestPrb1 {

    public static void main(String[] args) {

        //Student s1=new Student();//constructor implicit
        /*Student s1=new Student("Andrei", 2002);
        Student s2=new Student(102948594, "Tudor");
        Student s3=new Student(198148245, "Alex", 2005);
        Student s4=new Student(s1);
        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();*/

        Grupa grupa = new Grupa();

        Student s1 = new Student("Andrei", 2002);
        Student s2 = new Student(102948594, "Tudor");
        Student s3 = new Student(198148245, "Alex", 2005);
        Student s4 = new Student("Maria", 2000);

        grupa.add(s1, 0);
        grupa.add(s2, 1);
        grupa.add(s3, 2);
        grupa.add(s4, 0); // Suprascrie studentul de pe poziția 0 cu s4

        grupa.print();
    }
}
