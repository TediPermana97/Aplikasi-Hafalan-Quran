package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AttakasurQuestionsBank_102 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat At-Takasur sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat  At-Takasur?",
            "3. Bacakanlah ayat ke-7 dari surat At-Takasur?",
            "4. Bacakanlah ayat ke-5 dari surat  At-Takasur ",
            "5. Bacakanlah ayat ke-1 dari surat At-Takasur ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 8 ayat", "B. 10 ayat", "C. 11 ayat ", "D. 13 ayat"},
            {"A. ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ", "B. ثُمَّ كَلَّا سَوْفَ تَعْلَمُونَ", "C. كَلَّا سَوْفَ تَعْلَمُونَ", "D. كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ"},
            {"A. ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ", "B. ثُمَّ كَلَّا سَوْفَ تَعْلَمُونَ", "C. كَلَّا سَوْفَ تَعْلَمُونَ", "D. كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ"},
            {"A. ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ", "B. ثُمَّ كَلَّا سَوْفَ تَعْلَمُونَ", "C. كَلَّا سَوْفَ تَعْلَمُونَ", "D. كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ"},
            {"A. ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ", "B. أَلْهَىٰكُمُ التَّكَاثُرُ ", "C. كَلَّا سَوْفَ تَعْلَمُونَ", "D. كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ"}
    };

    private String mCorrectAnswers[] = {"A. 8 ayat", "C. كَلَّا سَوْفَ تَعْلَمُونَ", " A. ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ", "D. كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ", "B. أَلْهَىٰكُمُ التَّكَاثُرُ"};

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
