package com.scratcher_wrj.buaixueos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Preview extends Activity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview);

        radioGroup = (RadioGroup) findViewById(R.id.previewRightRadioRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                updateTextView(radioGroup);
            }
        });
    }
    // 看起来写了一大堆实际上什么用也没有的代码
    private void updateTextView(RadioGroup radioGroup) {
        RadioButton checkedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        TextView textView = (TextView) findViewById(R.id.previewRightTextTextView);
        if (checkedRadioButton.getContentDescription() == "To do") {
            textView.setText("哇，没有待完成的预习哦~");
        } else if (checkedRadioButton.getContentDescription() == "Done") {
            textView.setText("别让这里空着哟，快去完成预习吧~");
        }
    }
}