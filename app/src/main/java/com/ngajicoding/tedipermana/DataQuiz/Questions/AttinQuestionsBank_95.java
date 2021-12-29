package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AttinQuestionsBank_95 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat At-Tin sebutkan?",
            "2. Bacakanlah ayat ke-1 dari surat At-Tin?",
            "3. Bacakanlah ayat ke-5 dari surat At-Tin?",
            "4. Bacakanlah ayat ke-8 dari surat At-Tin",
            "5. Bacakanlah ayat ke-6 dari surat At-Tin?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 9 ayat", "B. 14 ayat", "C. 11 ayat", "D. 8 ayat"},
            {"A. وَالتِّينِ وَالزَّيْتُونِ ", "B. وَهٰذَا الْبَلَدِ الْأَمِينِ", "C. ثُمَّ رَدَدْنٰهُ أَسْفَلَ سٰفِلِينَ ", "D. فَمَا يُكَذِّبُكَ بَعْدُ بِالدِّينِ "},
            {"A. ثُمَّ رَدَدْنٰهُ أَسْفَلَ سٰفِلِينَ", "B. لَقَدْ خَلَقْنَا الْإِنسٰنَ فِىٓ أَحْسَنِ تَقْوِيمٍ", "C. وَالتِّينِ وَالزَّيْتُونِ ", "D. فَمَا يُكَذِّبُكَ بَعْدُ بِالدِّينِ "},
            {"A. فَمَا يُكَذِّبُكَ بَعْدُ بِالدِّينِ ", "B. أَلَيْسَ اللهُ بِأَحْكَمِ الْحٰكِمِينَ", "C. وَالتِّينِ وَالزَّيْتُونِ ", "D. وَهٰذَا الْبَلَدِ الْأَمِينِ"},
            {"A. إِلَّا الَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ الصّٰلِحٰتِ فَلَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍِ", "B. وَهٰذَا الْبَلَدِ الْأَمِينِ", "C. ثُمَّ رَدَدْنٰهُ أَسْفَلَ سٰفِلِينَ", "D. وَالتِّينِ وَالزَّيْتُونِ "}
    };

    private String mCorrectAnswers[] = {"D. 8 ayat", "A. وَالتِّينِ وَالزَّيْتُونِ ", "بِسْمِ اللَّـهِ الرَّحْمٰنِ الرَّحِيم", "B. أَلَيْسَ اللهُ بِأَحْكَمِ الْحٰكِمِينَ", "A. إِلَّا الَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ الصّٰلِحٰتِ فَلَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ"};

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
