package com.example.assignment31122021;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterPerson extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Person> people;

    public AdapterPerson(Context context, int layout, List<Person> people) {
        this.context = context;
        this.layout = layout;
        this.people = people;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int i) {
        return people.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        Person person = people.get(i);

        TextView userName = view.findViewById(R.id.userName);
        TextView email = view.findViewById(R.id.email);
        ImageView imageView = view.findViewById(R.id.imageView);

        userName.setText(person.getUsername());
        email.setText(person.getEmail());
        Picasso.with(context.getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").into(imageView); // TODO

        return view;
    }
}
