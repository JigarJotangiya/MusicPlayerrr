package com.coocent.videoplayer.p062t.p063a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.video.videoplayercore.ConsantsKt;
import com.coocent.videoplayer.C2705l;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.p060r.C2711a;
import com.coocent.videoplayer.p061s.C2725e;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p260d.C6621a;
import com.p256kk.taurus.playerbase.p263g.C6660b;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p266j.C6695c;
import com.p256kk.taurus.playerbase.player.C6712d;
import java.io.Serializable;
import java.util.Objects;
import p369i.C8457t;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.t.a.d */
/* compiled from: ControllerCover.kt */
public final class C2729d extends C6660b implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, C6712d, C6695c {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2711a f9369l;

    /* renamed from: m */
    private ObjectAnimator f9370m;

    /* renamed from: n */
    private int f9371n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f9372o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f9373p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f9374q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f9375r = true;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f9376s;

    /* renamed from: t */
    private final C2730a f9377t = new C2730a(this, Looper.getMainLooper());

    /* renamed from: u */
    private final C2731b f9378u = new C2731b(this);

    /* renamed from: v */
    private final C2732c f9379v = new C2732c(this);

    /* renamed from: com.coocent.videoplayer.t.a.d$a */
    /* compiled from: ControllerCover.kt */
    public static final class C2730a extends Handler {

        /* renamed from: a */
        final /* synthetic */ C2729d f9380a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2730a(C2729d dVar, Looper looper) {
            super(looper);
            this.f9380a = dVar;
        }

        public void handleMessage(Message message) {
            C8594l.m46771e(message, "msg");
            super.handleMessage(message);
            if (message.what == 13) {
                this.f9380a.m12333e0(false);
            }
        }
    }

    /* renamed from: com.coocent.videoplayer.t.a.d$b */
    /* compiled from: ControllerCover.kt */
    public static final class C2731b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C2729d f9381g;

        C2731b(C2729d dVar) {
            this.f9381g = dVar;
        }

        public void run() {
            if (this.f9381g.f9372o >= 0) {
                Bundle a = C6621a.m38175a();
                a.putInt("int_data", this.f9381g.f9372o);
                this.f9381g.mo25980N(a);
            }
        }
    }

    /* renamed from: com.coocent.videoplayer.t.a.d$c */
    /* compiled from: ControllerCover.kt */
    public static final class C2732c implements C6668j.C6669a {

        /* renamed from: a */
        final /* synthetic */ C2729d f9382a;

        C2732c(C2729d dVar) {
            this.f9382a = dVar;
        }

        /* renamed from: a */
        public void mo10289a(String str, Object obj) {
            if (!TextUtils.equals(str, ConsantsKt.KEY_DATA_SOURCE)) {
                int i = 8;
                if (TextUtils.equals(str, "show_play_list")) {
                    if (obj != null) {
                        C2729d dVar = this.f9382a;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        C2711a Q = dVar.f9369l;
                        if (Q != null) {
                            AppCompatImageView appCompatImageView = Q.f9285l;
                            C8594l.m46770d(appCompatImageView, "mBinding.ivPlayList");
                            if (booleanValue) {
                                i = 0;
                            }
                            appCompatImageView.setVisibility(i);
                            return;
                        }
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                } else if (TextUtils.equals(str, "play_completed")) {
                    if (obj != null) {
                        C2729d dVar2 = this.f9382a;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        if (booleanValue2) {
                            dVar2.m12333e0(false);
                        }
                        dVar2.f9375r = !booleanValue2;
                    }
                } else if (TextUtils.equals(str, "enable_timer_update")) {
                    C2729d dVar3 = this.f9382a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    dVar3.f9374q = ((Boolean) obj).booleanValue();
                } else if (TextUtils.equals(str, "screen_orientation")) {
                    C2729d dVar4 = this.f9382a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    dVar4.f9373p = ((Integer) obj).intValue();
                    C2729d dVar5 = this.f9382a;
                    dVar5.m12336h0(dVar5.f9373p);
                } else if (TextUtils.equals(str, "mute")) {
                    C2711a Q2 = this.f9382a.f9369l;
                    if (Q2 != null) {
                        AppCompatImageView appCompatImageView2 = Q2.f9282i;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        appCompatImageView2.setSelected(((Boolean) obj).booleanValue());
                        return;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                } else if (TextUtils.equals(str, "playing")) {
                    C2711a Q3 = this.f9382a.f9369l;
                    if (Q3 != null) {
                        AppCompatImageButton appCompatImageButton = Q3.f9275b;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        appCompatImageButton.setSelected(!((Boolean) obj).booleanValue());
                        return;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                } else if (TextUtils.equals(str, "show_forward_rewind")) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue3 = ((Boolean) obj).booleanValue();
                    C2711a Q4 = this.f9382a.f9369l;
                    if (Q4 != null) {
                        AppCompatImageView appCompatImageView3 = Q4.f9286m;
                        C8594l.m46770d(appCompatImageView3, "ivPrevious");
                        appCompatImageView3.setVisibility(booleanValue3 ^ true ? 0 : 8);
                        AppCompatImageView appCompatImageView4 = Q4.f9283j;
                        C8594l.m46770d(appCompatImageView4, "ivNext");
                        appCompatImageView4.setVisibility(booleanValue3 ^ true ? 0 : 8);
                        AppCompatImageView appCompatImageView5 = Q4.f9279f;
                        C8594l.m46770d(appCompatImageView5, "ivFastRewind");
                        appCompatImageView5.setVisibility(booleanValue3 ? 0 : 8);
                        AppCompatImageView appCompatImageView6 = Q4.f9278e;
                        C8594l.m46770d(appCompatImageView6, "ivFastForward");
                        if (booleanValue3) {
                            i = 0;
                        }
                        appCompatImageView6.setVisibility(i);
                        return;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                } else if (TextUtils.equals(str, "show_window")) {
                    C2729d dVar6 = this.f9382a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    dVar6.f9376s = ((Boolean) obj).booleanValue();
                    C2711a Q5 = this.f9382a.f9369l;
                    if (Q5 != null) {
                        AppCompatImageView appCompatImageView7 = Q5.f9288o;
                        C8594l.m46770d(appCompatImageView7, "mBinding.ivWindowsPlay");
                        if (this.f9382a.f9376s) {
                            i = 0;
                        }
                        appCompatImageView7.setVisibility(i);
                        return;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else if (obj != null) {
                C2729d dVar7 = this.f9382a;
                if (obj instanceof C6618a) {
                    dVar7.m12335g0((C6618a) obj);
                }
            }
        }

        /* renamed from: b */
        public String[] mo10290b() {
            return new String[]{ConsantsKt.KEY_DATA_SOURCE, "screen_orientation", "enable_timer_update", "mute", "play_completed", "show_forward_rewind", "playing", "show_play_list", "show_window"};
        }
    }

    /* renamed from: com.coocent.videoplayer.t.a.d$d */
    /* compiled from: ControllerCover.kt */
    public static final class C2733d extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final Bundle f9383a = C6621a.m38175a();

        /* renamed from: b */
        final /* synthetic */ boolean f9384b;

        /* renamed from: c */
        final /* synthetic */ C2729d f9385c;

        C2733d(boolean z, C2729d dVar) {
            this.f9384b = z;
            this.f9385c = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f9384b) {
                C2711a Q = this.f9385c.f9369l;
                if (Q != null) {
                    Q.f9290q.setVisibility(8);
                    this.f9383a.putBoolean("bool_data", false);
                    this.f9385c.mo25996z(1016, this.f9383a);
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (this.f9384b) {
                C2711a Q = this.f9385c.f9369l;
                if (Q != null) {
                    Q.f9290q.setVisibility(0);
                    C2711a Q2 = this.f9385c.f9369l;
                    if (Q2 == null) {
                        C8594l.m46783q("mBinding");
                        throw null;
                    } else if (!Q2.f9280g.isSelected()) {
                        this.f9383a.putBoolean("bool_data", true);
                        this.f9385c.mo25996z(1016, this.f9383a);
                    }
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2729d(Context context) {
        super(context);
        C8594l.m46771e(context, "context");
    }

    /* renamed from: c0 */
    private final void m12331c0() {
        ObjectAnimator objectAnimator = this.f9370m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            objectAnimator.removeAllListeners();
            objectAnimator.removeAllUpdateListeners();
        }
    }

    /* renamed from: d0 */
    private final void m12332d0() {
        C2711a aVar = this.f9369l;
        if (aVar != null) {
            boolean isSelected = aVar.f9275b.isSelected();
            if (isSelected) {
                mo25979M((Bundle) null);
            } else {
                mo25978L((Bundle) null);
            }
            C2711a aVar2 = this.f9369l;
            if (aVar2 != null) {
                aVar2.f9275b.setSelected(!isSelected);
                mo25994x().mo26001h("playing", isSelected);
                return;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m12333e0(boolean z) {
        if (z) {
            this.f9377t.removeMessages(13);
            this.f9377t.sendEmptyMessageDelayed(13, 3000);
        } else {
            this.f9377t.removeMessages(13);
        }
        m12334f0(z);
    }

    /* renamed from: f0 */
    private final void m12334f0(boolean z) {
        C2711a aVar = this.f9369l;
        if (aVar != null) {
            aVar.f9290q.clearAnimation();
            m12331c0();
            C2711a aVar2 = this.f9369l;
            if (aVar2 != null) {
                ConstraintLayout constraintLayout = aVar2.f9290q;
                float[] fArr = new float[2];
                float f = 0.0f;
                fArr[0] = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                fArr[1] = f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, "alpha", fArr).setDuration(500);
                duration.addListener(new C2733d(z, this));
                duration.start();
                C8457t tVar = C8457t.f34900a;
                this.f9370m = duration;
                if (z) {
                    mo25977K();
                } else {
                    mo25981O();
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m12335g0(C6618a aVar) {
        int columnIndex;
        String title = aVar.getTitle();
        if (!TextUtils.isEmpty(title)) {
            C2711a aVar2 = this.f9369l;
            if (aVar2 != null) {
                aVar2.f9295v.setText(title);
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            Uri uri = aVar.getUri();
            if (uri != null) {
                String scheme = uri.getScheme();
                if (scheme == null) {
                    title = uri.getPath();
                } else if (C8594l.m46767a("file", scheme)) {
                    title = uri.getLastPathSegment();
                } else if (C8594l.m46767a("content", scheme)) {
                    Cursor query = mo25993w().getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
                    if (query == null) {
                        query = null;
                    } else if (!query.isClosed() && query.moveToFirst() && (columnIndex = query.getColumnIndex("_display_name")) > -1) {
                        title = query.getString(columnIndex);
                    }
                    if (query != null) {
                        query.close();
                    }
                }
                if (!TextUtils.isEmpty(title)) {
                    C2711a aVar3 = this.f9369l;
                    if (aVar3 != null) {
                        aVar3.f9295v.setText(title);
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m12336h0(int i) {
        if (i == 1) {
            C2711a aVar = this.f9369l;
            if (aVar != null) {
                aVar.f9284k.setImageResource(C2705l.video_playpage_ic_landscape);
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else if (i != 2) {
            C2711a aVar2 = this.f9369l;
            if (aVar2 != null) {
                aVar2.f9284k.setImageResource(C2705l.video_playpage_ic_auto);
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C2711a aVar3 = this.f9369l;
            if (aVar3 != null) {
                aVar3.f9284k.setImageResource(C2705l.video_playpage_ic_portrait);
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
    }

    /* renamed from: i0 */
    private final void m12337i0(int i, int i2) {
        C2711a aVar = this.f9369l;
        if (aVar != null) {
            aVar.f9292s.setMax(i2);
            aVar.f9292s.setProgress(i);
            aVar.f9292s.setSecondaryProgress((int) (((((float) this.f9371n) * 1.0f) / ((float) 100)) * ((float) i2)));
            long j = (long) i2;
            String b = C2725e.m12318b(j);
            aVar.f9293t.setText(C2725e.m12317a((long) i, b));
            aVar.f9294u.setText(C2725e.m12317a(j, b));
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo10267H() {
        super.mo10267H();
        C6618a aVar = (C6618a) mo25994x().mo25999d(ConsantsKt.KEY_DATA_SOURCE);
        if (aVar != null) {
            m12335g0(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo10268I() {
        super.mo10268I();
        C2711a aVar = this.f9369l;
        if (aVar != null) {
            ConstraintLayout constraintLayout = aVar.f9290q;
            C8594l.m46770d(constraintLayout, "mBinding.layoutController");
            constraintLayout.setVisibility(8);
            this.f9377t.removeMessages(13);
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public View mo10269J(Context context) {
        C8594l.m46771e(context, "context");
        C2711a d = C2711a.m12272d(LayoutInflater.from(context), (ViewGroup) null, false);
        C8594l.m46770d(d, "it");
        this.f9369l = d;
        ConstraintLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(LayoutInflater.f…g = it\n            }.root");
        return c;
    }

    /* renamed from: a */
    public void mo10270a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo10271b(int i, Bundle bundle) {
        Integer num;
        Serializable serializable = null;
        switch (i) {
            case -99031:
                if (bundle == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(bundle.getInt("int_data"));
                }
                if (num != null && num.intValue() == 4) {
                    C2711a aVar = this.f9369l;
                    if (aVar != null) {
                        aVar.f9275b.setSelected(true);
                        return;
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                } else if (num != null && num.intValue() == 3) {
                    C2711a aVar2 = this.f9369l;
                    if (aVar2 != null) {
                        aVar2.f9275b.setSelected(false);
                        return;
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                } else {
                    return;
                }
            case -99015:
            case -99014:
                this.f9374q = true;
                return;
            case -99001:
                this.f9371n = 0;
                m12337i0(0, 0);
                if (bundle != null) {
                    serializable = bundle.getSerializable("serializable_data");
                }
                Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.kk.taurus.playerbase.entity.DataSource");
                C6618a aVar3 = (C6618a) serializable;
                mo25994x().mo26002i(ConsantsKt.KEY_DATA_SOURCE, aVar3);
                m12335g0(aVar3);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public void mo10272d(int i, Bundle bundle) {
    }

    /* renamed from: n */
    public void mo10273n() {
    }

    public void onClick(View view) {
        Integer valueOf = view == null ? null : Integer.valueOf(view.getId());
        int i = C2706m.iv_back;
        if (valueOf != null && valueOf.intValue() == i) {
            mo25996z(1001, (Bundle) null);
            return;
        }
        int i2 = C2706m.iv_play_list;
        int i3 = 0;
        if (valueOf != null && valueOf.intValue() == i2) {
            mo25996z(1003, (Bundle) null);
            m12333e0(false);
            return;
        }
        int i4 = C2706m.iv_more;
        if (valueOf != null && valueOf.intValue() == i4) {
            mo25996z(1004, (Bundle) null);
            m12333e0(false);
            return;
        }
        int i5 = C2706m.iv_screenshot;
        if (valueOf != null && valueOf.intValue() == i5) {
            mo25996z(1005, (Bundle) null);
            return;
        }
        int i6 = C2706m.iv_windows_play;
        if (valueOf != null && valueOf.intValue() == i6) {
            mo25996z(1017, (Bundle) null);
            return;
        }
        int i7 = C2706m.iv_mute;
        if (valueOf != null && valueOf.intValue() == i7) {
            C2711a aVar = this.f9369l;
            if (aVar != null) {
                boolean isSelected = aVar.f9282i.isSelected();
                Bundle a = C6621a.m38175a();
                a.putBoolean("mute", !isSelected);
                mo25996z(1006, a);
                C2711a aVar2 = this.f9369l;
                if (aVar2 != null) {
                    aVar2.f9282i.setSelected(!isSelected);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            int i8 = C2706m.iv_lock;
            if (valueOf != null && valueOf.intValue() == i8) {
                C2711a aVar3 = this.f9369l;
                if (aVar3 != null) {
                    AppCompatImageView appCompatImageView = aVar3.f9280g;
                    if (aVar3 != null) {
                        appCompatImageView.setSelected(!appCompatImageView.isSelected());
                        C2711a aVar4 = this.f9369l;
                        if (aVar4 != null) {
                            boolean isSelected2 = aVar4.f9280g.isSelected();
                            m12333e0(!isSelected2);
                            C2711a aVar5 = this.f9369l;
                            if (aVar5 != null) {
                                RelativeLayout relativeLayout = aVar5.f9291r;
                                C8594l.m46770d(relativeLayout, "mBinding.layoutTop");
                                relativeLayout.setVisibility(isSelected2 ^ true ? 0 : 8);
                                C2711a aVar6 = this.f9369l;
                                if (aVar6 != null) {
                                    ConstraintLayout constraintLayout = aVar6.f9289p;
                                    C8594l.m46770d(constraintLayout, "mBinding.layoutBottom");
                                    constraintLayout.setVisibility(isSelected2 ^ true ? 0 : 8);
                                    C2711a aVar7 = this.f9369l;
                                    if (aVar7 != null) {
                                        AppCompatImageView appCompatImageView2 = aVar7.f9287n;
                                        C8594l.m46770d(appCompatImageView2, "mBinding.ivScreenshot");
                                        appCompatImageView2.setVisibility(isSelected2 ^ true ? 0 : 8);
                                        C2711a aVar8 = this.f9369l;
                                        if (aVar8 != null) {
                                            AppCompatImageView appCompatImageView3 = aVar8.f9282i;
                                            C8594l.m46770d(appCompatImageView3, "mBinding.ivMute");
                                            appCompatImageView3.setVisibility(isSelected2 ^ true ? 0 : 8);
                                            C2711a aVar9 = this.f9369l;
                                            if (aVar9 != null) {
                                                AppCompatImageView appCompatImageView4 = aVar9.f9288o;
                                                C8594l.m46770d(appCompatImageView4, "mBinding.ivWindowsPlay");
                                                appCompatImageView4.setVisibility(isSelected2 ^ true ? 0 : 8);
                                                if (this.f9376s) {
                                                    C2711a aVar10 = this.f9369l;
                                                    if (aVar10 != null) {
                                                        AppCompatImageView appCompatImageView5 = aVar10.f9288o;
                                                        C8594l.m46770d(appCompatImageView5, "mBinding.ivWindowsPlay");
                                                        if (!(!isSelected2)) {
                                                            i3 = 8;
                                                        }
                                                        appCompatImageView5.setVisibility(i3);
                                                    } else {
                                                        C8594l.m46783q("mBinding");
                                                        throw null;
                                                    }
                                                } else {
                                                    C2711a aVar11 = this.f9369l;
                                                    if (aVar11 != null) {
                                                        AppCompatImageView appCompatImageView6 = aVar11.f9288o;
                                                        C8594l.m46770d(appCompatImageView6, "mBinding.ivWindowsPlay");
                                                        appCompatImageView6.setVisibility(8);
                                                    } else {
                                                        C8594l.m46783q("mBinding");
                                                        throw null;
                                                    }
                                                }
                                                Bundle a2 = C6621a.m38175a();
                                                a2.putBoolean("locked", isSelected2);
                                                mo25996z(1008, a2);
                                                mo25994x().mo26001h("locked", isSelected2);
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
                                C8594l.m46783q("mBinding");
                                throw null;
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
                C8594l.m46783q("mBinding");
                throw null;
            }
            int i9 = C2706m.iv_eq;
            if (valueOf != null && valueOf.intValue() == i9) {
                mo25996z(1009, (Bundle) null);
                m12333e0(false);
                return;
            }
            int i10 = C2706m.iv_previous;
            if (valueOf != null && valueOf.intValue() == i10) {
                mo25996z(1011, (Bundle) null);
                return;
            }
            int i11 = C2706m.ib_play;
            if (valueOf != null && valueOf.intValue() == i11) {
                m12332d0();
                return;
            }
            int i12 = C2706m.iv_next;
            if (valueOf != null && valueOf.intValue() == i12) {
                mo25996z(1012, (Bundle) null);
                return;
            }
            int i13 = C2706m.iv_fast_rewind;
            if (valueOf != null && valueOf.intValue() == i13) {
                mo25996z(1013, (Bundle) null);
                return;
            }
            int i14 = C2706m.iv_fast_forward;
            if (valueOf != null && valueOf.intValue() == i14) {
                mo25996z(1014, (Bundle) null);
                return;
            }
            int i15 = C2706m.iv_orientation;
            if (valueOf != null && valueOf.intValue() == i15) {
                int i16 = this.f9373p;
                if (i16 == 1) {
                    i3 = 2;
                } else if (i16 != 2) {
                    i3 = 1;
                }
                this.f9373p = i3;
                Bundle a3 = C6621a.m38175a();
                a3.putInt("int_data", this.f9373p);
                mo25996z(1015, a3);
                m12336h0(this.f9373p);
            }
        }
    }

    public void onDoubleTap(MotionEvent motionEvent) {
        C2711a aVar = this.f9369l;
        if (aVar == null) {
            C8594l.m46783q("mBinding");
            throw null;
        } else if (!aVar.f9280g.isSelected() && this.f9375r) {
            m12332d0();
        }
    }

    public void onDown(MotionEvent motionEvent) {
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C8594l.m46771e(seekBar, "seekBar");
        if (z) {
            m12337i0(i, seekBar.getMax());
        }
    }

    public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f9375r) {
        }
    }

    public void onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f9375r) {
            C2711a aVar = this.f9369l;
            if (aVar == null) {
                C8594l.m46783q("mBinding");
                throw null;
            } else if (aVar.f9290q.getVisibility() == 0) {
                m12333e0(false);
            } else {
                m12333e0(true);
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f9374q = false;
        this.f9377t.removeMessages(13);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C8594l.m46771e(seekBar, "seekBar");
        this.f9372o = seekBar.getProgress();
        this.f9377t.sendEmptyMessageDelayed(13, 3000);
        this.f9377t.removeCallbacks(this.f9378u);
        this.f9377t.postDelayed(this.f9378u, 300);
    }

    /* renamed from: p */
    public void mo10283p() {
        super.mo10283p();
        m12331c0();
        mo25994x().mo26004k(this.f9379v);
        this.f9377t.removeMessages(13);
        this.f9377t.removeCallbacks(this.f9378u);
    }

    /* renamed from: t */
    public void mo10284t() {
        super.mo10284t();
        C2711a aVar = this.f9369l;
        if (aVar != null) {
            aVar.f9290q.setVisibility(8);
            aVar.f9276c.setOnClickListener(this);
            aVar.f9285l.setOnClickListener(this);
            aVar.f9281h.setOnClickListener(this);
            aVar.f9287n.setOnClickListener(this);
            aVar.f9288o.setOnClickListener(this);
            aVar.f9282i.setOnClickListener(this);
            aVar.f9280g.setOnClickListener(this);
            aVar.f9277d.setOnClickListener(this);
            aVar.f9286m.setOnClickListener(this);
            aVar.f9275b.setOnClickListener(this);
            aVar.f9283j.setOnClickListener(this);
            aVar.f9279f.setOnClickListener(this);
            aVar.f9278e.setOnClickListener(this);
            aVar.f9284k.setOnClickListener(this);
            aVar.f9292s.setOnSeekBarChangeListener(this);
            mo25994x().mo26003j(this.f9379v);
            this.f9377t.sendEmptyMessage(13);
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* renamed from: u */
    public void mo10285u(int i, int i2, int i3) {
        if (this.f9374q) {
            this.f9371n = i3;
            m12337i0(i, i2);
        }
    }

    /* renamed from: v */
    public Bundle mo10286v(int i, Bundle bundle) {
        if (i != 2000) {
            if (i == 2001 && bundle != null) {
                boolean z = bundle.getBoolean("mute");
                C2711a aVar = this.f9369l;
                if (aVar != null) {
                    aVar.f9282i.setSelected(z);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            }
        } else if (bundle != null) {
            m12337i0(bundle.getInt("int_arg1"), bundle.getInt("int_arg2"));
        }
        return super.mo10286v(i, bundle);
    }
}
