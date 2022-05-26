package coocent.musiclibrary.music.localLyric;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.List;
import p342g.p359b.C8348b;

public class OneLyricView extends TextView {

    /* renamed from: g */
    private float f32539g;

    /* renamed from: h */
    private Paint f32540h;

    /* renamed from: i */
    private Paint f32541i;

    /* renamed from: j */
    private int f32542j;

    /* renamed from: k */
    private int f32543k;

    /* renamed from: l */
    private float f32544l;

    /* renamed from: m */
    private float f32545m;

    /* renamed from: n */
    private int f32546n = 0;

    /* renamed from: o */
    private int f32547o = 0;

    /* renamed from: p */
    private List<C7405c> f32548p = null;

    /* renamed from: q */
    private boolean f32549q = false;

    public OneLyricView(Context context) {
        super(context);
        m41749a(context);
    }

    /* renamed from: a */
    private void m41749a(Context context) {
        setFocusable(true);
        this.f32545m = getResources().getDimension(C8348b.play_lyric_textsize);
        this.f32544l = getResources().getDimension(C8348b.play_lyric_texthight);
        float dimension = getResources().getDimension(C8348b.play_lyric_select_textsize);
        this.f32543k = Color.argb(90, 255, 255, 255);
        this.f32542j = Color.argb(255, 255, 255, 255);
        Paint paint = new Paint();
        this.f32540h = paint;
        paint.setAntiAlias(true);
        if (this.f32549q) {
            this.f32540h.setTextAlign(Paint.Align.LEFT);
        } else {
            this.f32540h.setTextAlign(Paint.Align.CENTER);
        }
        this.f32540h.setColor(this.f32542j);
        this.f32540h.setTextSize(dimension);
        this.f32540h.setTypeface(Typeface.SERIF);
        Paint paint2 = new Paint();
        this.f32541i = paint2;
        paint2.setAntiAlias(true);
        if (this.f32549q) {
            this.f32541i.setTextAlign(Paint.Align.LEFT);
        } else {
            this.f32541i.setTextAlign(Paint.Align.CENTER);
        }
        this.f32541i.setColor(this.f32543k);
        this.f32541i.setTextSize(this.f32545m);
        this.f32541i.setTypeface(Typeface.SERIF);
        this.f32547o = (int) (getResources().getDisplayMetrics().density * 5.0f);
    }

    public List<C7405c> getLyricList() {
        return this.f32548p;
    }

    public int getLyricSize() {
        List<C7405c> list = this.f32548p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            List<C7405c> list = this.f32548p;
            if (list == null || this.f32546n >= list.size()) {
                canvas.save();
                canvas.restore();
                return;
            }
            float f = this.f32539g / 2.0f;
            if (this.f32549q) {
                f = 0.0f;
            }
            canvas.drawText(this.f32548p.get(this.f32546n).mo28235a(), f, this.f32544l / 2.0f, this.f32540h);
            if (this.f32546n + 1 < this.f32548p.size()) {
                canvas.drawText(this.f32548p.get(this.f32546n + 1).mo28235a(), f, this.f32544l + ((float) this.f32547o), this.f32541i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f32539g = (float) i;
    }

    public void setColor(int i) {
        this.f32543k = i;
    }

    public void setHighLightColor(int i) {
        this.f32542j = i;
    }

    public void setIndex(int i) {
        this.f32546n = i;
        invalidate();
    }

    public void setLyricList(List<C7405c> list) {
        this.f32548p = list;
    }

    public OneLyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41749a(context);
    }

    public OneLyricView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41749a(context);
    }
}
