package example.com.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a reference to the view for pressing
        TextView longclick = (TextView) findViewById(R.id.text);

        //Register the View to which the context menu should be associated & and pass it the View.
        registerForContextMenu(longclick);
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater(); //inflate the context menu from a menu resource.
        inflater.inflate(R.menu.menu, menu);
    }

    //When the user selects a menu item, the system calls this method
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action1:
                Toast.makeText(this, "You have clicked Action 1.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action2:
                Toast.makeText(this, "You have clicked Action 2.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action3:
                Toast.makeText(this, "You have clicked Action 3.", Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}
