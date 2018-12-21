package androidsingh.navjyotsingh.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;

    //TimePicker timePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //timePicker=findViewById(R.id.timepicker);
        datePicker=findViewById(R.id.datepicker);
        textView=findViewById(R.id.textview);


        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int month, int day) {

                        textView.setText("You selected: "+day+"-"+(month+1)+"-"+year);
                    }
                }
        );



//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
//                textView.setText("Hour: "+hour+"\n Minutes: "+minute);
//
//            }
//        });
    }
}
