package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlikhlasQuestionsBank_112 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Ikhlas sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Ikhlas?",
            "3. Bacakanlah ayat ke-4 dari surat Al-Ikhlas?",
            "4. Bacakanlah ayat ke-2 dari surat Al-Ikhlas",
            "5. Bacakanlah ayat ke-1 dari surat Al-Ikhlas?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 6 ayat", "B. 5 ayat", "C. 4 ayat", "D. 10 ayat"},
            {"A. لَمْ يَلِدْ وَلَمْ يُولَدْ", "B. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ"},
            {"A. لَمْ يَلِدْ وَلَمْ يُولَدْ", "B. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ"},
            {"A. لَمْ يَلِدْ وَلَمْ يُولَدْ", "B. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. اَللهُ الصَّمَدُ"},
            {"A. لَمْ يَلِدْ وَلَمْ يُولَدِْ", "B. تَبَّتْ يَدَآ أَبِى لَهَبٍ وَتَبَّ ", "C. وَامْرَأَتُهُۥ حَمَّالَةَ الْحَطَبِ", "D. قُلْ هُوَ اللهُ أَحَدٌ"}
    };

    private String mCorrectAnswers[] = {"C. 4 ayat", " A. لَمْ يَلِدْ وَلَمْ يُولَدْ", "D. وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ", "D. اَللهُ الصَّمَدُ", "D. قُلْ هُوَ اللهُ أَحَدٌ"};

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
