package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlmursalatQuestionsBank77 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Mursalat sebutkan ?",
            "2. Bacakanlah ayat ke-10 dari surat Al-Mursalat?",
            "3. Bacakanlah ayat ke-19 dari surat Al-Mursalat?",
            "4. Bacakanlah ayat ke-25 dari surat  Al-Mursalat",
            "5. Bacakanlah ayat ke-40 dari surat Al-Mursalat ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 40 ayat", "B. 44 ayat", "C. 45 ayat", "D. 50 ayat"},
            {"A. وَإِذَا الْجِبَالُ نُسِفَتْ", "B. وَإِذَا الرُّسُلُ أُقِّتَتْ ", "C. وَمَآ أَدْرَىٰكَ مَا يَوْمُ الْفَصْلِ", "D. وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ"},
            {"A. وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ", "B. إِلَىٰ قَدَرٍ مَّعْلُومٍ", "C. وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ", "D. أَلَمْ نَخْلُقكُّم مِّن مَّآءٍ مَّهِينٍ"},
            {"A. انطَلِقُوٓا۟ إِلَىٰ مَا كُنتُم بِهِۦ تُكَذِّبُونَ", "B. أَلَمْ نَجْعَلِ الْأَرْضَ كِفَاتًا ", "C. وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ", "D. إِنَّ الْمُتَّقِينَ فِى ظِلٰلٍ وَعُيُونٍ"},
            {"A. كَأَنَّهُۥ جِمٰلَتٌ صُفْرٌِ", "B. أَحْيَآءً وَأَمْوٰتًا ", "C. أَلَمْ نَجْعَلِ الْأَرْضَ كِفَاتًا", "D. وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ"}
    };

    private String mCorrectAnswers[] = {"D. 50 ayat", " A. وَإِذَا الْجِبَالُ نُسِفَتْ", "C. وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ", "B. أَلَمْ نَجْعَلِ الْأَرْضَ كِفَاتًا ", "D. وَيْلٌ يَوْمَئِذٍ لِّلْمُكَذِّبِينَ"};

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
