package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlkafirunQuestionsBank_109 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Alkafirun sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Alkafirun?",
            "3. Bacakanlah ayat ke-1 dari suratAl-Alkafirun?",
            "4. Bacakanlah ayat ke-5 dari surat Al-Alkafirun",
            "5. Bacakanlah ayat ke-4 dari surat Al-Alkafirun?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 6 ayat", "B. 7 ayat", "C. 9 ayat", "D. 10 ayat"},
            {"A. قُلْ يٰٓأَيُّهَا الْكٰفِرُونَ", "B. لَكُمْ دِينُكُمْ وَلِىَ دِينِ ", "C. لَآ أَعْبُدُ مَا تَعْبُدُونَ", "D. ووَلَآ أَنتُمْ عٰبِدُونَ مَآ أَعْبُدُ "},
            {"A. قُلْ يٰٓأَيُّهَا الْكٰفِرُونَ", "B. لَكُمْ دِينُكُمْ وَلِىَ دِينِ ", "C. لَآ أَعْبُدُ مَا تَعْبُدُونَ", "D. ووَلَآ أَنتُمْ عٰبِدُونَ مَآ أَعْبُدُ "},
            {"A. قُلْ يٰٓأَيُّهَا الْكٰفِرُونَ", "B. لَكُمْ دِينُكُمْ وَلِىَ دِينِ ", "C. وَلَآ أَنتُمْ عٰبِدُونَ مَآ أَعْبُدُ", "D. ووَلَآ أَنتُمْ عٰبِدُونَ مَآ أَعْبُدُ"},
            {"A. قُلْ يٰٓأَيُّهَا الْكٰفِرُونَِ", "B. وَلَآ أَنَا۠ عَابِدٌ مَّا عَبَدتُّمْ", "C. لَآ أَعْبُدُ مَا تَعْبُدُونَ", "D. ووَلَآ أَنتُمْ عٰبِدُونَ مَآ أَعْبُدُ"}
    };

    private String mCorrectAnswers[] = {"A. 6 ayat", " D. ووَلَآ أَنتُمْ عٰبِدُونَ مَآ أَعْبُدُ ", "A. قُلْ يٰٓأَيُّهَا الْكٰفِرُونَ", " C. وَلَآ أَنتُمْ عٰبِدُونَ مَآ أَعْبُدُ ", "B. وَلَآ أَنَا۠ عَابِدٌ مَّا عَبَدتُّمْ"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
