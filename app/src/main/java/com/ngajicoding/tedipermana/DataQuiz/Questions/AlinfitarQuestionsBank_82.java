package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlinfitarQuestionsBank_82 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Iinfitar sebutkan?",
            "2. Bacakanlah ayat ke-2 dari surat Al-Iinfitar?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Iinfitar?",
            "4. Bacakanlah ayat ke-15 dari surat Al-Iinfitar",
            "5. Bacakanlah ayat ke-7 dari surat Al-Iinfitar  ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 40 ayat", "B. 21 ayat", "C. 19 ayat", "D. 32 ayat"},
            {"A. وَإِذَا الْكَوَاكِبُ انتَثَرَتْ", "B. عَلِمَتْ نَفْسٌ مَّا قَدَّمَتْ وَأَخَّرَتْ", "C. وَإِذَا الْبِحَارُ فُجِّرَتْ", "D. إِذَا السَّمَآءُ انفَطَرَتْ"},
            {"A. عَلِمَتْ نَفْسٌ مَّا قَدَّمَتْ وَأَخَّرَتْ", "B. الَّذِى خَلَقَكَ فَسَوَّىٰكَ فَعَدَلَكَ", "C. وَإِنَّ عَلَيْكُمْ لَحٰفِظِينَ", "D. كِرَامًا كٰتِبِينَ"},
            {"A. وَمَآ أَدْرَىٰكَ مَا يَوْمُ الدِّينِ", "B. وَمَا هُمْ عَنْهَا بِغَآئِبِينَ", "C. يَصْلَوْنَهَا يَوْمَ الدِّينِ", "D. إِنَّ الْأَبْرَارَ لَفِى نَعِيمٍ"},
            {"A. وَمَا هُمْ عَنْهَا بِغَآئِبِينَِ", "B. ثُمَّ مَآ أَدْرَىٰكَ مَا يَوْمُ الدِّينِ", "C. وَإِنَّ الْفُجَّارَ لَفِى جَحِيمٍ", "D. وَإِنَّ عَلَيْكُمْ لَحٰفِظِينَ"}
    };

    private String mCorrectAnswers[] = {"C. 19 ayat", "A. وَإِذَا الْكَوَاكِبُ انتَثَرَتْ", "A. عَلِمَتْ نَفْسٌ مَّا قَدَّمَتْ وَأَخَّرَتْ", " C.يَصْلَوْنَهَا يَوْمَ الدِّينِ", "B. ثُمَّ مَآ أَدْرَىٰكَ مَا يَوْمُ الدِّينِ"};

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
