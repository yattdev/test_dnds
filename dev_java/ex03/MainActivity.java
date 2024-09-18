package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText;
    Button submitButton;
    TextView validationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lier les vues
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        submitButton = findViewById(R.id.submitButton);
        validationTextView = findViewById(R.id.validationTextView);

        // Ajouter une action pour le bouton de soumission
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateForm();
            }
        });
    }

    // Méthode pour valider le formulaire
    private void validateForm() {
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();

        // Vérifier si le champ email est vide
        if (email.isEmpty()) {
            validationTextView.setText("Veuillez entrer un email.");
            return;
        }

        // Vérifier le format de l'email
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            validationTextView.setText("Email invalide. Format attendu : nom@domaine.com");
        } else {
            validationTextView.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            validationTextView.setText("Validation réussie !");
        }
    }
}
