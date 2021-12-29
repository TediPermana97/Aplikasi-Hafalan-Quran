package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AllahabQuestionsBank_111 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Lahab sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Lahab?",
            "3. Bacakanlah ayat ke-2 dari surat Al-Lahab?",
            "4. Bacakanlah ayat ke-5 dari surat Al-Lahab",
            "5. Bacakanlah ayat ke-1 dari surat Al-Lahab?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 6 ayat", "B. 5 ayat", "C. 9 ayat", "D. 10 ayat"},
            {"A. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ", "B. مَآ أَغْنَىٰ عَنْهُ مَالُهُۥ وَمَا كَسَبَ ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ"},
            {"A. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ", "B. مَآ أَغْنَىٰ عَنْهُ مَالُهُۥ وَمَا كَسَبَ ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ"},
            {"A. فِى جِيدِهَا حَبْلٌ مِّن مَّسَدٍۭ", "B. مَآ أَغْنَىٰ عَنْهُ مَالُهُۥ وَمَا كَسَبَ ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ"},
            {"A. فِى جِيدِهَا حَبْلٌ مِّن مَّسَدٍِۭ", "B. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ"}
    };

    private String mCorrectAnswers[] = {"B. 5 ayat", "D. سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ", "B. مَآ أَغْنَىٰ عَنْهُ مَالُهُۥ وَمَا كَسَبَ ", "A. فِى جِيدِهَا حَبْلٌ مِّن مَّسَدٍۭ", "B. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ "};

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
