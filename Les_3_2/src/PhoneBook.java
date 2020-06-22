import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    private List<Note> subscribers;

    public PhoneBook() {
        subscribers = new LinkedList<>();
    }


    void add(Note note) {
        subscribers.add(note);
    }

    LinkedList<String> get(String surname) {
        LinkedList<String> ls= new LinkedList<>();
        for (Note note : subscribers){
            if(note.getSurname().equals(surname)){
                ls.add(note.getCell());
            }
        }
        return ls;
    }

    void showPhoneBook() {
        for (Note note : subscribers) {
            System.out.printf("%s %s \n", note.getSurname(), note.getCell());
        }
    }
}
