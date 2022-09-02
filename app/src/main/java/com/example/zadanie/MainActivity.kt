package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val widok = findViewById<Button>(R.id.button);
        val obraz = findViewById<ImageView>(R.id.imageView);
        val tekst = findViewById<TextView>(R.id.textView);

        var x =0;

        widok.setOnClickListener {

            if(x==0) {
                obraz.visibility= View.VISIBLE;
                tekst.visibility= View.VISIBLE;
                x++;
            }

            else if(x==1) {
                obraz.visibility= View.INVISIBLE;
                tekst.visibility= View.INVISIBLE;
                x--;
            }
        }



    }
}