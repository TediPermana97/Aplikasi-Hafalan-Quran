package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlmuthafifinQuestionsBank_83 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Muthaffifin sebutkan?",
            "2. Bacakanlah ayat ke-5 dari surat Al-Muthaffifin?",
            "3. Bacakanlah ayat ke-25 dari surat Al-Muthaffifin ?",
            "4. Bacakanlah ayat ke-22 dari surat Al-Muthaffifin",
            "5. Bacakanlah ayat ke-11 dari surat Al-Muthaffifin ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 36 ayat", "B. 40 ayat", "C. 67 ayat", "D. 44 ayat"},
            {"A. كِتٰبٌ مَّرْقُومٌ", "B. وَمَآ أَدْرَىٰكَ مَا سِجِّينٌ", "C. لِيَوْمٍ عَظِيمٍ", "D. أَلَا يَظُنُّ أُو۟لٰٓئِكَ أَنَّهُم مَّبْعُوثُونَ"},
            {"A. يُسْقَوْنَ مِن رَّحِيقٍ مَّخْتُومٍ", "B. عَلَى الْأَرَآئِكِ يَنظُرُونَ", "C. وَمِزَاجُهُۥ مِن تَسْنِيمٍ ", "D. عَلَى الْأَرَآئِكِ يَنظُرُونَ "},
            {"A. إِنَّ الْأَبْرَارَ لَفِى نَعِيمٍ ", "B. كِتٰبٌ مَّرْقُومٌ ", "C. وَمِزَاجُهُۥ مِن تَسْنِيمٍ", "D. عَلَى الْأَرَآئِكِ يَنظُرُونَ "},
            {"A. الَّذِينَ يُكَذِّبُونَ بِيَوْمِ الدِّينِِ", "B. وَمَا يُكَذِّبُ بِهِۦٓ إِلَّا كُلُّ مُعْتَدٍ أَثِيمٍ", "C. إِنَّ الْأَبْرَارَ لَفِى نَعِيمٍ ", "D. ثُمَّ إِنَّهُمْ لَصَالُوا۟ الْجَحِيمِ "}
    };

    private String mCorrectAnswers[] = {"A. 36 ayat", "C. لِيَوْمٍ عَظِيمٍ", "A. يُسْقَوْنَ مِن رَّحِيقٍ مَّخْتُومٍ", "A. إِنَّ الْأَبْرَارَ لَفِى نَعِيمٍ", "A. الَّذِينَ يُكَذِّبُونَ بِيَوْمِ الدِّينِ"};

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
