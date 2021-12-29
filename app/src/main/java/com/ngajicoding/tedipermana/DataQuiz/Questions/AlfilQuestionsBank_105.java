package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlfilQuestionsBank_105 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Surah Al-Fil sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Surah Al-Fil?",
            "3. Bacakanlah ayat ke-5 dari suratSurah Al-Fil?",
            "4. Bacakanlah ayat ke-1 dari surat Surah Al-Fil ",
            "5. Bacakanlah ayat ke-2 dari surat Surah Al-Fil?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 12 ayat", "B. 5 ayat", "C. 10 ayat", "D. 11 ayat"},
            {"A. أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحٰبِ الْفِيلِ", "B. أَلَمْ يَجْعَلْ كَيْدَهُمْ فِى تَضْلِيلٍ", "C. وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ", "D. تَرْمِيهِم بِحِجَارَةٍ مِّن سِجِّيلٍ"},
            {"A. أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحٰبِ الْفِيلِ", "B. أَلَمْ يَجْعَلْ كَيْدَهُمْ فِى تَضْلِيلٍ", "C. وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ", "D. فَجَعَلَهُمْ كَعَصْفٍ مَّأْكُولٍۭ"},
            {"A. أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحٰبِ الْفِيلِ", "B. أَلَمْ يَجْعَلْ كَيْدَهُمْ فِى تَضْلِيلٍ", "C. وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ ", "D. فَجَعَلَهُمْ كَعَصْفٍ مَّأْكُولٍۭ"},
            {"A. أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحٰبِ الْفِيلِِ", "B. أَلَمْ يَجْعَلْ كَيْدَهُمْ فِى تَضْلِيلٍ", "C. وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ ", "D. فَجَعَلَهُمْ كَعَصْفٍ مَّأْكُولٍۭ"}
    };

    private String mCorrectAnswers[] = {"B. 5 ayat", " C. وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ ", " D. فَجَعَلَهُمْ كَعَصْفٍ مَّأْكُولٍۭ", "A. أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحٰبِ الْفِيلِ ", ": B. أَلَمْ يَجْعَلْ كَيْدَهُمْ فِى تَضْلِيلٍ"};

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
