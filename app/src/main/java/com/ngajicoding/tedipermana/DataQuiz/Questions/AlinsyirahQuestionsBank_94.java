package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlinsyirahQuestionsBank_94 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Linsyirah sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Linsyirah ?",
            "3. Bacakanlah ayat ke-7 dari surat Al-Linsyirah?",
            "4. Bacakanlah ayat ke-4 dari surat Al-Linsyirah",
            "5. Bacakanlah ayat ke-6 dari surat Al-Linsyirah ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 10 ayat", "B. 7 ayat", "C. 8 ayat", "D. 9 ayat"},
            {"A. وَوَضَعْنَا عَنكَ وِزْرَكَ", "B. وَرَفَعْنَا لَكَ ذِكْرَكَ", "C. إِنَّ مَعَ الْعُسْرِ يُسْرًا", "D. الَّذِىٓ أَنقَضَ ظَهْرَكَ "},
            {"A. الَّذِىٓ أَنقَضَ ظَهْرَكَ ", "B. فَإِذَا فَرَغْتَ فَانصَبْ", "C. وَوَضَعْنَا عَنكَ وِزْرَكَ", "D. وَإِلَىٰ رَبِّكَ فَارْغَب"},
            {"A. فَإِنَّ مَعَ الْعُسْرِ يُسْرًا", "B. إِنَّ مَعَ الْعُسْرِ يُسْرًا", "C. الَّذِىٓ أَنقَضَ ظَهْرَكَ", "D. وَرَفَعْنَا لَكَ ذِكْرَكَ"},
            {"A. وَرَفَعْنَا لَكَ ذِكْرَكَِ", "B. الَّذِىٓ أَنقَضَ ظَهْرَكَ", "C. فَإِذَا فَرَغْتَ فَانصَبْ", "D. إِنَّ مَعَ الْعُسْرِ يُسْرًا"}
    };

    private String mCorrectAnswers[] = {"C. 8 ayat", "D. الَّذِىٓ أَنقَضَ ظَهْرَكَ ", "B. فَإِذَا فَرَغْتَ فَانصَبْ", "D. وَرَفَعْنَا لَكَ ذِكْرَكَ", " D. إِنَّ مَعَ الْعُسْرِ يُسْرً"};

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
