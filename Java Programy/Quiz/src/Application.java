import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean flag = false;
        do {
            System.out.println();
            System.out.println("Witamy w naszym quizie! Wybierz co chcesz zrobić: " + "\n1. Nowy quiz" + "\n2. Lista wyników" + "\n0. Wyjście");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int counter = 0;
                    System.out.println("NOWY QUIZ");
                    Quiz quiz = new Quiz();
                    List<Question> questions = Quiz.readAllQuestions();
                    for (int i = 0; i < questions.size(); i++) {
                        System.out.println("Pytanie nr: " + (i+1));
                        Question que = questions.get(i);
                        System.out.println(questions.get(i));
                        System.out.println("Podaj odpowiedz: ");
                        String d = sc.next();
                        System.out.println("Odpowiedź to: " + d + "\nPrawidłowa odpowiedź: " + questions.get(i).getCorrectAnswer());
                        if(d.equals(questions.get(i).getCorrectAnswer())){
                            counter++;
                        }

                    }
                    System.out.println("Lista prawidłowych odpowiedzi: " + counter+"/"+questions.size());


                    break;
                }
                case 2: {
                    System.out.println("Wyniki: ");
                    List<String> ranking = Quiz.getRanking();
                    if (ranking != null) {
                        for (String wynik : ranking) {
                            System.out.println(wynik);
                        }
                    } else {
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
