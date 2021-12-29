package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlinsanQuestionsBank_76 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Insan sebutkan ?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Insan?",
            "3. Bacakanlah ayat ke-16 dari surat Al-Insan?",
            "4. Bacakanlah ayat ke-25 dari surat  Al-Insan ",
            "5. Bacakanlah ayat ke-22 dari surat Al-Insan?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 3o ayat", "B. 40 ayat", "C. 33 ayat", "D. 31 ayat"},
            {"A. إِنَّا هَدَيْنٰهُ السَّبِيلَ إِمَّا شَاكِرًا وَإِمَّا كَفُورًا", "B. إِنَّ الْأَبْرَارَ يَشْرَبُونَ مِن كَأْسٍ كَانَ مِزَاجُهَا كَافُورًا", "C. إِنَّا نَخَافُ مِن رَّبِّنَا يَوْمًا عَبُوسًا قَمْطَرِيرًا", "D. يُوفُونَ بِالنَّذْرِ وَيَخَافُونَ يَوْمًا كَانَ شَرُّهُۥ مُسْتَطِيرًا"},
            {"A. عَيْنًا فِيهَا تُسَمَّىٰ سَلْسَبِيلًا", "B. وَإِذَا رَأَيْتَ ثَمَّ رَأَيْتَ نَعِيمًا وَمُلْكًا كَبِيرًا ", "C. إِنَّ هٰذَا كَانَ لَكُمْ جَزَآءً وَكَانَ سَعْيُكُم مَّشْكُورًا ", "D. قَوَارِيرَا۟ مِن فِضَّةٍ قَدَّرُوهَا تَقْدِيرًا "},
            {"A. وَمِنَ الَّيْلِ فَاسْجُدْ لَهُۥ وَسَبِّحْهُ لَيْلًا طَوِيلًا", "B. وَاذْكُرِ اسْمَ رَبِّكَ بُكْرَةً وَأَصِيلًا", "C. وَإِذَا رَأَيْتَ ثَمَّ رَأَيْتَ نَعِيمًا وَمُلْكًا كَبِيرًا", "D. إِنَّا نَحْنُ نَزَّلْنَا عَلَيْكَ الْقُرْءَانَ تَنزِيلًا "},
            {"A. وَاذْكُرِ اسْمَ رَبِّكَ بُكْرَةً وَأَصِيلًا ِ", "B. إِنَّا نَحْنُ نَزَّلْنَا عَلَيْكَ الْقُرْءَانَ تَنزِيلًا ", "C. إِنَّ هٰذَا كَانَ لَكُمْ جَزَآءً وَكَانَ سَعْيُكُم مَّشْكُورًا", "D. عَيْنًا فِيهَا تُسَمَّىٰ سَلْسَبِيلًا"}
    };

    private String mCorrectAnswers[] = {"D. 31 ayat", "A. إِنَّا هَدَيْنٰهُ السَّبِيلَ إِمَّا شَاكِرًا وَإِمَّا كَفُورًا", "D. قَوَارِيرَا۟ مِن فِضَّةٍ قَدَّرُوهَا تَقْدِيرًا ", "B. وَاذْكُرِ اسْمَ رَبِّكَ بُكْرَةً وَأَصِيلًا", "C. إِنَّ هٰذَا كَانَ لَكُمْ جَزَآءً وَكَانَ سَعْيُكُم مَّشْكُورًا"};

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
