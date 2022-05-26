package com.coocent.lyriclibrary.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p159f.p166c.p177d.C4342b;
import p159f.p166c.p177d.C4346f;
import p159f.p166c.p177d.C4347g;
import p159f.p166c.p177d.p178h.C4348a;
import p159f.p166c.p177d.p178h.C4349b;
import p159f.p166c.p177d.p179i.C4351b;
import p159f.p166c.p177d.p180j.C4359c;
import p159f.p166c.p177d.p180j.C4360d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class TwoLyricView extends View {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C4348a> f7573g;

    /* renamed from: h */
    private List<C4349b> f7574h;

    /* renamed from: i */
    private TextPaint f7575i;

    /* renamed from: j */
    private Rect f7576j;

    /* renamed from: k */
    private float f7577k;

    /* renamed from: l */
    private int f7578l;

    /* renamed from: m */
    private int f7579m;

    /* renamed from: n */
    private int f7580n;

    /* renamed from: o */
    private int f7581o;

    /* renamed from: p */
    private float f7582p;

    /* renamed from: q */
    private String f7583q;

    /* renamed from: r */
    private int f7584r;

    /* renamed from: s */
    private int f7585s;

    /* renamed from: t */
    private boolean f7586t;

    /* renamed from: u */
    private int f7587u;

    /* renamed from: v */
    private StaticLayout f7588v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f7589w;

    /* renamed from: x */
    private int f7590x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C4351b f7591y;

    /* renamed from: com.coocent.lyriclibrary.view.TwoLyricView$a */
    class C2235a implements View.OnClickListener {
        C2235a() {
        }

        public void onClick(View view) {
            if (TwoLyricView.this.f7591y != null) {
                TwoLyricView.this.f7591y.mo8880b(TwoLyricView.this.mo8863h());
            }
        }
    }

    /* renamed from: com.coocent.lyriclibrary.view.TwoLyricView$b */
    class C2236b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ long f7593g;

        /* renamed from: h */
        final /* synthetic */ long f7594h;

        C2236b(long j, long j2) {
            this.f7593g = j;
            this.f7594h = j2;
        }

        public void run() {
            long j;
            if (TwoLyricView.this.mo8863h()) {
                int c = C4359c.m19012c(TwoLyricView.this.f7573g, this.f7593g);
                long j2 = c < TwoLyricView.this.f7573g.size() ? ((C4348a) TwoLyricView.this.f7573g.get(c)).mo14757j() : 0;
                if (c >= TwoLyricView.this.f7573g.size() || ((C4348a) TwoLyricView.this.f7573g.get(c)).mo14755d() <= j2) {
                    int i = c + 1;
                    if (i < TwoLyricView.this.f7573g.size()) {
                        j = ((C4348a) TwoLyricView.this.f7573g.get(i)).mo14757j();
                    } else {
                        j = this.f7594h;
                    }
                } else {
                    j = ((C4348a) TwoLyricView.this.f7573g.get(c)).mo14755d();
                }
                TwoLyricView.this.m10415m(this.f7593g, j2, j);
                if (c != TwoLyricView.this.f7589w) {
                    int unused = TwoLyricView.this.f7589w = c;
                    TwoLyricView.this.invalidate();
                }
            }
        }
    }

    public TwoLyricView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    private void m10410f(Canvas canvas, StaticLayout staticLayout, Rect rect, float f) {
        if (staticLayout != null) {
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(this.f7582p, f);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: g */
    private void m10411g(Canvas canvas, StaticLayout staticLayout, float f) {
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(this.f7582p, f);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    private String getCurrentText() {
        int size = this.f7573g.size();
        int i = this.f7589w;
        return size > i ? this.f7573g.get(i).mo14756h() : BuildConfig.FLAVOR;
    }

    private float getLrcWidth() {
        return ((float) getWidth()) > this.f7582p * 2.0f ? ((float) getWidth()) - (this.f7582p * 2.0f) : (float) getWidth();
    }

    /* renamed from: i */
    private void m10412i(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4347g.TwoLyricView);
        this.f7582p = obtainStyledAttributes.getDimension(C4347g.TwoLyricView_twoLyricPadding, (float) C4360d.m19019a(getContext(), 50.0f));
        this.f7577k = obtainStyledAttributes.getDimension(C4347g.TwoLyricView_twoLyricTextSize, (float) C4360d.m19020b(getContext(), 14.0f));
        int i = C4347g.TwoLyricView_twoLyricCurrentTextColor;
        Resources resources = getResources();
        int i2 = C4342b.lyric_light;
        this.f7578l = obtainStyledAttributes.getColor(i, resources.getColor(i2));
        this.f7579m = obtainStyledAttributes.getColor(C4347g.TwoLyricView_twoLyricCurrentDefaultTextColor, getResources().getColor(C4342b.lyric_default));
        this.f7580n = obtainStyledAttributes.getColor(C4347g.TwoLyricView_twoLyricNormalTextColor, getResources().getColor(C4342b.lyric_normal));
        String string = obtainStyledAttributes.getString(C4347g.TwoLyricView_twoLyricDefaultLabel);
        this.f7583q = string;
        this.f7583q = TextUtils.isEmpty(string) ? getResources().getString(C4346f.lyrics_no_find) : this.f7583q;
        this.f7584r = obtainStyledAttributes.getColor(C4347g.TwoLyricView_twoLyricDefaultColor, getResources().getColor(i2));
        int integer = obtainStyledAttributes.getInteger(C4347g.TwoLyricView_twoLyricMaxLine, 1);
        this.f7585s = integer;
        if (integer > 2) {
            this.f7585s = 2;
        }
        this.f7586t = obtainStyledAttributes.getBoolean(C4347g.TwoLyricView_twoLyricShowStroke, false);
        boolean z = obtainStyledAttributes.getBoolean(C4347g.TwoLyricView_twoLyricTextBold, false);
        this.f7587u = obtainStyledAttributes.getInteger(C4347g.TwoLyricView_twoLyricGravity, 0);
        obtainStyledAttributes.recycle();
        this.f7581o = getResources().getColor(C4342b.lyric_stroke);
        TextPaint textPaint = new TextPaint();
        this.f7575i = textPaint;
        textPaint.setAntiAlias(true);
        this.f7575i.setTextSize(this.f7577k);
        this.f7575i.setTextAlign(Paint.Align.LEFT);
        this.f7575i.setStrokeWidth(0.0f);
        this.f7575i.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7575i.setFakeBoldText(z);
        this.f7576j = new Rect();
        setOnClickListener(new C2235a());
    }

    /* renamed from: j */
    private void m10413j() {
        if (mo8863h() && getWidth() != 0) {
            this.f7574h.clear();
            this.f7575i.setTextSize(this.f7577k);
            for (C4348a h : this.f7573g) {
                this.f7574h.add(new C4349b(C4349b.m18961a(h.mo14756h(), this.f7575i, (int) getLrcWidth(), this.f7587u)));
            }
        }
    }

    /* renamed from: l */
    private void m10414l(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m10415m(long j, long j2, long j3) {
        try {
            this.f7590x = (int) (((j - j2) * 100) / (j3 - j2));
            postInvalidate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public boolean mo8863h() {
        return !this.f7573g.isEmpty();
    }

    /* renamed from: k */
    public void mo8864k() {
        this.f7573g.clear();
        invalidate();
    }

    /* renamed from: n */
    public void mo8865n(long j, long j2) {
        m10414l(new C2236b(j, j2));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        StaticLayout f;
        StaticLayout f2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        if (!mo8863h()) {
            this.f7575i.setTextSize(this.f7577k);
            if (this.f7588v == null) {
                this.f7588v = C4349b.m18961a(this.f7583q, this.f7575i, (int) getLrcWidth(), this.f7587u);
            }
            if (this.f7586t) {
                this.f7575i.setColor(this.f7581o);
                this.f7575i.setStrokeWidth(2.0f);
                StaticLayout staticLayout = this.f7588v;
                m10411g(canvas2, staticLayout, ((float) height) - (((float) staticLayout.getHeight()) * 0.5f));
                this.f7575i.setStrokeWidth(0.0f);
            }
            this.f7575i.setColor(this.f7584r);
            StaticLayout staticLayout2 = this.f7588v;
            m10411g(canvas2, staticLayout2, ((float) height) - (((float) staticLayout2.getHeight()) * 0.5f));
        } else if (this.f7585s > 1) {
            if (this.f7589w < this.f7574h.size() && (f2 = this.f7574h.get(this.f7589w).mo14762f()) != null) {
                int height2 = height > f2.getHeight() ? height - f2.getHeight() : 0;
                if (this.f7586t) {
                    this.f7575i.setColor(this.f7581o);
                    this.f7575i.setStrokeWidth(2.0f);
                    m10411g(canvas2, f2, (float) height2);
                    this.f7575i.setStrokeWidth(0.0f);
                }
                this.f7575i.setColor(this.f7579m);
                float f3 = (float) height2;
                m10411g(canvas2, f2, f3);
                this.f7575i.setColor(this.f7578l);
                int lineCount = f2.getLineCount();
                int height3 = f2.getHeight() / lineCount;
                float measureText = (this.f7575i.measureText(getCurrentText()) * ((float) this.f7590x)) / 100.0f;
                int i = 0;
                while (i < lineCount) {
                    Rect rect = this.f7576j;
                    rect.top = (i * height3) + height2;
                    int i2 = i + 1;
                    rect.bottom = (i2 * height3) + height2;
                    float f4 = this.f7582p;
                    rect.left = C4349b.m18962d((float) getWidth(), f4, f4, f2.getLineWidth(i), this.f7587u);
                    Rect rect2 = this.f7576j;
                    float width = (float) getWidth();
                    float f5 = this.f7582p;
                    rect2.right = C4349b.m18963e(width, f5, f5, f2.getLineWidth(i), measureText, this.f7587u, measureText > f2.getLineWidth(i));
                    m10410f(canvas2, f2, this.f7576j, f3);
                    measureText -= f2.getLineWidth(i);
                    i = i2;
                }
                height = height2 + f2.getHeight();
            }
            if (this.f7589w + 1 < this.f7574h.size()) {
                StaticLayout f6 = this.f7574h.get(this.f7589w + 1).mo14762f();
                if (this.f7586t) {
                    this.f7575i.setColor(this.f7581o);
                    this.f7575i.setStrokeWidth(2.0f);
                    m10411g(canvas2, f6, (float) height);
                    this.f7575i.setStrokeWidth(0.0f);
                }
                this.f7575i.setColor(this.f7580n);
                m10411g(canvas2, f6, (float) height);
            }
        } else if (this.f7589w < this.f7574h.size() && (f = this.f7574h.get(this.f7589w).mo14762f()) != null) {
            float f7 = (float) height;
            int height4 = f7 > ((float) f.getHeight()) * 0.5f ? (int) (f7 - (((float) f.getHeight()) * 0.5f)) : 0;
            if (this.f7586t) {
                this.f7575i.setColor(this.f7581o);
                this.f7575i.setStrokeWidth(2.0f);
                m10411g(canvas2, f, (float) height4);
                this.f7575i.setStrokeWidth(0.0f);
            }
            this.f7575i.setColor(this.f7579m);
            float f8 = (float) height4;
            m10411g(canvas2, f, f8);
            this.f7575i.setColor(this.f7578l);
            int lineCount2 = f.getLineCount();
            float height5 = (((float) f.getHeight()) * 1.0f) / ((float) lineCount2);
            float measureText2 = (this.f7575i.measureText(getCurrentText()) * ((float) this.f7590x)) / 100.0f;
            int i3 = 0;
            while (i3 < lineCount2) {
                Rect rect3 = this.f7576j;
                rect3.top = (int) ((((float) i3) * height5) + f8);
                int i4 = i3 + 1;
                rect3.bottom = (int) ((((float) i4) * height5) + f8);
                float f9 = this.f7582p;
                rect3.left = C4349b.m18962d((float) getWidth(), f9, f9, f.getLineWidth(i3), this.f7587u);
                Rect rect4 = this.f7576j;
                float width2 = (float) getWidth();
                float f10 = this.f7582p;
                rect4.right = C4349b.m18963e(width2, f10, f10, f.getLineWidth(i3), measureText2, this.f7587u, measureText2 > f.getLineWidth(i3));
                m10410f(canvas2, f, this.f7576j, f8);
                measureText2 -= f.getLineWidth(i3);
                i3 = i4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m10413j();
    }

    public void setLyricList(List<C4348a> list) {
        mo8864k();
        if (list != null && !list.isEmpty()) {
            Collections.sort(list);
            for (C4348a next : list) {
                if (!TextUtils.isEmpty(next.mo14756h().trim())) {
                    this.f7573g.add(next);
                } else if (this.f7573g.size() > 0) {
                    List<C4348a> list2 = this.f7573g;
                    if (list2.get(list2.size() - 1).mo14755d() == 0) {
                        List<C4348a> list3 = this.f7573g;
                        list3.get(list3.size() - 1).mo14758k(next.mo14757j());
                    }
                }
            }
        }
        m10413j();
        invalidate();
    }

    public void setOnLyricListener(C4351b bVar) {
        this.f7591y = bVar;
    }

    public void setTextColor(int i) {
        this.f7578l = i;
        this.f7584r = i;
        postInvalidate();
    }

    public void setTextSize(float f) {
        this.f7577k = (float) C4360d.m19020b(getContext(), f);
        m10413j();
        postInvalidate();
    }

    public TwoLyricView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoLyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7573g = new ArrayList();
        this.f7574h = new ArrayList();
        this.f7585s = 1;
        this.f7586t = true;
        this.f7587u = 0;
        this.f7590x = 0;
        m10412i(attributeSet);
    }
}
