package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlqiyamahQuestionsBank_75 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Qiyamah sebutkan?",
            "2. Bacakanlah ayat ke-1 dari surat  Al-Qiyamah ?",
            "3. Bacakanlah ayat ke-15 dari surat Al-Qiyamah?",
            "4. Bacakanlah ayat ke-30 dari surat  Al-Qiyamah",
            "5. Bacakanlah ayat ke-40 dari surat Al-Qiyamah  ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 40 ayat", "B. 20 ayat", "C. 30 ayat", "D. 45 ayat"},
            {"A. لَآ أُقْسِمُ بِيَوْمِ الْقِيٰمَةِ", "B. فَإِذَا بَرِقَ الْبَصَرُ", "C. يَسْـَٔلُ أَيَّانَ يَوْمُ الْقِيٰمَةِ ", "D. بَلْ يُرِيدُ الْإِنسٰنُ لِيَفْجُرَ أَمَامَهُۥ "},
            {"A. وَلَوْ أَلْقَىٰ مَعَاذِيرَهُۥ ", "B. فَإِذَا بَرِقَ الْبَصَرُ", "C. ثُمَّ إِنَّ عَلَيْنَا بَيَانَهُۥ", "D. فَإِذَا قَرَأْنٰهُ فَاتَّبِعْ قُرْءَانَهُ"},
            {"A. إِلَىٰ رَبِّكَ يَوْمَئِذٍ الْمَسَاقُ", "B. وَظَنَّ أَنَّهُ الْفِرَاقُ", "C. وَلٰكِن كَذَّبَ وَتَوَلَّىٰ", "D. أَوْلَىٰ لَكَ فَأَوْلَىٰ"},
            {"A. أَلَيْسَ ذٰلِكَ بِقٰدِرٍ عَلَىٰٓ أَن يُحْۦِىَ الْمَوْتَىِٰ", "B. وَلٰكِن كَذَّبَ وَتَوَلَّىٰ", "C. فَإِذَا قَرَأْنٰهُ فَاتَّبِعْ قُرْءَانَهُ", "D. يَسْـَٔلُ أَيَّانَ يَوْمُ الْقِيٰمَةِ "}
    };

    private String mCorrectAnswers[] = {"A 40 ayat", " A. لَآ أُقْسِمُ بِيَوْمِ الْقِيٰمَةِ ", "A. وَلَوْ أَلْقَىٰ مَعَاذِيرَهُۥ ", " A. إِلَىٰ رَبِّكَ يَوْمَئِذٍ الْمَسَاقُ", "A. أَلَيْسَ ذٰلِكَ بِقٰدِرٍ عَلَىٰٓ أَن يُحْۦِىَ الْمَوْتَىٰ"};

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
