package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class NuhQuestionsBank_71 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Nuh sebutkan?",
            "2. Bacakanlah ayat ke-16 dari surat Nuh?",
            "3. Bacakanlah ayat ke-18 dari surat Nuh?",
            "4. Bacakanlah ayat ke-8 dari surat Nuh",
            "5. Bacakanlah ayat ke-3 dari surat Nuh?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 28 ayat", "B. 20 ayat", "C. 36 ayat", "D. 25 ayat"},
            {"A. وَجَعَلَ الْقَمَرَ فِيهِنَّ نُورًا وَجَعَلَ الشَّمْسَ سِرَاجًا", "B. وَقَدْ خَلَقَكُمْ أَطْوَارًا", "C. يُرْسِلِ السَّمَآءَ عَلَيْكُم مِّدْرَارًا ", "D. مَّا لَكُمْ لَا تَرْجُونَ لِلَّـهِ وَقَارًا "},
            {"A. ثُمَّ يُعِيدُكُمْ فِيهَا وَيُخْرِجُكُمْ إِخْرَاجًا", "B. وَاللَّـهُ أَنۢبَتَكُم مِّنَ الْأَرْضِ نَبَاتًا", "C. يُرْسِلِ السَّمَآءَ عَلَيْكُم مِّدْرَارًا ", "D. مَّا لَكُمْ لَا تَرْجُونَ لِلَّـهِ وَقَارًا"},
            {"A. ثُمَّ إِنِّى دَعَوْتُهُمْ جِهَارًا", "B. وَقَدْ خَلَقَكُمْ أَطْوَارًا", "C. يُرْسِلِ السَّمَآءَ عَلَيْكُم مِّدْرَارًا", "D. مَّا لَكُمْ لَا تَرْجُونَ لِلَّـهِ وَقَارًا "},
            {"A. فَلَمْ يَزِدْهُمْ دُعَآءِىٓ إِلَّا فِرَارًاِ", "B. أَنِ اعْبُدُوا۟ اللَّـهَ وَاتَّقُوهُ وَأَطِيعُونِ", "C. مَّا لَكُمْ لَا تَرْجُونَ لِلَّـهِ وَقَارًا ", "D. قَالَ يٰقَوْمِ إِنِّى لَكُمْ نَذِيرٌ مُّبِينٌ"}
    };

    private String mCorrectAnswers[] = {"A. 28 ayat", "A وَجَعَلَ الْقَمَرَ فِيهِنَّ نُورًا وَجَعَلَ الشَّمْسَ سِرَاجًا", "بِسْمِ اللَّـهِ الرَّحْمٰنِ الرَّحِيم", "A. ثُمَّ يُعِيدُكُمْ فِيهَا وَيُخْرِجُكُمْ إِخْرَاجً", " B. أَنِ اعْبُدُوا۟ اللَّـهَ وَاتَّقُوهُ وَأَطِيعُونِ"};

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
