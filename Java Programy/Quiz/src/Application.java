import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println("Witamy w naszym quizie! Wybierz co chcesz zrobić: " + "\n1. Nowy quiz" + "\n2. Lista wyników" + "\n0. Wyjście");
        do {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("NOWY QUIZ");
                    Quiz quiz = new Quiz();
                    List<Question> questions = Quiz.readAllQuestions();
                        List<Question> oneQuestion Quiz.readOneQuestion(questions);
                    break;
                }
                case 2: {
                    System.out.println("Wyniki: ");
                    List<String> ranking = Quiz.getRanking();
                    if(ranking != null){
                    for(String wynik : ranking){
                        System.out.println(wynik);
                    }
                    }else{
                        System.out.println("Brak wyników");
                    }
                    break;
                }
                case 0: {
                    System.out.println("Dziękujemy za grę, zapraszamy ponownie!");
                    flag = true;
                    break;
                }
                default: {
                    System.out.println("Nie wybrałeś żadnej opcji, spróbuj ponownie");
                    break;
                }
            }
        } while (!flag);
    }
}
