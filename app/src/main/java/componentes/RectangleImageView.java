package componentes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RectangleImageView extends android.support.v7.widget.AppCompatImageView {
  public RectangleImageView(Context context) {
    super(context);
  }

  public RectangleImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public RectangleImageView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    int size = Math.max(getMeasuredWidth(), getMeasuredHeight());
    int sizeH = (int) (size - (size * 0.60));
    setMeasuredDimension(size, sizeH);
  }
}
