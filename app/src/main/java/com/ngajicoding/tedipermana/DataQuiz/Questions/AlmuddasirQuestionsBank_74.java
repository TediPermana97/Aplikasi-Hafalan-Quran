package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlmuddasirQuestionsBank_74 {

    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Muddatstsir sebutkan ?",
            "2. Bacakanlah ayat ke-10 dari surat  Al-Muddatstsir ?",
            "3. Bacakanlah ayat ke-20 dari surat Al-Muddatstsir ?",
            "4. Bacakanlah ayat ke-30 dari surat  Al-Muddatstsir",
            "5. Bacakanlah ayat ke-32 dari surat Al-Muddatstsir  ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 56 ayat", "B. 30 ayat", "C. 40 ayat", "D. 50 ayat"},
            {"A. وَلَا تَمْنُن تَسْتَكْثِرُ ", "B. وَالرُّجْزَ فَاهْجُرْ", "C. عَلَى الْكٰفِرِينَ غَيْرُ يَسِيرٍ", "D. وَلِرَبِّكَ فَاصْبِرْ "},
            {"A. ثُمَّ قُتِلَ كَيْفَ قَدَّرَ", "B. ثُمَّ أَدْبَرَ وَاسْتَكْبَرَ", "C. وَمَآ أَدْرَىٰكَ مَا سَقَرُ", "D. إِنْ هٰذَآ إِلَّا قَوْلُ الْبَشَرِ"},
            {"A. لَوَّاحَةٌ لِّلْبَشَرِ", "B. وَمَآ أَدْرَىٰكَ مَا سَقَرُ", "C. وَلِرَبِّكَ فَاصْبِرْ ", "D. عَلَيْهَا تِسْعَةَ عَشَرَ"},
            {"A. كَلَّا وَالْقَمَرِِ", "B. لِمَن شَآءَ مِنكُمْ أَن يَتَقَدَّمَ أَوْ يَتَأَخَّرَ", "C. إِنَّهَا لَإِحْدَى الْكُبَرِ", "D. نَذِيرًا لِّلْبَشَرِ"}
    };

    private String mCorrectAnswers[] = {"A. 56 ayat", "C. عَلَى الْكٰفِرِينَ غَيْرُ يَسِيرٍ", "A. ثُمَّ قُتِلَ كَيْفَ قَدَّرَ", "D. عَلَيْهَا تِسْعَةَ عَشَرَ", "A. كَلَّا وَالْقَمَرِ"};

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
