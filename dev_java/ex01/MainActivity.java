import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NumbersAdapter numbersAdapter;
    private List<Integer> numbersList;
    private EditText editTextThreshold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewNumbers);
        editTextThreshold = findViewById(R.id.editTextThreshold);

        // Initialiser la liste des nombres
        numbersList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbersList.add(i);
        }

        // Configurer le RecyclerView
        numbersAdapter = new NumbersAdapter(numbersList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(numbersAdapter);

        // Ajouter un TextWatcher pour filtrer les nombres
        editTextThreshold.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterNumbers(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    // Méthode pour filtrer les nombres en fonction du seuil
    private void filterNumbers(String thresholdStr) {
        if (thresholdStr.isEmpty()) {
            numbersAdapter.setFilteredList(numbersList);
            return;
        }

        int threshold = Integer.parseInt(thresholdStr);
        List<Integer> filteredList = new ArrayList<>();
        for (int number : numbersList) {
            if (number > threshold) {
                filteredList.add(number);
            }
        }

        numbersAdapter.setFilteredList(filteredList);
    }
}
