package com.example.mypc.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    Integer picture[]=
            {
                    R.drawable.letter,
                    R.drawable.letter_f,
                    R.drawable.letter_r,
                    R.drawable.kbc_icon,
                    R.drawable.rate,
                    R.drawable.smiley,
                    R.drawable.letter_t
            };

            String text[]=
                    {
                            "JellyBean",
                            "Lollipop",
                            "Marshmallow",
                            "Nougat",
                            "Kitkat",
                            "android",
                            "letter"
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.myList);

        MyAdapter adapter = new MyAdapter(this,text,picture);

        listView.setAdapter(adapter);
    }
}
