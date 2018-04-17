package componentes;

import android.content.Context;
import android.util.AttributeSet;

import com.joooonho.SelectableRoundedImageView;

public class SquareRoundedImageView extends SelectableRoundedImageView {
    public SquareRoundedImageView(Context context) {
        super(context);
    }

    public SquareRoundedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareRoundedImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        setMeasuredDimension(width, width);
    }
}

