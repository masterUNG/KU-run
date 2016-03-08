package kusrc.worapong.preyapron.sriwan.kurun;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage myManage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request Database
        myManage = new MyManage(this);

        //Tester Add Value
        //testAddValue();

        //Delete All SQlite
        deleteAllSQLite();


    }   // Main Method

    private void deleteAllSQLite() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        sqLiteDatabase.delete(MyManage.user_table, null, null);
    }

    private void testAddValue() {
        myManage.addUser("name", "sur", "id", "2016", "user", "12345", "3");
    }

    public void clickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }
}   // Main Class
