package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlqariahQuestionsBank_101 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Qriah sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Qari'ah ?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Qari'ah?",
            "4. Bacakanlah ayat ke-7 dari surat Al-Qari'ah",
            "5. Bacakanlah ayat ke-10 dari surat Al-Qari'ah ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 11 ayat ", "B. 30 ayat", "C. 15 ayat", "D. 21 ayat"},
            {"A. وَمَآ أَدْرَىٰكَ مَا الْقَارِعَةُ", "B. وَمَآ أَدْرَىٰكَ مَا هِيَهْ", "C. وَأَمَّا مَنْ خَفَّتْ مَوٰزِينُهُۥ ", "D. فَأُمُّهُۥ هَاوِيَةٌ"},
            {"A. وَتَكُونُ الْجِبَالُ كَالْعِهْنِ الْمَنفُوشِ", "B. وَمَآ أَدْرَىٰكَ مَا هِيَهْ", "C. وَأَمَّا مَنْ خَفَّتْ مَوٰزِينُهُۥ ", "D. فَأُمُّهُۥ هَاوِيَةٌ"},
            {"A. وَتَكُونُ الْجِبَالُ كَالْعِهْنِ الْمَنفُوشِ", "B. وَمَآ أَدْرَىٰكَ مَا هِيَهْ", "C. وَأَمَّا مَنْ خَفَّتْ مَوٰزِينُهُۥ ", "D. فَهُوَ فِى عِيشَةٍ رَّاضِيَةٍ"},
            {"A. وَمَآ أَدْرَىٰكَ مَا هِيَهِْ", "B. فَأُمُّهُۥ هَاوِيَةٌ", "C. وَأَمَّا مَنْ خَفَّتْ مَوٰزِينُهُۥ", "D. فَهُوَ فِى عِيشَةٍ رَّاضِيَةٍ"}
    };

    private String mCorrectAnswers[] = {"A. 11 ayat", "A. وَمَآ أَدْرَىٰكَ مَا الْقَارِعَةُ", " A. وَتَكُونُ الْجِبَالُ كَالْعِهْنِ الْمَنفُوشِ", "D. فَهُوَ فِى عِيشَةٍ رَّاضِيَةٍ", "A. وَمَآ أَدْرَىٰكَ مَا هِيَهْ"};

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
