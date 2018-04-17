package componentes;

import android.content.Context;
import android.util.AttributeSet;

public class LogoImageView extends android.support.v7.widget.AppCompatImageView {
    public LogoImageView(Context context) {
        super(context);
    }

    public LogoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LogoImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = Math.max(getMeasuredWidth(), getMeasuredHeight());
        int sizeH = (int) (size - (size * 0.75));
        setMeasuredDimension(size, sizeH);
    }
}
