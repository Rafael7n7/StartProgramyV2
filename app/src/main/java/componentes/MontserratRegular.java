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
public class MontserratRegular extends android.support.v7.widget.AppCompatTextView {
    public MontserratRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MontserratRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MontserratRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Montserrat-Regular.ttf");
            setTypeface(tf);
        }
    }
}
