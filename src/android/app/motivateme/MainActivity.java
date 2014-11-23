package android.app.motivateme;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.app.getmycontacts.R;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	public static final String[] quotes = {
		"The journey of a thousand miles begins with one step - Lau tzu",
		"Success is going from failure to failure without losing your enthusiasm - Winston Churchill",
		"Life isn’t about getting and having, it’s about giving and being. –Kevin Kruse",
		"Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill",
		"Strive not to be a success, but rather to be of value. –Albert Einstein",
		"Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.  –Robert Frost",
		"I attribute my success to this: I never gave or took any excuse. –Florence Nightingale",
		"You miss 100% of the shots you don’t take. –Wayne Gretzky",
		"I’ve missed more than 9000 shots in my career. I’ve lost almost 300 games. 26 times I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life. And that is why I succeed. –Michael Jordan",
		"The most difficult thing is the decision to act, the rest is merely tenacity. –Amelia Earhart",
		"Every strike brings me closer to the next home run. –Babe Ruth",
		"Definiteness of purpose is the starting point of all achievement. –W. Clement Stone",
		"We must balance conspicuous consumption with conscious capitalism. –Kevin Kruse",
		"Life is what happens to you while you’re busy making other plans. –John Lennon",
		"We become what we think about. –Earl Nightingale",
		"Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do, so throw off the bowlines, sail away from safe harbor, catch the trade winds in your sails.  Explore, Dream, Discover. –Mark Twain",
		"Life is 10% what happens to me and 90% of how I react to it. –Charles Swindoll"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Log.i("Motivated", "MotivationNeeded");
        		TextView textView = (TextView) findViewById(R.id.text);
        		int stringIndex = randInt(1, 17);
				textView.setText(quotes[stringIndex-1]);
            }
        });
	}

	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
