package com.example.mypc.customlistview;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.mypc.customlistview.R.id.textview;

/**
 * Created by MY PC on 23-03-2018.
 */

public class MyAdapter extends ArrayAdapter<String>
{
    Integer picture[];
    String text[];
    Activity activity;

    public MyAdapter(Activity activity,String text[], Integer picture[])
    {
        super(activity,R.layout.jadu,text);
        this.picture=picture;
        this.text=text;
        this.activity=activity;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.jadu,null);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(textview);

        imageView.setImageResource(picture[position]);
        textView.setText(text[position]);

        if(position==0)
        {
            view.setBackgroundColor(Color.RED);
        }
        else if(position==1)
        {
            view.setBackgroundColor(Color.BLUE);
        }
        else if(position==2)
        {
            view.setBackgroundColor(Color.BLACK);
        }
        else if(position==3)
        {
            view.setBackgroundColor(Color.YELLOW);
        }
        else if(position==4)
        {
            view.setBackgroundColor(Color.GREEN);
        }
        else if(position==5)
        {
            view.setBackgroundColor(Color.GRAY);
        }
        else if(position==6)
        {
            view.setBackgroundColor(Color.YELLOW);
        }

        return view;
    }
}
