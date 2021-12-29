package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlquraishQuestionsBank_106 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Quraisy sebutkan?",
            "2. Bacakanlah ayat ke-2 dari surat Surah Al-Quraisy?",
            "3. Bacakanlah ayat ke-4 dari surat Surah Al-Quraisy?",
            "4. Bacakanlah ayat ke-1 dari surat Al-Quraisy",
            "5. Bacakanlah ayat ke-3 dari surat Al-Quraisy?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 4 ayat", "B. 6 ayat", "C. 7 ayat", "D. 10 ayat"},
            {"A. لِإِيلٰفِ قُرَيْشٍ", "B. فَلْيَعْبُدُوا۟ رَبَّ هٰذَا الْبَيْتِ", "C. الَّذِىٓ أَطْعَمَهُم مِّن جُوعٍ وَءَامَنَهُم مِّنْ خَوْفٍۭ", "D. إِۦلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ"},
            {"A. لِإِيلٰفِ قُرَيْشٍ", "B. فَلْيَعْبُدُوا۟ رَبَّ هٰذَا الْبَيْتِ", "C. الَّذِىٓ أَطْعَمَهُم مِّن جُوعٍ وَءَامَنَهُم مِّنْ خَوْفٍۭ", "D. إِۦلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ"},
            {"A. لِإِيلٰفِ قُرَيْشٍ", "B. فَلْيَعْبُدُوا۟ رَبَّ هٰذَا الْبَيْتِ", "C. الَّذِىٓ أَطْعَمَهُم مِّن جُوعٍ وَءَامَنَهُم مِّنْ خَوْفٍۭ", "D. إِۦلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ"},
            {"A. لِإِيلٰفِ قُرَيْشٍِ", "B. فَلْيَعْبُدُوا۟ رَبَّ هٰذَا الْبَيْتِ", "C. الَّذِىٓ أَطْعَمَهُم مِّن جُوعٍ وَءَامَنَهُم مِّنْ خَوْفٍۭ", "D. إِۦلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ"}
    };

    private String mCorrectAnswers[] = {"A. 4 ayat", "D. إِۦلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ", " C. الَّذِىٓ أَطْعَمَهُم مِّن جُوعٍ وَءَامَنَهُم مِّنْ خَوْفٍۭ", " A. لِإِيلٰفِ قُرَيْشٍ", " B. فَلْيَعْبُدُوا۟ رَبَّ هٰذَا الْبَيْتِ"};

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
