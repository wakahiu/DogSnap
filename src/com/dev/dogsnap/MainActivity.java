package com.dev.dogsnap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView img;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        img = (ImageView)findViewById(R.id.imageView1);
        img.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		open();
        	}
        });
    }
    
    public void open(){
    	Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    	startActivityForResult(intent,0);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
    	//TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	Bitmap bp = (Bitmap) data.getExtras().get("data");
    	//img.setImageBitmap(bp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
