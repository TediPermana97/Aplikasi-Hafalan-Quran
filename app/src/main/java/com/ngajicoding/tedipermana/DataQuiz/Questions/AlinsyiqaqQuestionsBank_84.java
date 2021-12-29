package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlinsyiqaqQuestionsBank_84 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Insyiqaq sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Insyiqaq ?",
            "3. Bacakanlah ayat ke-11 dari surat Al-Insyiqaq ?",
            "4. Bacakanlah ayat ke-15 dari surat Al-Insyiqaq",
            "5. Bacakanlah ayat ke-23 dari surat Al-Insyiqaq ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 33 ayat", "B. 45 ayat", "C. 25 ayat", "D. 30 ayat"},
            {"A. فَسَوْفَ يُحَاسَبُ حِسَابًا يَسِيرًا", "B. وَإِذَا الْأَرْضُ مُدَّتْ", "C. وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ ", "D. وَيَنقَلِبُ إِلَىٰٓ أَهْلِهِۦ مَسْرُورًا "},
            {"A. وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ ", "B. وَيَنقَلِبُ إِلَىٰٓ أَهْلِهِۦ مَسْرُورًا", "C. فَسَوْفَ يَدْعُوا۟ ثُبُورًا", "D.  وَإِذَا الْأَرْضُ مُدَّتْ"},
            {"A. بَلَىٰٓ إِنَّ رَبَّهُۥ كَانَ بِهِۦ بَصِيرًا", "B. وَالَّيْلِ وَمَا وَسَقَ ", "C. فَمَا لَهُمْ لَا يُؤْمِنُونَ", "D. لَتَرْكَبُنَّ طَبَقًا عَن طَبَقٍ"},
            {"A. بَلِ الَّذِينَ كَفَرُوا۟ يُكَذِّبُونَِ", "B. وَاللَّـهُ أَعْلَمُ بِمَا يُوعُونَ", "C. وَالَّيْلِ وَمَا وَسَقَ ", "D. فَبَشِّرْهُم بِعَذَابٍ أَلِيمٍ "}
    };

    private String mCorrectAnswers[] = {"C. 25 ayat", "B. وَإِذَا الْأَرْضُ مُدَّتْ", "C. فَسَوْفَ يَدْعُوا۟ ثُبُورًا", " A. بَلَىٰٓ إِنَّ رَبَّهُۥ كَانَ بِهِۦ بَصِيرًا", " B. وَاللَّـهُ أَعْلَمُ بِمَا يُوعُونَ"};

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
