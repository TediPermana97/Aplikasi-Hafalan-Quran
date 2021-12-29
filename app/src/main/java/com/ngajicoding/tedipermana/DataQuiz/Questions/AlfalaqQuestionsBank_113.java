package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlfalaqQuestionsBank_113 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Falaq sebutkan?",
            "2. Bacakanlah ayat ke-5 dari suratAl-Falaq?",
            "3. Bacakanlah ayat ke-1 dari surat Al-Falaq?",
            "4. Bacakanlah ayat ke-2 dari surat Al-Falaq",
            "5. Bacakanlah ayat ke-4 dari surat Al-Falaq?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 6 ayat", "B. 5 ayat", "C. 4 ayat", "D. 10 ayat"},
            {"A. قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ", "B. مِن شَرِّ مَا خَلَقَ", "C. وَمِن شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ", "D. وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ"},
            {"A. قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ", "B. مِن شَرِّ مَا خَلَقَ", "C. وَمِن شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ", "D. وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ"},
            {"A. قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ", "B. مِن شَرِّ مَا خَلَقَ", "C. وَمِن شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ", "D. وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ"},
            {"A. قُلْ أَعُوذُ بِرَبِّ الْفَلَقِِ", "B. مِن شَرِّ مَا خَلَقَ", "C. وَمِن شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ", "D. وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ"}
    };

    private String mCorrectAnswers[] = {" B. 5 ayat", "D. وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ", "A. قُلْ أَعُوذُ بِرَبِّ الْفَلَقِِ", "B. مِن شَرِّ مَا خَلَقَ", "C. وَمِن شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ"};

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
