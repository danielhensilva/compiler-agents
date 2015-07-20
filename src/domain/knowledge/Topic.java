package knowledge;

public class Topic {

    private String title;

    private String body;

    private String question;

    private List<Path> paths;

    public Topic(String title, String body, String question) {
        this.title = title;
        this.body = body;
        this.question = question;
    }

    public void add(Path path) {
        if (this.paths == null)
            this.paths = new List<>();

        this.paths.add(path);
    }

}