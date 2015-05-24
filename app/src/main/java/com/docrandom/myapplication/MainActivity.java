package com.docrandom.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.R.layout;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.docrandom.myapplication.MESSAGE";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
public void sendMessage(View view){
	Intent intent = new Intent(this, DisplayMessageActivity.class);
	EditText editText = (EditText) findViewById(R.id.edit_message);
	String message = editText.getText().toString();
	intent.putExtra(EXTRA_MESSAGE, message);
	startActivity(intent);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
        

        return super.onOptionsItemSelected(item);
    }
}

    private void openSearch() {

    }
    private void openSettings(){

    }
}
