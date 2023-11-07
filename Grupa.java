public class Grupa {

    int nr_Studenti;
    Student[] lista_studenti;

    //Task 1
    Grupa(){
        System.out.println("Constructor initializare pt Grupa");
        nr_Studenti=0;
        //lista_studenti=new Student[0];//initializare cu un masiv gol. Mai bine asa deoarece daca vreau sa mai adaug studenti
        //se poate face usor dinamic(modificare usoara)
        lista_studenti=new Student[5];//dimensiune maxima 5
    }

    //Task 2
    // Metoda pentru adăugarea sau suprascrierea unui student la o anumită poziție
    void add(Student student, int pozitie) {
        if (pozitie < 0 || pozitie >= lista_studenti.length) {
            System.out.println("Pozitie invalida");
        } else {
            lista_studenti[pozitie] = student;
            nr_Studenti++;
        }
    }

    //Task 3
    void print() {
        for (int i = 0; i < lista_studenti.length; i++) {
            if (lista_studenti[i] != null) {
                lista_studenti[i].printStudent();
            }
        }
    }
}
