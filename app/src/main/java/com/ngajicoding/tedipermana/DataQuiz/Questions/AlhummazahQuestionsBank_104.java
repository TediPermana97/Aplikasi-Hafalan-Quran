package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlhummazahQuestionsBank_104 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Alhumazah sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Alhumazah?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Alhumazah?",
            "4. Bacakanlah ayat ke-9 dari surat Al-Alhumazah",
            "5. Bacakanlah ayat ke-8 dari surat Al-Alhumazah?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 12 ayat", "B. 16 ayat", "C. 10 ayat", "D. 9 ayat"},
            {"A. وَمَآ أَدْرَىٰكَ مَا الْحُطَمَةُ", "B. الَّذِى جَمَعَ مَالًا وَعَدَّدَهُۥ", "C. يَحْسَبُ أَنَّ مَالَهُۥٓ أَخْلَدَهُۥ ", "D. وَمَآ أَدْرَىٰكَ مَا الْحُطَمَةُ"},
            {"A. وَمَآ أَدْرَىٰكَ مَا الْحُطَمَةُ", "B. الَّذِى جَمَعَ مَالًا وَعَدَّدَهُۥ", "C. يَحْسَبُ أَنَّ مَالَهُۥٓ أَخْلَدَهُۥ ", "D. وَمَآ أَدْرَىٰكَ مَا الْحُطَمَةُ"},
            {"A. وَمَآ أَدْرَىٰكَ مَا الْحُطَمَةُ", "B. الَّذِى جَمَعَ مَالًا وَعَدَّدَهُۥ", "C. يَحْسَبُ أَنَّ مَالَهُۥٓ أَخْلَدَهُۥ ", "D. إِنَّهَا عَلَيْهِم مُّؤْصَدَةٌ"},
            {"A. فِى عَمَدٍ مُّمَدَّدَةٍِۭ", "B. الَّذِى جَمَعَ مَالًا وَعَدَّدَهُۥ", "C. يَحْسَبُ أَنَّ مَالَهُۥٓ أَخْلَدَهُۥ ", "D. إِنَّهَا عَلَيْهِم مُّؤْصَدَةٌ "}
    };

    private String mCorrectAnswers[] = {" D. 9 ayat", "C. يَحْسَبُ أَنَّ مَالَهُۥٓ أَخْلَدَهُۥ ", "D. وَمَآ أَدْرَىٰكَ مَا الْحُطَمَةُ", "D. إِنَّهَا عَلَيْهِم مُّؤْصَدَةٌ ", "A. فِى عَمَدٍ مُّمَدَّدَةٍۭ"};

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
