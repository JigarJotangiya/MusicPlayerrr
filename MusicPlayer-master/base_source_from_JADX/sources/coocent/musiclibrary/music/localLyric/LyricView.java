package coocent.musiclibrary.music.localLyric;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import android.widget.TextView;
import com.un4seen.bass.BASS;
import java.util.List;
import p342g.p359b.C8348b;

public class LyricView extends TextView {

    /* renamed from: A */
    private float f32512A;

    /* renamed from: B */
    private float f32513B;

    /* renamed from: C */
    public boolean f32514C = false;

    /* renamed from: D */
    private int f32515D = 0;

    /* renamed from: E */
    Runnable f32516E = new C7402a();

    /* renamed from: F */
    public int f32517F = -1;

    /* renamed from: g */
    private int f32518g;

    /* renamed from: h */
    private int f32519h;

    /* renamed from: i */
    private float f32520i;

    /* renamed from: j */
    private float f32521j;

    /* renamed from: k */
    private Paint f32522k;

    /* renamed from: l */
    private Paint f32523l;

    /* renamed from: m */
    private Paint f32524m;

    /* renamed from: n */
    private Paint f32525n;

    /* renamed from: o */
    private Paint f32526o;

    /* renamed from: p */
    private int f32527p;

    /* renamed from: q */
    private int f32528q;

    /* renamed from: r */
    private float f32529r;

    /* renamed from: s */
    private float f32530s;

    /* renamed from: t */
    private int f32531t = 0;

    /* renamed from: u */
    public Scroller f32532u;

    /* renamed from: v */
    private VelocityTracker f32533v;

    /* renamed from: w */
    private int f32534w;

    /* renamed from: x */
    public C7406d f32535x;

    /* renamed from: y */
    private List<C7405c> f32536y;

    /* renamed from: z */
    private Handler f32537z = null;

    /* renamed from: coocent.musiclibrary.music.localLyric.LyricView$a */
    class C7402a implements Runnable {
        C7402a() {
        }

        public void run() {
            LyricView lyricView = LyricView.this;
            lyricView.f32514C = false;
            lyricView.f32517F = -1;
            lyricView.mo28211d();
            LyricView.this.f32535x.mo28237b();
        }
    }

    public LyricView(Context context) {
        super(context);
        m41745a(context);
    }

    /* renamed from: a */
    private void m41745a(Context context) {
        setFocusable(true);
        this.f32530s = getResources().getDimension(C8348b.play_lyric_textsize);
        this.f32529r = getResources().getDimension(C8348b.play_lyric_texthight);
        float dimension = getResources().getDimension(C8348b.play_lyric_textsize_default);
        float dimension2 = getResources().getDimension(C8348b.play_lyric_select_textsize_n);
        float dimension3 = getResources().getDimension(C8348b.play_lyric_touch_textsize_n);
        this.f32528q = Color.argb(100, 255, 255, 255);
        this.f32527p = Color.argb(255, 255, 255, 255);
        this.f32519h = Color.argb(190, 255, 255, 255);
        Paint paint = new Paint();
        this.f32523l = paint;
        paint.setAntiAlias(true);
        this.f32523l.setTextAlign(Paint.Align.CENTER);
        this.f32523l.setColor(this.f32519h);
        this.f32523l.setTextSize(dimension3);
        this.f32523l.setTypeface(Typeface.SERIF);
        Paint paint2 = new Paint();
        this.f32522k = paint2;
        paint2.setAntiAlias(true);
        this.f32522k.setTextAlign(Paint.Align.CENTER);
        this.f32522k.setColor(this.f32527p);
        this.f32522k.setTextSize(dimension2);
        this.f32522k.setTypeface(Typeface.SERIF);
        Paint paint3 = new Paint();
        this.f32524m = paint3;
        paint3.setAntiAlias(true);
        this.f32524m.setTextAlign(Paint.Align.CENTER);
        this.f32524m.setColor(this.f32528q);
        this.f32524m.setTextSize(this.f32530s);
        Paint paint4 = new Paint();
        this.f32525n = paint4;
        paint4.setAntiAlias(true);
        this.f32525n.setTextAlign(Paint.Align.CENTER);
        int parseColor = Color.parseColor("#50ffffff");
        this.f32518g = parseColor;
        this.f32525n.setColor(parseColor);
        this.f32525n.setTextSize(10.0f);
        Paint paint5 = new Paint();
        this.f32526o = paint5;
        paint5.setAntiAlias(true);
        this.f32526o.setTextAlign(Paint.Align.LEFT);
        this.f32526o.setColor(this.f32528q);
        this.f32526o.setTextSize(dimension);
        this.f32532u = new Scroller(context);
        this.f32534w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f32537z = new Handler();
    }

    /* renamed from: b */
    private void m41746b() {
        VelocityTracker velocityTracker = this.f32533v;
        if (velocityTracker == null) {
            this.f32533v = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: c */
    private void m41747c() {
        if (this.f32533v == null) {
            this.f32533v = VelocityTracker.obtain();
        }
    }

    public void computeScroll() {
        if (this.f32532u.computeScrollOffset() && this.f32536y != null && ((float) this.f32532u.getCurrY()) > (-this.f32520i) && ((float) this.f32532u.getCurrY()) <= (this.f32529r * ((float) this.f32536y.size())) - this.f32520i) {
            scrollTo(0, this.f32532u.getCurrY());
        }
    }

    /* renamed from: d */
    public void mo28211d() {
        List<C7405c> list = this.f32536y;
        if (list == null || list.size() <= 0) {
            this.f32517F = -1;
            scrollTo(0, 0);
            return;
        }
        int i = this.f32517F;
        int i2 = this.f32531t;
        if (i != i2) {
            this.f32517F = i2;
            invalidate();
            if (!this.f32514C) {
                this.f32532u.startScroll(0, getScrollY(), 0, ((int) ((((float) this.f32531t) * this.f32529r) - this.f32520i)) - getScrollY());
            }
        }
    }

    public List<C7405c> getLyricList() {
        return this.f32536y;
    }

    public int getTouchIndex() {
        return this.f32515D;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        List<C7405c> list;
        super.onDraw(canvas);
        if (canvas != null && (list = this.f32536y) != null && list.size() > 0) {
            float f = ((float) (-getHeight())) * 0.5f;
            for (int i = 0; i < this.f32536y.size(); i++) {
                if (i > 0) {
                    f = this.f32529r + f;
                }
                if (i == this.f32531t) {
                    canvas.drawText(this.f32536y.get(i).mo28235a(), this.f32521j / 2.0f, f, this.f32522k);
                } else if (!this.f32514C || this.f32515D != i) {
                    canvas.drawText(this.f32536y.get(i).mo28235a(), this.f32521j / 2.0f, f, this.f32524m);
                } else {
                    canvas.drawText(this.f32536y.get(i).mo28235a(), this.f32521j / 2.0f, f, this.f32523l);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f32520i = (float) i2;
        this.f32521j = (float) i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            List<C7405c> list = this.f32536y;
            if (list != null) {
                if (list.size() > 0) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                this.f32514C = true;
                                this.f32537z.removeCallbacks(this.f32516E);
                                int y = (int) (this.f32512A - motionEvent.getY());
                                int abs = Math.abs((int) (((float) ((getScrollY() + y) + getHeight())) / this.f32529r));
                                this.f32515D = abs;
                                int max = Math.max(0, abs);
                                this.f32515D = max;
                                int min = Math.min(max, this.f32536y.size() - 1);
                                this.f32515D = min;
                                this.f32535x.mo28238c(min);
                                m41747c();
                                this.f32533v.addMovement(motionEvent);
                                if (((float) (getScrollY() + y)) > (-this.f32520i) && ((float) (getScrollY() + y)) <= (this.f32529r * ((float) this.f32536y.size())) - this.f32520i) {
                                    scrollBy(0, y);
                                }
                                this.f32512A = motionEvent.getY();
                            } else if (action != 3) {
                            }
                        }
                        this.f32533v.computeCurrentVelocity(1000, (float) this.f32534w);
                        float f = -this.f32533v.getYVelocity();
                        if (Math.abs(motionEvent.getY() - this.f32513B) > 8.0f) {
                            this.f32532u.fling(0, getScrollY(), 0, (int) f, 0, 0, BASS.BASS_DATA_FFT512, Integer.MAX_VALUE);
                            this.f32532u.computeScrollOffset();
                            this.f32537z.removeCallbacks(this.f32516E);
                            this.f32537z.postDelayed(this.f32516E, 5000);
                        } else {
                            this.f32535x.mo28236a();
                            this.f32514C = false;
                        }
                    } else {
                        float y2 = motionEvent.getY();
                        this.f32512A = y2;
                        this.f32513B = y2;
                        this.f32532u.forceFinished(true);
                        m41746b();
                        this.f32533v.addMovement(motionEvent);
                    }
                    return true;
                }
            }
            this.f32535x.mo28236a();
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
        }
    }

    public void setColor(int i) {
        this.f32528q = i;
        this.f32524m.setColor(i);
    }

    public void setIndex(int i) {
        this.f32531t = i;
        mo28211d();
    }

    public void setLyricList(List<C7405c> list) {
        this.f32536y = list;
    }

    public void setOnLyrciListener(C7406d dVar) {
        this.f32535x = dVar;
    }

    public LyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41745a(context);
    }

    public LyricView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41745a(context);
    }
}
