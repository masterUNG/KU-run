package kusrc.worapong.preyapron.sriwan.kurun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    private RadioButton avata1RadioButton, avata2RadioButton,
            avata3RadioButton, avata4RadioButton, avata5RadioButton;

    private String nameString, surnameString, idSTUString,
            yearString, userString, passwordString, avataString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //Bind Widget
        bindWidget();
    } //main method

    public void clickSignUpSign(View view) {

        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        idSTUString = idSTUEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (checkSpace()) {
            //Have Space
            MyAlertDialog myAlertDialog = new MyAlertDialog();
            myAlertDialog.myDialog(SignUpActivity.this,
                    "มีช่องว่าง",
                    "กรุณากรอก ทุกช่องคะ");

        } else {
            //No Space

        }

    }   // clickSignUp

    private boolean checkSpace() {

        boolean bolStatus = nameString.equals("") ||
                surnameString.equals("") ||
                idSTUString.equals("") ||
                userString.equals("") ||
                passwordString.equals("");

        return bolStatus;
    }

    private void bindWidget() {

        nameEditText = (EditText) findViewById(R.id.editText3);
        surnameEditText = (EditText) findViewById(R.id.editText4);
        idSTUEditText = (EditText) findViewById(R.id.editText5);
        userEditText = (EditText) findViewById(R.id.editText7);
        passwordEditText = (EditText) findViewById(R.id.editText8);
        yearSpinner = (Spinner) findViewById(R.id.spinner);
        avataRadiogroup = (RadioGroup) findViewById(R.id.ragAvata);
        avata1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        avata2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        avata3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        avata4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        avata5RadioButton = (RadioButton) findViewById(R.id.radioButton5);


    } //bindWidget
} //Main class