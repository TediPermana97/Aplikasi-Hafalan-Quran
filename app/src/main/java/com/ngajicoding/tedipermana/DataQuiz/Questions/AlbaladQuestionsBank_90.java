package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlbaladQuestionsBank_90 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Balad sebutkan?",
            "2. Bacakanlah ayat ke-1 dari surat Al-Balad?",
            "3. Bacakanlah ayat ke-6 dari surat Al-Balad?",
            "4. Bacakanlah ayat ke-15 dari surat Al-Balad",
            "5. Bacakanlah ayat ke-20 dari surat Al-Balad?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 18 ayat", "B. 30 ayat", "C. 20 ayat", "D. 33 ayat"},
            {"A. لَآ اُقْسِمُ بِهٰذَا الْبَلَدِۙ ", "B. وَوَالِدٍ وَّمَا وَلَدَۙ ", "C. يَقُوْلُ اَهْلَكْتُ مَالًا لُّبَدًاۗ ", "D. وَلِسَانًا وَّشَفَتَيْنِۙ "},
            {"A. وَلِسَانًا وَّشَفَتَيْنِۙ", "B. وَوَالِدٍ وَّمَا وَلَدَۙ", "C. يَقُوْلُ اَهْلَكْتُ مَالًا لُّبَدًاۗ ", "D. وَلِسَانًا وَّشَفَتَيْنِۙ"},
            {"A. يَّتِيْمًا ذَا مَقْرَبَةٍۙ  ", "B. اَيَحْسَبُ اَنْ لَّمْ يَرَهٗٓ اَحَدٌ", "C. وَلِسَانًا وَّشَفَتَيْنِۙ", "D. اَوْ مِسْكِيْنًا ذَا مَتْرَبَةٍۗ "},
            {"A. فَكُّ رَقَبَةٍۙ ِ", "B. يَّتِيْمًا ذَا مَقْرَبَةٍۙ ", "C. عَلَيْهِمْ نَارٌ مُّؤْصَدَةٌ ", "D. وَلِسَانًا وَّشَفَتَيْنِۙ"}
    };

    private String mCorrectAnswers[] = {"C. 20 ayat", "A. لَآ اُقْسِمُ بِهٰذَا الْبَلَدِۙ ", " C. يَقُوْلُ اَهْلَكْتُ مَالًا لُّبَدًاۗ ", "A. يَّتِيْمًا ذَا مَقْرَبَةٍۙ ", " C. عَلَيْهِمْ نَارٌ مُّؤْصَدَةٌ "};

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
