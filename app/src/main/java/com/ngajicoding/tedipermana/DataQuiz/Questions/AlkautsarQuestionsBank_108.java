package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlkautsarQuestionsBank_108 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-kautsar sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-kautsar?",
            "3. Bacakanlah ayat ke-1 dari surat Al-kautsar?",
            "4. Bacakanlah ayat ke-2 dari surat Al-kautsar",
            "5. Ayat disamping nomer berapakah فَصَلِّ لِرَبِّكَ وَانْحَرْ dalam surat Al-kautsar?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 1 ayat", "B. 5 ayat", "C. 7 ayat", "D. 3 ayat"},
            {"A. أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّينِ", "B. فَوَيْلٌ لِّلْمُصَلِّينَ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ", "D. إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ"},
            {"A. أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّينِ ", "B. إِنَّآ أَعْطَيْنٰكَ الْكَوْثَرَ ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ ", "D. إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ"},
            {"A. أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّينِ ", "B. فَصَلِّ لِرَبِّكَ وَانْحَرْ ", "C. الَّذِينَ هُمْ عَن صَلَاتِهِمْ سَاهُونَ ", "D. إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ"},
            {"A. No 1ِ", "B. No 3", "C. No 2", "D. No 4"}
    };

    private String mCorrectAnswers[] = {"D. 3 ayat", "D. إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ", "B. إِنَّآ أَعْطَيْنٰكَ الْكَوْثَرَ ", "B. فَصَلِّ لِرَبِّكَ وَانْحَرْ ", "C. No 2"};

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
