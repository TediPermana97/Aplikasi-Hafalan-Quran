package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlalaqQuestionsBank_96 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah suratAl-Alaq sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Alaq?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Alaq?",
            "4. Bacakanlah ayat ke-8 dari surat Al-Alaq",
            "5. Bacakanlah ayat ke-4 dari surat Al-Alaq ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 17 ayat", "B. 20 ayat", "C. 19 ayat", "D. 22 ayat"},
            {"A. اقْرَأْ وَرَبُّكَ الْأَكْرَمُ ", "B. كَلَّآ إِنَّ الْإِنسٰنَ لَيَطْغَىٰٓ", "C. اقْرَأْ وَرَبُّكَ الْأَكْرَمُ ", "D. الَّذِى عَلَّمَ بِالْقَلَمِ "},
            {"A. اقْرَأْ بِاسْمِ رَبِّكَ الَّذِى خَلَقَ", "B. عَلَّمَ الْإِنسٰنَ مَا لَمْ يَعْلَمْ ", "C. اقْرَأْ وَرَبُّكَ الْأَكْرَمُ", "D. الَّذِى عَلَّمَ بِالْقَلَمِ"},
            {"A. أَن رَّءَاهُ اسْتَغْنَىٰٓ", "B. عَلَّمَ الْإِنسٰنَ مَا لَمْ يَعْلَمْ", "C. إِنَّ إِلَىٰ رَبِّكَ الرُّجْعَىٰٓ", "D. أَرَءَيْتَ الَّذِى يَنْهَىٰ "},
            {"A. الَّذِى عَلَّمَ بِالْقَلَمِِ", "B. أَرَءَيْتَ الَّذِى يَنْهَىٰ", "C. عَلَّمَ الْإِنسٰنَ مَا لَمْ يَعْلَمْ", "D. كَلَّآ إِنَّ الْإِنسٰنَ لَيَطْغَىٰٓ"}
    };

    private String mCorrectAnswers[] = {"C. 19 ayat", "C. اقْرَأْ وَرَبُّكَ الْأَكْرَمُ", "B.عَلَّمَ الْإِنسٰنَ مَا لَمْ يَعْلَمْ", "A. أَن رَّءَاهُ اسْتَغْنَىٰٓ", "A. الَّذِى عَلَّمَ بِالْقَلَمِ"};

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
