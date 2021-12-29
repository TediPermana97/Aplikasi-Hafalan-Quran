package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AnnasQuestionsBank_114 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat An-Nas sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat An-Nas?",
            "3. Bacakanlah ayat ke-5 dari surat An-Nas ?",
            "4. Bacakanlah ayat ke-6 dari surat An-Nas",
            "5. Bacakanlah ayat ke-2 dari surat An-Nas?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 6 ayat", "B. 5 ayat", "C. 4 ayat", "D. 10 ayat"},
            {"A. قُلْ أَعُوذُ بِرَبِّ النَّاسِ", "B. إِلٰهِ النَّاسِ", "C. الَّذِى يُوَسْوِسُ فِى صُدُورِ النَّاسِ", "D. مِنَ الْجِنَّةِ وَالنَّاسِ"},
            {"A. مَلِكِ النَّاسِ ", "B. الَّذِى يُوَسْوِسُ فِى صُدُورِ النَّاسِ", "C. مِنَ الْجِنَّةِ وَالنَّاسِ", "D. قُلْ أَعُوذُ بِرَبِّ النَّاسِ "},
            {"A. مَلِكِ النَّاسِ ", "B. إِلٰهِ النَّاسِ", "C. مِنَ الْجِنَّةِ وَالنَّاسِ", "D. قُلْ أَعُوذُ بِرَبِّ النَّاسِ"},
            {"A. مَلِكِ النَّاسِ ِ", "B. إِلٰهِ النَّاسِ", "C. مِنَ الْجِنَّةِ وَالنَّاسِ", "D. قُلْ أَعُوذُ بِرَبِّ النَّاسِ "}
    };

    private String mCorrectAnswers[] = {"A. 6 ayat", "B. إِلٰهِ النَّاسِ", "B. الَّذِى يُوَسْوِسُ فِى صُدُورِ النَّاسِ", "C. مِنَ الْجِنَّةِ وَالنَّاسِ", "A. مَلِكِ النَّاسِ "};

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
