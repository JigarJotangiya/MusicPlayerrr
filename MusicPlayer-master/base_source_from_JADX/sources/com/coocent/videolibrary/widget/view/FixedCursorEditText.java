package com.coocent.videolibrary.widget.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.coocent.videoplayer.p061s.C2723c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class FixedCursorEditText extends AppCompatEditText {

    /* renamed from: j */
    private CharSequence f9170j;

    /* renamed from: k */
    private Paint f9171k;

    /* renamed from: l */
    private int f9172l;

    public FixedCursorEditText(Context context) {
        super(context);
        m12187a();
    }

    /* renamed from: a */
    private void m12187a() {
        this.f9170j = getHint();
        setHint(BuildConfig.FLAVOR);
        Paint paint = new Paint(5);
        this.f9171k = paint;
        paint.setTextSize(getTextSize());
        this.f9171k.setTextAlign(Paint.Align.LEFT);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int colorForState;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f9170j) && TextUtils.isEmpty(getText())) {
            canvas.save();
            ColorStateList hintTextColors = getHintTextColors();
            if (!(hintTextColors == null || (colorForState = hintTextColors.getColorForState(getDrawableState(), 0)) == this.f9172l)) {
                this.f9172l = colorForState;
                this.f9171k.setColor(colorForState);
            }
            Paint.FontMetricsInt fontMetricsInt = this.f9171k.getFontMetricsInt();
            int i = fontMetricsInt.top;
            int height = (((getHeight() - fontMetricsInt.bottom) + i) / 2) - i;
            CharSequence charSequence = this.f9170j;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) (getPaddingLeft() + C2723c.m12314a(getContext(), 5.0f)), (float) height, this.f9171k);
            canvas.restore();
        }
    }

    public FixedCursorEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12187a();
    }

    public FixedCursorEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12187a();
    }
}
