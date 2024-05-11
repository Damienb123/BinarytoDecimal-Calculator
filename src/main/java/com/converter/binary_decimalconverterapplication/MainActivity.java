/**
 * This activity represents the main screen of the Binary to Decimal Converter application.
 * It allows users to enter a binary number, convert it to decimal, and display the result.
 */
package com.converter.binary_decimalconverterapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.binary_decimalconverterapplication.R;

public class MainActivity extends AppCompatActivity {

    /**
     * Called when the activity is starting. This is where most initialization should go.
     * @param savedInstanceState If the activity is being re-initialized after previously
     *                            being shut down then this Bundle contains the data it most
     *                            recently supplied in onSaveInstanceState(Bundle).
     *                            Note: Otherwise, it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing EditTexts and Buttons
        EditText input = findViewById(R.id.editText);
        EditText output = findViewById(R.id.output);
        Button submit = findViewById(R.id.submit);
        Button reset = findViewById(R.id.reset);

        // Submit Button OnClickListener
        submit.setOnClickListener(v -> {
            String string = input.getText().toString();
            int i = Integer.parseInt(string, 2); // Convert binary string to integer
            String decimal = Integer.toString(i); // Convert integer to decimal string
            output.setText(decimal); // Display decimal value in output EditText
        });

        // Reset Button OnClickListener
        reset.setOnClickListener(v -> {
            input.setText(""); // Clear input EditText
            output.setText(""); // Clear output EditText
        });
    }
}