package coocent.music.player.widget.stereoview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;

public class StereoView extends ViewGroup {

    /* renamed from: A */
    private C7309c f32258A;

    /* renamed from: g */
    private int f32259g;

    /* renamed from: h */
    private float f32260h;

    /* renamed from: i */
    private Scroller f32261i;

    /* renamed from: j */
    private float f32262j;

    /* renamed from: k */
    private boolean f32263k;

    /* renamed from: l */
    private Context f32264l;

    /* renamed from: m */
    private int f32265m;

    /* renamed from: n */
    private VelocityTracker f32266n;

    /* renamed from: o */
    private Camera f32267o;

    /* renamed from: p */
    private Matrix f32268p;

    /* renamed from: q */
    private int f32269q;

    /* renamed from: r */
    private int f32270r;

    /* renamed from: s */
    private int f32271s;

    /* renamed from: t */
    private int f32272t;

    /* renamed from: u */
    private boolean f32273u;

    /* renamed from: v */
    private int f32274v;

    /* renamed from: w */
    private C7308b f32275w;

    /* renamed from: x */
    private float f32276x;

    /* renamed from: y */
    private float f32277y;

    /* renamed from: z */
    private boolean f32278z;

    /* renamed from: coocent.music.player.widget.stereoview.StereoView$a */
    static /* synthetic */ class C7307a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32279a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                coocent.music.player.widget.stereoview.StereoView$c[] r0 = coocent.music.player.widget.stereoview.StereoView.C7309c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32279a = r0
                coocent.music.player.widget.stereoview.StereoView$c r1 = coocent.music.player.widget.stereoview.StereoView.C7309c.Normal     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32279a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.widget.stereoview.StereoView$c r1 = coocent.music.player.widget.stereoview.StereoView.C7309c.ToPre     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32279a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.widget.stereoview.StereoView$c r1 = coocent.music.player.widget.stereoview.StereoView.C7309c.ToNext     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.widget.stereoview.StereoView.C7307a.<clinit>():void");
        }
    }

    /* renamed from: coocent.music.player.widget.stereoview.StereoView$b */
    public interface C7308b {
        /* renamed from: a */
        void mo28031a(int i);

        /* renamed from: b */
        void mo28032b(int i);
    }

    /* renamed from: coocent.music.player.widget.stereoview.StereoView$c */
    public enum C7309c {
        Normal,
        ToPre,
        ToNext
    }

    public StereoView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m41419a() {
        this.f32274v = (this.f32274v + 1) % getChildCount();
        int childCount = getChildCount();
        View childAt = getChildAt(0);
        removeViewAt(0);
        addView(childAt, childCount - 1);
        C7308b bVar = this.f32275w;
        if (bVar != null) {
            bVar.mo28032b(this.f32274v);
        }
    }

    /* renamed from: b */
    private void m41420b() {
        this.f32274v = ((this.f32274v - 1) + getChildCount()) % getChildCount();
        int childCount = getChildCount() - 1;
        View childAt = getChildAt(childCount);
        removeViewAt(childCount);
        addView(childAt, 0);
        C7308b bVar = this.f32275w;
        if (bVar != null) {
            bVar.mo28031a(this.f32274v);
        }
    }

    /* renamed from: c */
    private void m41421c(float f) {
        this.f32272t = 0;
        if (getScrollY() != this.f32270r) {
            int i = C7307a.f32279a[this.f32258A.ordinal()];
            if (i == 1) {
                m41426j();
            } else if (i == 2) {
                m41427l(f);
            } else if (i == 3) {
                m41425i(f);
            }
            invalidate();
        }
    }

    /* renamed from: d */
    private void m41422d(Canvas canvas, int i, long j) {
        int i2 = this.f32270r * i;
        if (getScrollY() + this.f32270r >= i2 && i2 >= getScrollY() - this.f32270r) {
            float f = (float) (this.f32269q / 2);
            float f2 = getScrollY() > i2 ? (float) (this.f32270r + i2) : (float) i2;
            float scrollY = (this.f32262j * ((float) (getScrollY() - i2))) / ((float) this.f32270r);
            if (scrollY <= 90.0f && scrollY >= -90.0f) {
                canvas.save();
                this.f32267o.save();
                this.f32267o.rotateX(scrollY);
                this.f32267o.getMatrix(this.f32268p);
                this.f32267o.restore();
                this.f32268p.preTranslate(-f, -f2);
                this.f32268p.postTranslate(f, f2);
                canvas.concat(this.f32268p);
                drawChild(canvas, getChildAt(i), j);
                canvas.restore();
            }
        }
    }

    /* renamed from: e */
    private void m41423e(Context context) {
        this.f32265m = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f32267o = new Camera();
        this.f32268p = new Matrix();
        if (this.f32261i == null) {
            this.f32261i = new Scroller(context);
        }
    }

    /* renamed from: g */
    private void m41424g(int i) {
        int i2 = (int) (((float) (i % this.f32270r)) / this.f32260h);
        if (Math.abs(i2) <= this.f32270r / 4) {
            scrollBy(0, i2);
            if (getScrollY() < 5 && this.f32259g != 0) {
                m41420b();
                scrollBy(0, this.f32270r);
            } else if (getScrollY() > ((getChildCount() - 1) * this.f32270r) - 5) {
                m41419a();
                scrollBy(0, -this.f32270r);
            }
        }
    }

    /* renamed from: i */
    private void m41425i(float f) {
        this.f32258A = C7309c.ToNext;
        m41419a();
        this.f32271s = ((Math.abs(f) - 2000.0f > 0.0f ? (int) (Math.abs(f) - 2000.0f) : 0) / 800) + 1;
        int scrollY = getScrollY() - this.f32270r;
        setScrollY(scrollY);
        int i = this.f32270r;
        int i2 = ((this.f32259g * i) - scrollY) + ((this.f32271s - 1) * i);
        this.f32261i.startScroll(0, scrollY, 0, i2, Math.abs(i2) * 3);
        this.f32271s--;
    }

    /* renamed from: j */
    private void m41426j() {
        this.f32258A = C7309c.Normal;
        this.f32271s = 0;
        int scrollY = getScrollY();
        int scrollY2 = (this.f32270r * this.f32259g) - getScrollY();
        this.f32261i.startScroll(0, scrollY, 0, scrollY2, Math.abs(scrollY2) * 4);
    }

    /* renamed from: l */
    private void m41427l(float f) {
        this.f32258A = C7309c.ToPre;
        m41420b();
        float f2 = f - 2000.0f;
        this.f32271s = ((f2 > 0.0f ? (int) f2 : 0) / 800) + 1;
        int scrollY = getScrollY() + this.f32270r;
        setScrollY(scrollY);
        int i = this.f32259g;
        int i2 = this.f32270r;
        int i3 = (-(scrollY - (i * i2))) - ((this.f32271s - 1) * i2);
        this.f32261i.startScroll(0, scrollY, 0, i3, Math.abs(i3) * 3);
        this.f32271s--;
    }

    public void computeScroll() {
        if (this.f32261i.computeScrollOffset()) {
            C7309c cVar = this.f32258A;
            if (cVar == C7309c.ToPre) {
                scrollTo(this.f32261i.getCurrX(), this.f32261i.getCurrY() + (this.f32270r * this.f32272t));
                if (getScrollY() < this.f32270r + 2 && this.f32271s > 0) {
                    this.f32273u = true;
                    m41420b();
                    this.f32272t++;
                    this.f32271s--;
                }
            } else if (cVar == C7309c.ToNext) {
                scrollTo(this.f32261i.getCurrX(), this.f32261i.getCurrY() - (this.f32270r * this.f32272t));
                if (getScrollY() > this.f32270r && this.f32271s > 0) {
                    this.f32273u = true;
                    m41419a();
                    this.f32271s--;
                    this.f32272t++;
                }
            } else {
                scrollTo(this.f32261i.getCurrX(), this.f32261i.getCurrY());
            }
            postInvalidate();
        }
        if (this.f32261i.isFinished()) {
            this.f32272t = 0;
            this.f32271s = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f32273u || !this.f32263k) {
            this.f32273u = false;
            super.dispatchDraw(canvas);
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            m41422d(canvas, i, getDrawingTime());
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32278z = false;
            this.f32276x = x;
            this.f32277y = y;
            if (!this.f32261i.isFinished()) {
                Scroller scroller = this.f32261i;
                scroller.setFinalY(scroller.getCurrY());
                this.f32261i.abortAnimation();
                scrollTo(0, getScrollY());
                this.f32278z = true;
            }
        } else if (action == 2 && !this.f32278z) {
            this.f32278z = mo28022f(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public boolean mo28022f(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return Math.abs(y - this.f32276x) > ((float) this.f32265m) && Math.abs(y - this.f32277y) > Math.abs(x - this.f32276x);
    }

    public int getCurScreen() {
        return this.f32274v;
    }

    /* renamed from: h */
    public StereoView mo28024h() {
        if (!this.f32261i.isFinished()) {
            this.f32261i.abortAnimation();
        }
        m41425i(-2000.0f);
        return this;
    }

    /* renamed from: k */
    public StereoView mo28025k() {
        if (!this.f32261i.isFinished()) {
            this.f32261i.abortAnimation();
        }
        m41427l(2000.0f);
        return this;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32278z;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.layout(0, i5, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i5);
                i5 += childAt.getMeasuredHeight();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        this.f32269q = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f32270r = measuredHeight;
        scrollTo(0, this.f32259g * measuredHeight);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 != 3) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.VelocityTracker r0 = r5.f32266n
            if (r0 != 0) goto L_0x000a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.f32266n = r0
        L_0x000a:
            android.view.VelocityTracker r0 = r5.f32266n
            r0.addMovement(r6)
            float r0 = r6.getY()
            int r1 = r6.getAction()
            java.lang.String r2 = "media.musicplayer.audioplayer.videoplayer.auto_ad_cancel"
            r3 = 1
            if (r1 == 0) goto L_0x00de
            java.lang.String r4 = "auto"
            if (r1 == r3) goto L_0x0044
            r3 = 2
            if (r1 == r3) goto L_0x0028
            r0 = 3
            if (r1 == r0) goto L_0x0044
            goto L_0x00d9
        L_0x0028:
            java.lang.String r1 = "ACTION_MOVE"
            android.util.Log.e(r4, r1)
            boolean r1 = r5.f32278z
            if (r1 == 0) goto L_0x00d9
            float r1 = r5.f32277y
            float r1 = r1 - r0
            int r1 = (int) r1
            r5.f32277y = r0
            android.widget.Scroller r0 = r5.f32261i
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00d9
            r5.m41424g(r1)
            goto L_0x00d9
        L_0x0044:
            android.content.Context r0 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2)
            android.content.Context r2 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            java.lang.String r2 = r2.getPackageName()
            android.content.Intent r1 = r1.setPackage(r2)
            r0.sendBroadcast(r1)
            android.content.Context r0 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "media.musicplayer.audioplayer.videoplayer.auto_ad_start"
            r1.<init>(r2)
            android.content.Context r2 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            java.lang.String r2 = r2.getPackageName()
            android.content.Intent r1 = r1.setPackage(r2)
            r0.sendBroadcast(r1)
            java.lang.String r0 = "ACTION_UP"
            android.util.Log.e(r4, r0)
            java.lang.String r0 = "ACTION_CANCEL"
            android.util.Log.e(r4, r0)
            boolean r0 = r5.f32278z
            if (r0 == 0) goto L_0x00cf
            r0 = 0
            r5.f32278z = r0
            android.view.VelocityTracker r0 = r5.f32266n
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            android.view.VelocityTracker r0 = r5.f32266n
            float r0 = r0.getYVelocity()
            r1 = 1157234688(0x44fa0000, float:2000.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x00c8
            int r1 = r5.getScrollY()
            int r2 = r5.f32270r
            int r3 = r2 / 2
            int r1 = r1 + r3
            int r1 = r1 / r2
            int r2 = r5.f32259g
            if (r1 >= r2) goto L_0x00a9
            goto L_0x00c8
        L_0x00a9:
            r1 = -990248960(0xffffffffc4fa0000, float:-2000.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x00c3
            int r1 = r5.getScrollY()
            int r2 = r5.f32270r
            int r3 = r2 / 2
            int r1 = r1 + r3
            int r1 = r1 / r2
            int r2 = r5.f32259g
            if (r1 <= r2) goto L_0x00be
            goto L_0x00c3
        L_0x00be:
            coocent.music.player.widget.stereoview.StereoView$c r1 = coocent.music.player.widget.stereoview.StereoView.C7309c.Normal
            r5.f32258A = r1
            goto L_0x00cc
        L_0x00c3:
            coocent.music.player.widget.stereoview.StereoView$c r1 = coocent.music.player.widget.stereoview.StereoView.C7309c.ToNext
            r5.f32258A = r1
            goto L_0x00cc
        L_0x00c8:
            coocent.music.player.widget.stereoview.StereoView$c r1 = coocent.music.player.widget.stereoview.StereoView.C7309c.ToPre
            r5.f32258A = r1
        L_0x00cc:
            r5.m41421c(r0)
        L_0x00cf:
            android.view.VelocityTracker r0 = r5.f32266n
            if (r0 == 0) goto L_0x00d9
            r0.recycle()
            r0 = 0
            r5.f32266n = r0
        L_0x00d9:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L_0x00de:
            android.content.Context r6 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            android.content.Context r1 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            java.lang.String r1 = r1.getPackageName()
            android.content.Intent r0 = r0.setPackage(r1)
            r6.sendBroadcast(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.widget.stereoview.StereoView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setiStereoListener(C7308b bVar) {
        this.f32275w = bVar;
    }

    public StereoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StereoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32259g = 1;
        this.f32260h = 1.8f;
        this.f32262j = 90.0f;
        this.f32263k = true;
        this.f32272t = 0;
        this.f32273u = false;
        this.f32274v = 1;
        this.f32278z = false;
        this.f32258A = C7309c.Normal;
        this.f32264l = context;
        m41423e(context);
    }
}
