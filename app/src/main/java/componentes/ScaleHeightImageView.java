package componentes;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ScaleHeightImageView extends ImageView {
  public ScaleHeightImageView(Context context) {
    super(context);
  }

  public ScaleHeightImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public ScaleHeightImageView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    final Drawable d = this.getDrawable();

    if (d != null) {
        // ceil not round - avoid thin vertical gaps along the left/right edges
	    final int height = MeasureSpec.getSize(heightMeasureSpec);
	    final int width = (int) Math.ceil(height * (float) d.getIntrinsicWidth() / d.getIntrinsicHeight());
    
        this.setMeasuredDimension(width, height);
    } else {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
  }
}

