package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AttakwirQuestionsBank_81 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat At-Takwir sebutkan?",
            "2. Bacakanlah ayat ke-5 dari surat At-Takwir?",
            "3. Bacakanlah ayat ke-15 dari surat At-Takwir?",
            "4. Bacakanlah ayat ke-25 dari surat At-Takwir",
            "5. Bacakanlah ayat ke-19 dari surat At-Takwir ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 34 ayat", "B. 40 ayat", "C. 30 ayat", "D. 29 ayat"},
            {"A. وَإِذَا الْبِحَارُ سُجِّرَتْ", "B. بِأَىِّ ذَنۢبٍ قُتِلَتْ", "C. وَإِذَا الْوُحُوشُ حُشِرَتْ", "D. وَإِذَا الْجِبَالُ سُيِّرَتْ"},
            {"وَإِذَا الْجَنَّةُ أُزْلِفَتْ", "B. وَإِذَا الصُّحُفُ نُشِرَتْ", "C. عَلِمَتْ نَفْسٌ مَّآ أَحْضَرَتْ", "D. وَالَّيْلِ إِذَا عَسْعَسَ"},
            {"A. وَلَقَدْ رَءَاهُ بِالْأُفُقِ الْمُبِينِ", "B. وَمَا هُوَ عَلَى الْغَيْبِ بِضَنِينٍ", "C. فَأَيْنَ تَذْهَبُونَ ", "D. وَمَا هُوَ بِقَوْلِ شَيْطٰنٍ رَّجِيمٍ"},
            {"A. إِنَّهُۥ لَقَوْلُ رَسُولٍ كَرِيمٍِ", "B. وَالَّيْلِ إِذَا عَسْعَسَ", "C. وَمَا صَاحِبُكُم بِمَجْنُونٍ", "D. فَأَيْنَ تَذْهَبُونَ"}
    };

    private String mCorrectAnswers[] = {"Merah - Putih", " C. وَإِذَا الْوُحُوشُ حُشِرَتْ", "B. وَإِذَا الصُّحُفُ نُشِرَتْ", "D. وَمَا هُوَ بِقَوْلِ شَيْطٰنٍ رَّجِيمٍ", "A. إِنَّهُۥ لَقَوْلُ رَسُولٍ كَرِيم"};

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
