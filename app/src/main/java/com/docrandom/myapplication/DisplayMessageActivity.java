package com.docrandom.myapplication;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class DisplayMessageActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		TextView textView= new TextView(this);
		textView.setTextSize(44);
		textView.setText(message);
		setContentView(textView);
		
			/*if (savedInstanceState==null){
				getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
				
			}
	}
@Override
public boolean onOptionsItemSelected(MenuItem item){
	int id = item.getItemId();
	if(id==R.id.action_settings){
		return true;
	}
return super.onOptionsItemSelected(item);
}
public static class PlaceholderFragment extends Fragment{
public PlaceholderFragment(){}
@Override
public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
	View rootView = inflater.inflate(R.layout.fragment_display_message,container,false);
	return rootView;
}
>*/
}}
