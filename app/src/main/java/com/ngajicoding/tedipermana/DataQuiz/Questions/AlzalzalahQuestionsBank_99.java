package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlzalzalahQuestionsBank_99 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Zalzalah sebutkan?",
            "2. Bacakanlah ayat ke-4 dari surat Al-Zalzalah?",
            "3. Bacakanlah ayat ke-6 dari surat Al-Zalzalah?",
            "4. Bacakanlah ayat ke-7 dari surat Al-Zalzalah",
            "5. Bacakanlah ayat ke-2 dari surat Al-Zalzalah?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 8 ayat", "B. 9 ayat ", "C. 10 ayat ", "D. 12 ayat "},
            {"A. إِذَا زُلْزِلَتِ الْأَرْضُ زِلْزَالَهَا", "B. يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا", "C. وَقَالَ الْإِنسٰنُ مَا لَهَا", "D. وَقَالَ الْإِنسٰنُ مَا لَهَا "},
            {"A. إِذَا زُلْزِلَتِ الْأَرْضُ زِلْزَالَهَا ", "B. يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا", "C. يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِّيُرَوْا۟ أَعْمٰلَهُمْ ُ", "D. يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَاْ"},
            {"A. إفَمَن يَعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَرَهُۥ  ", "B. يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا", "C. يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِّيُرَوْا۟ أَعْمٰلَهُمْ ", "D.يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا"},
            {"A. إفَمَن يَعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَرَهُۥ ِ", "B. يوَأَخْرَجَتِ الْأَرْضُ أَثْقَالَهَا", "C. يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِّيُرَوْا۟ أَعْمٰلَهُمْ ", "D. يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا"}
    };

    private String mCorrectAnswers[] = {"A. 8 ayat", "B. يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا", "D. يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِّيُرَوْا۟ أَعْمٰلَهُمْ", "A.إفَمَن يَعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَرَهُۥ", "B. يوَأَخْرَجَتِ الْأَرْضُ أَثْقَالَهَا"};

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
