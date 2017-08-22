import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-08-22.
 */
public class Question {
    private String title;
    private List<String> answers = new ArrayList<>();
    private  String correctAnswer;

    public List<String> getAnswers() {
        return answers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(){


    }
}
