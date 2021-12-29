package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlgosyiyahQuestionsBank_88 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Ghasyiyah sebutkan?",
            "2. Bacakanlah ayat ke-1 dari surat Al-Ghasyiyah ?",
            "3. Bacakanlah ayat ke-15 dari surat Al-Ghasyiyah?",
            "4. Bacakanlah ayat ke-20 dari surat Al-Ghasyiyah",
            "5. Bacakanlah ayat ke-25 dari surat Al-Ghasyiyah?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 42 ayat", "B. 33 ayat", "C. 20 ayat", "D. 26 ayat"},
            {"A. عَامِلَةٌ نَّاصِبَةٌ", "B. تُسْقَىٰ مِنْ عَيْنٍ ءَانِيَةٍ", "C. هَلْ أَتَىٰكَ حَدِيثُ الْغٰشِيَةِ ", "D. تَصْلَىٰ نَارًا حَامِيَةً"},
            {"A. وَنَمَارِقُ مَصْفُوفَةٌ", "B. فِيهَا عَيْنٌ جَارِيَةٌ", "C. وَإِلَى السَّمَآءِ كَيْفَ رُفِعَتْ", "D. وَزَرَابِىُّ مَبْثُوثَةٌ "},
            {"A. وَزَرَابِىُّ مَبْثُوثَةٌ ", "B.  َصْلَىٰ نَارًا حَامِيَ", "C. وَإِلَى الْأَرْضِ كَيْفَ سُطِحَتْ", "D. لَّسْتَ عَلَيْهِم بِمُصَيْطِرٍ "},
            {"A. إِنَّ إِلَيْنَآ إِيَابَهُمِْ", "B.  َصْلَىٰ نَارًا حَامِيَةً", "C. لَّسْتَ عَلَيْهِم بِمُصَيْطِرٍ ", "D. ثُمَّ إِنَّ عَلَيْنَا حِسَابَهُم"}
    };

    private String mCorrectAnswers[] = {"D. 26 ayat", " C. هَلْ أَتَىٰكَ حَدِيثُ الْغٰشِيَةِ", "A. وَنَمَارِقُ مَصْفُوفَةٌ", "C. وَإِلَى الْأَرْضِ كَيْفَ سُطِحَتٌْ", " A. إِنَّ إِلَيْنَآ إِيَابَهُمْ"};

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
