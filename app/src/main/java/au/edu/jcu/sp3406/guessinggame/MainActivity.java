package au.edu.jcu.sp3406.guessinggame;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void checkGuess(View view) {
        EditText userInput = findViewById(R.id.userInput);
        String text = userInput.getText().toString();
        int guess = Integer.parseInt(text);
        Toast toast = Toast.makeText(this,"you won!", Toast.LENGTH_LONG);
        if(!Game.check(guess)){
            toast.setText("incorrect.. try again!");
        }
        toast.show();
}
}