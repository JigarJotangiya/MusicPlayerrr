package com.coocent.lyriclibrary.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p159f.p166c.p177d.C4342b;
import p159f.p166c.p177d.C4343c;
import p159f.p166c.p177d.C4344d;
import p159f.p166c.p177d.C4345e;
import p159f.p166c.p177d.p179i.C4350a;
import p159f.p166c.p177d.p179i.C4351b;
import p159f.p166c.p177d.p180j.C4352a;

/* renamed from: com.coocent.lyriclibrary.view.a */
/* compiled from: DesktopLyricView */
public class C2237a extends FrameLayout implements View.OnClickListener {

    /* renamed from: A */
    private ImageView f7596A;

    /* renamed from: B */
    private ImageView f7597B;

    /* renamed from: C */
    private ImageView f7598C;

    /* renamed from: D */
    private ImageView f7599D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f7600E;

    /* renamed from: F */
    private int f7601F;

    /* renamed from: G */
    private float f7602G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f7603H;

    /* renamed from: I */
    private C2240c f7604I;

    /* renamed from: J */
    private BroadcastReceiver f7605J;

    /* renamed from: K */
    private WindowManager.LayoutParams f7606K;

    /* renamed from: L */
    private WindowManager f7607L;

    /* renamed from: M */
    private float f7608M;

    /* renamed from: N */
    private int f7609N;

    /* renamed from: g */
    private Context f7610g;

    /* renamed from: h */
    private int f7611h;

    /* renamed from: i */
    private LinearLayout f7612i;

    /* renamed from: j */
    private LinearLayout f7613j;

    /* renamed from: k */
    private TextView f7614k;

    /* renamed from: l */
    private ImageView f7615l;

    /* renamed from: m */
    private ImageView f7616m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public TwoLyricView f7617n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public HorProgressView f7618o;

    /* renamed from: p */
    private LinearLayout f7619p;

    /* renamed from: q */
    private ImageView f7620q;

    /* renamed from: r */
    private ImageView f7621r;

    /* renamed from: s */
    private ImageView f7622s;

    /* renamed from: t */
    private ImageView f7623t;

    /* renamed from: u */
    private ImageView f7624u;

    /* renamed from: v */
    private LinearLayout f7625v;

    /* renamed from: w */
    private ImageView f7626w;

    /* renamed from: x */
    private ImageView f7627x;

    /* renamed from: y */
    private ImageView f7628y;

    /* renamed from: z */
    private ImageView f7629z;

    /* renamed from: com.coocent.lyriclibrary.view.a$a */
    /* compiled from: DesktopLyricView */
    class C2238a extends C4351b {
        C2238a() {
        }

        /* renamed from: b */
        public void mo8880b(boolean z) {
            if (C2237a.this.f7603H) {
                return;
            }
            if (!C2237a.this.f7600E) {
                C2237a.this.setBgVisable(true);
            } else if (z) {
                C2237a.this.setBgVisable(false);
            } else if (C2237a.this.getService() != null) {
                C2237a.this.getService().mo14766c();
            }
        }
    }

    /* renamed from: com.coocent.lyriclibrary.view.a$b */
    /* compiled from: DesktopLyricView */
    class C2239b extends BroadcastReceiver {
        C2239b() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (C2237a.this.getService() == null) {
                return;
            }
            if (C2237a.this.getService().mo14774k().equals(action)) {
                C2237a.this.m10424H();
            } else if (C2237a.this.getService().mo14776m().equals(action)) {
                C2237a.this.m10422F();
                C2237a.this.m10421E();
                C2237a.this.m10423G();
            } else if (C2237a.this.getService().mo14771h().equals(action)) {
                C2237a.this.m10420D();
            }
        }
    }

    /* renamed from: com.coocent.lyriclibrary.view.a$c */
    /* compiled from: DesktopLyricView */
    private static class C2240c extends Handler {

        /* renamed from: a */
        private WeakReference f7632a;

        public C2240c(C2237a aVar) {
            super(Looper.getMainLooper());
            this.f7632a = new WeakReference(aVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C2237a aVar = (C2237a) this.f7632a.get();
            if (aVar != null) {
                int i = message.what;
                if (i == 0) {
                    aVar.setBgVisable(false);
                } else if (i != 1) {
                    if (i == 2 && aVar.getService() != null) {
                        int g = (int) aVar.getService().mo14770g();
                        int d = (int) aVar.getService().mo14767d();
                        if (aVar.f7618o != null) {
                            aVar.f7618o.mo8838c(g, d);
                        }
                        if (aVar.getService().mo14764a()) {
                            sendEmptyMessageDelayed(2, 1000);
                        }
                    }
                } else if (aVar.getService() != null) {
                    int g2 = (int) aVar.getService().mo14770g();
                    int d2 = (int) aVar.getService().mo14767d();
                    if (aVar.f7617n != null) {
                        aVar.f7617n.mo8865n((long) g2, (long) d2);
                    }
                    if (aVar.getService().mo14764a()) {
                        sendEmptyMessageDelayed(1, 100);
                    }
                }
            }
        }
    }

    public C2237a(Context context) {
        this(context, false);
    }

    /* renamed from: B */
    private void m10419B(int i) {
        int i2 = this.f7601F;
        int[] iArr = C4352a.f12934g;
        if (i2 != iArr[i]) {
            setLyricTextColor(iArr[i]);
            if (getService() != null) {
                getService().mo14779p(C4352a.f12934g[i]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m10420D() {
        TwoLyricView twoLyricView;
        if (!(getService() == null || (twoLyricView = this.f7617n) == null)) {
            twoLyricView.setLyricList(getService().mo14765b());
        }
        m10421E();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m10421E() {
        C2240c cVar = this.f7604I;
        if (cVar != null) {
            cVar.removeMessages(1);
            this.f7604I.sendEmptyMessage(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m10422F() {
        if (this.f7622s != null && getService() != null) {
            this.f7622s.setImageResource(getService().mo14764a() ? C4343c.lyrics_pause : C4343c.lyrics_play);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m10423G() {
        C2240c cVar = this.f7604I;
        if (cVar != null) {
            cVar.removeMessages(2);
            this.f7604I.sendEmptyMessage(2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m10424H() {
        if (this.f7614k != null && getService() != null && getService().mo14769f() != null) {
            this.f7614k.setText(getService().mo14769f());
        }
    }

    /* access modifiers changed from: private */
    public C4350a getService() {
        return C4352a.m18992f().mo14782g();
    }

    /* access modifiers changed from: private */
    public void setBgVisable(boolean z) {
        this.f7600E = z;
        if (z) {
            this.f7613j.setVisibility(0);
            this.f7619p.setVisibility(0);
            this.f7618o.setVisibility(0);
            this.f7617n.setBackgroundColor(getResources().getColor(C4342b.desktop_bg_color));
            m10436u();
            return;
        }
        this.f7613j.setVisibility(4);
        this.f7619p.setVisibility(4);
        this.f7618o.setVisibility(4);
        this.f7625v.setVisibility(8);
        this.f7617n.setBackgroundColor(getResources().getColor(C4342b.transparent));
    }

    private void setClickViews(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(this);
            }
        }
    }

    private void setLyricTextColor(int i) {
        this.f7601F = i;
        this.f7614k.setTextColor(i);
        this.f7617n.setTextColor(i);
        this.f7618o.setProgressColor(i);
        boolean z = false;
        this.f7626w.setSelected(i == C4352a.f12934g[0]);
        this.f7627x.setSelected(i == C4352a.f12934g[1]);
        this.f7628y.setSelected(i == C4352a.f12934g[2]);
        this.f7629z.setSelected(i == C4352a.f12934g[3]);
        this.f7596A.setSelected(i == C4352a.f12934g[4]);
        ImageView imageView = this.f7597B;
        if (i == C4352a.f12934g[5]) {
            z = true;
        }
        imageView.setSelected(z);
    }

    private void setLyricTextSize(float f) {
        this.f7602G = f;
        this.f7614k.setTextSize(f);
        this.f7617n.setTextSize(f);
        this.f7598C.setImageResource(f == 11.0f ? C4343c.lyrics_zoom_out_off : C4343c.lyrics_zoom_out_on);
        this.f7599D.setImageResource(f == 15.0f ? C4343c.lyrics_zoom_in_off : C4343c.lyrics_zoom_in_on);
    }

    /* renamed from: u */
    private void m10436u() {
        C2240c cVar = this.f7604I;
        if (cVar != null) {
            cVar.removeMessages(0);
            this.f7604I.sendEmptyMessageDelayed(0, 6000);
        }
    }

    /* renamed from: v */
    private void m10437v() {
        m10440y();
        m10424H();
        m10422F();
        m10420D();
        m10423G();
    }

    /* renamed from: w */
    private void m10438w() {
        setClickViews(this.f7612i, this.f7615l, this.f7616m, this.f7620q, this.f7621r, this.f7622s, this.f7623t, this.f7624u, this.f7626w, this.f7627x, this.f7628y, this.f7629z, this.f7596A, this.f7597B, this.f7598C, this.f7599D);
        this.f7617n.setOnLyricListener(new C2238a());
    }

    /* renamed from: x */
    private void m10439x() {
        if (getService() != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(getService().mo14774k());
            intentFilter.addAction(getService().mo14776m());
            intentFilter.addAction(getService().mo14771h());
            this.f7610g.registerReceiver(this.f7605J, intentFilter);
        }
    }

    /* renamed from: y */
    private void m10440y() {
        float f;
        int i = C4352a.f12934g[5];
        if (getService() != null) {
            i = getService().mo14768e();
            f = getService().mo14777n();
        } else {
            f = 13.0f;
        }
        setLyricTextColor(i);
        setLyricTextSize(f);
    }

    /* renamed from: z */
    private void m10441z() {
        LayoutInflater.from(this.f7610g).inflate(C4345e.desktop_lyric_view, this);
        this.f7612i = (LinearLayout) findViewById(C4344d.desktop_layout);
        this.f7613j = (LinearLayout) findViewById(C4344d.title_layout);
        this.f7614k = (TextView) findViewById(C4344d.tv_title);
        this.f7615l = (ImageView) findViewById(C4344d.iv_music);
        this.f7616m = (ImageView) findViewById(C4344d.iv_close);
        this.f7617n = (TwoLyricView) findViewById(C4344d.twoLyricView);
        this.f7618o = (HorProgressView) findViewById(C4344d.progressView);
        this.f7619p = (LinearLayout) findViewById(C4344d.play_layout);
        this.f7620q = (ImageView) findViewById(C4344d.iv_lock);
        this.f7621r = (ImageView) findViewById(C4344d.iv_prev);
        this.f7622s = (ImageView) findViewById(C4344d.iv_play);
        this.f7623t = (ImageView) findViewById(C4344d.iv_next);
        this.f7624u = (ImageView) findViewById(C4344d.iv_setting);
        this.f7625v = (LinearLayout) findViewById(C4344d.setting_layout);
        this.f7626w = (ImageView) findViewById(C4344d.iv_color1);
        this.f7627x = (ImageView) findViewById(C4344d.iv_color2);
        this.f7628y = (ImageView) findViewById(C4344d.iv_color3);
        this.f7629z = (ImageView) findViewById(C4344d.iv_color4);
        this.f7596A = (ImageView) findViewById(C4344d.iv_color5);
        this.f7597B = (ImageView) findViewById(C4344d.iv_color6);
        this.f7598C = (ImageView) findViewById(C4344d.iv_zoom_out);
        this.f7599D = (ImageView) findViewById(C4344d.iv_zoom_in);
        setBgVisable(!this.f7603H);
        this.f7625v.setVisibility(8);
    }

    /* renamed from: A */
    public void mo8874A(boolean z) {
        WindowManager.LayoutParams layoutParams;
        this.f7603H = z;
        setBgVisable(!z);
        WindowManager windowManager = this.f7607L;
        if (windowManager != null && (layoutParams = this.f7606K) != null) {
            if (z) {
                layoutParams.flags = 56;
            } else {
                layoutParams.flags = 40;
            }
            windowManager.updateViewLayout(this, layoutParams);
        }
    }

    /* renamed from: C */
    public void mo8875C(WindowManager.LayoutParams layoutParams, WindowManager windowManager) {
        this.f7606K = layoutParams;
        this.f7607L = windowManager;
    }

    public void onClick(View view) {
        if (this.f7600E) {
            m10436u();
        }
        int id = view.getId();
        if (id == C4344d.desktop_layout) {
            if (!this.f7603H) {
                setBgVisable(!this.f7600E);
            }
        } else if (id == C4344d.iv_music) {
            if (getService() != null) {
                getService().mo14766c();
            }
        } else if (id == C4344d.iv_close) {
            if (getService() != null) {
                getService().mo14772i();
            }
            C4352a.m18992f().mo14783i();
        } else if (id == C4344d.iv_lock) {
            mo8874A(true);
            if (getService() != null) {
                getService().mo14778o();
            }
        } else if (id == C4344d.iv_play) {
            if (getService() != null) {
                getService().mo14780q();
            }
        } else if (id == C4344d.iv_prev) {
            if (getService() != null) {
                getService().mo14775l(false);
            }
        } else if (id == C4344d.iv_next) {
            if (getService() != null) {
                getService().mo14775l(true);
            }
        } else if (id == C4344d.iv_setting) {
            if (this.f7625v.getVisibility() == 0) {
                this.f7625v.setVisibility(8);
            } else {
                this.f7625v.setVisibility(0);
            }
        } else if (id == C4344d.iv_color1) {
            m10419B(0);
        } else if (id == C4344d.iv_color2) {
            m10419B(1);
        } else if (id == C4344d.iv_color3) {
            m10419B(2);
        } else if (id == C4344d.iv_color4) {
            m10419B(3);
        } else if (id == C4344d.iv_color5) {
            m10419B(4);
        } else if (id == C4344d.iv_color6) {
            m10419B(5);
        } else if (id == C4344d.iv_zoom_out) {
            float f = this.f7602G - 1.0f;
            this.f7602G = f;
            if (f < 11.0f) {
                this.f7602G = 11.0f;
            }
            setLyricTextSize(this.f7602G);
            if (getService() != null) {
                getService().mo14773j(this.f7602G);
            }
        } else if (id == C4344d.iv_zoom_in) {
            float f2 = this.f7602G + 1.0f;
            this.f7602G = f2;
            if (f2 > 15.0f) {
                this.f7602G = 15.0f;
            }
            setLyricTextSize(this.f7602G);
            if (getService() != null) {
                getService().mo14773j(this.f7602G);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2240c cVar = this.f7604I;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages((Object) null);
        }
        try {
            this.f7610g.unregisterReceiver(this.f7605J);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f7606K == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7608M = motionEvent.getRawY();
            this.f7609N = this.f7606K.y;
            return false;
        } else if (action == 2 && Math.abs(motionEvent.getRawY() - this.f7608M) > ((float) this.f7611h)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            android.view.WindowManager$LayoutParams r0 = r3.f7606K
            if (r0 == 0) goto L_0x0051
            android.view.WindowManager r0 = r3.f7607L
            if (r0 != 0) goto L_0x0009
            goto L_0x0051
        L_0x0009:
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x0043
            r1 = 2
            if (r0 == r1) goto L_0x0017
            r1 = 3
            if (r0 == r1) goto L_0x0043
            goto L_0x004c
        L_0x0017:
            float r0 = r4.getRawY()
            float r1 = r3.f7608M
            float r0 = r0 - r1
            float r1 = java.lang.Math.abs(r0)
            int r2 = r3.f7611h
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            boolean r1 = r3.f7603H
            if (r1 != 0) goto L_0x004c
            boolean r1 = r3.f7600E
            if (r1 == 0) goto L_0x0034
            r3.m10436u()
        L_0x0034:
            android.view.WindowManager$LayoutParams r1 = r3.f7606K
            int r2 = r3.f7609N
            float r2 = (float) r2
            float r2 = r2 + r0
            int r0 = (int) r2
            r1.y = r0
            android.view.WindowManager r0 = r3.f7607L
            r0.updateViewLayout(r3, r1)
            goto L_0x004c
        L_0x0043:
            android.content.Context r0 = r3.f7610g
            android.view.WindowManager$LayoutParams r1 = r3.f7606K
            int r1 = r1.y
            p159f.p166c.p177d.p180j.C4352a.m18997m(r0, r1)
        L_0x004c:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L_0x0051:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.lyriclibrary.view.C2237a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C2237a(Context context, boolean z) {
        super(context);
        this.f7605J = new C2239b();
        this.f7609N = 0;
        this.f7610g = context;
        this.f7603H = z;
        this.f7611h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7604I = new C2240c(this);
        m10441z();
        m10437v();
        m10438w();
        m10439x();
    }
}
