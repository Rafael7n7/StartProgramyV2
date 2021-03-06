package componentes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RectangleImageView3 extends ImageView {
  public RectangleImageView3(Context context) {
    super(context);
  }

  public RectangleImageView3(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public RectangleImageView3(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    int width = getMeasuredWidth();
    int height = (int) (width + (width * 0.4));
    setMeasuredDimension(width, height);
  }
}
