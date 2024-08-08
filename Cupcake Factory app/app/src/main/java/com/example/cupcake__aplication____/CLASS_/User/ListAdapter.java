package com.example.cupcake__aplication____.CLASS_.User;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.cupcake__aplication____.R;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<listview> {
    private Context context;
    private ArrayList<listview> categoryArrayList;

    public ListAdapter(Context context, ArrayList<listview> categoryArrayList) {
        super(context, R.layout.list_item, categoryArrayList);
        this.context = context;
        this.categoryArrayList = categoryArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



            listview currentItem = getItem(position);

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }

            ImageView imageView = convertView.findViewById(R.id.image01);
            TextView textView = convertView.findViewById(R.id.cake);

            if (currentItem != null) {
                imageView.setImageResource(currentItem.getImageID());
                textView.setText(currentItem.getCupcakeName());
            }

            return convertView;
    }
}
