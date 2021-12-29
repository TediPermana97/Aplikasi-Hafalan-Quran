package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlalaQuestionsBank_86 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-A'la sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-A'la?",
            "3. Bacakanlah ayat ke-10 dari surat Al-A'la?",
            "4. Bacakanlah ayat ke-15 dari surat Al-A'la",
            "5. Bacakanlah ayat ke-19 dari surat Al-A'la  ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 17 ayat", "B. 28 ayat", "C. 15 ayat", "D. 32 ayat"},
            {"A. وَالَّذِىٓ أَخْرَجَ الْمَرْعَىٰ ", "B. وَنُيَسِّرُكَ لِلْيُسْرَىٰ", "C. سَنُقْرِئُكَ فَلَا تَنسَىٰٓ ", "D. وَالَّذِى قَدَّرَ فَهَدَىٰ "},
            {"A. وَنُيَسِّرُكَ لِلْيُسْرَىٰ", "B. فَذَكِّرْ إِن نَّفَعَتِ الذِّكْرَىٰ ", "C. وَيَتَجَنَّبُهَا الْأَشْقَى", "D. سَيَذَّكَّرُ مَن يَخْشَىٰ"},
            {"A. وَذَكَرَ اسْمَ رَبِّهِۦ فَصَلَّىٰ", "B. وَيَتَجَنَّبُهَا الْأَشْقَى", "C. وَالَّذِى قَدَّرَ فَهَدَىٰ", "D. وَالْءَاخِرَةُ خَيْرٌ وَأَبْقَىٰٓ"},
            {"A. سَيَذَّكَّرُ مَن يَخْشَىِٰ", "B. صُحُفِ إِبْرٰهِيمَ وَمُوسَىٰ ", "C. وَالَّذِى قَدَّرَ فَهَدَىٰ ", "D. وَذَكَرَ اسْمَ رَبِّهِۦ فَصَلَّىٰ"}
    };

    private String mCorrectAnswers[] = {"A. 17 ayat", "D. وَالَّذِى قَدَّرَ فَهَدَىٰ ", "D. سَيَذَّكَّرُ مَن يَخْشَىٰٰ", "A. وَذَكَرَ اسْمَ رَبِّهِۦ فَصَلَّىٰٰ", "B. صُحُفِ إِبْرٰهِيمَ وَمُوسَىٰ "};

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
