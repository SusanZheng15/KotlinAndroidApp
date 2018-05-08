package com.example.susan.firstandroidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeLabelButton.setOnClickListener({
            buttonAction()
        })

        goToListViewButton.setOnClickListener({
            goToListView()
        })
    }


    private fun buttonAction(){
        textView.text = "Congrats, you changed a label"
    }

    private fun goToListView(){
        println("action to open a new activity and display a list view")
    }
}
