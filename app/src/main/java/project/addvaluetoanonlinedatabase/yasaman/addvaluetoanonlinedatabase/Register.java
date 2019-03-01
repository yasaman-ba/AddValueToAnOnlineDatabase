package project.addvaluetoanonlinedatabase.yasaman.addvaluetoanonlinedatabase;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText edt_name;
    EditText edt_password;
    EditText edt_contact;
    EditText edt_country;

    Button btn_register;

    String name,password,contact,country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        edt_name = (EditText) findViewById(R.id.edt_name);
        edt_password = (EditText) findViewById(R.id.edt_pass);
        edt_contact = (EditText) findViewById(R.id.edt_contact);
        edt_country = (EditText) findViewById(R.id.edt_country);

        btn_register = (Button) findViewById(R.id.btn_insert);


    }
    public  void  RegisterUser (View view){

        name = edt_name.getText().toString();
        password = edt_password.getText().toString();
        contact = edt_contact.getText().toString();
        country = edt_country.getText().toString();
        String method = "register";

        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, name,password,contact,country);

        finish();
    }

}
