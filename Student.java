public class Student {

    long numarMatricol=0;
    String numeStudent;
    int anStudiu=1;

    Student(String str, int an){// constructor explicit
        System.out.println("Constrcutor(String, int)");
        this.numeStudent=str;
        this.anStudiu=an;
    }

    Student(long numarMatricol, String str){
        System.out.println("Constructor(long, String)");
        this.numarMatricol=numarMatricol;
        this.numeStudent=str;
    }

    Student(long numarMatricol, String str, int anStudiu){
        System.out.println("Constructor(long, String, int)");
        this.numarMatricol=numarMatricol;
        this.numeStudent=str;
        this.anStudiu=anStudiu;
    }

    //Student(long, String, int)
    Student(Student s){//constructor de copiere
        this(s.numarMatricol, s.numeStudent, s.anStudiu);//mereu pe prima linie
        //this.numarMatricol=s.numarMatricol;
        //this.anStudiu=s.anStudiu;
        //this.numeStudent=s.numeStudent;
        System.out.println("Constructor de copiere");
    }

    void printStudent() {
        System.out.println("Nume student :"+ numeStudent);
        System.out.println("Numar matricol:" +numarMatricol);
        System.out.println("An de studiu" +anStudiu);
        System.out.println(this.isValidStudent(this));

    }

    boolean isValidStudent(Student s){
        if(s.anStudiu==1 || s.numarMatricol==0 || s.numeStudent==null)
            return false;
        return true;}
}
