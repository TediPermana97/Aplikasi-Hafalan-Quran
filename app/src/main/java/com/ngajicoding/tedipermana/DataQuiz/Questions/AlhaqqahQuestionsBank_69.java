package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlhaqqahQuestionsBank_69 {

    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Haqqah sebutkan?",
            "2. Bacakanlah ayat ke-5 dari surat Al-Haqqah?",
            "3. Bacakanlah ayat ke-10 dari surat Al-Haqqah?",
            "4. Bacakanlah ayat ke-23 dari surat Al-Haqqah ",
            "5. Bacakanlah ayat terakhir dari surat Al-Haqqah ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 40 ayat", "B. 52 ayat", "C. 60 ayat", "D. 32 ayat"},
            {"A. الْحَآقَّةُ", "B. فَأَمَّا ثَمُودُ فَأُهْلِكُوا۟ بِالطَّاغِيَةِ ", "C. وَمَآ أَدْرَىٰكَ مَا الْحَآقَّةُ ", "D. فَهَلْ تَرَىٰ لَهُم مِّنۢ بَاقِيَةٍ"},
            {"A. فَعَصَوْا۟ رَسُولَ رَبِّهِمْ فَأَخَذَهُمْ أَخْذَةً رَّابِيَةً", "B. فَيَوْمَئِذٍ وَقَعَتِ الْوَاقِعَةُ", "C. وَانشَقَّتِ السَّمَآءُ فَهِىَ يَوْمَئِذٍ وَاهِيَةٌ ", "D. إِنَّا لَمَّا طَغَا الْمَآءُ حَمَلْنٰكُمْ فِى الْجَارِيَةِ"},
            {"A. قُطُوفُهَا دَانِيَةٌ ", "B. وَلَمْ أَدْرِ مَا حِسَابِيَهْ ", "C. هَلَكَ عَنِّى سُلْطٰنِيَهْ ", "D. فِى جَنَّةٍ عَالِيَةٍ"},
            {"A. وَإِنَّهُۥ لَتَذْكِرَةٌ لِّلْمُتَّقِينَ ", "B. فِى جَنَّةٍ عَالِيَةٍ ", "C. قُطُوفُهَا دَانِيَةٌ ", "D. فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ"}
    };

    private String mCorrectAnswers[] = {"B 52 ayat", " B. فَأَمَّا ثَمُودُ فَأُهْلِكُوا۟ بِالطَّاغِيَةِ ", "A. فَعَصَوْا۟ رَسُولَ رَبِّهِمْ فَأَخَذَهُمْ أَخْذَةً رَّابِيَةً", " A. قُطُوفُهَا دَانِيَةٌ ", " D. فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ"};

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
