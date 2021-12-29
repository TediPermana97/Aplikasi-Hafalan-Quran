package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class QuestionBank {

    private String textQuestions [] = {

            "1. Ada berapakah jumlah surat al – mulk sebutkan   ",
            "2. Bacakanlah ayat ke-12 dari surat Al-Mulk?",
            "3. Bacakanlah ayat ke-24 dari surat Al-Mulk?",
            "4. Bacakanlah ayat ke-18 dari surat Al-Mulk",
            "5. Bacakanlah ayat ke-7 dari surat Al-Mulk  ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 35 ayat", "B. 30 ayat", "C. 29 ayat", "D. 25 ayat"},
            {"A. أَلَا يَعْلَمُ مَنْ خَلَقَ وَهُوَ اللَّطِيفُ الْخَبِيرُ", "B. إِنَّ الَّذِينَ يَخْشَوْنَ رَبَّهُم بِالْغَيْبِ لَهُم مَّغْفِرَةٌ وَأَجْرٌ كَبِيرٌ", "C. فَاعْتَرَفُوا۟ بِذَنۢبِهِمْ فَسُحْقًا لِّأَصْحٰبِ السَّعِيرِ", "D. وَلَقَدْ كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ فَكَيْفَ كَانَ نَكِيرِ"},
            {"A. قُلْ هُوَ الَّذِى ذَرَأَكُمْ فِى الْأَرْضِ وَإِلَيْهِ تُحْشَرُونَ", "B. قُلْ إِنَّمَا الْعِلْمُ عِندَ اللَّـهِ وَإِنَّمَآ أَنَا۠ نَذِيرٌ مُّبِينٌ ", "C. وَيَقُولُونَ مَتَىٰ هٰذَا الْوَعْدُ إِن كُنتُمْ صٰدِقِينَ", "D. وَلَقَدْ كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ فَكَيْفَ كَانَ نَكِيرِ"},
            {"A. وَلَقَدْ كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ فَكَيْفَ كَانَ نَكِيرِ", "B.قُلْ هُوَ الَّذِى ذَرَأَكُمْ فِى الْأَرْضِ وَإِلَيْهِ تُحْشَرُونَ", "C. أَلَا يَعْلَمُ مَنْ خَلَقَ وَهُوَ اللَّطِيفُ الْخَبِيرُ", "D. قُلْ إِنَّمَا الْعِلْمُ عِندَ اللَّـهِ وَإِنَّمَآ أَنَا۠ نَذِيرٌ مُّبِينٌ"},
            {"A. فَاعْتَرَفُوا۟ بِذَنۢبِهِمْ فَسُحْقًا لِّأَصْحٰبِ السَّعِيرِِ", "B. إِذَآ أُلْقُوا۟ فِيهَا سَمِعُوا۟ لَهَا شَهِيقًا وَهِىَ تَفُورُ", "C. وَقَالُوا۟ لَوْ كُنَّا نَسْمَعُ أَوْ نَعْقِلُ مَا كُنَّا فِىٓ أَصْحٰبِ السَّعِيرِ", "D. إِنَّ الَّذِينَ يَخْشَوْنَ رَبَّهُم بِالْغَيْبِ لَهُم مَّغْفِرَةٌ وَأَجْرٌ كَبِيرٌ"}
    };

    private String mCorrectAnswers[] = {"B. 30 ayat", "B. إِنَّ الَّذِينَ يَخْشَوْنَ رَبَّهُم بِالْغَيْبِ لَهُم مَّغْفِرَةٌ وَأَجْرٌ كَبِيرٌ", "A. قُلْ هُوَ الَّذِى ذَرَأَكُمْ فِى الْأَرْضِ وَإِلَيْهِ تُحْشَرُونَ", " A. وَلَقَدْ كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ فَكَيْفَ كَانَ نَكِيرِ", "B. إِذَآ أُلْقُوا۟ فِيهَا سَمِعُوا۟ لَهَا شَهِيقًا وَهِىَ تَفُورُ"};

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