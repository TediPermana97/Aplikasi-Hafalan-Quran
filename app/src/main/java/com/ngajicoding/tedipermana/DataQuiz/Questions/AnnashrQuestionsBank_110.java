package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AnnashrQuestionsBank_110 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat An-Nasr sebutkan?",
            "2. Bacakanlah ayat ke-1 dari surat An-Nasr?",
            "3. Bacakanlah ayat ke-2 dari surat An-Nasr?",
            "4. Lanjutkan dari potongan ayat فَسَبِّحۡ بِحَمۡدِ رَبِّكَ وَاسۡتَغۡفِرۡ surat Al-Nasr sebutkan",
            "5. manakah ayat yang termasuk surat An-Nasr?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 6 ayat", "B. 5 ayat", "C. 3 ayat", "D. 10 ayat"},
            {"A. مَلِكِ النَّاسِ ", "B. إِلٰهِ النَّاسِ", "C. قُلْ أَعُوذُ بِرَبِّ النَّاسِ", "D. اِذَا جَآءَ نَصۡرُ اللّٰهِ وَالۡفَتۡحُِۙ "},
            {"A. مَلِكِ النَّاسِ", "B. الَّذِى يُوَسْوِسُ فِى صُدُورِ النَّاسِ", "وَرَاَيۡتَ النَّاسَ يَدۡخُلُوۡنَ فِىۡ دِيۡنِ اللّٰهِ اَفۡوَاجًا .C", "D. يَوْمَ يَتَذَكَّرُ الْإِنسٰنُ مَا سَعَىٰ"},
            {"اِنَّهٗ كَانَ تَوَّابًا .A", "B. إِلٰهِ النَّاسِ", "C. مَلِكِ النَّاسِ ", "وَرَاَيۡتَ النَّاسَ يَدۡخُلُوۡنَ فِىۡ دِيۡنِ اللّٰهِ اَفۡوَاجًا .D"},
            {"A. وَالسّٰبِحٰتِ سَبْحًا ", "B. وَالنّٰزِعٰتِ غَرْقًا", "C. وَالسّٰبِحٰتِ سَبْحًا", "D. اِذَا جَآءَ نَصۡرُ اللّٰهِ وَالۡفَتۡحُۙ"}
    };

    private String mCorrectAnswers[] = {"C. 3 ayat", "D. اِذَا جَآءَ نَصۡرُ اللّٰهِ وَالۡفَتۡحُِۙ ", "وَرَاَيۡتَ النَّاسَ يَدۡخُلُوۡنَ فِىۡ دِيۡنِ اللّٰهِ اَفۡوَاجًا .C", "اِنَّهٗ كَانَ تَوَّابًا .A", "D. اِذَا جَآءَ نَصۡرُ اللّٰهِ وَالۡفَتۡحُۙ"};

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
