package com.example.assignment31122021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    TextView userName, name, phone, company, address, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.imageViewSpec);
        userName = findViewById(R.id.userNameSpec);
        name = findViewById(R.id.nameSpec);
        phone = findViewById(R.id.phoneSpec);
        company = findViewById(R.id.companySpec);
        address = findViewById(R.id.addressSpec);
        email = findViewById(R.id.emailSpec);

        Person person = (Person) getIntent().getSerializableExtra(MainActivity.EXTRA_MESSAGE);
        if (person != null) {
            Picasso.with(getApplicationContext()).load(person.getAvatarUrl()).into(imageView);
            userName.setText(getString(R.string.user_name, person.getUsername()));
            name.setText(getString(R.string.name, person.getName()));
            phone.setText(getString(R.string.phone, person.getPhone()));
            company.setText(getString(R.string.company, person.getCompany()));
            address.setText(getString(R.string.address, person.getAddress()));
            email.setText(getString(R.string.email, person.getEmail()));
        }
    }
}