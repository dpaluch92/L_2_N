package com.masiad.l_2_n;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etName = findViewById(R.id.etPersonName);
        final EditText etLastName = findViewById(R.id.etPersonLastName);
        final TextView tvPerson = findViewById(R.id.textView);
        Button bSave = findViewById(R.id.bSave);
        ListView lvPerson = findViewById(R.id.lvPersonList);

        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String lastName = etLastName.getText().toString();
                tvPerson.setText(name + " " + lastName);
                Toast.makeText(MainActivity.this, "Dodano nowy rekord", Toast.LENGTH_SHORT).show();
                View parentView = findViewById(android.R.id.content);

                // doanie Snackbar do
                // aby dodać ten element należy w pliku app/grundle.build dodać rekord
                // implementation 'com.google.android.material:material:1.3.0-alpha01'

                Snackbar snackbar = Snackbar.make(parentView, "tekst", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

        // zadanie
        // napisz metodę która doda osobę do listy i wyświeli ją na ekranie

        List<String> personList = new ArrayList<>();
        personList.add("Tomasz Nowak");
        personList.add("Ewa Nowak");
        personList.add("Paweł Kowalski");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1, personList);
        lvPerson.setAdapter(adapter);
    }
}