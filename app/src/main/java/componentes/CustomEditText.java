package componentes;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


/**
 * Created with IntelliJ IDEA.
 * User: Mohsen Afshin
 * Date: 8/4/13
 * Time: 5:36 PM
 */
public class CustomEditText extends android.support.v7.widget.AppCompatEditText {
    public CustomEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Regular.ttf");
            setTypeface(tf);
        }
    }
}
