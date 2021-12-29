package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlburujQuestionsBank_85 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Buruj sebutkan?",
            "2. Bacakanlah ayat ke-5 dari surat Al-Buruj?",
            "3. Bacakanlah ayat ke-12 dari surat Al-Buruj?",
            "4. Bacakanlah ayat ke-20 dari surat Al-Buruj",
            "5. Bacakanlah ayat ke-22 dari surat Al-Buruj ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 23 ayat", "B. 24 ayat", "C. 22 ayat", "D. 30 ayat"},
            {"A. وَشَاهِدٍ وَمَشْهُودٍ", "B. وَالْيَوْمِ الْمَوْعُودِ", "C. إِذْ هُمْ عَلَيْهَا قُعُودٌ", "D. النَّارِ ذَاتِ الْوَقُودِ "},
            {"A. إِنَّ بَطْشَ رَبِّكَ لَشَدِيدٌ", "B. ذُو الْعَرْشِ الْمَجِيدُ", "C. وَهُوَ الْغَفُورُ الْوَدُودُ", "D. فِرْعَوْنَ وَثَمُودَ"},
            {"A. ذُو الْعَرْشِ الْمَجِيدُ", "B. وَهُوَ الْغَفُورُ الْوَدُودُ", "C. وَاللَّـهُ مِن وَرَآئِهِم مُّحِيطٌۢ", "D. بَلْ هُوَ قُرْءَانٌ مَّجِيدٌ"},
            {"A. ذُو الْعَرْشِ الْمَجِيدُِ", "B. فِى لَوْحٍ مَّحْفُوظٍۭ", "C. ذُو الْعَرْشِ الْمَجِيدُ", "D. فِرْعَوْنَ وَثَمُودَ"}
    };

    private String mCorrectAnswers[] = {"C. 22 ayat", "D. النَّارِ ذَاتِ الْوَقُودِ", "A. إِنَّ بَطْشَ رَبِّكَ لَشَدِيدٌ", "C. وَاللَّـهُ مِن وَرَآئِهِم مُّحِيطٌۢ", "B. فِى لَوْحٍ مَّحْفُوظٍۭ"};

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
