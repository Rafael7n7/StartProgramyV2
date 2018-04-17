package componentes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ViewFlipper;

public class IndicatorViewFlipper extends ViewFlipper {
	Context context;
	Paint paint = new Paint();

	public IndicatorViewFlipper(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	@Override
	protected void dispatchDraw(Canvas canvas) {
		super.dispatchDraw(canvas);
		int width = getWidth();
		
		float margin = 0;
		float radius = 0;
		
		margin = convertDpToPixels(2, context);
		radius = convertDpToPixels(4, context);
		
		float cx = width / 2 - ((radius + margin) * 2 * getChildCount() / 2);
		float cy = getHeight() - 15;
		
		canvas.save();
		
		for (int i = 0; i < getChildCount(); i++) {
			if (i == getDisplayedChild()) {
				paint.setColor(Color.WHITE);
				canvas.drawCircle(cx, cy, radius, paint);
			} 
			else {
				paint.setColor(Color.GRAY);
				canvas.drawCircle(cx, cy, radius, paint);
			}
			cx += 2 * (radius + margin);
		}
		
		canvas.restore();
	}
	
	public static int convertDpToPixels(float dp, Context context) {
	    int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
	    return px; 
	}
}
