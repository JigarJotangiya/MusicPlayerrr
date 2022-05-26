package com.coocent.marquee;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.input.InputManager;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import androidx.core.app.C0482g;
import com.coocent.marquee.C2294l;
import com.coocent.marquee.C2300p;
import p159f.p166c.p176c.C4326a;

public class MarqueeFloatingWindowService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f7692A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f7693B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f7694C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f7695D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f7696E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public String f7697F;

    /* renamed from: G */
    private Binder f7698G = new C2259e();

    /* renamed from: g */
    private WindowManager.LayoutParams f7699g;

    /* renamed from: h */
    private WindowManager f7700h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public View f7701i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public MarqueeSweepGradientView f7702j;

    /* renamed from: k */
    private C0482g.C0488d f7703k;

    /* renamed from: l */
    private BroadcastReceiver f7704l = new C2255a();

    /* renamed from: m */
    private DisplayMetrics f7705m;

    /* renamed from: n */
    private int f7706n;

    /* renamed from: o */
    private int f7707o;

    /* renamed from: p */
    private int f7708p;

    /* renamed from: q */
    private boolean f7709q;

    /* renamed from: r */
    private boolean f7710r;

    /* renamed from: s */
    private View f7711s;

    /* renamed from: t */
    private WindowManager.LayoutParams f7712t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public AudioManager f7713u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f7714v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f7715w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public Handler f7716x = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Runnable f7717y = new C2256b();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7718z = -1;

    /* renamed from: com.coocent.marquee.MarqueeFloatingWindowService$a */
    class C2255a extends BroadcastReceiver {
        C2255a() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                try {
                    MarqueeFloatingWindowService.this.startActivity(new Intent(MarqueeFloatingWindowService.this, MarqueeOnePixelActivity.class).addFlags(268435456));
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("TAGF", e.getMessage());
                }
            } else if (C2276f.m10600a(context).equals(action)) {
                MarqueeFloatingWindowService.this.stopSelf();
            } else if (C2276f.m10601b(context).equals(action)) {
                Log.d("TAGF", "MarqueeFloatingWindowService_onReceive_getSwitchFloatingAction");
                if (C4326a.m18907f().mo14749c(context)) {
                    C2296m.m10662f(context, !C2296m.m10659c(context));
                    if (!C2296m.m10659c(context)) {
                        C2296m.m10661e(context, 1);
                    }
                    MarqueeFloatingWindowService.this.m10489G();
                    C2280j.m10618d(MarqueeFloatingWindowService.this.getApplication(), MarqueeFloatingWindowService.this.f7702j, MarqueeFloatingWindowService.this.f7714v);
                    MarqueeFloatingWindowService.this.f7701i.setVisibility(MarqueeFloatingWindowService.this.f7702j.getVisibility());
                    MarqueeFloatingWindowService.this.m10502T();
                    return;
                }
                C2296m.m10662f(context, false);
                MarqueeFloatingWindowService.this.stopSelf();
            } else if (C2276f.m10602c(context).equals(action)) {
                MarqueeFloatingWindowService.this.m10489G();
            }
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeFloatingWindowService$b */
    class C2256b implements Runnable {
        C2256b() {
        }

        public void run() {
            try {
                if (MarqueeFloatingWindowService.this.f7713u != null) {
                    boolean isMusicActive = MarqueeFloatingWindowService.this.f7713u.isMusicActive();
                    if (isMusicActive != MarqueeFloatingWindowService.this.f7714v) {
                        boolean unused = MarqueeFloatingWindowService.this.f7714v = isMusicActive;
                        Log.e("TAGF", "marquee isMusicOn = " + MarqueeFloatingWindowService.this.f7714v);
                        if (MarqueeFloatingWindowService.this.f7715w) {
                            C2280j.m10622h(MarqueeFloatingWindowService.this.getApplication(), MarqueeFloatingWindowService.this.f7702j, true);
                            MarqueeFloatingWindowService.this.f7701i.setVisibility(MarqueeFloatingWindowService.this.f7702j.getVisibility());
                        } else {
                            C2280j.m10618d(MarqueeFloatingWindowService.this.getApplication(), MarqueeFloatingWindowService.this.f7702j, MarqueeFloatingWindowService.this.f7714v);
                            MarqueeFloatingWindowService.this.f7701i.setVisibility(MarqueeFloatingWindowService.this.f7702j.getVisibility());
                        }
                        MarqueeFloatingWindowService.this.m10502T();
                    }
                    if (isMusicActive) {
                        MarqueeFloatingWindowService.this.m10488F();
                        MarqueeFloatingWindowService.this.m10487E(true);
                    }
                }
                MarqueeFloatingWindowService.this.m10488F();
                MarqueeFloatingWindowService.this.m10487E(true);
                MarqueeFloatingWindowService.this.f7716x.postDelayed(MarqueeFloatingWindowService.this.f7717y, 500);
            } catch (Exception e) {
                Log.e("TAGF", "marquee Exception+++++++++++++++++++++++++++++++++");
                e.printStackTrace();
                if (MarqueeFloatingWindowService.this.f7716x != null) {
                    MarqueeFloatingWindowService.this.f7716x.removeCallbacks(MarqueeFloatingWindowService.this.f7717y);
                }
            }
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeFloatingWindowService$c */
    class C2257c implements C2300p.C2301a.C2303b {

        /* renamed from: a */
        final /* synthetic */ RemoteViews f7721a;

        C2257c(MarqueeFloatingWindowService marqueeFloatingWindowService, RemoteViews remoteViews) {
            this.f7721a = remoteViews;
        }

        /* renamed from: a */
        public void mo8907a(boolean z) {
            RemoteViews remoteViews = this.f7721a;
            int i = C2308s.notifyText;
            remoteViews.setTextViewCompoundDrawablesRelative(i, C2307r.marquee_ic_revolving_lamp_floating_window_black, 0, 0, 0);
            if (z) {
                this.f7721a.setTextColor(i, Color.parseColor("#000000"));
            }
        }

        /* renamed from: b */
        public void mo8908b(boolean z) {
            RemoteViews remoteViews = this.f7721a;
            int i = C2308s.notifyText;
            remoteViews.setTextViewCompoundDrawablesRelative(i, C2307r.marquee_ic_revolving_lamp_floating_window, 0, 0, 0);
            if (z) {
                this.f7721a.setTextColor(i, Color.parseColor("#b2b2b2"));
            }
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeFloatingWindowService$d */
    class C2258d implements Runnable {
        C2258d() {
        }

        public void run() {
            if (MarqueeFloatingWindowService.this.f7715w) {
                MarqueeSweepGradientView b = MarqueeFloatingWindowService.this.f7702j;
                int d = MarqueeFloatingWindowService.this.f7718z;
                int f = MarqueeFloatingWindowService.this.f7692A;
                int h = MarqueeFloatingWindowService.this.f7693B;
                int j = MarqueeFloatingWindowService.this.f7694C;
                int l = MarqueeFloatingWindowService.this.f7695D;
                int n = MarqueeFloatingWindowService.this.f7696E;
                MarqueeFloatingWindowService marqueeFloatingWindowService = MarqueeFloatingWindowService.this;
                b.mo8946f(d, f, h, j, l, n, marqueeFloatingWindowService.m10501S(marqueeFloatingWindowService.f7697F));
                C2280j.m10622h(MarqueeFloatingWindowService.this.getApplication(), MarqueeFloatingWindowService.this.f7702j, true);
                MarqueeFloatingWindowService.this.f7701i.setVisibility(MarqueeFloatingWindowService.this.f7702j.getVisibility());
            } else {
                C2280j.m10618d(MarqueeFloatingWindowService.this.getApplication(), MarqueeFloatingWindowService.this.f7702j, MarqueeFloatingWindowService.this.f7714v);
                MarqueeFloatingWindowService.this.f7701i.setVisibility(MarqueeFloatingWindowService.this.f7702j.getVisibility());
            }
            MarqueeFloatingWindowService.this.m10502T();
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeFloatingWindowService$e */
    class C2259e extends C2294l.C2295a {
        C2259e() {
        }

        /* renamed from: J4 */
        public void mo8910J4(int i) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7695D = i;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setWidth(i);
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: N5 */
        public void mo8911N5(int i) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7692A = i;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setRadiusBottomIn(i);
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: P6 */
        public void mo8912P6(int i) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7718z = i;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setRadiusTopIn(i);
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: R5 */
        public void mo8913R5(int i, int i2, int i3, int i4) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7718z = i;
            int unused2 = MarqueeFloatingWindowService.this.f7692A = i2;
            int unused3 = MarqueeFloatingWindowService.this.f7693B = i3;
            int unused4 = MarqueeFloatingWindowService.this.f7694C = i4;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setRadiusTopIn(MarqueeFloatingWindowService.this.f7718z);
                MarqueeFloatingWindowService.this.f7702j.setRadiusBottomIn(MarqueeFloatingWindowService.this.f7692A);
                MarqueeFloatingWindowService.this.f7702j.setRadiusTopOut(MarqueeFloatingWindowService.this.f7693B);
                MarqueeFloatingWindowService.this.f7702j.setRadiusBottomOut(MarqueeFloatingWindowService.this.f7694C);
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: W2 */
        public void mo8914W2(int i) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7694C = i;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setRadiusBottomOut(i);
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: d4 */
        public void mo8915d4(boolean z) throws RemoteException {
            boolean unused = MarqueeFloatingWindowService.this.f7715w = z;
            MarqueeFloatingWindowService.this.m10489G();
            C2280j.m10622h(MarqueeFloatingWindowService.this.getApplication(), MarqueeFloatingWindowService.this.f7702j, MarqueeFloatingWindowService.this.f7715w);
            MarqueeFloatingWindowService.this.f7701i.setVisibility(MarqueeFloatingWindowService.this.f7702j.getVisibility());
            MarqueeFloatingWindowService.this.m10502T();
        }

        /* renamed from: f4 */
        public void mo8916f4(int i) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7693B = i;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setRadiusTopOut(i);
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: j3 */
        public void mo8917j3(int i, int i2, int i3, int i4, int i5, int i6, String str) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7718z = i;
            int unused2 = MarqueeFloatingWindowService.this.f7692A = i2;
            int unused3 = MarqueeFloatingWindowService.this.f7693B = i3;
            int unused4 = MarqueeFloatingWindowService.this.f7694C = i4;
            int unused5 = MarqueeFloatingWindowService.this.f7695D = i5;
            int unused6 = MarqueeFloatingWindowService.this.f7696E = i6;
            String unused7 = MarqueeFloatingWindowService.this.f7697F = str;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeSweepGradientView b = MarqueeFloatingWindowService.this.f7702j;
                int d = MarqueeFloatingWindowService.this.f7718z;
                int f = MarqueeFloatingWindowService.this.f7692A;
                int h = MarqueeFloatingWindowService.this.f7693B;
                int j = MarqueeFloatingWindowService.this.f7694C;
                int l = MarqueeFloatingWindowService.this.f7695D;
                int n = MarqueeFloatingWindowService.this.f7696E;
                MarqueeFloatingWindowService marqueeFloatingWindowService = MarqueeFloatingWindowService.this;
                b.mo8946f(d, f, h, j, l, n, marqueeFloatingWindowService.m10501S(marqueeFloatingWindowService.f7697F));
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: v4 */
        public void mo8918v4(int i) throws RemoteException {
            int unused = MarqueeFloatingWindowService.this.f7696E = i;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setBaseRotate(i);
                MarqueeFloatingWindowService.this.m10502T();
            }
        }

        /* renamed from: w3 */
        public void mo8919w3(String str) throws RemoteException {
            String unused = MarqueeFloatingWindowService.this.f7697F = str;
            if (MarqueeFloatingWindowService.this.f7702j != null) {
                MarqueeFloatingWindowService.this.f7702j.setColors(MarqueeFloatingWindowService.this.m10501S(str));
                MarqueeFloatingWindowService.this.m10502T();
            }
        }
    }

    /* renamed from: C */
    private void m10485C() {
        View view = new View(this);
        this.f7711s = view;
        try {
            this.f7700h.addView(view, this.f7712t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: D */
    private void m10486D() {
        try {
            this.f7700h.addView(this.f7701i, this.f7699g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m10487E(boolean z) {
        int[] K = m10493K();
        boolean[] zArr = new boolean[2];
        int i = 0;
        zArr[0] = K[0] != 0;
        zArr[1] = K[1] != 0;
        int i2 = this.f7706n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && !(!z && this.f7709q == zArr[1] && this.f7710r == zArr[0])) {
                        boolean z2 = zArr[1];
                        this.f7709q = z2;
                        boolean z3 = zArr[0];
                        this.f7710r = z3;
                        WindowManager.LayoutParams layoutParams = this.f7699g;
                        layoutParams.x = z3 ? -K[0] : 0;
                        if (z2) {
                            i = -K[1];
                        }
                        layoutParams.y = i;
                    }
                } else if (z || this.f7709q != zArr[1]) {
                    boolean z4 = zArr[1];
                    this.f7709q = z4;
                    WindowManager.LayoutParams layoutParams2 = this.f7699g;
                    if (z4) {
                        i = -K[1];
                    }
                    layoutParams2.y = i;
                }
            } else if (!(!z && this.f7709q == zArr[1] && this.f7710r == zArr[0])) {
                boolean z5 = zArr[1];
                this.f7709q = z5;
                boolean z6 = zArr[0];
                this.f7710r = z6;
                WindowManager.LayoutParams layoutParams3 = this.f7699g;
                layoutParams3.x = z6 ? -K[0] : 0;
                if (z5) {
                    i = -K[1];
                }
                layoutParams3.y = i;
            }
        } else if (z || this.f7709q != zArr[1]) {
            boolean z7 = zArr[1];
            this.f7709q = z7;
            WindowManager.LayoutParams layoutParams4 = this.f7699g;
            if (z7) {
                i = -K[1];
            }
            layoutParams4.y = i;
        }
        m10502T();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020e  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m10488F() {
        /*
            r14 = this;
            r0 = 0
            android.view.WindowManager r1 = r14.f7700h     // Catch:{ Exception -> 0x000c }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ Exception -> 0x000c }
            int r1 = r1.getRotation()     // Catch:{ Exception -> 0x000c }
            goto L_0x0011
        L_0x000c:
            r1 = move-exception
            r1.printStackTrace()
            r1 = 0
        L_0x0011:
            int r2 = r14.f7706n
            if (r1 == r2) goto L_0x0235
            r14.f7706n = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "屏幕旋转="
            r1.append(r3)
            int r3 = r14.f7706n
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "TEST##TAGF"
            android.util.Log.v(r3, r1)
            r14.m10496N()
            com.coocent.marquee.MarqueeSweepGradientView r1 = r14.f7702j
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r3 = r14.f7708p
            r1.width = r3
            int r3 = r14.f7707o
            r1.height = r3
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            r3.setLayoutParams(r1)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r3 = 0
            r1.setDuration(r3)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            r3.clearAnimation()
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            r4 = 0
            r3.setPivotX(r4)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            r3.setPivotY(r4)
            int r3 = r14.f7706n
            r5 = 0
            java.lang.String r6 = "translationY"
            r7 = 3
            java.lang.String r8 = "translationX"
            java.lang.String r9 = "rotation"
            r10 = 2
            r11 = 1
            if (r3 == 0) goto L_0x0195
            if (r3 == r11) goto L_0x014d
            if (r3 == r10) goto L_0x00cd
            if (r3 == r7) goto L_0x0075
            goto L_0x01da
        L_0x0075:
            android.view.WindowManager$LayoutParams r3 = r14.f7699g
            int r12 = r14.m10491I()
            int r12 = -r12
            r3.x = r12
            android.view.WindowManager$LayoutParams r3 = r14.f7699g
            int r12 = r14.m10492J()
            int r12 = -r12
            r3.y = r12
            android.view.WindowManager$LayoutParams r3 = r14.f7699g
            int r12 = r14.f7707o
            r3.height = r12
            r3 = 1119092736(0x42b40000, float:90.0)
            if (r2 != r11) goto L_0x00b4
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r5 = new float[r11]
            r5[r0] = r3
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r9, r5)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r3 = new float[r11]
            int r9 = r14.f7707o
            float r9 = (float) r9
            r3[r0] = r9
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r8, r3)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r8 = new float[r11]
            r8[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r8)
            goto L_0x0178
        L_0x00b4:
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r4 = new float[r11]
            r4[r0] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r4)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r4 = new float[r11]
            int r6 = r14.f7707o
            float r6 = (float) r6
            r4[r0] = r6
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r4)
            goto L_0x01dc
        L_0x00cd:
            r3 = 1127481344(0x43340000, float:180.0)
            if (r2 != r11) goto L_0x00f9
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            int r8 = r14.f7708p
            int r8 = r8 / r10
            float r8 = (float) r8
            r2.setPivotX(r8)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            int r8 = r14.f7707o
            int r8 = r8 / r10
            float r8 = (float) r8
            r2.setPivotY(r8)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r8 = new float[r11]
            r8[r0] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r8)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r8 = new float[r11]
            r8[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r8)
            goto L_0x01dc
        L_0x00f9:
            if (r2 != 0) goto L_0x0123
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            int r6 = r14.f7708p
            int r6 = r6 / r10
            float r6 = (float) r6
            r2.setPivotX(r6)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            int r6 = r14.f7707o
            int r6 = r6 / r10
            float r6 = (float) r6
            r2.setPivotY(r6)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r6 = new float[r11]
            r6[r0] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r6)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r6 = new float[r11]
            r6[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r6)
            goto L_0x01dc
        L_0x0123:
            if (r2 != r7) goto L_0x01da
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            int r6 = r14.f7708p
            int r6 = r6 / r10
            float r6 = (float) r6
            r2.setPivotX(r6)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            int r6 = r14.f7707o
            int r6 = r6 / r10
            float r6 = (float) r6
            r2.setPivotY(r6)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r6 = new float[r11]
            r6[r0] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r6)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r6 = new float[r11]
            r6[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r6)
            goto L_0x01dc
        L_0x014d:
            android.view.WindowManager$LayoutParams r3 = r14.f7699g
            int r12 = r14.f7707o
            r3.height = r12
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            if (r2 != r7) goto L_0x017d
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r5 = new float[r11]
            r5[r0] = r3
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r9, r5)
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r3 = new float[r11]
            int r9 = r14.f7708p
            float r9 = (float) r9
            r3[r0] = r9
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r6, r3)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r6 = new float[r11]
            r6[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r6)
        L_0x0178:
            r13 = r3
            r3 = r2
            r2 = r5
            r5 = r13
            goto L_0x01dc
        L_0x017d:
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r4 = new float[r11]
            r4[r0] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r4)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r4 = new float[r11]
            int r8 = r14.f7708p
            float r8 = (float) r8
            r4[r0] = r8
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r4)
            goto L_0x01dc
        L_0x0195:
            if (r2 != r11) goto L_0x01ac
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r3 = new float[r11]
            r3[r0] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r3)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r8 = new float[r11]
            r8[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r8)
            goto L_0x01dc
        L_0x01ac:
            if (r2 != r10) goto L_0x01c3
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r3 = new float[r11]
            r3[r0] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r3)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r6 = new float[r11]
            r6[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r6)
            goto L_0x01dc
        L_0x01c3:
            if (r2 != r7) goto L_0x01da
            com.coocent.marquee.MarqueeSweepGradientView r2 = r14.f7702j
            float[] r3 = new float[r11]
            r3[r0] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r9, r3)
            com.coocent.marquee.MarqueeSweepGradientView r3 = r14.f7702j
            float[] r6 = new float[r11]
            r6[r0] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r8, r6)
            goto L_0x01dc
        L_0x01da:
            r2 = r5
            r3 = r2
        L_0x01dc:
            if (r5 == 0) goto L_0x020e
            if (r3 == 0) goto L_0x01ee
            if (r2 == 0) goto L_0x01ee
            android.animation.Animator[] r4 = new android.animation.Animator[r7]
            r4[r0] = r5
            r4[r11] = r3
            r4[r10] = r2
            r1.playTogether(r4)
            goto L_0x022f
        L_0x01ee:
            if (r3 == 0) goto L_0x01fa
            android.animation.Animator[] r2 = new android.animation.Animator[r10]
            r2[r0] = r5
            r2[r11] = r3
            r1.playTogether(r2)
            goto L_0x022f
        L_0x01fa:
            if (r2 == 0) goto L_0x0206
            android.animation.Animator[] r3 = new android.animation.Animator[r10]
            r3[r0] = r5
            r3[r11] = r2
            r1.playTogether(r3)
            goto L_0x022f
        L_0x0206:
            android.animation.Animator[] r2 = new android.animation.Animator[r11]
            r2[r0] = r5
            r1.playTogether(r2)
            goto L_0x022f
        L_0x020e:
            if (r3 == 0) goto L_0x021c
            if (r2 == 0) goto L_0x021c
            android.animation.Animator[] r4 = new android.animation.Animator[r10]
            r4[r0] = r3
            r4[r11] = r2
            r1.playTogether(r4)
            goto L_0x022f
        L_0x021c:
            if (r3 == 0) goto L_0x0226
            android.animation.Animator[] r2 = new android.animation.Animator[r11]
            r2[r0] = r3
            r1.playTogether(r2)
            goto L_0x022f
        L_0x0226:
            if (r2 == 0) goto L_0x022f
            android.animation.Animator[] r3 = new android.animation.Animator[r11]
            r3[r0] = r2
            r1.playTogether(r3)
        L_0x022f:
            r1.start()
            r14.m10487E(r11)
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.marquee.MarqueeFloatingWindowService.m10488F():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m10489G() {
        String packageName = getPackageName();
        int i = C2310t.marquee_noti_layout;
        RemoteViews remoteViews = new RemoteViews(packageName, i);
        C2300p.f8010b.mo9043c(getApplicationContext(), i, C2308s.notifyText, new C2257c(this, remoteViews));
        Intent intent = new Intent();
        intent.setAction(C2276f.m10600a(getApplicationContext()));
        try {
            remoteViews.setOnClickPendingIntent(C2308s.closeBtn, PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 0));
            intent.setAction(C2276f.m10601b(getApplicationContext()));
            remoteViews.setOnClickPendingIntent(C2308s.switchBtn, PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (C2296m.m10659c(getApplicationContext())) {
            if (C2298o.m10741Y0() != null) {
                remoteViews.setImageViewBitmap(C2308s.switchBtn, m10490H(C2298o.m10741Y0()));
            } else {
                remoteViews.setImageViewResource(C2308s.switchBtn, C2298o.m10738X0());
            }
        } else if (C2298o.m10746a1() != null) {
            remoteViews.setImageViewBitmap(C2308s.switchBtn, m10490H(C2298o.m10746a1()));
        } else {
            remoteViews.setImageViewResource(C2308s.switchBtn, C2298o.m10743Z0());
        }
        int i2 = 8;
        remoteViews.setInt(C2308s.closeBtn, "setVisibility", this.f7715w ? 8 : 0);
        int i3 = C2308s.switchBtn;
        if (!this.f7715w) {
            i2 = 0;
        }
        remoteViews.setInt(i3, "setVisibility", i2);
        this.f7703k.mo3202p(remoteViews);
        Notification c = this.f7703k.mo3191c();
        c.flags = 2;
        c.icon = C2307r.marquee_ic_revolving_lamp_floating_window_black;
        Intent launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null && !this.f7715w) {
            launchIntentForPackage.setAction("android.intent.action.VIEW");
            remoteViews.setOnClickPendingIntent(C2308s.notifyLayout, PendingIntent.getActivity(getApplicationContext(), 0, launchIntentForPackage, 0));
            c.contentIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage.addFlags(268435456), 0);
        }
        startForeground(255, c);
    }

    /* renamed from: H */
    private static Bitmap m10490H(Drawable drawable) {
        Bitmap.Config config;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: I */
    private int m10491I() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: J */
    private int m10492J() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: K */
    private int[] m10493K() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.f7711s.getLocationInWindow(iArr);
        this.f7711s.getLocationOnScreen(iArr2);
        return new int[]{iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
    }

    /* renamed from: L */
    private void m10494L() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f7712t = layoutParams;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.format = 1;
        layoutParams.flags |= 536;
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.width = 0;
        layoutParams.height = 0;
    }

    /* renamed from: M */
    private void m10495M() {
        View inflate = LayoutInflater.from(getApplication()).inflate(C2310t.marquee_floating, (ViewGroup) null);
        this.f7701i = inflate;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2308s.floatingRootRel);
        MarqueeSweepGradientView marqueeSweepGradientView = (MarqueeSweepGradientView) this.f7701i.findViewById(C2308s.floatingSweepGradientView);
        this.f7702j = marqueeSweepGradientView;
        marqueeSweepGradientView.post(new C2258d());
    }

    /* renamed from: N */
    private void m10496N() {
        this.f7705m = new DisplayMetrics();
        try {
            this.f7700h.getDefaultDisplay().getMetrics(this.f7705m);
        } catch (Exception e) {
            e.printStackTrace();
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f7699g = layoutParams;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.format = 1;
        layoutParams.flags |= 16777752;
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = -m10492J();
        if (i >= 31) {
            this.f7699g.alpha = ((InputManager) getApplication().getSystemService("input")).getMaximumObscuringOpacityForTouch();
        }
        m10500R(this.f7700h, this.f7705m);
    }

    /* renamed from: O */
    private void m10497O() {
        try {
            View view = this.f7711s;
            if (view != null) {
                this.f7700h.removeView(view);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: P */
    private void m10498P() {
        try {
            View view = this.f7701i;
            if (view != null) {
                this.f7700h.removeView(view);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Q */
    private void m10499Q() {
        WindowManager.LayoutParams layoutParams = this.f7699g;
        int i = layoutParams.height;
        int i2 = layoutParams.width;
        if (i > i2) {
            this.f7707o = i;
            this.f7708p = i2;
            return;
        }
        this.f7707o = i2;
        this.f7708p = i;
    }

    /* renamed from: R */
    private void m10500R(WindowManager windowManager, DisplayMetrics displayMetrics) {
        try {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
                WindowManager.LayoutParams layoutParams = this.f7699g;
                layoutParams.height = point.y;
                layoutParams.width = point.x;
                return;
            }
            try {
                Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
                WindowManager.LayoutParams layoutParams2 = this.f7699g;
                layoutParams2.height = displayMetrics.heightPixels;
                layoutParams2.width = displayMetrics.widthPixels;
            } catch (Exception unused) {
                defaultDisplay.getSize(point);
                WindowManager.LayoutParams layoutParams3 = this.f7699g;
                layoutParams3.height = point.y;
                layoutParams3.width = point.x;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public int[] m10501S(String str) {
        try {
            String[] split = str.substring(1, str.length() - 1).split(", ");
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m10502T() {
        try {
            this.f7700h.updateViewLayout(this.f7701i, this.f7699g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f7698G;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.uiMode & 48;
        if (i == 16 || i == 32) {
            m10489G();
        }
    }

    public void onCreate() {
        super.onCreate();
        Log.d("TAGF", "MarqueeFloatingWindowService_onCreate");
        this.f7703k = new C0482g.C0488d(getApplication(), "channel_marquee");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("channel_marquee", "marquee", 2);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            this.f7703k.mo3209x(C2307r.marquee_ic_revolving_lamp_floating_window_black);
            startForeground(255, this.f7703k.mo3191c());
        }
        m10489G();
        this.f7700h = (WindowManager) getApplication().getSystemService("window");
        m10496N();
        m10499Q();
        m10495M();
        m10486D();
        m10494L();
        m10485C();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C2276f.m10600a(getApplicationContext()));
        intentFilter.addAction(C2276f.m10601b(getApplicationContext()));
        intentFilter.addAction(C2276f.m10602c(getApplicationContext()));
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        try {
            registerReceiver(this.f7704l, intentFilter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f7713u = audioManager;
        if (audioManager != null) {
            this.f7714v = audioManager.isMusicActive();
        }
        this.f7716x.postDelayed(this.f7717y, 100);
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (powerManager != null) {
            boolean z = false;
            try {
                z = powerManager.isScreenOn();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!z) {
                stopSelf();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("TAGF", "marquee onDestroy");
        m10497O();
        BroadcastReceiver broadcastReceiver = this.f7704l;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        Handler handler = this.f7716x;
        if (handler != null) {
            handler.removeCallbacks(this.f7717y);
        }
        m10498P();
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(255);
        }
        stopForeground(true);
    }
}
