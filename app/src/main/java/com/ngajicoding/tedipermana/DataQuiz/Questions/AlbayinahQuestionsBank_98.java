package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlbayinahQuestionsBank_98 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Bayyinah sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Bayyinah?",
            "3. Bacakanlah ayat ke-2 dari surat Al-Bayyinah?",
            "4. Bacakanlah ayat ke-7 dari surat Al-Bayyinah",
            "5. Bacakanlah ayat ke-1 dari surat Al-Bayyinah ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 7 ayat", "B. 8 ayat", "C. 9 ayat", "D. 10 ayat"},
            {"A. فِيهَا كُتُبٌ قَيِّمَةٌ ", "B. رَسُولٌ مِّنَ اللهِ يَتْلُوا۟ صُحُفًا مُّطَهَّرَةً", "C. وَمَا تَفَرَّقَ الَّذِينَ أُوتُوا۟ الْكِتٰبَ إِلَّا مِنۢ بَعْدِ مَا جَآءَتْهُمُ الْبَيِّنَةُ", "D. إِنَّ الَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ الصّٰلِحٰتِ أُو۟لٰٓئِكَ هُمْ خَيْرُ الْبَرِيَّةِ"},
            {"A. فِيهَا كُتُبٌ قَيِّمَةٌ ", "B. وَمَا تَفَرَّقَ الَّذِينَ أُوتُوا۟ الْكِتٰبَ إِلَّا مِنۢ بَعْدِ مَا جَآءَتْهُمُ الْبَيِّنَةُ", "C. رَسُولٌ مِّنَ اللهِ يَتْلُوا۟ صُحُفًا مُّطَهَّرَةً", "D. إِنَّ الَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ الصّٰلِحٰتِ أُو۟لٰٓئِكَ هُمْ خَيْرُ الْبَرِيَّةِ"},
            {"A. إِنَّ الَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ الصّٰلِحٰتِ أُو۟لٰٓئِكَ هُمْ خَيْرُ الْبَرِيَّةِ", "B. فِيهَا كُتُبٌ قَيِّمَةٌ ", "C. رَسُولٌ مِّنَ اللهِ يَتْلُوا۟ صُحُفًا مُّطَهَّرَةً", "D. وَمَا تَفَرَّقَ الَّذِينَ أُوتُوا۟ الْكِتٰبَ إِلَّا مِنۢ بَعْدِ مَا جَآءَتْهُمُ الْبَيِّنَةُ"},
            {"A. فِيهَا كُتُبٌ قَيِّمَةٌ ٌِ", "B. رَسُولٌ مِّنَ اللهِ يَتْلُوا۟ صُحُفًا مُّطَهَّرَةً", "C. وَمَا تَفَرَّقَ الَّذِينَ أُوتُوا۟ الْكِتٰبَ إِلَّا مِنۢ بَعْدِ مَا جَآءَتْهُمُ الْبَيِّنَةُ", "D. لَمْ يَكُنِ الَّذِينَ كَفَرُوا۟ مِنْ أَهْلِ الْكِتٰبِ وَالْمُشْرِكِينَ مُنفَكِّينَ حَتَّىٰ تَأْتِيَهُمُ الْبَيِّنَةُ"}
    };

    private String mCorrectAnswers[] = {"B. 8 ayat", "A. فِيهَا كُتُبٌ قَيِّمَةٌ ", " C. رَسُولٌ مِّنَ اللهِ يَتْلُوا۟ صُحُفًا مُّطَهَّرَةً", "A. إِنَّ الَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ الصّٰلِحٰتِ أُو۟لٰٓئِكَ هُمْ خَيْرُ الْبَرِيَّةِ", "D. لَمْ يَكُنِ الَّذِينَ كَفَرُوا۟ مِنْ أَهْلِ الْكِتٰبِ وَالْمُشْرِكِينَ مُنفَكِّينَ حَتَّىٰ تَأْتِيَهُمُ الْبَيِّنَةُ"};

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
