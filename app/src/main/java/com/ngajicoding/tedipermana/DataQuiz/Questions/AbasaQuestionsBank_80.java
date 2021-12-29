package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AbasaQuestionsBank_80 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Abasa sebutkan ?",
            "2. Bacakanlah ayat ke-4 dari surat Abasa ?",
            "3. Bacakanlah ayat ke-15 dari surat Abasa?",
            "4. Bacakanlah ayat ke-30 dari surat Abasa?",
            "5. Bacakanlah ayat ke-10 dari surat Abasa?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 30 ayat", "B. 20 ayat", "C. 42 ayat", "D. 50 ayat"},
            {"A. وَمَا يُدْرِيكَ لَعَلَّهُۥ يَزَّكَّىٰٓ", "B. أَوْ يَذَّكَّرُ فَتَنفَعَهُ الذِّكْرَىٰٓ", "C. وَمَا عَلَيْكَ أَلَّا يَزَّكَّىٰ", "D. وَأَمَّا مَن جَآءَكَ يَسْعَىٰ "},
            {"A. مِنْ أَىِّ شَىْءٍ خَلَقَهُۥ ", "B. بِأَيْدِى سَفَرَةٍ", "ثُمَّ أَمَاتَهُۥ فَأَقْبَرَهُۥ", "بِأَيْدِى سَفَرَةٍ"},
            {"A. وَحَدَآئِقَ غُلْبًا", "B. مَّتٰعًا لَّكُمْ وَلِأَنْعٰمِكُمْ", "C. وَزَيْتُونًا وَنَخْلًا", "D. وَأُمِّهِۦ وَأَبِيهِ"},
            {"A. فَمَن شَآءَ ذَكَرَهُِ", "B. فَأَنتَ عَنْهُ تَلَهَّىٰ", "C. فِى صُحُفٍ مُّكَرَّمَةٍ ", "D. بِأَيْدِى سَفَرَةٍ"}
    };

    private String mCorrectAnswers[] = {"C. 42 ayat", "B. أَوْ يَذَّكَّرُ فَتَنفَعَهُ الذِّكْرَىٰٓ ", "D. بِأَيْدِى سَفَرَةٍ", "A. وَحَدَآئِقَ غُلْبًا", "B. فَأَنتَ عَنْهُ تَلَهَّىٰ"};

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


