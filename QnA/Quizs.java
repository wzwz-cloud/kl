package QnA;

public class Quizs {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.add(new Question("What is the chemical symbol for water?", "h2o"));
        quiz.add(new Question("Which planet is known as the Red Planet?", "mars"));
        quiz.add(new Question("Who wrote 'Hamlet'?", "shakespeare"));
        quiz.add(new Question("What is 12 multiplied by 8?", "96"));
        quiz.add(new Question("Which continent is Egypt located in?", "africa"));

        quiz.giveQuiz();
    }
}


