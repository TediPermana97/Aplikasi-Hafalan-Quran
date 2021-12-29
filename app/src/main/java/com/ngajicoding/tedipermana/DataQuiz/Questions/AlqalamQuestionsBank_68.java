package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlqalamQuestionsBank_68 {

    private String textQuestions[] = {
            "1. Ada berapakah jumlah surat Al-Qallam sebutkan?",
            "2. Bacakanlah ayat ke-2 dari surat Al-Qallam ?",
            "3. Bacakanlah ayat ke-5 dari surat Al-Qallam ?",
            "4. Bacakanlah ayat ke-10 dari surat Al-Qallam ?",
            "5. Bacakanlah ayat ke-30 dari surat Al-Qallam ?"
    };

    // array of multiple choices for each question
    private String multipleChoice[][] = {
            {"A. 46 ayat", "B. 23 ayat", "C. 40 ayat", "D. 30 ayat"},
            {"A. مَآ أَنتَ بِنِعْمَةِ رَبِّكَ بِمَجْنُونٍ", "B. بِأَييِّكُمُ الْمَفْتُونُ ", "C. فَسَتُبْصِرُ وَيُبْصِرُونَ", "D. فَلَا تُطِعِ الْمُكَذِّبِينَ"},
            {"A. فَسَتُبْصِرُ وَيُبْصِرُونَ", "B. وَإِنَّ لَكَ لَأَجْرًا غَيْرَ مَمْنُونٍ", "C. بِأَييِّكُمُ الْمَفْتُونُ ", "D فَلَا تُطِعِ الْمُكَذِّبِينَ"},
            {"A. فَسَتُبْصِرُ وَيُبْصِرُونَ", "B. بِأَييِّكُمُ الْمَفْتُونُ", "C. وَلَا تُطِعْ كُلَّ حَلَّافٍ مَّهِينٍ", "D. فَلَا تُطِعِ الْمُكَذِّبِينَ"},
            {"A. فَأَقْبَلَ بَعْضُهُمْ عَلَىٰ بَعْضٍ يَتَلٰوَمُونَِ", "B. وَلَا يَسْتَثْنُونَ", "C. سَنَسِمُهُۥ عَلَى الْخُرْطُومِ", "D. إِنَّ لِلْمُتَّقِينَ عِندَ رَبِّهِمْ جَنّٰتِ النَّعِيمِ"}
    };

    private String mCorrectAnswers[] = {"C. 40", "A. مَآ أَنتَ بِنِعْمَةِ رَبِّكَ بِمَجْنُونٍ", "A. فَسَتُبْصِرُ وَيُبْصِرُونَ", "C. وَلَا تُطِعْ كُلَّ حَلَّافٍ مَّهِينٍ", "A. فَأَقْبَلَ بَعْضُهُمْ عَلَىٰ بَعْضٍ يَتَلٰوَمُونَ"};

    public int getLength() {
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num - 1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}


