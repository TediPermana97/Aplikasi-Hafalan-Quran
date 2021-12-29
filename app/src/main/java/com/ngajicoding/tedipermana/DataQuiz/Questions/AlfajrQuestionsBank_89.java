package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlfajrQuestionsBank_89 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Fajr sebutkan?",
            "2. Bacakanlah ayat ke-4 dari surat Al-Fajr?",
            "3. Bacakanlah ayat ke-9 dari surat Al-Fajr?",
            "4. Bacakanlah ayat ke-19 dari surat Al-Fajr",
            "5. Bacakanlah ayat ke-26 dari surat Al-Fajr ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 50 ayat", "B. 30 ayat", "C. 22 ayat", "D. 23 ayat"},
            {"A. لَآ أُقْسِمُ بِهٰذَا الْبَلَدِ", "B. وَوَالِدٍ وَمَا وَلَدَ", "C. وَوَالِدٍ وَمَا وَلَدَ", "D. أَيَحْسَبُ أَن لَّن يَقْدِرَ عَلَيْهِ أَحَدٌ"},
            {"A. أَلَمْ نَجْعَل لَّهُۥ عَيْنَيْنِ", "B. يَقُولُ أَهْلَكْتُ مَالًا لُّبَدًا", "C. أَيَحْسَبُ أَن لَّن يَقْدِرَ عَلَيْهِ أَحَدٌ", "D. وَوَالِدٍ وَمَا وَلَدَ"},
            {"A. يَتِيمًا ذَا مَقْرَبَةٍ", "B. أُو۟لٰٓئِكَ أَصْحٰبُ الْمَيْمَنَةِ ", "C. وَوَالِدٍ وَمَا وَلَدَ", "D. أَوْ مِسْكِينًا ذَا مَتْرَبَةٍ "},
            {"A. أَلَمْ نَجْعَل لَّهُۥ عَيْنَيْنِِ", "B. أُو۟لٰٓئِكَ أَصْحٰبُ الْمَيْمَنَةِ", "C. عَلَيْهِمْ نَارٌ مُّؤْصَدَةٌۢ ", "D. وَوَالِدٍ وَمَا وَلَدَ"}
    };

    private String mCorrectAnswers[] = {"B. 30 ayat ", "A. لَآ أُقْسِمُ بِهٰذَا الْبَلَدِ", "C. أَيَحْسَبُ أَن لَّن يَقْدِرَ عَلَيْهِ أَحَدٌ", "A. يَتِيمًا ذَا مَقْرَبَةٍ", "C. عَلَيْهِمْ نَارٌ مُّؤْصَدَةٌۢ"};

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
