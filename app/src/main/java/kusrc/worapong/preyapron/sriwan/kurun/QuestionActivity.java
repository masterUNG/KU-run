package kusrc.worapong.preyapron.sriwan.kurun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    //Explicit
    private ImageView imageView;
    private TextView titleTextView, questionTextView;
    private RadioGroup radioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton,
            choice3RadioButton, choice4RadioButton;
    private String titleString;
    private int iconAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        //Bind Widget
        bindWidget();

        //Show View
        titleString = getIntent().getStringExtra("Base");
        iconAnInt = getIntent().getIntExtra("Icon", R.drawable.base1);
        titleTextView.setText(titleString);
        imageView.setImageResource(iconAnInt);

    }   // Main Method

    private void bindWidget() {

        imageView = (ImageView) findViewById(R.id.imageView7);
        titleTextView = (TextView) findViewById(R.id.textView11);
        questionTextView = (TextView) findViewById(R.id.textView10);
        radioGroup = (RadioGroup) findViewById(R.id.ragChoice);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton6);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton7);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton8);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton9);

    }   // bindWidget

    public void clickAnswer(View view) {

    }

}   // Main Class
