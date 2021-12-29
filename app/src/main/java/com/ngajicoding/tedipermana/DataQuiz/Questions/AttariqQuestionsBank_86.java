package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AttariqQuestionsBank_86 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat At-Tariq sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat At-Tariq?",
            "3. Bacakanlah ayat ke-10 dari surat At-Tariq?",
            "4. Bacakanlah ayat ke-15 dari surat At-Tariq",
            "5. Bacakanlah ayat ke-7 dari surat At-Tariq  ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 10 ayat", "B. 17 ayat", "C. 19 ayat", "D. 30 ayat"},
            {"A. إِن كُلُّ نَفْسٍ لَّمَّا عَلَيْهَا حَافِظٌ", "B. إِن كُلُّ نَفْسٍ لَّمَّا عَلَيْهَا حَافِظٌ", "C. خُلِقَ مِن مَّآءٍ دَافِقٍ", "D. النَّجْمُ الثَّاقِبُ"},
            {"A. وَمَا هُوَ بِالْهَزْلِ", "B. إِنَّهُۥ لَقَوْلٌ فَصْلٌ", "C. فَمَا لَهُۥ مِن قُوَّةٍ وَلَا نَاصِرٍ", "D. إِنَّهُۥ لَقَوْلٌ فَصْلٌ "},
            {"A. إِنَّهُمْ يَكِيدُونَ كَيْدًا", "B. وَأَكِيدُ كَيْدًا ", "C. فَمَا لَهُۥ مِن قُوَّةٍ وَلَا نَاصِرٍ", "D.  النَّجْمُ الثَّاقِبُ"},
            {"A. إِنَّهُۥ لَقَوْلٌ فَصْلٌ ِ", "B. يَخْرُجُ مِنۢ بَيْنِ الصُّلْبِ وَالتَّرَآئِبِ", "C. إِنَّهُۥ لَقَوْلٌ فَصْلٌ", "D. النَّجْمُ الثَّاقِبُ"}
    };

    private String mCorrectAnswers[] = {"B. 17 ayat", "D. النَّجْمُ الثَّاقِبُ", "C. فَمَا لَهُۥ مِن قُوَّةٍ وَلَا نَاصِرٍ", " A. إِنَّهُمْ يَكِيدُونَ كَيْدًا", " B. يَخْرُجُ مِنۢ بَيْنِ الصُّلْبِ وَالتَّرَآئِبِ"};

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
