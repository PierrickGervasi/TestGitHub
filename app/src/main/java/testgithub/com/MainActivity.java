package testgithub.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testUpload(){
        int i=1+1;

        int ii=2+2;

        int iii=i+ii;
    }
    
    private void aChangeWasMade(){
        int a=2;   
    }
    
    private void extChange(){
        int b=3;   
    }
    
    private void extChangeMerge(){
        int d=4;   
    }
    
    private void extChangeMergeMerge(){
        int e=5;   
    }
    
}
