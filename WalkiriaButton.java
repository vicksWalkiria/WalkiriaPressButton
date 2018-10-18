public class WalkiriaButton extends android.support.v7.widget.AppCompatButton implements View.OnTouchListener {
    public WalkiriaButton(Context context) {
        super(context);
        this.setOnTouchListener(this);
    }

    public WalkiriaButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(this);

    }

    public WalkiriaButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOnTouchListener(this);
    }


    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                view.setAlpha(0.8f);
                break;
            }
            case MotionEvent.ACTION_CANCEL: {
                view.setAlpha(1.0f);
                break;
            }
            case MotionEvent.ACTION_UP: {
                view.setAlpha(1.0f);
                break;
            }
        }
        return false;
    }
}
