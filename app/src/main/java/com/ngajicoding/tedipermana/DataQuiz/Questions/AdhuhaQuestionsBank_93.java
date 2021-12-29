package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AdhuhaQuestionsBank_93 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Adh-Dhuha sebutkan?",
            "2. Bacakanlah ayat ke-4 dari surat Adh-Dhuha ?",
            "3. Bacakanlah ayat ke-7 dari surat Adh-Dhuha?",
            "4. Bacakanlah ayat ke-11 dari surat Adh-Dhuha",
            "5. Bacakanlah ayat ke-10 dari surat Adh-Dhuha?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 25 ayat", "B. 11 ayat", "C. 38 ayat", "D. 12 ayat"},
            {"A. وَالَّيْلِ إِذَا سَجَىٰ", "B. مَا وَدَّعَكَ رَبُّكَ وَمَا قَلَىٰ", "C. وَلَلْءَاخِرَةُ خَيْرٌ لَّكَ مِنَ الْأُولَىٰ", "D. وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰٓ"},
            {"A. وَوَجَدَكَ ضَآلًّا فَهَدَىٰ", "B. وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰٓ", "C. وَوَجَدَكَ عَآئِلًا فَأَغْنَىٰ", "D. وَالَّيْلِ إِذَا سَجَىٰ"},
            {"A. أَلَمْ يَجِدْكَ يَتِيمًا فَـَٔاوَىٰ", "B. وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ", "C. وَوَجَدَكَ ضَآلًّا فَهَدَىٰ", "D. وَأَمَّا السَّآئِلَ فَلَا تَنْهَرْ"},
            {"A. وَوَجَدَكَ ضَآلًّا فَهَدَىِٰ", "B. وَأَمَّا السَّآئِلَ فَلَا تَنْهَرْ", "C. أَلَمْ يَجِدْكَ يَتِيمًا فَـَٔاوَىٰ", "D. وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ"}
    };

    private String mCorrectAnswers[] = {"B. 11 ayat", "C. وَلَلْءَاخِرَةُ خَيْرٌ لَّكَ مِنَ الْأُولَىٰ", "A. وَوَجَدَكَ ضَآلًّا فَهَدَىٰ", " B. وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ", "B. وَأَمَّا السَّآئِلَ فَلَا تَنْهَرْ"};

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
