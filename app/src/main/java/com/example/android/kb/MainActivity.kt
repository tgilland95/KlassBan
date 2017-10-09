package com.example.android.kb

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import com.example.android.kb.R.menu.menu_main_toolbar


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadUpDatabase()
        setContentView(R.layout.activity_main)


    }

    fun loadUpDatabase(){

    }

    fun goToClasses(){
        setContentView(R.layout.activity_class_list)
    }

    fun addNewListItem(){

    }

    private fun goToList(view: View?) {

    }


}
