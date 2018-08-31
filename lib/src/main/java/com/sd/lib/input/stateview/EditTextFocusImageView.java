package com.sd.lib.input.stateview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;

import com.sd.lib.input.FEditText;

/**
 * 焦点变化，切换选中状态
 */
public class EditTextFocusImageView extends ImageView implements FEditText.StateView
{
    public EditTextFocusImageView(Context context)
    {
        super(context);
    }

    public EditTextFocusImageView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public void onStateChanged(FEditText.ChangType type, EditText editText)
    {
        switch (type)
        {
            case Visibility:
                setVisibility(editText.getVisibility());
                break;
            case Focus:
                setSelected(editText.isFocused());
                break;
            default:
                break;
        }
    }
}