package com.example.latihanlistviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //listview
        var listview = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        //addding items in listview
        list.add(Model("Ruby", "Ruby is an open-source and fully object-oriented programming language",R.drawable.ruby))
        list.add(Model("Rails", "Ruby on Rais is a server-side web application development framework written in Ruby Language", R.drawable.rails))
        list.add(Model("Ptyton", "Phyton is intrepreted scripting and object-oriented programming language",R.drawable.python))
        list.add(Model("Java Script", "JavaScript is an object-based scripting language",R.drawable.javascript))
        list.add(Model("PHP", "PHP is an Interpreted language i.e there is no need for compilation",R.drawable.php))

        //adapter
        listview.adapter = MyListAdapter(this, R.layout.row, list)

        //listview item clicks
        listview.setOnItemClickListener{ parent: AdapterView<*>?, view: View?, position: Int, I: Long ->
            if (position==0){
                Toast.makeText(this@MainActivity, "Item One Clicked...", Toast.LENGTH_SHORT).show()
                }
            if (position==1){
                Toast.makeText(this@MainActivity, "Item Two Clicked...", Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "Item Three Clicked...", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "Item Four Clicked...", Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "Item Five Clicked...", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
