package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AllailQuestionsBank_92 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Lail sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Lail?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Lail?",
            "4. Bacakanlah ayat ke-16 dari surat Al-Lail",
            "5. Bacakanlah ayat ke-20 dari surat Al-Lail ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 28 ayat", "B. 21 ayat", "C. 22 ayat", "D. 30 ayat"},
            {"A  فَأَمَّا مَنْ أَعْطَىٰ وَاتَّقَىٰ", "B. وَمَا خَلَقَ الذَّكَرَ وَالْأُنثَىٰٓ", "C. وَالَّيْلِ إِذَا يَغْشَىٰ", "D. إِنَّ سَعْيَكُمْ لَشَتَّىٰ"},
            {"A. فَأَمَّا مَنْ أَعْطَىٰ وَاتَّقَىٰ", "B. إِنَّ سَعْيَكُمْ لَشَتَّىٰ", "C. وَأَمَّا مَنۢ بَخِلَ وَاسْتَغْنَىٰ", "D. وَكَذَّبَ بِالْحُسْنَىٰ"},
            {"A. لَا يَصْلَىٰهَآ إِلَّا الْأَشْقَى", "B. الَّذِى كَذَّبَ وَتَوَلَّىٰ", "C. الَّذِى كَذَّبَ وَتَوَلَّىٰ", "D. إِنَّ عَلَيْنَا لَلْهُدَىٰ "},
            {"A. إِنَّ عَلَيْنَا لَلْهُدَىٰ ِ", "B. الَّذِى يُؤْتِى مَالَهُۥ يَتَزَكَّىٰ", "C. وَسَيُجَنَّبُهَا الْأَتْقَى", "D. إِلَّا ابْتِغَآءَ وَجْهِ رَبِّهِ الْأَعْلَىٰ"}
    };

    private String mCorrectAnswers[] = {"B. 21 ayat", "B. وَمَا خَلَقَ الذَّكَرَ وَالْأُنثَىٰٓ", "A. فَأَمَّا مَنْ أَعْطَىٰ وَاتَّقَىٰ", "C.الَّذِى كَذَّبَ وَتَوَلَّىٰ", "D. إِلَّا ابْتِغَآءَ وَجْهِ رَبِّهِ الْأَعْلَىٰ"};

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
