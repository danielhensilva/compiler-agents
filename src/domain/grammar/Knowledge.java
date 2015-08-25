package domain.grammar;

public class Knowledge {

    private String description;

    private Question question;

    public Knowledge() {

    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Question getQuestion() {
        return this.question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
