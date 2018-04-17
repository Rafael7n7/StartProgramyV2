package componentes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class MapImageView extends ImageView {
  public MapImageView(Context context) {
    super(context);
  }

  public MapImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public MapImageView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    int width = getMeasuredWidth();
    int height = (int) (width - (width * 0.6));
    setMeasuredDimension(width, height);
  }
}
