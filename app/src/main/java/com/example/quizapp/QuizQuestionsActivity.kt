package com.example.quizapp

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class QuizQuestionsActivity : AppCompatActivity() {

    private var progressBar : ProgressBar? = null
    private var tvProcess : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionThree : TextView? = null
    private var tvOptionFour : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_questions)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val controller = WindowInsetsControllerCompat(window, window.decorView)
        controller.hide(WindowInsetsCompat.Type.systemBars())
        controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        progressBar = findViewById(R.id.progressBar)
        tvProcess = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_Image)

        tvOptionOne = findViewById(R.id.tv_option_One)
        tvOptionTwo = findViewById(R.id.tv_option_Two)
        tvOptionThree = findViewById(R.id.tv_option_Three)
        tvOptionFour = findViewById(R.id.tv_option_Four)



        val questionList = Constants.getQuestions()
        var currentPosition = 1

        val question : Question = questionList[currentPosition-1]
        progressBar?.progress = currentPosition
        tvProcess?.text = "${currentPosition}/${progressBar?.max}"
        tvQuestion?.text = question.question
        ivImage?.setImageResource(question.image)

        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTow
        tvOptionThree?.text = question.optionTree
        tvOptionFour?.text = question.optionFour







    }
}