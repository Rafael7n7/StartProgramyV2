
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
public class ButtonMontSerrat extends android.support.v7.widget.AppCompatButton {
    public ButtonMontSerrat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public ButtonMontSerrat(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonMontSerrat(Context context) {
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

