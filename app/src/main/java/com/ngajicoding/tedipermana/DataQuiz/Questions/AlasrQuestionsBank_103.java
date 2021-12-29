package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlasrQuestionsBank_103 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Asr sebutkan?",
            "2. Bacakanlah ayat ke-1 dari surat Al-Asr?",
            "3. Manakah yang termasuk ayat surat Al-Asr ?",
            "4. Bacakanlah ayat ke-2 dari surat Al-Asr",
            "5. Manakah yang termasuk ayat surat Al-Asr?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 2 ayat", "B. 3 ayat", "C. 7 ayat", "D. 5 ayat"},
            {"A. وَالۡعَصۡرِۙ", "B. مَا وَدَّعَكَ رَبُّكَ وَمَا قَلَىٰ", "C. وَلَلْءَاخِرَةُ خَيْرٌ لَّكَ مِنَ الْأُولَىٰ", "D. وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰٓ"},
            {"A. وَوَجَدَكَ ضَآلًّا فَهَدَىٰ", "B. وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰٓ", "C. اِنَّ الۡاِنۡسَانَ لَفِىۡ خُسۡرٍٰۙ", "D. وَالَّيْلِ إِذَا سَجَىٰ"},
            {"A. اِنَّ الۡاِنۡسَانَ لَفِىۡ خُسۡر", "B. وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰٓ", "C. اِنَّ الۡاِنۡسَانَ لَفِىۡ خُسۡرٍٰۙ", "D. وَالَّيْلِ إِذَا سَجَىٰ"},
            {"A. وَالۡعَصۡرِۙ", "B. اِنَّ الۡاِنۡسَانَ لَفِىۡ خُسۡرٍٰۙ", "C. وَلَلْءَاخِرَةُ خَيْرٌ لَّكَ مِنَ الْأُولَىٰ", "D. وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰٓ"}
    };

    private String mCorrectAnswers[] = {"B. 3 ayat", "A. وَالۡعَصۡرِۙ", "C. اِنَّ الۡاِنۡسَانَ لَفِىۡ خُسۡر", "A. اِنَّ الۡاِنۡسَانَ لَفِىۡ خُسۡر", "B. اِنَّ الۡاِنۡسَانَ لَفِىۡ خُسۡرٍۙ"};

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
