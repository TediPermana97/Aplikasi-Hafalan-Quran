package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AladiatQuestionsBank_100 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Adiyat sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Adiyat?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Adiyat?",
            "4. Bacakanlah ayat ke-7 dari surat Al-Adiyat",
            "5. Bacakanlah ayat ke-1 dari surat Al-Adiyat?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 11 ayat", "B. 10 ayat", "C. 14 ayat", "D. 16 ayat"},
            {"A. فَالْمُورِيٰتِ قَدْحًا", "B. فَوَسَطْنَ بِهِۦ جَمْعًا", "C. فَالْمُغِيرٰتِ صُبْحًا", "D. وَإِنَّهُۥ عَلَىٰ ذٰلِكَ لَشَهِيدٌ"},
            {"A. فَوَسَطْنَ بِهِۦ جَمْعًا", "B.َالْمُغِيرٰتِ صُبْحًا", "C. فَالْمُغِيرٰتِ صُبْحًا", "D. وَإِنَّهُۥ عَلَىٰ ذٰلِكَ لَشَهِيدٌ"},
            {"A. فَوَسَطْنَ بِهِۦ جَمْعًا", "B.َالْمُغِيرٰتِ صُبْحًا", "C.فَالْمُغِيرٰتِ صُبْحًا", "D.وَإِنَّهُۥ عَلَىٰ ذٰلِكَ لَشَهِيدٌ"},
            {"A. فَوَسَطْنَ بِهِۦ جَمْعًاِ", "B.َالْمُغِيرٰتِ صُبْحًا", "C. فَالْمُغِيرٰتِ صُبْحًا", "D.وَالْعٰدِيٰتِ ضَبْحًا"}
    };

    private String mCorrectAnswers[] = {"A. 11 ayat", "C. َالْمُغِيرٰتِ صُبْحًا", "A. فَوَسَطْنَ بِهِۦ جَمْعًا", "D. وَإِنَّهُۥ عَلَىٰ ذٰلِكَ لَشَهِيدٌ", "D. وَالْعٰدِيٰتِ ضَبْحًا "};

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
