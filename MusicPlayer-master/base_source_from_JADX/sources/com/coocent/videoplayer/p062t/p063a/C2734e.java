package com.coocent.videoplayer.p062t.p063a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.videoplayer.p060r.C2712b;
import com.coocent.videoplayer.p061s.C2725e;
import com.p256kk.taurus.playerbase.p260d.C6621a;
import com.p256kk.taurus.playerbase.p263g.C6660b;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p263g.C6674l;
import com.p256kk.taurus.playerbase.p266j.C6695c;
import java.util.Objects;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.t.a.e */
/* compiled from: GestureCover.kt */
public final class C2734e extends C6660b implements C6695c {

    /* renamed from: A */
    private final Runnable f9386A = new C2726a(this);

    /* renamed from: B */
    private final C2735a f9387B = new C2735a(this);

    /* renamed from: l */
    private C2712b f9388l;

    /* renamed from: m */
    private AudioManager f9389m;

    /* renamed from: n */
    private final Bundle f9390n = new Bundle();

    /* renamed from: o */
    private int f9391o;

    /* renamed from: p */
    private int f9392p;

    /* renamed from: q */
    private float f9393q = -1.0f;

    /* renamed from: r */
    private int f9394r;

    /* renamed from: s */
    private int f9395s;

    /* renamed from: t */
    private int f9396t = -1;

    /* renamed from: u */
    private long f9397u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f9398v;

    /* renamed from: w */
    private boolean f9399w;

    /* renamed from: x */
    private boolean f9400x;

    /* renamed from: y */
    private boolean f9401y;

    /* renamed from: z */
    private final Handler f9402z = new Handler(Looper.getMainLooper());

    /* renamed from: com.coocent.videoplayer.t.a.e$a */
    /* compiled from: GestureCover.kt */
    public static final class C2735a implements C6668j.C6669a {

        /* renamed from: a */
        final /* synthetic */ C2734e f9403a;

        C2735a(C2734e eVar) {
            this.f9403a = eVar;
        }

        /* renamed from: a */
        public void mo10289a(String str, Object obj) {
            if (TextUtils.equals(str, "play_completed") || TextUtils.equals(str, "show_error") || TextUtils.equals(str, "locked") || TextUtils.equals(str, "move_screen")) {
                C2734e eVar = this.f9403a;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                eVar.f9398v = !((Boolean) obj).booleanValue();
            }
        }

        /* renamed from: b */
        public String[] mo10290b() {
            return new String[]{"play_completed", "show_error", "locked", "move_screen"};
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2734e(Context context) {
        super(context);
        C8594l.m46771e(context, "context");
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: R */
    private final void m12352R(float f) {
        this.f9399w = false;
        if (mo25993w() instanceof Activity) {
            Context w = mo25993w();
            Objects.requireNonNull(w, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) w;
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            if (this.f9393q < 0.0f) {
                float f2 = attributes.screenBrightness;
                this.f9393q = f2;
                if (f2 <= 0.0f) {
                    this.f9393q = 0.5f;
                } else if (f2 < 0.01f) {
                    this.f9393q = 0.01f;
                }
            }
            C2712b bVar = this.f9388l;
            if (bVar != null) {
                bVar.f9300e.setVisibility(0);
                bVar.f9301f.setVisibility(8);
                bVar.f9302g.setVisibility(8);
                float f3 = this.f9393q + f;
                attributes.screenBrightness = f3;
                if (f3 > 1.0f) {
                    attributes.screenBrightness = 1.0f;
                } else if (f3 < 0.01f) {
                    attributes.screenBrightness = 0.01f;
                }
                int i = (int) (attributes.screenBrightness * ((float) 100));
                AppCompatTextView appCompatTextView = bVar.f9305j;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('%');
                appCompatTextView.setText(sb.toString());
                bVar.f9303h.setProgress(i);
                activity.getWindow().setAttributes(attributes);
                return;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: S */
    private final void m12353S(float f) {
        if (m12356V() > 0) {
            this.f9399w = true;
            if (mo25994x().mo26000e("enable_timer_update", false)) {
                mo25994x().mo26001h("enable_timer_update", false);
            }
            int V = m12356V();
            int U = m12355U();
            long min = (long) (((float) Math.min(V / 2, V - U)) * f);
            long j = (long) U;
            long j2 = min + j;
            this.f9397u = j2;
            long j3 = (long) V;
            if (j2 > j3) {
                this.f9397u = j3;
            } else if (j2 <= 0) {
                this.f9397u = 0;
                min = -j;
            }
            int i = (min > 0 ? 1 : (min == 0 ? 0 : -1));
            if (i != 0) {
                this.f9390n.putInt("int_arg1", (int) this.f9397u);
                this.f9390n.putInt("int_arg2", V);
                mo25987A("controller_cover", 2000, this.f9390n);
                C2712b bVar = this.f9388l;
                if (bVar != null) {
                    bVar.f9301f.setVisibility(0);
                    bVar.f9300e.setVisibility(8);
                    bVar.f9302g.setVisibility(8);
                    String b = C2725e.m12318b(Math.abs(min));
                    String a = C2725e.m12317a(Math.abs(min), b);
                    if (i >= 0) {
                        bVar.f9307l.setText(C8594l.m46777k("+", a));
                        bVar.f9297b.setVisibility(0);
                        bVar.f9298c.setVisibility(8);
                    } else {
                        bVar.f9307l.setText(C8594l.m46777k("-", a));
                        bVar.f9297b.setVisibility(8);
                        bVar.f9298c.setVisibility(0);
                    }
                    AppCompatTextView appCompatTextView = bVar.f9306k;
                    appCompatTextView.setText(C2725e.m12317a(this.f9397u, b) + '/' + C2725e.m12317a(j3, b));
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: T */
    private final void m12354T(float f) {
        boolean z = false;
        this.f9399w = false;
        float f2 = ((float) 2) * f;
        int i = this.f9392p;
        int i2 = ((int) (f2 * ((float) i))) + this.f9391o;
        if (i2 <= i) {
            i = i2;
        }
        if (i < 0) {
            i = 0;
        }
        AudioManager audioManager = this.f9389m;
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i, 0);
            if (Build.VERSION.SDK_INT >= 18) {
                AudioManager audioManager2 = this.f9389m;
                if (audioManager2 == null) {
                    C8594l.m46783q("mAudioManager");
                    throw null;
                } else if (audioManager2.getStreamVolume(3) < i) {
                    AudioManager audioManager3 = this.f9389m;
                    if (audioManager3 != null) {
                        audioManager3.setStreamVolume(3, i, 1);
                    } else {
                        C8594l.m46783q("mAudioManager");
                        throw null;
                    }
                }
            }
            int i3 = (int) ((((float) i) / ((float) this.f9392p)) * ((float) 100));
            C2712b bVar = this.f9388l;
            if (bVar != null) {
                bVar.f9302g.setVisibility(0);
                bVar.f9300e.setVisibility(8);
                bVar.f9301f.setVisibility(8);
                AppCompatTextView appCompatTextView = bVar.f9308m;
                StringBuilder sb = new StringBuilder();
                sb.append(i3);
                sb.append('%');
                appCompatTextView.setText(sb.toString());
                bVar.f9304i.setProgress(i3);
                bVar.f9299d.setSelected(i3 == 0);
                Bundle bundle = this.f9390n;
                if (i == 0) {
                    z = true;
                }
                bundle.putBoolean("mute", z);
                mo25987A("controller_cover", 2001, this.f9390n);
                return;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
        C8594l.m46783q("mAudioManager");
        throw null;
    }

    /* renamed from: U */
    private final int m12355U() {
        C6674l r = mo25879r();
        if (r == null) {
            return 0;
        }
        return r.mo25880a();
    }

    /* renamed from: V */
    private final int m12356V() {
        C6674l r = mo25879r();
        if (r == null) {
            return 0;
        }
        return r.mo25881b();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m12359Y(C2734e eVar) {
        C8594l.m46771e(eVar, "this$0");
        if (eVar.f9396t >= 0) {
            Bundle a = C6621a.m38175a();
            a.putInt("int_data", eVar.f9396t);
            eVar.mo25980N(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m12360Z(C2734e eVar) {
        C8594l.m46771e(eVar, "this$0");
        eVar.f9394r = eVar.mo25975E().getWidth();
        eVar.f9395s = eVar.mo25975E().getHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo10267H() {
        super.mo10267H();
        mo25994x().mo26003j(this.f9387B);
        mo25975E().post(new C2727b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo10268I() {
        super.mo10268I();
        mo25994x().mo26004k(this.f9387B);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public View mo10269J(Context context) {
        C2712b d = C2712b.m12276d(LayoutInflater.from(context), (ViewGroup) null, false);
        C8594l.m46770d(d, "it");
        this.f9388l = d;
        ConstraintLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(LayoutInflater.f…g = it\n            }.root");
        return c;
    }

    /* renamed from: a */
    public void mo10270a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo10271b(int i, Bundle bundle) {
        if (i == -99015) {
            this.f9398v = true;
        }
    }

    /* renamed from: d */
    public void mo10272d(int i, Bundle bundle) {
    }

    /* renamed from: n */
    public void mo10273n() {
        this.f9391o = -1;
        this.f9393q = -1.0f;
        C2712b bVar = this.f9388l;
        if (bVar != null) {
            bVar.f9302g.setVisibility(8);
            C2712b bVar2 = this.f9388l;
            if (bVar2 != null) {
                bVar2.f9300e.setVisibility(8);
                C2712b bVar3 = this.f9388l;
                if (bVar3 != null) {
                    bVar3.f9301f.setVisibility(8);
                    if (this.f9397u < 0 || !this.f9399w) {
                        mo25994x().mo26001h("enable_timer_update", true);
                    } else {
                        mo25994x().mo26001h("enable_timer_update", false);
                        this.f9396t = (int) this.f9397u;
                        this.f9402z.removeCallbacks(this.f9386A);
                        this.f9402z.postDelayed(this.f9386A, 300);
                        this.f9397u = 0;
                    }
                    this.f9399w = false;
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    public void onDoubleTap(MotionEvent motionEvent) {
    }

    public void onDown(MotionEvent motionEvent) {
        this.f9399w = false;
        this.f9401y = true;
        AudioManager audioManager = this.f9389m;
        if (audioManager != null) {
            this.f9391o = audioManager.getStreamVolume(3);
        } else {
            C8594l.m46783q("mAudioManager");
            throw null;
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C8594l.m46771e(motionEvent, "e1");
        C8594l.m46771e(motionEvent2, "e2");
        if (this.f9398v) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = x - motionEvent2.getX();
            float y2 = y - motionEvent2.getY();
            if (this.f9401y) {
                float abs = Math.abs(f);
                float abs2 = Math.abs(f2);
                boolean z = true;
                this.f9399w = abs >= abs2;
                if (x <= ((float) this.f9394r) * 0.5f) {
                    z = false;
                }
                this.f9400x = z;
                this.f9401y = false;
            }
            if (this.f9399w) {
                m12353S((-x2) / ((float) this.f9394r));
                return;
            }
            float abs3 = Math.abs(y2);
            int i = this.f9395s;
            if (abs3 <= ((float) i)) {
                if (this.f9400x) {
                    m12354T(y2 / ((float) i));
                } else {
                    m12352R(y2 / ((float) i));
                }
            }
        }
    }

    public void onSingleTapConfirmed(MotionEvent motionEvent) {
    }

    /* renamed from: p */
    public void mo10283p() {
        super.mo10283p();
        this.f9402z.removeCallbacks(this.f9386A);
    }

    /* renamed from: t */
    public void mo10284t() {
        super.mo10284t();
        Object systemService = mo25993w().getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.f9389m = audioManager;
        if (audioManager != null) {
            this.f9392p = audioManager.getStreamMaxVolume(3);
        } else {
            C8594l.m46783q("mAudioManager");
            throw null;
        }
    }
}
