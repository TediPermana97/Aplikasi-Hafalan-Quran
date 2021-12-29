package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlmaunQuestionsBank_107 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Ma'un sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Ma'un?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Ma'un?",
            "4. Bacakanlah ayat ke-7 dari surat Al-Ma'un ",
            "5. Bacakanlah ayat ke-4 dari surat Al-Ma'un?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 5 ayat", "B. 6 ayat", "C. 7 ayat", "D. 9 ayat"},
            {"A. أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّينِ ", "B. وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِينِ ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ ", "D. وَيَمْنَعُونَ الْمَاعُونَ"},
            {"A. أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّينِ ", "B. وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِينِ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ ", "D. وَيَمْنَعُونَ الْمَاعُونَ"},
            {"A. أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّينِ ", "B. وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِينِ ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ ", "D. وَيَمْنَعُونَ الْمَاعُونَ"},
            {"A. أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّينِ ِ", "B. فَوَيْلٌ لِّلْمُصَلِّينَ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ", "D. وَيَمْنَعُونَ الْمَاعُونَ"}
    };

    private String mCorrectAnswers[] = {"C. 7 ayat", "B. وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِينِ ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ ", "D. وَيَمْنَعُونَ الْمَاعُونَ", "B. فَوَيْلٌ لِّلْمُصَلِّينَ"};

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
