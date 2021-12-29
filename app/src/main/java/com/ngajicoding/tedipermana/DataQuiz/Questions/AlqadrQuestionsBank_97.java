package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlqadrQuestionsBank_97 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Qadr sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Qadr ?",
            "3. Bacakanlah ayat ke-2 dari surat Al-Qadr ?",
            "4. Bacakanlah ayat ke-1 dari surat Al-Qadr ?",
            "5. Bacakanlah ayat ke-4 dari surat Al-Qadr ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 4 ayat", "B. 5 ayat", "C. 7 ayat", "D. 9 ayat"},
            {"A. لَيْلَةُ الْقَدْرِ خَيْرٌ مِّنْ أَلْفِ شَهْرٍ", "B. تَنَزَّلُ الْمَلٰٓئِكَةُ وَالرُّوحُ فِيهَا بِإِذْنِ رَبِّهِم مِّن كُلِّ أَمْرٍ", "C. وَمَآ أَدْرَىٰكَ مَا لَيْلَةُ الْقَدْرِ", "D. إِنَّآ أَنزَلْنٰهُ فِى لَيْلَةِ الْقَدْرِ"},
            {"A. وَمَآ أَدْرَىٰكَ مَا لَيْلَةُ الْقَدْرِ", "B. لَيْلَةُ الْقَدْرِ خَيْرٌ مِّنْ أَلْفِ شَهْرٍ", "C. سَلٰمٌ هِىَ حَتَّىٰ مَطْلَعِ الْفَجْرِ ", "D. إِنَّآ أَنزَلْنٰهُ فِى لَيْلَةِ الْقَدْرِ"},
            {"A. لَيْلَةُ الْقَدْرِ خَيْرٌ مِّنْ أَلْفِ شَهْرٍ", "B. إِنَّآ أَنزَلْنٰهُ فِى لَيْلَةِ الْقَدْرِ", "C. وَمَآ أَدْرَىٰكَ مَا لَيْلَةُ الْقَدْرِ", "D. سَلٰمٌ هِىَ حَتَّىٰ مَطْلَعِ الْفَجْرِ"},
            {"A. سَلٰمٌ هِىَ حَتَّىٰ مَطْلَعِ الْفَجْرِ ِ", "إِنَّآ أَنزَلْنٰهُ فِى لَيْلَةِ الْقَدْرِ", "C. وَمَآ أَدْرَىٰكَ مَا لَيْلَةُ الْقَدْرِ", "D. تَنَزَّلُ الْمَلٰٓئِكَةُ وَالرُّوحُ فِيهَا بِإِذْنِ رَبِّهِم مِّن كُلِّ أَمْرٍ"}
    };

    private String mCorrectAnswers[] = {"B. 5 ayat", "A. لَيْلَةُ الْقَدْرِ خَيْرٌ مِّنْ أَلْفِ شَهْرٍ", "A. وَمَآ أَدْرَىٰكَ مَا لَيْلَةُ الْقَدْرِ", "B. إِنَّآ أَنزَلْنٰهُ فِى لَيْلَةِ الْقَدْرِ", "D. تَنَزَّلُ الْمَلٰٓئِكَةُ وَالرُّوحُ فِيهَا بِإِذْنِ رَبِّهِم مِّن كُلِّ أَمْرٍ"};

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
