package com.example.quizapp

import java.util.ArrayList


object Constants {

    fun getQuestions() : ArrayList<Question>{

        val arrQuestionsList = ArrayList<Question>()

        val questionsList = listOf(
            Question(
                1,
                "What country does this flag ?",
                R.drawable.ic_flag_of_argentina,
                "Argentina",
                "Australia",
                "brazil",
                "Morocco",
                1
            ),
            Question(
                2,
                "What country does this flag ?",
                R.drawable.ic_flag_of_brazil,
                "Germany",
                "India",
                "brazil",
                "Zealand",
                3
            ),
            Question(
                3,
                "What country does this flag ?",
                R.drawable.ic_flag_of_belgium,
                "Kuwait",
                "Belgium",
                "australia",
                "Germany",
                2
            ),
            Question(
                4,
                "What country does this flag ?",
                R.drawable.ic_flag_of_denmark,
                "Denmark",
                "Belgium",
                "India",
                "New Zealand",
                1
            ),
            Question(
                5,
                "What country does this flag ?",
                R.drawable.ic_flag_of_fiji,
                "Germany",
                "Kuwait",
                "fiji",
                "brazil",
                3
            ),
            Question(
                6,
                "What country does this flag ?",
                R.drawable.ic_flag_of_india,
                "Belgium",
                "brazil",
                "New Zealand",
                "India",
                3
            ),
            Question(
                7,
                "What country does this flag ?",
                R.drawable.ic_flag_of_kuwait,
                "Belgium",
                "Kuwait",
                "Denmark",
                "Germany",
                2
            ),
            Question(
                8,
                "What country does this flag ?",
                R.drawable.ic_flag_of_new_zealand,
                "Argentina",
                "Australia",
                "Morocco",
                "New Zealand",
                4
            ),
            Question(
                9,
                "What country does this flag ?",
                R.drawable.ic_flag_of_germany,
                "Kuwait",
                "Australia",
                "India",
                "Germany",
                4
            ),
            Question(
                10,
                "What country does this flag ?",
                R.drawable.ic_flag_of_australia,
                "fiji",
                "Australia",
                "India",
                "Denmark",
                2
            )
        )

        for (question in questionsList){
            arrQuestionsList.add(question)
        }
        return arrQuestionsList
    }
}