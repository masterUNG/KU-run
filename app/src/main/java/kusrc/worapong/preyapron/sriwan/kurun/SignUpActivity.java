package kusrc.worapong.preyapron.sriwan.kurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, surnameEditText, idSTUEditText,
            userEditText, passwordEditText;
    private Spinner yearSpinner;
    private RadioGroup avataRadiogroup;
    private RadioButton avata1RadioButton, avata2RadioButtonavata3RadioButtonavata4RadioButton,avata5RadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //Bind Widget
        bindWidget();
    } //main method
    public void  clickSignUpSign(View view){

    }

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText3);
        surnameEditText = (EditText)findViewById(R.id.editText4);
        idSTUEditText = (EditText) findViewById(R.id.editText5);
        userEditText = (EditText) findViewById(R.id.editText7);
        passwordEditText = (EditText)findViewById(R.id.editText8);


    } //bindWidget
} //Main class