package com.example.colortheme;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.Menu;

public class MainActivity extends Activity {

	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        //btn1 = (Button) findViewById(R.id.button1);
        //btn1.setBackgroundColor(rColor.getRColor());
        
        
     // создание обработчика
        OnClickListener oclBtn = new OnClickListener() {
          @Override
          public void onClick(View v) {
            // TODO Auto-generated method stub
    
        	// по id определеяем кнопку, вызвавшую этот обработчик
              switch (v.getId()) {
              case R.id.button1:
                // кнопка 1
                 
                break;
              case R.id.button2:
                  // кнопка 1
                   
                  break;
              case R.id.button3:
                  // кнопка 1
                   
                  break;
              case R.id.button4:
                  // кнопка 1
                   
                  break;
              case R.id.button5:
                  // кнопка 1
                   
                  break;
              case R.id.button6:
                  // кнопка 1
                   
                  break;
              
              }
          }
        };
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuInflater mif = getMenuInflater();
        mif.inflate(R.menu.menu_main, menu);
    	return super.onCreateOptionsMenu(menu);
      }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	super.onOptionsItemSelected(item);
    	switch(item.getItemId()){
    	case R.id.iMenuRefresh:
    		refreshMenuItem();
    		break;
    	case R.id.iMenuAbout:
    		aboutMenuItem();
    		break;
    	}
    	return true;
    }
    
    private void aboutMenuItem(){
    	new AlertDialog.Builder(this).setTitle("О программе").setMessage("Создал Бирюков Олег АП-72 28.09.2014").setNeutralButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		}).show();
    }
    
    private void refreshMenuItem(){
    	updateColor();
    }
    
    public void updateColor()
    {
    	btn = (Button) findViewById(R.id.button1);
        btn.setBackgroundColor(rColor.getRColor());
        
        btn = (Button) findViewById(R.id.button2);
        btn.setBackgroundColor(rColor.getRColor());
        
        btn = (Button) findViewById(R.id.button3);
        btn.setBackgroundColor(rColor.getRColor());
        
        btn = (Button) findViewById(R.id.button4);
        btn.setBackgroundColor(rColor.getRColor());
        
        btn = (Button) findViewById(R.id.button5);
        btn.setBackgroundColor(rColor.getRColor());
        
        btn = (Button) findViewById(R.id.button6);
        btn.setBackgroundColor(rColor.getRColor());
    }

  
}
