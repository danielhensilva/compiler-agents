package domain.grammar;

import utils.*;

public class Evaluation {

    private String question;

    private String anwser;

    private List<String> options;

    private String unknown;

    public Evaluation() {
        this.options = new List<>();
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setAnswer(String anwser) {
        this.anwser = anwser;
    }

    public String getAnswer() {
        return this.anwser;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getOptions() {
        return this.options;
    }

    public String getUnknown() {
        return this.unknown;
    }

    public void setUnknown(String unknown) {
        this.unknown = unknown;
    }

}
