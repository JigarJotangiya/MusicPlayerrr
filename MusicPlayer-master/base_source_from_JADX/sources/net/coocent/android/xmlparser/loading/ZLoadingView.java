package net.coocent.android.xmlparser.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import p391j.p392a.p393a.C8618k;

public class ZLoadingView extends AppCompatImageView {
    protected ZLoadingBuilder mZLoadingBuilder;
    private ZLoadingDrawable mZLoadingDrawable;

    public ZLoadingView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8618k.ZLoadingView);
            int i = obtainStyledAttributes.getInt(C8618k.ZLoadingView_z_type, 0);
            int color = obtainStyledAttributes.getColor(C8618k.ZLoadingView_z_color, -16777216);
            obtainStyledAttributes.recycle();
            setLoadingBuilder(Z_TYPE.values()[i]);
            setColorFilter(color);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startAnimation() {
        ZLoadingDrawable zLoadingDrawable = this.mZLoadingDrawable;
        if (zLoadingDrawable != null) {
            zLoadingDrawable.start();
        }
    }

    private void stopAnimation() {
        ZLoadingDrawable zLoadingDrawable = this.mZLoadingDrawable;
        if (zLoadingDrawable != null) {
            zLoadingDrawable.stop();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && getVisibility() == 0) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    public void setLoadingBuilder(Z_TYPE z_type) {
        this.mZLoadingBuilder = z_type.newInstance(getContext());
        ZLoadingDrawable zLoadingDrawable = new ZLoadingDrawable(this.mZLoadingBuilder);
        this.mZLoadingDrawable = zLoadingDrawable;
        zLoadingDrawable.initParams(getContext());
        setImageDrawable(this.mZLoadingDrawable);
    }

    public ZLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ZLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
